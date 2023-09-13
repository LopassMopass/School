public class Cuboit <T extends  Number>{
    private T length;
    private T breadth;
    private T height;

    public Cuboit(T length, T breadth, T height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getBreadth() {
        return breadth;
    }

    public void setBreadth(T breadth) {
        this.breadth = breadth;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cuboit{" + "length=" + length + ", breadth=" + breadth + ", height=" + height + '}';
    }
}
