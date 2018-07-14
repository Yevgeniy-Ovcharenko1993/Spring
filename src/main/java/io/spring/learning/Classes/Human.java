package io.spring.learning.Classes;

import io.spring.learning.interfases.Actions;
import io.spring.learning.interfases.Body;
import io.spring.learning.interfases.Hand;
import io.spring.learning.interfases.Leg;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.xml.bind.SchemaOutputResolver;

@Component
public class Human extends BaseHuman implements Actions, InitializingBean, DisposableBean {
    private String color;
    private int age;
    private boolean soundEnabled;

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Human human1() {
        return new Human();
    }

    public Human() {

    }


    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Human human2() {
        return new Human("Red", 45, false);
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

        System.out.println("Color: " + color);

        System.out.println("Age: " + age);

        System.out.println("Is enabled: " + soundEnabled);
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
