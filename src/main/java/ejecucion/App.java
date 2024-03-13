/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecucion;
import banco.Cuenta;
import banco.DepositarImpl;
import banco.Invoker;
import banco.RetirarImpl;
/**
 *
 * @author Robinson Concha
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta = new Cuenta(1, 200);
        
        DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
        RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);
        
        Invoker ivk = new Invoker();
        ivk.recibirOperacion(opDepositar);
        ivk.recibirOperacion(opRetirar);
        
        ivk.realizarOperaciones();
    }
    
}
