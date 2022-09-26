import java.util.Scanner;
public class VareasLeituras{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo;
        double preco;
        String nome, texto;

        System.out.println("Digite o codigo: ");
        //codigo = teclado.nextInt();
        texto = teclado.nextLine();
        codigo = Integer.parseInt(texto);


        System.out.println("Digite nome: ");
        nome = teclado.nextLine();

        System.out.println("Digite preco: ");
        texto = teclado.nextLine();
        preco = Double.parseDouble(texto);

        //System.out.println("Voce ditou: " + codigo + " - " + nome + " R$ " + preco);

        System.out.printf("Voce digitou %d - %s R$ %.2f \n", codigo, nome, preco); 
        
    }
}