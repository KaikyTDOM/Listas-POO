package Lista2.exe1;

public class TestarCliente{

    public static void main(String[] args){

        Cliente obj1 = new Cliente();
        obj1.setNumeroConta("123456-8");
        obj1.setNumeroAgencia("1234-6");
        obj1.setNome("Maria Novelino");
        obj1.setSaldo(100);
        obj1.depositar(100);
        obj1.sacar(50);
        System.out.println(obj1.mostrar());
    }
}
