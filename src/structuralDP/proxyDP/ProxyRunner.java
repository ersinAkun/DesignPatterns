package structuralDP.proxyDP;

public class ProxyRunner {
    public static void main(String[] args) {
        ProxyClass proxyClass1 = new ProxyClass("C:\\resin1.jpg");
        ProxyClass proxyClass2 = new ProxyClass("C:\\resin2.jpg");

        proxyClass1.showImage();
        proxyClass2.showImage();

    }

}
