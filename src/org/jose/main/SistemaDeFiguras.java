/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jose.main;

/**
 *
 * @author garci
 */
// Clase abstracta Figura
abstract class Figura {
    // Métodos abstractos para calcular el área y el perímetro
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

// Clase que representa un círculo
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Implementación del método calcularPerimetro
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

// Clase que representa un rectángulo
class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    // Implementación del método calcularPerimetro
    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}

// Clase principal para probar el sistema de figuras
public class SistemaDeFiguras {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
}

