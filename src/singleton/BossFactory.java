/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author zigis
 */
public class BossFactory implements VaateTehdas {
    Farkut farkut = null;
    Lippis lippis = null;
    Kengat kengat = null;
    Paita paita = null;
    private static BossFactory BOSSINSTANCE = null;
    
    private BossFactory() {
        
    }
    
    public static BossFactory getInstance() {
        if (BOSSINSTANCE == null) {
            BOSSINSTANCE = new BossFactory();
        }
        return BOSSINSTANCE;
    }

    @Override
    public void luoFarkut() {
        farkut = new BossFarkut();
    }

    @Override
    public void luoLippis() {
        lippis = new BossLippis();
    }

    @Override
    public void luoKengat() {
        kengat = new BossKengat();
    }

    @Override
    public void luoPaita() {
        paita = new BossPaita();
    }
    
    public String toString() {
        return farkut + ", " + lippis + ", " + paita + " sekä " + kengat;
    }
    
}
