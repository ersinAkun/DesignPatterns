package creationalDP.singletonDP;

public class SingletonObject {

    String message = "Merhaba";

    private static SingletonObject instance = new SingletonObject();  //ilk create

    private SingletonObject(){};         //default const. private ile new lemeyi kapattik bu class disinda cagrilamaz

    public static SingletonObject getInstance(){   //
        return instance;
    }

    public void showMessage(){
        this.message = this.message + " Batch 82-83";
        System.out.println(this.message);
    }

}

        //SingletonObject obje1 = new SingletonObject();   => bunu onlememiz lazim


