/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author carlo
 */
public class ContaCorrente extends Conta {
    
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa * 2);
    }
    @Override
    public void deposita(double quantidade) { //método
        this.saldo = this.saldo + quantidade - 1;
    }
    
}
