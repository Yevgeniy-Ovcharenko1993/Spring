package io.spring.learning.Classes;

import io.spring.learning.interfases.Body;
import org.springframework.stereotype.Component;

@Component
public class BodyImpl implements Body {
    public void mooving() {
        System.out.println("mooving body ");
    }
}
