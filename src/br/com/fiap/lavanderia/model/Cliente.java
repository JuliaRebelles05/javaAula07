package br.com.fiap.lavanderia.model;

public class Cliente extends Pessoa {

    private boolean assinante;

    public void pagar(double valor){
        if (assinante)
            valor *= 0.9;
        System.out.printf(nome + "Valor a ser pago: " + valor);
    }
    public boolean isAssinante() {
        return assinante;
    }

    public void setAssinante(boolean assinante) {
        this.assinante = assinante;
    }
}
