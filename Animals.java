package Animals;

public class Animals {
    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public void holiday(int day) {
        weight += day * 0.1;
    }

    public Animals(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animals(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public Animals(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public void rename(String nameName) {
        this.name = nameName;

    }

    public void display() {
        if (name == null) name = "NO Name";
        System.out.println("Тип: " + type + "\n" + "Имя: "
                + name + "\n" + "Возраст: " + age + "\n" + "Вес: "
                + weight + "\n" + "Он летает: " + (isFly ? "Да" : "Нет") + "\n" + "Он ходит: "
                + (isWalk ? "Да" : "Нет") + "\n" + "Он плавает: " + (isSwim ? "Да" : "Нет"));
        System.out.println("***********************");
    }
}



