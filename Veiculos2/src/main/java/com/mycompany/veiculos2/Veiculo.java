/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculos2;

/**
 *
 * @author guilherme62977766
 */
public class Veiculo {
    
private String marca;
    private double velocidade;
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
        
    }
    
    public Veiculo(String marca){
        this.marca = marca;
        this.velocidade = 0;
    }
    
 public void acelerar(){
    this.velocidade = this.velocidade + 10;
     System.out.println("Vrum vrum vrum...Acelerando...");
     
 }
  }
