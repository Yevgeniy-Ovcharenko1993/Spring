package io.spring.learning.Classes;

import io.spring.learning.interfases.Leg;
import org.springframework.stereotype.Component;

@Component
public class LegImp implements Leg {
    public void run() {
        System.out.println("Running");
    }
}
