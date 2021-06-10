// 1 - Pacote
package intro;

// 2 - Referência às bibliotecas

// 3- Classe
public class Medidas {
    // 3.1 - atributos - características

    // 3.2 - Métodos e funções
    public static void main(String[] args){
        // Condicional = verificar uma condição - fazer uma pergunta para uma pessoa, um hardware ou software

        // switch selecionar o comportamento do programa conforme a escolha da pessoa ou software

        String opcao = "ifSimples";

        switch (opcao){
            case "ifSimples":
                System.out.println("Você escolheu executar o método if simples");
                ifsimples();
                break;
            case "curto":
                System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "extenso":
                System.out.println("Você escolheu executar o método calcularModoExtenso");
                calcularModoExtenso();
                break;
            case "extenso":
                System.out.println("Você escolheu executar o método calcularModoExtenso");
                calcularModoExtenso();
                break;
        }


    }

    public static void ifsimples(){
        // Condicional = verificar uma condição - fazer uma pergunta para uma pessoa, um hardware ou software

        // if = se
        // else = senão

        String modo = "curto";
        if (modo == "curto") {
            calcularAreaModoCurto();
        }
        else {
            calcularModoExtenso();
        }
    }

    public static void calcularAreaModoCurto (){
        System.out.println("Calculo de area modo curto!!!");
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a Largura de " + largura + " e o comprimento de " + comprimento + "m a area é de " + largura * comprimento + "m2");

    }

    public static void calcularModoExtenso (){
        // calculo de area - Exemplo: o tamanho do tapete ou do piso
        System.out.println("Calculo de area modo extenso!!!");
        int largura;
        int comprimento;
        int resultado;
        int altura;

        largura = 5; // recebe 4 unidades
        comprimento = 6; // recebe 3 unidades

        resultado = largura * comprimento;

        altura = resultado / 10;
        System.out.println("Para a Largura de " + largura + " e o comprimento de " + comprimento + "m a area é de " + resultado + "m2");
        System.out.println("Até mais, Pessoal");
        System.out.println("Agora iremos calcular o resultado dividindo pela altura");
        System.out.println("Resultado final " + altura);
    }



}
