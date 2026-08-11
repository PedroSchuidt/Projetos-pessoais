import java.util.Scanner;

    public class Gestão {
        int Id;
        String Nome;
        double salario;
        double gastos;

            public static void main(String[] args) {
            
                Scanner entrada = new Scanner(System.in); 
                Gestão usuario = new Gestão();

                    System.out.println("Olá Bem-Vindo(a)!");
                    System.out.println("por favor, Digite seu nome:R");
                    usuario.Nome = entrada.nextLine(); 

                    System.out.println("Informe seu salário");
                    usuario.salario = entrada.nextDouble();

                    System.out.println("Informe seus gastos");
                    usuario.gastos = entrada.nextDouble();

                        System.out.println("Nome do usuário: " + usuario.Nome);
                        System.out.println("Total salário: " + usuario.salario);
                        System.out.println("Total gasto: " + usuario.gastos);
                        System.out.println("Ainda restam: " + usuario.CalcularSaldo());

        }

            public double CalcularSaldo(){

                        return salario - gastos;
        }

}
