package model;

import java.util.ArrayList;
import java.util.Hashtable;

public class Produto {
    private String nome;
    private String descricao;
    private Hashtable<Site, ArrayList<PrecoData> > precos;
    private ArrayList<Categoria> categorias;

    public Produto(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        this.precos = new Hashtable<>();
        this.categorias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Hashtable<Site, ArrayList<PrecoData>> getPrecos() {
        return precos;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecos(Hashtable<Site, ArrayList<PrecoData>> precos) {
        this.precos = precos;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void adicionarCategoria(String nomeCategoria){
        Categoria categoria = new Categoria(nomeCategoria);
        categorias.add(categoria);
    }

    public void adicionarSite(String nomeSite){
        Site site = new Site(nomeSite);
        ArrayList<PrecoData> precosDatas = new ArrayList<>();
        precos.put(site, precosDatas);
    }

    public boolean adicionarPrecos(Site site, String data, float valor){
        PrecoData precoData = new PrecoData(valor, data);

        if(precos.containsKey(site)){
            precos.get(site).add(precoData);
            return true;
        }
        return false;
    }

}
