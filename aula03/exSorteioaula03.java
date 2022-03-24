import java.util.Random;

public class exSorteioaula03 
{
    // Atributos, propriedade, variaveis globais
    // Funções e procedimentos
    // Rotina Principal

    //public static void main(String[] args) 
        //{
            //Random gerador = new Random();
            //int n = 1 + gerador.nextInt(100);      
            //System.out.println(n);     
        //} 

    public static void main(String[] args) 
    {
        Random gerador = new Random();   
        int c = 1;
        int soma = 0;
        int maior = 0; // ou 1 ou c
        int menor = 100; // ou 101
        while (c <= 1000) 
        {
            // ler o número
            int n = 1 + gerador.nextInt(100);
            c++; // c = c + 1
            soma = soma + n;
            System.out.println(n);

            if (n > maior)
            {
                maior = n;
            }   
            
            if (n < menor)
            {
                menor = n;   
            }
        }

        System.out.println("O maior número é:" + maior);
        System.out.println("O menor número é:" + menor); 
        System.out.println("A soma dos números é:" + soma);
        System.out.println("A média dos números é:" + soma / 1000f); 
    }    
}