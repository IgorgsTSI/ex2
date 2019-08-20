package br.edu.ifsul.teste1.control;

import br.edu.ifsul.teste1.model.Produto;

public class AppProduto {

    public static void main(String[] args) {
        Produto produto = new Produto();
        System.out.println(produto);
        System.out.println(produto.getValor());
    }
}
