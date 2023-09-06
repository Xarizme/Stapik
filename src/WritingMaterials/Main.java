package WritingMaterials;

public class Main {
    public static void main(String[] args) {
        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        wm.display();

        Pen p = new Pen();
        p.setName("Паркер");
        p.setCountColor(2);
        p.setAuto(false);
        p.display();
        p.writeMyName();

        Ruler r = new Ruler();
        r.setName("Линейка");
        r.setLength(25);
        r.setWood(true);
        r.display();
        r.measure();

        Divider d = new Divider();
        d.setName("Циркуль");
        d.setDividerType("С карандашом");
        d.setMetal(true);
        d.display();
        d.draw_circle();

    }
}
