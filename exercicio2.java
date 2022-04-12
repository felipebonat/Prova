import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a sua altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Informe o seu peso: ");
        double peso = entrada.nextDouble();

        if (altura < 1.20){
            if (peso <= 60){
                System.out.println("Classificação: A");
            }else if(peso > 60 && peso <= 90){
                System.out.println("Classificação: D");
            }else{
                System.out.println("Classificação: G");
            }
        }else if (altura >= 1.20 && altura <= 1.70){
            if (peso <= 60){
                System.out.println("Classificação: B");
            }else if(peso > 60 && peso <= 90){
                System.out.println("Classificação: E");
            }else{
                System.out.println("Classificação: H");
            }
        }else if (altura > 1.70){
            if (peso <= 60){
                System.out.println("Classificação: C");
            }else if(peso > 60 && peso <= 90){
                System.out.println("Classificação: F");
            }else{
                System.out.println("Classificação: G");
            }
        }
    }
}
