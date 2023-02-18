import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i=0, res, alunos=0, reprovados=0, aprovados=0;
	    float[] nota1 = new float[100], nota2 = new float[100], media = new float[100];
	    String[] nome = new String[100];
	    String situacao;
		//quer repetir?
        do{
            System.out.println("Qual o nome do aluno?");
            Scanner nomeAluno = new Scanner (System.in);
            nome[i] = nomeAluno.nextLine();
            
            System.out.println("Qual a primeira nota?");
            Scanner nota1Aluno = new Scanner (System.in);
            nota1[i] = Integer.parseInt(nota1Aluno.nextLine());
            
            System.out.println("Qual a segunda nota?");
            Scanner nota2Aluno = new Scanner (System.in);
            nota2[i] = Integer.parseInt(nota2Aluno.nextLine());
            
            alunos+=1;
            media[i] = (nota1[i]+nota2[i])/2;
            
            if(media[i]>=5){
                aprovados+=1;
                situacao="aprovado";
            } else{
                reprovados+=1;
                situacao="reprovado";
            }
            
            System.out.println("O aluno "+nome[i]+" foi "+situacao+" com média "+media[i]);
            System.out.println("Para outro aluno digite '1' e para encerrar digite '2'");
            Scanner resposta = new Scanner (System.in);
            res = Integer.parseInt(resposta.nextLine());
        }while(res==1);
        System.out.println("Foi verificada a situação de "+alunos+" alunos");
        System.out.println("Há "+aprovados+" alunos aprovados");
        System.out.println("Há "+reprovados+" alunos reprovados");
	}
}

