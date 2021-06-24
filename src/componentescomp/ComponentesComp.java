/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentescomp;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
import ico.fes.componentes.computadora;
/**
 *
 * @author User
 */
public class ComponentesComp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     computadora c1 =new computadora(new CPU("AMD Ryzen9", "3900X", 3), new Monitor("BenQ", "Mobiuz", 27), new Mouse("Logitech", "G703", "Óptico"), new Teclado("Logitech", "G915 TKL", 89, 0));
        System.out.println(c1);
    }

}
