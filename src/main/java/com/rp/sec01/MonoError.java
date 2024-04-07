package com.rp.sec01;

import com.rp.courseutil.ReactUtils;
import reactor.core.publisher.Mono;

public class MonoError {
    public static void main(String[] args) {
        Mono.just(1)
                .map(item -> item / 0)
                .subscribe(
                        ReactUtils.onNext(),
                        ReactUtils.onError(),
                        ReactUtils.onComplete()
                );
    }
}
