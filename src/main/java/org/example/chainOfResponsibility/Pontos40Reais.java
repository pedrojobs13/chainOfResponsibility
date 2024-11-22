package org.example.chainOfResponsibility;

import org.example.model.Pedido;

public class Pontos40Reais implements CalculadoraDePontos {
    private CalculadoraDePontos calculadoraDePontos;

    public Pontos40Reais(CalculadoraDePontos calculadoraDePontos) {
        this.calculadoraDePontos = calculadoraDePontos;
    }

    @Override
    public Integer calculadoraPontos(Pedido pedido) {
        if (pedido.getValor() >= 40) {
            return (int) (pedido.getValor() / 7);
        }
        return calculadoraDePontos.calculadoraPontos(pedido);
    }

    @Override
    public void setProximo(CalculadoraDePontos prox) {
        this.calculadoraDePontos = prox;
    }

    @Override
    public CalculadoraDePontos getProximo() {
        return calculadoraDePontos;
    }
}
