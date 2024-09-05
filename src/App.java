import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao conversor de data em Java");
        System.err.println("Qual será o tipo de conversão? ");
        System.out.println("1) dd/mm/yyyy para yyyy/mm/dd");
        System.out.println("2) yyyy/mm/dd para dd/mm/yyyy");
        int tipo_conversao = scanner.nextInt();

        switch(tipo_conversao) {
            case 1:
                System.out.println("Digite o dia: ");
                int dia = scanner.nextInt();
                System.out.println("Digite o mes: ");
                int mes = scanner.nextInt();
                System.out.println("Digite o ano: ");
                int ano = scanner.nextInt();
                if(dia <= 31 && mes <= 12) {
                    System.out.println(ano + "/" + mes + "/" + dia);
                }

                else {
                    System.out.println("Data Inválida");
                }
                break;
            
            case 2:
                System.out.println("Digite o ano: ");
                int ano_2 = scanner.nextInt();
                System.out.println("Digite o mes: ");
                int mes_2 = scanner.nextInt();
                System.out.println("Digite o dia: ");
                int dia_2 = scanner.nextInt();
                if (dia_2 <= 31 && mes_2 <= 12) { 
                    System.out.println(dia_2 + "/" + mes_2 + "/" + ano_2);
                }

                else {
                    System.out.println("Data Inválida");
                }
        }

        scanner.close();
        
    }   

}
