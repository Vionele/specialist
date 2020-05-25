package ex.sveta.specialist;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        /*Shape p1 = new Point();
        Shape p2 = new Point(1, 3);
        Shape c1 = new Circle();
        Shape c2 = new Circle(10, 20, 3.666);

        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(p1);
        shapeList.add(p2);
        shapeList.add(c1);
        shapeList.add(c2);

        for (Shape shape : shapeList) {
            shape.draw();
        }*/

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
