import java.util.Scanner;

import javax.swing.JOptionPane;



public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    String nome, modelo;
    float tamanho;
    String preco;
    int quantidade;

    System.out.println("Cadastro de Produtos");
    System.out.println();
    System.out.print("Digite o nome do produto: ");
    nome = scanner.nextLine();
    modelo = JOptionPane.showInputDialog(null, "Insira o modelo do produto: ", "Cadastro de Produto", JOptionPane.QUESTION_MESSAGE);
    System.out.println("Insira o modelo do produto: " + modelo);
    System.out.print("Insira o tamanho do produto: ");
    tamanho = scanner.nextFloat();
    preco = JOptionPane.showInputDialog(null, "Insira o preço do produto: ", "Cadastro de Produto", JOptionPane.QUESTION_MESSAGE);
    double precoDouble = Double.parseDouble(preco);
    System.out.println("Insira o preço do produto: " + precoDouble);
    System.out.print("Insira a quantidade do produto:");
    quantidade = scanner.nextInt();


    JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nModelo: " + modelo + "\nTamanho:" + tamanho + "\nPreço: " + preco + "\nQuantidade: " + quantidade, "Produto cadastrado", JOptionPane.INFORMATION_MESSAGE);

    System.out.println();
    System.out.println("Produto cadastrado");
    System.out.println();
    System.out.println("Nome: " + nome + "\nModelo: " + modelo + "\nTamanho:" + tamanho + "\nPreço: " + precoDouble + "\nQuantidade: " + quantidade);





    scanner.close();
    }

    
       
}
