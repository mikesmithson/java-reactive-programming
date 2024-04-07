package com.rp.courseutil;

import java.util.function.Consumer;

public class ReactUtils {
    public static <T> Consumer<T> onNext() {
        return T -> System.out.println("Received: " + T);
    }

    public static <T extends Throwable> Consumer<T> onError() {
        return Throwable::printStackTrace;
    }

    public static Runnable onComplete() {
        return () -> System.out.println("Finished");
    }
}
