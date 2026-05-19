import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TrechoRodovia trecho1 = new TrechoRodovia();
        TrechoRodovia trecho2 = new TrechoRodovia();
        Scanner entrada = new Scanner(System.in);


        System.out.println("Registro Trechos Rodovia");

        System.out.println("Cadastrar Primeiro Trecho : ");
        System.out.println("Km inicial : ");
        trecho1.setQuilometroInicial(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Km Final : ");
        trecho1.setQuilometroFinal(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Qual o tamanho da vegetação atual (cm) : ");
        trecho1.setNivelVegetacao(entrada.nextFloat());
        entrada.nextLine();

        System.out.println("Cadastrar Segundo Trecho : ");
        System.out.println("Km inicial : ");
        trecho2.setQuilometroInicial(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Km Final : ");
        trecho2.setQuilometroFinal(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Qual o tamanho da vegetação atual (cm) : ");
        trecho2.setNivelVegetacao(entrada.nextFloat());
        entrada.nextLine();


        System.out.println("Qual a taxa de crescimento da grama ");

        double num = entrada.nextInt();
        entrada.nextLine();

        trecho1.registrarCrescimento(num);
        trecho2.registrarCrescimento(num);

        System.out.println("Trecho 2:");
        trecho2.mandarEquipes();
        System.out.println("Trecho 1");
        trecho1.mandarEquipes();



    }
}