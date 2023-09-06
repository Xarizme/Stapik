package WritingMaterials;

public class Ruler extends WritingMaterials{

    private boolean wood;

    //___геттеры_____


    public boolean isWood() {
        return wood;
    }

    //___сеттеры_____
    public void setWood(boolean b) {
        this.wood = b;
    }



    @Override
    public void display() {
        System.out.println("This is "+getClass());
        super.display();
        System.out.println(isWood() ? "Эта линейка сделана из дерева?: Да" : "Эта линейка сделана из дерева?: Нет");
    }

    public Ruler() {
        super();
        super.setDraw(false);
        this.wood = isWood();
    }

    public void measure() {
        System.out.println("Сейчас померяем длину");
        System.out.println("-".repeat(20));
    }
}
