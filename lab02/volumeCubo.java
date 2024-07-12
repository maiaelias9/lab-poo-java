package lab02;

public class volumeCubo {
    public static void main(String[] args) {
        var lado = Float.parseFloat(args[0]);
        var vol = Math.pow(lado, 3);

        System.out.println("O volume deste cubo é" + vol);
    }
}