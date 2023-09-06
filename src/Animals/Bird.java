package Animals;

public class Bird extends Animals {

    public Bird(){
        super.setType("Птица");
        super.setFly(true);
        this.area=getArea();
        this.winterFly=isWinterFly();
    }
    private String area;
    private boolean winterFly;

    void chirick_chirick() {
        System.out.println("Chirik-Chirik");
        System.out.println("-".repeat(20));
    }


    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setWinterFly(boolean b) {
        winterFly = b;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    @Override
    void display() {
        System.out.println("I am "+getType());
        super.display();
        System.out.println("зона обитания "+getArea()+"\n"+"Улетает ли она зимовать "+((isWinterFly())? "Да":"Нет"));
        System.out.println("-".repeat(20));
    }
}
