import java.util.Scanner;

public class ProgramaPrincipal 
{
    public static void main(String[] args) 
    {
        Pessoa pessoa[] = new Pessoa[6];
        Scanner tcld = new Scanner(System.in);

        pessoa[0] = new Pessoa("Felipe", 57, 'M', 90, 100, 80, 30, 70); 
        pessoa[1] = new Pessoa("Maria", 45, 'F', 50, 70, 100, 50, 90);
        pessoa[2] = new Pessoa("Cristina", 30, 'F', 50, 20, 30, 70, 30);
        pessoa[3] = new Pessoa("Leonardo", 32, 'M', 80, 10, 60, 80, 50);
        pessoa[4] = new Pessoa("João", 27, 'M', 100, 30, 50, 100, 10);
        pessoa[5] = new Pessoa("Jéssica", 45, 'F', 85, 60, 70, 50, 60);


        System.out.println("Informe o Nome: ");
        String nome = tcld.next();
        System.out.println("Informe a Idade  : ");
        int idade = tcld.nextInt();
        System.out.println("Informe o Gênero : ");
        int genero = tcld.nextInt();
        System.out.println("Informe o Gosta de viajar  : ");
        int viajar = tcld.nextInt();
        System.out.println("Informe o Gosta de cozinhar : ");
        int cozinhar = tcld.nextInt();
        System.out.println("Informe o Gosta de cinema : ");
        int cinema = tcld.nextInt();
        System.out.println("Informe o Gosta de balada : ");
        int balada = tcld.nextInt();
        System.out.println("Informe o Gosta de fica em casa : ");
        int casa = tcld.nextInt();


        Pessoa pessoaLida = new Pessoa();

        for (int i = 0; i < pessoa.length; i++) 
        {
            
        }


    }
}
