/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dome.model;

/**
 *
 * @author rodrigo
 */
public class DVD {
    private String title;
    private String director;
    private int playingTime;
    private boolean owned;
    private String comment;

    public DVD(String title, String director, int playingTime) {
        this.title = title;
        this.director = director;
        this.playingTime = playingTime;
        this.owned = false;
        this.comment = "";
    }

    public boolean isOwned() {
        return owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public void print() {
        System.out.print("DVD: " + title + " (" + playingTime + " mins)");
        
        if (owned) {
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("     " + director);
        System.out.println("     " + comment);
    }
    
    
}
