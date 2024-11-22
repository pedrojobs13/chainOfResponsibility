package org.example.service;

import org.example.chainOfResponsibility.*;
import org.example.model.Pedido;

import java.util.Arrays;
import java.util.List;

public class CalculadoraPontosService {
    private Pontos70Reais pontos70Reais;
    private Pontos40Reais pontos40Reais;
    private Pontos20Reais pontos20Reais;
    private NenhumPonto nenhumPonto;

    public Integer calcular(Pedido pedido, Integer dia) {
        nenhumPonto = new NenhumPonto();
        pontos20Reais = new Pontos20Reais(nenhumPonto);
        pontos40Reais = new Pontos40Reais(pontos20Reais);
        pontos70Reais = new Pontos70Reais(pontos40Reais);

        List<CalculadoraDePontos> calculadoras = Arrays.asList(pontos70Reais, pontos40Reais, pontos20Reais, nenhumPonto);


        calculadoras
                .forEach(calculadoraDePontos -> calculadoraDePontos.setProximo(calculadoraDePontos.getProximo()));

        if (dia >= 16 && dia <= 31) {
            return pontos70Reais.calculadoraPontos(pedido) * 2;
        }

        return pontos70Reais.calculadoraPontos(pedido);
    }
}
