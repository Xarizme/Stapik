package WritingMaterials;

public class Pen extends WritingMaterials {
    private int countColor = 1;
    private boolean auto;

    //___геттеры_____
    public int getCountColor() {
        return countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    //___сеттеры_____
    public void setCountColor(int a) {
        this.countColor = a;
    }

    public void setAuto(boolean b) {
        this.auto = b;
    }

    @Override
    public void display() {
        System.out.println("This is "+getClass());
        super.display();
        System.out.println("Количество цветов этой ручки: " + this.getCountColor());
        System.out.println((isAuto()) ? "Эта ручка автоматическая?: Да" : "Эта ручка автоматическая?: Нет");
    }

    public Pen() {
        super();
        super.setDraw(true);
        this.countColor = getCountColor();
        this.auto = isAuto();
    }

    public void writeMyName() {
        System.out.println("My Name is Valerii");
        System.out.println("-".repeat(20));
    }
}
