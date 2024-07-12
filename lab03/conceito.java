package lab03;

import java.util.Scanner;

public class conceito {
    // Execute no terminal
    // java lab03/Condicionais3.java
    public static void main(String[] args) {var sc = new Scanner(System.in);
        System.out.println("Informe o seu conceito:");
        var conceito = sc.next();
        switch (conceito) {
            case "A" -> System.out.println("Sua nota é 100");
            case "B" -> System.out.println("Sua nota é 90");
            case "C" -> System.out.println("Sua nota é 80");
            case "D" -> System.out.println("Sua nota é 70");
            case "E" -> System.out.println("Sua nota é 60");
        }
        sc.close();
    }
}