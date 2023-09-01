package Lista1.exe4;

public class TestaRio{

    public static void main(String[] args){
        Rio obj1 = new Rio();
        obj1.nome = "Paraná";
        obj1.chover(2);
        obj1.poluir();
        System.out.println(obj1.mostrar());

        Rio obj2 = new Rio("Tietê", 10, true);
        obj1.ensolarar(3);
        obj1.limpar();
        System.out.println(obj2.mostrar());
    }
}
