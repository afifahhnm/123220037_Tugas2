/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;


public class Persegi implements OperasiBangunDatar{

    private double panjang, lebar;
    
    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double Luas() {
        return panjang * lebar;
    }
    
    @Override
    public double Keliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double Volume() {
        return 0;
    }

    @Override
    public double LuasPermukaan() {
       return 0;
    }
}

 
    

