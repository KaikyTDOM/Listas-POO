package Lista2;

public class TestaPc{

    public  static void main(String[] args){
        Pc obj1 = new Pc();
        obj1.setMarca("Lenovo");
        obj1.setModelo("IdeaPad 3");
        obj1.setProcessador("Intel I3-4200U");
        obj1.setRam(4);
        obj1.setDisco(512);

        System.out.println("Marca: " + obj1.getMarca());
        System.out.println("Modelo: " + obj1.getModelo());
        System.out.println("Processador: " + obj1.getProcessador());
        System.out.println("Ram: " + obj1.getRam());
        System.out.println("Disco: " + obj1.getDisco());

        Pc obj2 = new Pc("Acer", "Aspire 5", "I7", 8, 500);

        System.out.println("\nMarca: " + obj2.getMarca());
        System.out.println("Modelo: " + obj2.getModelo());
        System.out.println("Processador: " + obj2.getProcessador());
        System.out.println("Ram: " + obj2.getRam());
        System.out.println("Disco: " + obj2.getDisco());

        System.out.println(obj1.toString());
    }
}
