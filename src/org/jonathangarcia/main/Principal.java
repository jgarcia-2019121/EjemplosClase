/*
    Jonathan José Gracía Juárez
    IN5AM
    2019121
    Fecha Creación:
        01-03-2023
    Fecha Modificaciones:
        02-03-2023
*/
package org.jonathangarcia.main;
// variable global

import java.util.Scanner;
import javax.swing.JOptionPane;
import org.jonathangarcia.bean.Sumar;
import org.jonathangarcia.bean.Restar;
import org.jonathangarcia.bean.Multiplicacion;
import org.jonathangarcia.bean.Division;
import org.jonathangarcia.bean.Salir;


public class Principal {
    
    public static void main(String[] args) {
        int valor2, resultado;
        Sumar suma = new Sumar(0,0);
        Restar restas = new Restar(0,0);
        Multiplicacion  multipli = new Multiplicacion(0,0);
        Division div = new Division(0,0);
        Salir salida = new Salir();
        boolean op = true;
        
        JOptionPane.showMessageDialog(null, "Jonathan José García Juárez");
        while(op){
        int opciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de opción\n"
                + " 1. Suma\n"
                + " 2. Resta\n"
                + " 3. Multiplicación\n"
                + " 4. División\n"
                + " 5. Salir \n"));
                        
                switch(opciones){
                    case 1:
                            suma.setValor1(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número para sumar")));
                            suma.setValor2(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro número")));
                            JOptionPane.showMessageDialog(null, "El resultado es : " + suma.sumatoria(suma.getValor1(), suma.getValor2()));
                        break;
                        
                    case 2:
                            restas.setValor1(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número para restar")));
                            restas.setValor2(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro número")));
                            JOptionPane.showMessageDialog(null, "El resultado es : " + restas.resta(restas.getValor1(), restas.getValor2()));
                        break;
                        
                    case 3:
                            multipli.setValor1(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número para multiplicar")));
                            multipli.setValor2(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro número")));
                            JOptionPane.showMessageDialog(null, "El resultado es : " + multipli.multi(multipli.getValor1(), multipli.getValor2()));
                        break;
                        
                    case 4:
                            div.setValor1(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número para dividir")));
                            div.setValor2(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro número")));
                            JOptionPane.showMessageDialog(null, "El resultado es : " + div.divi(div.getValor1(), div.getValor2()));
                        break;
                    case 5:
                            JOptionPane.showMessageDialog(null, "Ha salido del programa :/ ");
                            salida.Exit();
                        break;
                    default:
                            JOptionPane.showMessageDialog(null, "Esta opción no es valida, intente con uno que se encuentre disponible ;D");
                }//switch
        }//while
    }//main
}//class

//        int a = 0, b = 0, c = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Jonathan García");
//        System.out.println("Ingrese un número entero");
//        a = sc.nextInt();
//        System.out.println("Ingrese otro número");
//        b = sc.nextInt();
//        c = a + b;
//        System.out.println("El resultado de la suma es: " + c);
//        JOptionPane.showMessageDialog(null, "Jonathan José García Juárez");
//        
        // Permite recoger datos
//        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));
//        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro número"));
//        result = num1 + num2;
//        JOptionPane. showMessageDialog(null, "La Suma de los valoes es: " + result);

