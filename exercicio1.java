import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a operação (+,-,* ou /): ");
        char operacao = entrada.next().charAt(0);
        
        System.out.print("Informe o primeiro número inteiro: ");
        double num1 = entrada.nextDouble();

        System.out.print("Informe o segundo número inteiro: ");
        double num2 = entrada.nextDouble();

        switch(operacao){
            case '+':
            double soma = num1 + num2;
            System.out.println("A soma entre " +  num1 +  " e " + num2 +  " é: " + soma);
            break;

            case '-':
            double subtracao = num1 - num2;
            System.out.println("A soma entre " +  num1 +  " e " + num2 +  " é: " + subtracao);
            break;

            case '*':
            double multiplicacao = num1 * num2;
            System.out.println("A soma entre " +  num1 +  " e " + num2 +  " é: " + multiplicacao);
            break;

            case '/':
                if (num2 == 0){
                    System.out.println("Operação inválida. Em uma divisão, o segundo número não pode ser igual a 0.");
                }else{
                    double divisao = num1 / num2;
                    System.out.println("A divisão entre " +  num1  + " e " + num2 + " é: " + divisao );
                }
            break;

            
        }
    }
}
