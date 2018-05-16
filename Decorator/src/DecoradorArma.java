/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public abstract class DecoradorArma implements Arma{
    Arma armaDecorada;
    
    public DecoradorArma(Arma armaDecorada) {
        this.armaDecorada=armaDecorada;
    }
    
}
