/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculos2;

/**
 *
 * @author guilherme62977766
 */
public class Carro extends Veiculo{
    
    private int quantidadePortas;
    
    public int getQuantidadePortas(){
        return this.quantidadePortas;
    }
    
    public void setQuantidadePortas(){
        this.quantidadePortas = quantidadePortas;
    }
    
    public Carro(int quantidadePortas, String marca){
        super(marca);
        this.quantidadePortas = quantidadePortas;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
