public class Main {
    public static void main(String[] args) {
        Cake cake = new NutDecor(new ChocolateDecor(new SimpleCake()));
        System.out.println(cake.cake());
    }
}