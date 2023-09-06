package Animals;

public class Fish extends Animals{
    private String squama;
    private boolean upStreamSwim;

    public String getSquama(){
        return squama;
    }
    public void setSquama(String squama){
        this.squama=squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public Fish() {
        super.setType("Рыба");
        super.setSwim(true);
        this.squama=getSquama();
        this.upStreamSwim=isUpStreamSwim();
    }

    @Override
    void display() {
        System.out.println("I am "+ this.getType());
        super.display();
        System.out.println("Тип чешуи "+squama+"\n"+"Умеет ли плавать "+((upStreamSwim)? "Да":"Нет"));
        System.out.println("-".repeat(20));
    }

    public void bul_bul(){
        System.out.println("Bul-Bul");
        System.out.println("-".repeat(20));
    }
}
