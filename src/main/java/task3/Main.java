package task3;

public class Main {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("cute-kittens.jpg");
        proxyImage.display();
        System.out.println("  ");
        proxyImage.display();
        System.out.println("end");
    }
}
