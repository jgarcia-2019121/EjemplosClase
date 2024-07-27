/*
    Jonathan José Gracía Juárez
    IN5AM
    2019121
    Fecha Creación:
        01-03-2023
    Fecha Modificaciones:
        01-03-2023
*/
package org.jonathangarcia.bean;


public class Sumar {
    int valor1;
    int valor2;
    
    public Sumar(){    
    }
    
    // Constructor con argumentos
    public Sumar (int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2; 
    }
    
    public int getValor1(){
        return valor1;
    }
    
    public int getValor2(){
        return valor2;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    
    
    public int sumatoria(int valor, int valor2){
        return valor1 + valor2;
    }
}
