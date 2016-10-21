/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author melissacordero
 */
public class Examen {
    public String user = "Admin";
    public String password = "Admin";
    public double A;
    public double B;
    public double C;
    public double X1;
    public double x2; 
    public double discriminante;
    public double pi = 3.14;

    public Examen() {
    }

    public double areaCilindro(double r, double h)
    {
        return (2 * pi * r) * (h + r);
    }
    public double volumenCilindro(double r, double h)
    {
        return (3.14 * (r * r) * h);
    }    
    public double areaEsfera(double r)
    {
        return (4 * pi * (r * r));
    }
    public double volumenEsfera(double r)
    {
        return ((4/3) * pi * (r * r));
    }
    public double areaCono(double r, double g)
    {
        return (pi * (r * r)) + (pi * r * g);
    }
    public double volumenCono(double r, double h)
    {
        return (pi * (r * r) * h) / 3;
    }
    public double areaCubo(double a)
    {
        return (6 * (a * a));
    }
    public double volumenCubo(double a)
    {
        return (a * a);
    }    
   public double discriminante(double a, double b, double c)
    {
        return ((b*b)-(4*(a*c)));
    }   
}
