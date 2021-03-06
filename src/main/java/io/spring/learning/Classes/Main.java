package io.spring.learning.Classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext");


//        Object obj = context.getBean("human","humanObject");
//        if (obj instanceof Human) {
//            Human human = (Human) obj;
//            human.start();
//        }
//         another variant
        Human human = (Human) context.getBean("human1");
//        human.dance();
//        human.dance();
        human.start();

        Human human2 = (Human) context.getBean("human2");
////        human.dance();
////        human.dance();
        human2.start();


//        DatabaseConnection connection = (DatabaseConnection) context.getBean("dbConnection");
//        connection.dbConnection();
    }
}
