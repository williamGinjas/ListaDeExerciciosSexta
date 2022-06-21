import java.util.Scanner;
public class Ex3{

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade, ecivil, casados, solteiros, viuvos, idadev, desquitados, quantidade;
        double mediav, mediavd;
        desquitados = 0;
        casados = 0;
        solteiros = 0;
        viuvos = 0;
        idadev = 0;
        quantidade = 0;
        mediav = 0;
        do{

            System.out.println("Digite sua idade");
            idade = leitor.nextInt();

            if(idade !=0){
                System.out.println("Escolha um estado civil\n1-Casado\n2-Solteiro\n3-Viuvo\n4-Desquitado");
                ecivil = leitor.nextInt();

                if (ecivil == 1){
                    quantidade = quantidade + 1;
                    casados = casados + 1;
                }

                else if (ecivil == 2){
                    quantidade = quantidade + 1;
                    solteiros = solteiros + 1;
                }

                else if (ecivil == 3){
                    quantidade = quantidade + 1;
                    viuvos = viuvos + 1;
                    idadev = idadev + idade;
                    mediav = idadev / viuvos;
                }

                else if (ecivil == 4){
                    quantidade = quantidade + 1;
                    desquitados = desquitados + 1;
                }
            }
        }
        while(idade != 0);
        mediavd = ((viuvos + desquitados) * 1.0) / quantidade * 100;
        System.out.println("A quantidade de pessoas casadas e de " + casados);
        System.out.println("A quantidade de pessoas solteiras e de " + solteiros);
        System.out.println("A media de idade das pessoas viuvas e de " + mediav);
        System.out.println("A porcentagem de desquitados e viuvos e de " + mediavd + "%");
    }
}