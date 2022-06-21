import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
        int ncarteira;
        double vmultas = 0;
        int nmultas = 1;
        double vtotal = 0;
        int nmaiormultas = 0;
        int nmaiorcarteira = 1;
        Scanner leitor = new Scanner(System.in);

        do{
             System.out.println("Digite o numero da carteira de motorista: ");
             ncarteira = leitor.nextInt();

            if(ncarteira !=0){
                System.out.println("Digite o numero de multas: ");
                nmultas = leitor.nextInt();
                vmultas = 0;

                    for (int i = 1; i <= nmultas; i++){
                        System.out.println("Digite os valores de cada multa: ");
                        vmultas = vmultas + leitor.nextDouble();
                    }

                System.out.println("Os valores das multas sao: "+vmultas);
                vtotal = vtotal + vmultas;                  
            }

            if (nmultas > nmaiormultas){
                nmaiormultas = nmultas;
                nmaiorcarteira = ncarteira;
            }
        }
        
        while(ncarteira != 0);     
        System.out.println("O valor total de multas de todos os motoristas e de: "+vtotal);       
        System.out.println("O motorista que teve o maior numero de multa foi o da carteira numero: " +nmaiorcarteira);
    leitor.close();
    }
}