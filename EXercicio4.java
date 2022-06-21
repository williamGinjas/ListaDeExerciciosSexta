import java.util.Scanner;
public class Ex4 {

    public static void main(String[] args) {
        int numeroturma;
        int numeroalunos = 0;
        double mediaturma = 0;
        double mediaaluno;
        int numeroaprovados = 0;
        Scanner leitor = new Scanner(System.in);

        do{
             System.out.println("Digite o numero da turma (Digite 0 para sair):   ");
             numeroturma = leitor.nextInt();

            if(numeroturma != 0){
                System.out.println("Digite o numero de alunos");
                numeroalunos = leitor.nextInt();
                mediaaluno = 0;

                    for(int i = 1; i <= numeroalunos; i++){
                        System.out.println("Digite a media de cada aluno: ");   
                        mediaaluno = leitor.nextDouble();
                        mediaturma = mediaturma + mediaaluno;
                        
                        if(mediaaluno >=7){
                            numeroaprovados++;
                       }
                    }
             System.out.println("O numero de alunos aprovados foi de: " +numeroaprovados);
             System.out.println("O percentual de aprovados e :" +(numeroaprovados * 100) / numeroalunos + " (%)");
             System.out.printf("A media da turma e : %.1f %n" ,mediaturma / numeroalunos);
            }
        }while(numeroturma != 0);      
    leitor.close();
    }
}