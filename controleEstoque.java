import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String res;
	    int estoque, total=0;
	    do{
    	    System.out.println("Digite:");
    	    System.out.println("x - para fechar o programa");
    	    System.out.println("a - para adicionar uma unidade ao estoque");
    	    System.out.println("b - para subtrair uma unidade em estoque");
    	    System.out.println("c - para mostrar o total em estoque");
    	    System.out.println("USE LETRAS MINUSCULAS");
    	    Scanner resposta = new Scanner (System.in);
    	    res = resposta.nextLine();
    	    switch(res){
    	        case "x" : {
    	            System.out.println("App fechado");
    	            break;
    	        }
    	        case "a" : {
    	            System.out.println("Deseja adicionar quantas unidades?");
    	            Scanner add = new Scanner (System.in);
    	            estoque = Integer.parseInt(add.nextLine());
    	            total+=estoque;
    	            System.out.println("Operação finalizada.");
    	            break;
    	        }
    	        case "b" : {
    	            System.out.println("Deseja diminuir quantas unidades?");
    	            Scanner menos = new Scanner (System.in);
    	            estoque = Integer.parseInt(menos.nextLine());
    	            total-=estoque;
    	            System.out.println("Operação finalizada.");
    	            break;
    	        }
    	        case "c" : {
    	            System.out.println("Total em estoque: "+total);
    	            break;
    	        }
    	        default : {
    	            System.out.println("Opção inválida!");
    	        }
    	    }
	    }while(res.equals("x")==false);
	}
}

