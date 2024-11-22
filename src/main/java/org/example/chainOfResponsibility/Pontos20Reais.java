package org.example.chainOfResponsibility;

import org.example.model.Pedido;

public class Pontos20Reais implements CalculadoraDePontos {
    private CalculadoraDePontos calculadoraDePontos;

    public Pontos20Reais(CalculadoraDePontos calculadoraDePontos){
        this.calculadoraDePontos = calculadoraDePontos;
    }

    @Override
    public Integer calculadoraPontos(Pedido pedido) {
        if (pedido.getValor() >= 20) {
            return (int) (pedido.getValor() / 10);
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
