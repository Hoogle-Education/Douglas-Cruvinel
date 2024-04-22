import model.Produto;

import java.util.Scanner;

public class Main {

    public static void apresentarProdutos(Produto[] produtos) {
        System.out.println("----------------------------");

        for(int i=0; i < produtos.length; i++) {
            System.out.println("#" + (i+1) + ": " + produtos[i]);
        }

        System.out.println("----------------------------");
    }

    public static void apresentarMenu() {
        System.out.println("----------------------------");
        System.out.println("Menu");
        System.out.println("1 - Para efetuar venda");
        System.out.println("2 - Para listar os produtos");
        System.out.println("3 - Para sair");
        System.out.print("Digite a opção desejada: ");
    }

    public static void darBaixaEmProduto(String descricao, int quantidade, Produto[] produtos) {
        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i].getDescricao().equals(descricao)) {
                int quantidadeAtual = produtos[i].getQuantidade();
                produtos[i].setQuantidade(quantidadeAtual - quantidade);
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // inicializando um conjunto de produtos
        Produto[] produtos = new Produto[6];

        // cuidado: um vetor com 6 posicoes, vai de zero ate 5

        produtos[0] = new Produto("botao", 20, 0.30);
        produtos[1] = new Produto("linha", 10, 2.60);
        produtos[2] = new Produto("fita", 8, 0.80);
        produtos[3] = new Produto("barbante", 10, 8.00);
        produtos[4] = new Produto("agulha", 8, 5.20);
        produtos[5] = new Produto("ziper", 12, 3.90);

        int opcao;

        apresentarProdutos(produtos);

        // while => verifica => faz
        // do...while => faz => verifica

        do {
            apresentarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("----------------------------");

            System.out.println("############################");
            switch (opcao) {
                case 1 -> {
                    System.out.print("Qual a descricao: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Qual a quantidade: ");
                    int quantidade = scanner.nextInt();
                    darBaixaEmProduto(descricao, quantidade, produtos);
                }
                case 2 -> {
                    apresentarProdutos(produtos);
                }
                case 3 -> {
                    System.out.println("“Encerrando o sistema");
                }
                default -> {
                    System.out.println("Por favor, digite uma opcao valida!");
                }
            }
            System.out.println("############################");

        } while(opcao != 3);

    }
}