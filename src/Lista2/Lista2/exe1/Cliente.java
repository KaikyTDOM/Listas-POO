package Lista2.exe1;

public class Cliente{

    private String numeroConta, numeroAgencia, nome;
    private float saldo;

    public Cliente(){

    }

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void setNumeroConta(String numeroConta){
        if(numeroConta.length() == 8 && numeroConta.charAt(6) == '-'){
            this.numeroConta = numeroConta;
        }
        else{
            this.numeroConta = "";
            System.out.println("Número da conta inválida!");
        }
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroAgencia(String numeroAgencia){
        if(numeroAgencia.length() == 6 && numeroAgencia.charAt(4) == '-'){
            this.numeroAgencia = numeroAgencia;
        }
        else{
            this.numeroAgencia = "";
            System.out.println("Número da agência inválida!");
        }
    }

    public String getNumeroAgencia(){
        return numeroAgencia;
    }

    public void setNome(String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else{
            this.nome = "";
            System.out.println("O nome excedeu o limite de caracteres!");
        }
    }

    public String getNome(){
        return nome;
    }

    public void setSaldo(float saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }
        else{
            System.out.println("O saldo está negativo!");
        }
    }

    public float getSaldo(){
        return saldo;
    }

    public void depositar(float x){
        this.setSaldo(this.saldo + x);
    }

    public void sacar(float x){
        this.setSaldo(this.saldo - x);
    }

    public String mostrar(){
        return "-Número da conta: " + this.numeroConta +
                "\n-Número da agência: " + this.numeroAgencia +
                "\n-Nome: " + this.nome +
                "\n-Saldo: " + this.saldo;
    }
}
