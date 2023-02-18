import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

        Scanner resposta = new Scanner (System.in);

	    System.out.println("Digite o 1° num:");
        int num1 = Integer.parseInt(resposta.nextLine());
        
        System.out.println("Digite o 2° num:");
        int num2 = Integer.parseInt(resposta.nextLine());
        
        if(num1>num2){
            int a=num1;
            num1=num2;
            num2=a;
        }
        
        int soma=0;
        
        
        for(int i=num1; i<=(num2); i++){
            soma += i;
        }
        
        System.out.println("Resultado da soma dos valores de num1 até num2: "+soma);
        
    }
}

