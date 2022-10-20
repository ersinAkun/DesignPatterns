package creationalDP.factoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {

   /*
        Circle circle1 = new Circle();
        circle1.draw();
     */
        //uretmem gereken her seklin domain sinifini bilmem gerekmiyor
        //peki bu siniflaara ihtiyac olmadan obje uretebilseydim

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }

}
