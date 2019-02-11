package com.isle.ribbon.observer;

import org.junit.Test;
import rx.Observable;
import rx.Subscriber;

public class ObserveTest {

    @Test
    public void testObserve() {
        Observable<String> observable = Observable.create(subscriber -> {
            subscriber.onNext("Hello RxJava");
            subscriber.onNext("I am Isle");
            subscriber.onCompleted();
        });
        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {
                System.out.println("Subscriber : " + s);
            }
        };
        observable.subscribe(subscriber);
    }

}
