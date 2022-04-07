package itmo.rs.impl;

import itmo.rs.exception.ThrottlingException;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class ThrottlingService {
    private static final AtomicInteger size = new AtomicInteger(0);

    public static <T> CompletableFuture<T> submit(Supplier<T> supplier) throws ThrottlingException {
        if (size.getAndIncrement() >= 10) {
            size.decrementAndGet();
            System.out.println("LIMIT REACHED: " + size);
            throw ThrottlingException.DEFAULT_INSTANCE;
        }
        return CompletableFuture.supplyAsync(supplier).whenComplete((T res, Throwable err) -> {
            System.out.println("CHECK: " + size);
            size.decrementAndGet();
        });
    }
}
