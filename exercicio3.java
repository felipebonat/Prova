import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Informe o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Informe o terceiro número: ");
        double num3 = entrada.nextDouble();

        if (num1 > num2 && num1 > num3){
            if (num2 > num3){
                System.out.println("Maior número: " + num1 + "\nMenor número: " + num3);
            }else if (num3 > num2){
                System.out.println("Maior número: " + num1 + "\nMenor número: " + num2);
            }
        }else if (num2 > num3 && num2 > num1) {
            if (num3 > num1){
                System.out.println("Maior número: " + num2 + "\nMenor número: " + num1);
            }else{
                System.out.println("Maior número: " + num2 + "\nMenor número: " + num3);
            }
        }else if (num3 > num2 && num3 > num1){
            if (num2 > num1){
                System.out.println("Maior número: " + num3 + "\nMenor número: " + num1);
            }else{
                System.out.println("Maior número: " + num3 + "\nMenor número: " + num2);
            }
        }else{
            System.out.println("Números iguais.");
        }
    }
}
