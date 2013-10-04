/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse460.project;

/**
 *
 * @author Justin
 */
public class Guest {
    private String name;
    private double tailoredPercent;
    
    public Guest()
    {
        name = "Guest";
    }
    
    public void setTailoredPercent(double inputPercent)
    {
        tailoredPercent = inputPercent;
    }
    
    public void setName(String inputName)
    {
        name = inputName;
    }
    
    public double getPercent()
    {
        return tailoredPercent;
    }
    
    public String getName()
    {
        return name;
    }
}
