package io.spring.learning.Classes;

import io.spring.learning.interfases.Hand;
import org.springframework.stereotype.Component;

@Component
public class HandImpl implements Hand {

    public void kick() {
        System.out.println("Knocking out");
    }
}
