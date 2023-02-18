import java.util.Scanner;
public class Main
{
    public static final String opcoes = "1.Yoda\n2.Luke\n3.Imperador\n4.Nulo\n5.Branco\n\nEntre com seu voto:";
    
    public static void main(String[] args) {
        int voto = 0;
        String res;
        int yoda=0,luke=0,imperador=0,nulo=0,branco=0;
       do{
           System.out.println("Escolha o número do seu candidato:");
           System.out.println(opcoes);
           Scanner resposta = new Scanner (System.in);
           res = resposta.nextLine();
           switch(res){
               case "1" : {
                   yoda+=1;
                   System.out.println("\nVoto registrado");
                   voto+=1;
                   break;
               }
               case "2" : {
                   luke+=1;
                   System.out.println("\nVoto registrado");
                   voto+=1;
                   break;
               }
               case "3" : {
                   imperador+=1;
                   System.out.println("\nVoto registrado");
                   voto+=1;
                   break;
               }
               case "4" : {
                   nulo+=1;
                   System.out.println("\nVoto registrado");
                   voto+=1;
                   break;
               }
               case "5" : {
                   branco+=1;
                   System.out.println("\nVoto registrado");
                   voto+=1;
                   break;
               }
               case "x" : {
                   System.out.println("\nFinalizando...");
                   break;
               }
               default : {
                   System.out.println("\nOpção inválida!");
               }
           }
           
       }while(res.equals("x")==false);
       
       //qual é o mais votado?
       String vencedor;
       if(luke==yoda){
           if(luke>imperador){
               vencedor = "Empate entre Yoda e Luke";
           } else {
               vencedor = "Imperador venceu";
           }
       } else if(yoda==imperador){
           if(yoda>luke){
           vencedor = "Empate entre Yoda e Imperador";
           } else {
               vencedor = "Luke venceu";
           }
       } else if(imperador==luke){
           if(luke>yoda){
               vencedor = "Empate entre Luke e Imperador";
           } else {
               vencedor = "Yoda venceu";
           }
       } else if(yoda>luke && yoda>imperador){
           vencedor = "Yoda venceu";
       } else if(luke>yoda && luke>imperador){
           vencedor = "Luke venceu";
       } else if(luke==yoda && yoda==imperador){
           vencedor = "Empate entre os 3";
       } else{
           vencedor = "Imperador venceu";
       }
       
       System.out.println("\nPercentual de votos:\nYoda:"+yoda*100/voto+"%"+
       "\nluke:"+luke*100/voto+"%"+
       "\nimperador:"+imperador*100/voto+"%"+
       "\nnulo:"+nulo*100/voto+"% dos votos, recebeu "+nulo+" voto(s)"+
       "\nbranco:"+branco*100/voto+"% dos votos, recebeu "+branco+" voto(s)");
       System.out.println("Candidato vencedor: "+vencedor);
      
      resposta.close();
    }
}
