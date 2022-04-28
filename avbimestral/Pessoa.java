public class Pessoa 
{
    // Variáveis de instância
    private String nome;
    private int idade;
    private char genero;
    private int gostaViajar;
    private int gostaCozinhar;
    private int gostaCinema;
    private int gostaBalada;
    private int gostaFicarEmCasa;

    // Construtora Padrão em Branco
    public Pessoa()
    {

    }

    // Getters
    public String getnome()
    {
        return this.nome;
    }

    public int getidade()
    {
        return this.idade;
    }

    public char getgenero()
    {
        return this.genero;
    }

    public int getgostaViajar()
    {
        return this.gostaViajar;
    }

    public int getgostaCozinhar()
    {
        return this.gostaCozinhar;
    }

    public int getgostaCinema()
    {
        return this.gostaCinema;
    }

    public int getgostaBalada()
    {
        return this.gostaBalada;
    }

    public int getgostaFicarEmCasa()
    {
        return this.gostaFicarEmCasa;
    }

    // Setters
    public void setnome(String nome)
    {
        this.nome = nome;
    }

    public void setidade(int idade)
    {
        this.idade = idade;
    }

    public void setgenero(char genero)
    {
        this.genero = genero;
    }

    public void setgostaViajar(int gostaViajar)
    {
        this.gostaViajar = gostaViajar;
    }

    public void setgostaCozinhar(int gostaCozinhar)
    {
        this.gostaCozinhar = gostaCozinhar;
    }

    public void setgostaCinema(int gostaCinema)
    {
        this.gostaCinema = gostaCinema;
    }

    public void setgostaBalada(int gostaBalada)
    {
        this.gostaBalada = gostaBalada;
    }

    public void setgostaFicarEmCasa(int gostaFicarEmCasa)
    {
        this.gostaFicarEmCasa = gostaFicarEmCasa;
    }

    // Sobrecarga da Construtora
    public Pessoa
    (
        String nome, 
        int idade, 
        char genero,
        int gostaViajar,
        int gostaCozinhar,
        int gostaCinema,
        int gostaBalada,
        int gostaFicarEmCasa
    )

    {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.gostaViajar = gostaViajar;
        this.gostaCozinhar = gostaCozinhar;
        this.gostaCinema = gostaCinema;
        this.gostaBalada = gostaBalada;
        this.gostaFicarEmCasa = gostaFicarEmCasa;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ":\n" + String.format
        ("nome: %s\nidade: %d\ngenero: %c\ngostaViajar: %d\ngostaCozinhar: %d\ngostaCinema: %d\ngostaBalada: %d\ngostaFicarEmCasa: %d", this.nome, this.idade, this.genero, this.gostaViajar, this.gostaCozinhar, this.gostaCinema, this.gostaBalada, this.gostaFicarEmCasa);
    }

    public double calcularCompatibilidade(Pessoa pessoa)
    {
        return Math.sqrt(Math.pow(this.gostaViajar - pessoa.gostaViajar, 2) + Math.pow(this.gostaCozinhar - pessoa.gostaCozinhar, 2) + Math.pow(this.gostaCinema - pessoa.gostaCinema, 2) + Math.pow(this.gostaBalada - pessoa.gostaBalada, 2) + Math.pow(this.gostaFicarEmCasa - pessoa.gostaFicarEmCasa, 2));
    }

}





