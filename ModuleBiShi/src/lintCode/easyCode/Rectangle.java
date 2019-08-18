package lintCode.easyCode;

public class Rectangle {
    private int wight;
    private int height;

    public Rectangle(int wight, int height) {
        this.wight = wight;
        this.height = height;
    }

    public int getArea() {
        return wight * height;
    }
}
