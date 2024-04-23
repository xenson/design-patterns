package com.urancode.design.patterns.observer;

import com.google.common.eventbus.EventBus;

/**
 * 观察者模式
 * <p>
 * Created by Enson on 2023/12/21.
 */
public class ObserverTest {
    public static void main(String[] args) {
        //V1
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        gper.addObserver(tom);
        gper.addObserver(mic);

        //业务逻辑
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景？");

        gper.publishQuestion(question);

        //V2 guava
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("Tom");

        System.out.println();
    }
}
