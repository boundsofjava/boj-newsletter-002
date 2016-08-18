package com.boundsofjava.newsletter.defaultargument;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface
public interface DefaultArguments<A, B, C> extends Function<A, Function<B, Consumer<C>>> {

    default void invoke(A a, B b, C c) {
        this.apply(a).apply(b).accept(c);
    }

    default DefaultArguments<A, B, C> defaultingFirst(A defaultFirst) {
        return a -> b -> c -> this.invoke(
                Optional.ofNullable(a).orElse(defaultFirst),
                b,
                c);
    }

    default DefaultArguments<A, B, C> defaultingSecond(B defaultSecond) {
        return a -> b -> c -> this.invoke(
                a,
                Optional.ofNullable(b).orElse(defaultSecond),
                c);
    }

    default DefaultArguments<A, B, C> defaultingThird(C defaultThird) {
        return a -> b -> c -> this.invoke(
                a,
                b,
                Optional.ofNullable(c).orElse(defaultThird));
    }
}
