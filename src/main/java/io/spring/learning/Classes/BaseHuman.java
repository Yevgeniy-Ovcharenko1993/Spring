package io.spring.learning.Classes;

import io.spring.learning.interfases.Actions;
import io.spring.learning.interfases.Body;
import io.spring.learning.interfases.Hand;
import io.spring.learning.interfases.Leg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public abstract class BaseHuman implements Actions {
    @Autowired
    private Body body;
    @Autowired
    private Hand hand;
    @Autowired
    private Leg leg;

    public BaseHuman() {
        System.out.println(this + " - BaseHuman constructor()");
    }

//    public BaseHuman(Body body, Hand hand, Leg leg) {
//        this.body = body;
//        this.hand = hand;
//        this.leg = leg;
//
//    }


    public Body getBody() {
        return body;
    }
//    @Required
    public void setBody(Body body) {
        this.body = body;
    }

    public Hand getHand() {
        return hand;
    }
//    @Required
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }
//    @Required
    public void setLeg(Leg leg) {
        this.leg = leg;
    }


}
