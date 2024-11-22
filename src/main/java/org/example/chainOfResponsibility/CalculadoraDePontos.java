package org.example.chainOfResponsibility;

import org.example.model.Pedido;

public interface CalculadoraDePontos {
    Integer calculadoraPontos(Pedido pedido);

    void setProximo(CalculadoraDePontos calculadoraDePontos);

    CalculadoraDePontos getProximo();

}
