package org.example.chainOfResponsibility;

import org.example.model.Pedido;

public class NenhumPonto implements CalculadoraDePontos{
    @Override
    public Integer calculadoraPontos(Pedido pedido) {
        return 0;
    }

    @Override
    public void setProximo(CalculadoraDePontos calculadoraDePontos) {

    }

    @Override
    public CalculadoraDePontos getProximo() {
        return null;
    }
}
