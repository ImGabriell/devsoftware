public class ProgramaPrincipal 
{
    public static void main(String[] args) 
    {
        int num = ConsoleUtils.lerInteiro("Digite um inteiro:");
        try 
        {
            long fatorial = Fatorial.calcular(num);
            System.out.printf("%d! = %d", num, fatorial);
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            System.out.println("\nAcabou porra. Nunca mais volte");
        }
    }
}
