import java.util.Scanner;
public class Main
{
    public static final String SENHA = "limao";
    
	public static void main(String[] args) {
        int i = 0;
        String text;
        do{
            Scanner texto = new Scanner (System.in);
            System.out.println("\nDigite sua senha:");
            text = texto.nextLine();
            
            if(text.equals(SENHA) == true){
                System.out.println("Senha correta");
                i=3;
            }else{
                System.out.println("Senha incorreta");
                i++;
            }
            
        }while(i<3);
        if(text.equals(SENHA)==false){
        System.out.println("\nTente em outro momento, tentativas excedidas.");
        }
	}
}

