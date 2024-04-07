package com.rp.sec01;

import com.rp.courseutil.ReactUtils;
import reactor.core.publisher.Mono;

public class MonoSubscribe {
    public static void main(String[] args) {
        Mono.just(1).subscribe(
                ReactUtils.onNext(),
                ReactUtils.onError(),
                ReactUtils.onComplete()
        );
    }
}
