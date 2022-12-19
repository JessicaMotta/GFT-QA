import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Operadores {
 
    public static void main(String[] args) throws Exception {
        double soma = 10.4 + 23.5;
        int subtracao = 189 - 28;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; //resto da divisão
        double resultado = (10 * 7) + (20 / 7);

        // concatenação
        String nomeCompleto = "Linguagem: " + "Java";
        System.out.println(nomeCompleto);

        //incremento: x repetição
        int numero = 5;
        int segundo = 9;
        //numero = numero + 1;
        numero++;
        System.out.println(numero);

        //para mostrar o novo numero na tela atravez do System.out.println:
        System.out.println(++segundo);

        //negação - inverte o valor da váriavel
        boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel);
        
        // operadores ternário 
        int a, b;
        a = 5;
        b = 6;

        String result = a==b ?"verdadeira" : "falso";
            System.out.println("Resultado: "+result);

        //operadores relarionais 
        System.out.println("OPERADORES RELACIONAIS");
        int numero1 = 10;
        int numero2 = 20;


        boolean simNao = numero == numero2;
        System.out.println("Numero 1 é igual ao numero 2?: "+simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 é diferente ao numero 2?: "+simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero 1 é maior ao numero 2?: "+simNao);

        simNao = numero1 < numero2;
        System.out.println("Numero 1 é menor ao numero 2?: "+simNao);

        if(numero1 < numero2){
            System.out.println("a nossa adição é verdadeira");
        }

        //para objetos ou nomes deve ser utilizado o equals ao invés de: (==)
        String nomeUm = "Jéssica";
        String nomeDois= "Jéssica";

        System.out.println(nomeUm.equals(nomeDois));

        //OPERADORES LOGICOS
        System.out.println("OPERADORES LOGICOS");
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("as duas condicões são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        else{
            System.out.println("Fim!");
        }
    }
}

