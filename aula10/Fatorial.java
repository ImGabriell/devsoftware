public class Fatorial 
{
    public static long calcular(int n) throws IllegalArgumentException
    {
        if (n >= 0)
        {
            //calcula o fatorial e retorna
            long fatorial = 1;

            for (int i = 2; i <= n; i++) 
            {
                fatorial *= i; // fat = fat * i
            }
            return fatorial;

        }
        else
        {
            throw new IllegalArgumentException("Não existe fatorial de número negativo, babaca!");
        }
    }
}
