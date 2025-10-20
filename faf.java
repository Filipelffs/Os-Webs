import java.util.Scanner;

public class faf {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num1 = tecla.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = tecla.nextInt();
    
        int total = num1 += num2;
        
        System.out.println("O total da soma foi?" + total);
    }

}
