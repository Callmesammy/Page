/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component;

import javax.swing.Icon;

/**
 *
 * @author HP
 */
public class ModelUser {

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
     * @return the decimal
     */
    public int getDecimal() {
        return decimal;
    }

    /**
     * @param decimal the decimal to set
     */
    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public ModelUser() {
    }

    public ModelUser(Icon picture, String text, int decimal) {
        this.picture = picture;
        this.text = text;
        this.decimal = decimal;
    }
    
    private Icon picture;
    private String text;
    private int decimal;
    
}
