/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6;

/**
 *
 * @author Guilherme
 */
public class Piloto {
    private String name;
    private double [] voltas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getVoltas() {
        return voltas;
    }

    public void setVoltas(double[] voltas) {
        this.voltas = voltas;
    }

    public Piloto(String name, double[] voltas) {
        this.name = name;
        this.voltas = voltas;
    }
      
}
