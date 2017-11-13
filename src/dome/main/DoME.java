/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dome.main;

import dome.model.CD;
import dome.model.DVD;
import dome.model.Database;

/**
 *
 * @author rodrigo
 */
public class DoME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Database db = new Database();
        db.addCD(new CD("Nine Lives", "Aerosmith", 12, 68));
        db.addDVD(new DVD("Romeo and Juliet", "Zefirelli", 120));
        
        db.list();
    }
    
}
