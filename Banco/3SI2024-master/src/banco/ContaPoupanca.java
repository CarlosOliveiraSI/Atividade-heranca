/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author carlo
 */
public class ContaPoupanca extends Conta {
    
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa * 3);
    }
    
}
