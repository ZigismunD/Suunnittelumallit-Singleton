/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author zigis
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        VaateTehdas jasper  = BossFactory.getInstance();
        jasper.luoFarkut();
        jasper.luoLippis();
        jasper.luoKengat();
        jasper.luoPaita();
        System.out.println("Jasperilla on päällään: " + jasper);

    }

}
