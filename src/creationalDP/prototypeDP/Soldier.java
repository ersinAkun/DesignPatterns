package creationalDP.prototypeDP;

public class Soldier implements Cloneable{

    private int health;
    private int speed;
    private int maxLifeTime;
    private int agility;
    private int power;
    private int rank;
    private String weapon;
    private boolean isAvailableForWar;

    /////*********   PARAMETRELI CONST  **********
    public Soldier(int health, int speed, int maxLifeTime, int agility, int power, int rank, String weapon, boolean isAvailableForWar) {
        this.health = health;
        this.speed = speed;
        this.maxLifeTime = maxLifeTime;
        this.agility = agility;
        this.power = power;
        this.rank = rank;
        this.weapon = weapon;
        this.isAvailableForWar = isAvailableForWar;

    }
    /// **********  SOLDIER INFO  *********
    public void shoeSoldierInfo(){
        System.out.println("Saglik : "+ health);
        System.out.println("Hiz : "+ speed);
        System.out.println("Yasam Suresi : "+ maxLifeTime);
        System.out.println("Ceviklik : "+ agility);
        System.out.println("Guc : "+ power);
        System.out.println("Rutbe : "+ rank);
        System.out.println("Silah : "+ weapon);
        if(isAvailableForWar){
            System.out.println("Savasmaya hazir");
        }else {
            System.out.println("Bu asker savasamaz, yarali :(");
        }
    }
     ///***********  GETTER - SETTER   begin   **************
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(int maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAvailableForWar() {
        return isAvailableForWar;
    }

    public void setAvailableForWar(boolean availableForWar) {
        isAvailableForWar = availableForWar;
    }
    ///**********  GETTER - SETTER   end  *********


    // clone kismi   --> public class Soldier implements Cloneable{  dan getiriyor
    @Override
    public Soldier clone() {

        Soldier soldier = null;
        try {
             soldier = (Soldier) super.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("Asker kopyalama sirasinda hata yasandi");
            e.printStackTrace();
        }
        return  soldier;
    }






}
