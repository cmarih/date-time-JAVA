import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe qual a tabuada que deseja calcular de 1 a 10: ");

        int tabuada = entrada.nextInt();
        //System.out.println(tabuada);
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + tabuada * i);
        }
    }
}
