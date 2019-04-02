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
public class AdidasFactory implements VaateTehdas {
    Farkut farkut = null;
    Lippis lippis = null;
    Kengat kengat = null;
    Paita paita = null;
    private static AdidasFactory INSTANCE = null;
    
    private AdidasFactory() {
        
    }
    
    public static AdidasFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AdidasFactory();
        }
        return INSTANCE;
    }

    @Override
    public void luoFarkut() {
        farkut = new AdidasFarkut();
    }

    @Override
    public void luoLippis() {
        lippis = new AdidasLippis();
    }

    @Override
    public void luoKengat() {
        kengat = new AdidasKengat();
    }

    @Override
    public void luoPaita() {
        paita = new AdidasPaita();
    }
    
    public String toString() {
        return farkut + ", " + lippis + ", " + paita + " sekä " + kengat;
    }
    
}
