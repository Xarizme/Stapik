package Animals;

public class Animals {

    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;

    public Animals(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public Animals(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animals(String type, int age) {
        this.type = type;
        this.age = age;
        this.name = "No Name";
    }

    void display() {

        System.out.println("Тип: " + this.type);
        System.out.println("Имя: " + this.name);
        System.out.println("Возраст: " + this.age);
        System.out.printf("Вес: " + "%.1f", this.weight);
        System.out.println();
        System.out.println("Умеет ходить: " + (this.isWalk ? "Да" : "Нет"));
        System.out.println("Умеет плавать: " + (this.isSwim ? "Да" : "Нет"));
        System.out.println("Умеет летать: " + (this.isFly ? "Да" : "Нет"));
        System.out.println("-".repeat(20));
    }

    void rename(String name) {
        this.name = name;
    }

    void holiday(int days) {
        this.weight += 0.1 * days;
    }

    void holiday(double mass) {
        this.weight += mass;
    }

    void holiday() {
        this.weight += 0.1;
    }

    void holiday(double mass, int days) {
        this.weight += mass * days;
    }

    public Animals() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double wight) {
        this.weight = wight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }
}