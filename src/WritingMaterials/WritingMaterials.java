package WritingMaterials;

public class WritingMaterials {
    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public void display() {
        if (color == null) {
            color = "No Color";
            if (name == null) {
                name = "No Name";
            }
        }
        System.out.println("Название: " + name + "\nЦвет: " + color + "\nДлина: " + length + "\nЦена: " + price + "\nУмеет рисовать:" + (draw ? "Да" : "Нет"));

        System.out.println("*".repeat(20));
    }

    public void replace_rod(String Newcolor) {
        this.color = Newcolor;
    }

    public void priceUp(int a) {
        price += a;
    }

    public void priceDown(int a) {
        price -= a;
    }

    public WritingMaterials() {
    }


    public WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public WritingMaterials(int price, double length, boolean draw) {
        this.price = price;
        this.length = length;
        this.draw = draw;
    }
    public WritingMaterials(String name,String color,int price, double length,boolean draw){
        this.name=name;
        this.color=color;
        this.price=price;
        this.length=length;
        this.draw=draw;
    }

    public void draw() {
        System.out.println(draw ? (name + " провел линий: 1 . Их цвет- " + color) : (name + " не может ничего нарисовать"));
        System.out.println("-".repeat(20));
    }

    public void draw(int n) {
        System.out.println(draw ? (name + " провел линий: " + n + " Их цвет- " + color) : (name + " не может ничего нарисовать"));
        System.out.println("-".repeat(20));
    }

    public void draw(String color) {
        System.out.println(draw ? (name + " провел линий: 1 . Их цвет- " + color) : (name + " не может ничего нарисовать"));
        System.out.println("-".repeat(20));
    }

    public void draw(String color, int n) {
        System.out.println(draw ? (name + " провел линий: " + n + " Их цвет- " + color) : (name + " не может ничего нарисовать"));
        System.out.println("-".repeat(20));
    }
}
