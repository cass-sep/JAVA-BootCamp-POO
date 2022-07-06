package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class ProdutoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informar os dados do produto");
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        Produto celular = new Produto(nome, preco, quantidade);
        System.out.printf("\n%s R$ %.2f %d unidades;", celular.nome, celular.valorUnitario, celular.quantidade);
        System.out.printf("\nImposto: R$ %.2f.", celular.valorImposto());
        System.out.printf("\nTotal em estoque: R$ %.2f.", celular.valorEstoque());

        sc.close();
    }
}
