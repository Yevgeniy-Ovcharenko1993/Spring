package io.spring.learning.Classes;

import io.spring.learning.interfases.Actions;
import io.spring.learning.interfases.Body;
import io.spring.learning.interfases.Hand;
import io.spring.learning.interfases.Leg;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.xml.bind.SchemaOutputResolver;

public class Human extends BaseHuman implements Actions, InitializingBean, DisposableBean {
    private String color;
    private int age;
    private boolean soundEnabled;

    public Human() {

    }

    public Human(Body body, Hand hand, Leg leg, String color, int age, boolean soundEnabled) {
//        super(body, hand, leg);
        this.color = color;
        this.age = age;
        this.soundEnabled = soundEnabled;
    }

    public Human(String color, int age, boolean soundEnabled) {
        this.color = color;
        this.age = age;
        this.soundEnabled = soundEnabled;
    }

    public void start() {
        getBody().mooving();
        getHand().kick();
        getLeg().run();

//        System.out.println("Color: " + color);
//
//        System.out.println("Age: " + age);
//
//        System.out.println("Is enabled: " + soundEnabled);
//    }
    }
    public void dance() {
        System.out.println("this is dancing");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }


    public void destroy() throws Exception {
        System.out.println(this + "- method destroyObject()");

    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(this + "Method init () ");
    }
}
