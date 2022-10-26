package structuralDP.decoratorDP;

public class NormalSample {


    public static class Iphone11{
        public String name(){    //100x100 camera
            return "Iphone 11";
        }

        int getCameraCount(){
            return 2;
        }

    }


    public static class Iphone11Pro{
        public String name(){    //120x120 camera
            return "Iphone 11 Pro";
        }

        int getCameraCount(){
            return 3;
        }
    }


    public static class Iphone11ProMax{
        public String name(){     //150x150 camera
            return "Iphone 11 Pro Max";
        }

        int getCameraCount(){
            return 3;
        }
    }

}
