package controller;

import model.*;
import java.util.ArrayList;
import java.util.Hashtable;

public class Operador {
    private Hashtable<Produto, Hashtable<Site, ArrayList<PrecoData>>> produtos;

    public Operador() {
        produtos = new Hashtable<>();
    }

    public Hashtable<Produto, Hashtable<Site, ArrayList<PrecoData>>> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        if (!produtos.containsKey(produto)) {
            produtos.put(produto, new Hashtable<>());
        }
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void adicionarSiteAoProduto(Produto produto, Site site) {
        if (produtos.containsKey(produto)) {
            produtos.get(produto).put(site, new ArrayList<>());
        }
    }

    public void adicionarPrecoDataAoProduto(Produto produto, Site site, String data, float valor) {
        if (produtos.containsKey(produto) && produtos.get(produto).containsKey(site)) {
            PrecoData precoData = new PrecoData(valor, data);
            produtos.get(produto).get(site).add(precoData);
        }
    }

    public void removerSiteDoProduto(Produto produto, Site site) {
        if (produtos.containsKey(produto)) {
            produtos.get(produto).remove(site);
        }
    }

    public void removerPrecoDataDoProduto(Produto produto, Site site, PrecoData precoData) {
        if (produtos.containsKey(produto) && produtos.get(produto).containsKey(site)) {
            produtos.get(produto).get(site).remove(precoData);
        }
    }
}
