package Lista2;

public class Pc{
    private String marca, modelo;
    private String processador;
    private int ram, disco;

    public Pc(){

    }

    public Pc(String marca, String modelo, String processador, int ram, int disco){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setProcessador(processador);
        this.setRam(ram);
        this.setDisco(disco);
    }
    public final void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public final void setProcessador(String processador){
        this.processador = processador;
    }

    public String getProcessador() {
        return processador;
    }

    public final void setRam(int ram) {
        if((ram > 0) && (ram % 2 == 0)){
            this.ram = ram;
        }
        else{
            this.ram = 0;
        }
    }

    public int getRam(){
        return this.ram;
    }

    public final void setDisco(int disco) {
        if(disco % 128 == 0){
            this.disco = disco;
        }
        else{
            this.disco = 0;
        }
    }

    public int getDisco() {
        return disco;
    }

    @Override
    public String toString(){
        return ("\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nProcessador: " + this.processador +
                "\nRam: " + this.ram +
                "\nDisco: " + this.disco);
    }
}
