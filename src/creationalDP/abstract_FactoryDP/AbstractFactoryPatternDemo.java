package creationalDP.abstract_FactoryDP;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //circle objesi olusturuldu
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //rectungle objesi olusturuldu
        Shape shape2 = shapeFactory.getShape("RECTUNGLE");
        shape2.draw();

        //color fabrikasi olusturalim
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //RED objesi olusturalim
        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        //BLUE objesi olusturalim
        Color color2 = colorFactory.getColor("BLUE");
        color2.fill();





    }
}
