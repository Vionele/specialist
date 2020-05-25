package ex.sveta.specialist;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Shape p1 = ctx.getBean("p1", Shape.class);
//        Shape p2 = ctx.getBean("p2", Shape.class);
//        Shape c1 = ctx.getBean("c1", Shape.class);
//        Shape c2 = ctx.getBean("c2", Shape.class);
//        p1.draw();
//        p2.draw();
//        c1.draw();
//        c2.draw();

        Canvas canvas = ctx.getBean("canvas", Canvas.class);
        canvas.draw();
    }
}
