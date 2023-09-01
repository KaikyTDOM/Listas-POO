package Lista1.exe2;

public class Cliente{

    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente(){

    }

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(float valor){
        this.saldo += valor; // this.saldo = this.saldo + valor
        System.out.println("Depósito realizado com sucesso");
    }

    public void sacar(float valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }
        else {
            System.out.println("Saldo não pde ficar negativo");
        }
    }

    public String mostra(){
        return "Nro conta: " + this.numeroConta + " Nro agência " + this.numeroAgencia +
                " Nome " + this.nome + " Saldo " + this.saldo;
    }
}
