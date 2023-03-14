/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeK;

import javax.swing.Icon;

/**
 *
 * @author HP
 */
public class ModelUse {

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the picture
     */
    public Icon getPicture() {
        return picture;
    }

    /**
     * @param picture the picture to set
     */
    public void setPicture(Icon picture) {
        this.picture = picture;
    }

    public ModelUse() {
    }

    public ModelUse(int number, String text, Icon picture) {
        this.number = number;
        this.text = text;
        this.picture = picture;
    }
    
    
    private int number; 
    private String text;
    private Icon picture; 
    
}
