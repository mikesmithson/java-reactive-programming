package com.rp.sec01;

import reactor.core.publisher.Mono;

public class MonoJust {
    public static void main(String[] args) {
        Mono.just(1)
                .subscribe(data -> System.out.println("Received data: " + data));
    }
}
