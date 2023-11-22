package model;

import java.time.LocalDate;

public class PrecoData {
    private String data;
    private float valor;

    public PrecoData(float valor, String data){
        this.valor = valor;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public float getValor() {
        return valor;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
