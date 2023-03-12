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
public class modelDone {

    /**
     * @return the Username
     */
    public int getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(int Username) {
        this.Username = Username;
    }

    /**
     * @return the profile
     */
    public Icon getProfile() {
        return profile;
    }

    /**
     * @param profile the profile to set
     */
    public void setProfile(Icon profile) {
        this.profile = profile;
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

    public modelDone() {
    }

    public modelDone(int Username, Icon profile, String text) {
        this.Username = Username;
        this.profile = profile;
        this.text = text;
    }
    
    
    private int Username;
    private Icon profile;
    private String text;
}
