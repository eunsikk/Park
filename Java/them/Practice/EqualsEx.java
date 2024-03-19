package them.Practice;

class Rect {
    int width;
    int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rect) {
            Rect p = (Rect) obj;
            return width * height == p.width * p.height;
        } else {
            return false;
        }
    }
}


public class EqualsEx {
    public static void main(String[] args) {
        Rect a = new Rect(2, 3);
        Rect b = new Rect(3, 2);
        Rect c = new Rect(3, 4);

        if (a.equals(b)) {
            System.out.println("a is equal to b");
        } else if (a.equals(c)) {
            System.out.println("a is equals to c");
        } else if (b.equals(c)) {
            System.out.println("b is equal to c");
        }
    }
}
