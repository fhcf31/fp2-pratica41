/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Fernando
 */
public class Elipse {
    private double eixoX = 0;
    private double eixoY = 0;
    
    public Elipse(double eixoX,double eixoY){
        this.eixoX = eixoX;
        this.eixoY = eixoY;
    }
    
    public double getArea(){
        return Math.PI*eixoX*eixoY;
    }
    
    public double getPerimetro(){
        return Math.PI*(3*(eixoX+eixoY) - Math.sqrt((3*eixoX+eixoY)*(eixoX+3*eixoY)));
    }
    
    public double getEixoX(){
        return eixoX;
    }
    
    public double getEixoY(){
        return eixoY;
    }
}
