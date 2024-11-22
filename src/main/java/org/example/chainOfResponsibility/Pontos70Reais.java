package org.example.chainOfResponsibility;

import org.example.model.Pedido;

public class Pontos70Reais implements CalculadoraDePontos {
    private CalculadoraDePontos prox;

    public Pontos70Reais(CalculadoraDePontos calculadoraDePontos) {
        prox = calculadoraDePontos;
    }

    @Override
    public Integer calculadoraPontos(Pedido pedido) {
        if (pedido.getValor() >= 70) {
            return (int) (pedido.getValor() / 5);
        }

        return prox.calculadoraPontos(pedido);
    }

    @Override
    public void setProximo(CalculadoraDePontos calculadoraDePontos) {
        prox = calculadoraDePontos;
    }

    @Override
    public CalculadoraDePontos getProximo() {
        return prox;
    }
}
