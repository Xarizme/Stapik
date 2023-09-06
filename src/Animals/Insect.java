package Animals;

public class Insect extends Animals {

    private int wingCount;
    private boolean likeJesus;

    public int getWingCount(){
        return wingCount;
    }
    public void setWingCount(int wingCount){
        this.wingCount=wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public Insect() {
        super.setType("Насекомое");
        super.setWalk(true);
        this.wingCount=getWingCount();
        this.likeJesus=isLikeJesus();
    }

    @Override
    void display() {
        System.out.println("I am "+getType());
        super.display();
        System.out.println("Количество крыльев "+getWingCount()+"\n"+"Умеет ли ходить по воде "+((isLikeJesus())? "Да":"Нет"));
        System.out.println("-".repeat(20));
    }

    void ggggg() {
        System.out.println("Ggggggg");
        System.out.println("-".repeat(20));
    }
}
