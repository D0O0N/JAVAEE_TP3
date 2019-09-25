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
public class tour {
    // Score Actuel / (etat, 2 strike, 1 spare, 0 normal) / nbQuille1 / nbQuille2 / scoreTour
    public Integer info[] = {0,0,0,0,0} ;
    
    public void strike(){
        info[1] = 2;
        info[2] = 10;
        info[3] += 10;
        info[4] += 10;
    }
    public void spare(){
        info[1] = 1;
        info[3] += 10;
        info[4] += 10;
    }
    public void normal(int q,Integer nBoule){
        info[1] = 0;
        if (nBoule == 0) info[2] = q;
        if (nBoule == 1) info[3] = q;;
        info[4] += q;
    }
    public Integer score(){
        return info[4];
    }
}
