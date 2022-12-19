import java.util.Date;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Tipos de dados abaixo:
        byte idade = 123;
        short ano = 2023;
        int cep = 78765543;
        long cpf = 35654543234L;
        float pi = 3.14F;
        double salario = 1275.33;
        String nome ="Meu nome";
       // char sexo = "F";
        Date dataNascimento = new Date();

        //variavel x constante:

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 3.15; aqui apresenta erro pois não pode ser alterado
    }
}
