package lab03;

public class Condicionais1 {
    public static void main(String[] args) {
        //Crie um arquivo para calcular o vol de um solido.
        //Seu programa não deve calcular vol caso algum 
        // valor de aresta seja menor ou igual a zero. avisando ao usuário. 
        System.out.println("-----------------------------");
        System.out.println("Cálculo do volume da Pirâmide");
        System.out.println("-----------------------------");

        var sc = new scanner(System.in);
        System.out.println("Digite o valor da base: ");
        var base = sc.nextInt();

        System.out.println("Digite o valor da altura: ");
        var altura = sc.nextInt();

        if (altura > 0 && base > 0){

            var volume = base * base * altura;
            System.out.println("O volume é : " + volume);
        } else {
            System.out.println("Não é possível calcular o volume.");
        }

        
        }
    }
}
