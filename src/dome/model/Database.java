/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dome.model;

import java.util.ArrayList;

/**
 *
 * @author rodrigo
 */
public class Database {
    private ArrayList<CD> cds;
    private ArrayList<DVD> dvds;
    
    public Database() {
        cds = new ArrayList<>();
        dvds = new ArrayList<>();
    }
    
    public void addCD(CD cd) {
        cds.add(cd);
    }
    
    public void addDVD(DVD dvd) {
        dvds.add(dvd);
    }
    
    public void list() {
        for (CD cd : cds) {
            cd.print();
            System.out.println();
        }
        
        for (DVD dvd : dvds) {
            dvd.print();
            System.out.println();
        }
    }
}
