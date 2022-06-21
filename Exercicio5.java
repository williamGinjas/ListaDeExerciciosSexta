import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args){

        int qtdSoma = 0, qtdMult = 0;
        int opcao, qtd;
        Scanner sc = new Scanner(System.in);
        
        do{

            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Somar vários números");
            System.out.println("2 - Multiplicar vários números");
            System.out.println("3 - Sair");
            System.out.println("");
            System.out.print("Opção escolhida: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    int soma = 0;
                    qtdSoma++;
                    System.out.print("Quantos números você quer somar? R: ");
                    qtd = sc.nextInt();
                    for(int i = 1; i <= qtd; i++){
                        System.out.format("Digite o %do número: ", i);
                        soma += sc.nextInt();
                    }
                    System.out.format("%nSoma: %d%n", soma);
                    break;

                case 2:
                    int mult = 1;
                    qtdMult++;
                    System.out.print("Quantos números você quer multiplicar? R: ");
                    qtd = sc.nextInt();
                    for(int i = 1; i <= qtd; i++){
                        System.out.format("Digite o %do número: ", i);
                        mult *= sc.nextInt();
                    }
                    System.out.format("%nMultiplicação: %d%n", mult);
                    break;

                case 3:
                    System.out.println("\nTe vejo na próxima!");
                    System.out.println("Estatísticas do uso:");
                    System.out.format("Operação 'Somar vários números': Utilizada %d vez(es)%n", qtdSoma);
                    System.out.format("Operação 'Multiplicar vários números': Utilizada %d vez(es)%n%n", qtdMult);
                    break;

                default:
                    System.out.println("Opção inválida...");
                    break;
                    
            }
        } while(opcao != 3);
        sc.close();
    }
}