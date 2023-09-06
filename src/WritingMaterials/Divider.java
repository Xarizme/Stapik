package WritingMaterials;

public class Divider extends WritingMaterials{
    private String dividerType;
    private boolean metal;

    //___геттеры_____
    public String getDividerType() {
        return dividerType;
    }

    public boolean isMetal() {
        return metal;
    }

    //___сеттеры_____
    public void setDividerType(String a) {
        this.dividerType = a;
    }

    public void setMetal(boolean b) {
        this.metal = b;
    }

    @Override
    public void display() {
        System.out.println("This is "+getClass());
        super.display();
        System.out.println("Тип циркуля: " + this.getDividerType());
        System.out.println((isMetal()) ? "Этот циркуль сделан из металла?: Да" : "Этот циркуль сделан из металла?: Нет");
    }

    public Divider() {
        super();
        super.setDraw(true);
        this.dividerType = getDividerType();
        this.metal = isMetal();
    }

    public void draw_circle() {
        System.out.println("Нарисован круг");
        System.out.println("-".repeat(20));
    }
}
