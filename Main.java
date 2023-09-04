package Animals;

class Main{
    public static void main(String[] args) {
        Animals tiger=new Animals("тигр","Артем",15, 300.6,false,true,true);
        tiger.display();
        tiger.rename("Антон");
        tiger.holiday(5);
        tiger.display();

        Animals sneck=new Animals("Змея",12);
        sneck.setWeight(5);
        sneck.setFly(false);
        sneck.setSwim(true);
        sneck.setWalk(true);
        sneck.display();

        Animals duck=new Animals("Утка", "Утя",3,6.8,true,true,true);
        duck.holiday(5);
        duck.rename("Утя-Утя");
        duck.display();
        System.out.println(duck.getAge());
        System.out.println(duck.getName());
        System.out.println(duck.getWeight());
        System.out.println(duck.getType());
        System.out.println(duck.isSwim());
        System.out.println(duck.isWalk());
        System.out.println(duck.isFly());


    }
}