/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

/**
 *
 * @author pedago
 */
public class Main {
    public static void main (String[] args){
        System.out.println("Hello World");
        SinglePlayerGame P1 = new SinglePlayerGame();
        System.out.println(P1.score());
    }
    
}
