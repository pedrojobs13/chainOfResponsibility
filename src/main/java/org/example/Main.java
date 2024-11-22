package org.example;

import org.example.model.Pedido;
import org.example.service.CalculadoraPontosService;

public class Main {
    public static void main(String[] args) {
        CalculadoraPontosService calculadoraPontosService = new CalculadoraPontosService();


        System.out.println(calculadoraPontosService.calcular(new Pedido(21.00), 15));
    }
}