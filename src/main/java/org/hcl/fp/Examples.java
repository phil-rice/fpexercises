package org.hcl.fp;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;


interface FunctionWithException<From, To> {
    To apply(From from) throws Exception;
}

class WrappedException extends RuntimeException {
    public WrappedException(Throwable e) {
        super(e);
    }

    public Throwable wrappedException() {
        return getCause();
    }
}

public interface Examples {

static void example() {
    List.of(1, 2, 3).forEach(System.out::println);

    Stream.of(1, 2, 3).map(x -> x * 2).filter(x -> x > 2).forEach(System.out::println);

}

    static <From, To> Function<From, To> wrap(FunctionWithException<From, To> bizLogic) {
        return from -> {
            try {
                return bizLogic.apply(from);
            } catch (Error | RuntimeException e) {
                throw e;
            } catch (Throwable e) {
                throw new WrappedException(e);
            }
        };
    }

}
