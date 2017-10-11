
package ContaBancaria;

public class Conta {
    //Atributo
    private double saldo;
    
    
   //Metodo contrutor get
    public double getSaldo() {
        return saldo;
    }
    
    //Métodos
    public void deposita(){
    
    }
    
    public void saca(){
    
    }
    
    public void atualiza(double p){
    double porcentagem;
        System.out.println("Saldo Atual:"+ this.saldo);
    porcentagem = (p * this.saldo) / 100;
    this.saldo+=porcentagem;
        System.out.println("Saldo Atualizado:" + this.saldo);
    }
}
