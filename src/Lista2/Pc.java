package Lista2;

public class Pc{
    private String marca, modelo;
    private String processador;
    private int ram, disco;

    public Pc(){

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setProcessador(String processador){
        this.processador = processador;
    }

    public String getProcessador() {
        return processador;
    }

    public void setRam(int ram) {
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

    public void setDisco(int disco) {
        if((disco > 0) && (disco % 2 == 0)){
            this.disco = disco;
        }
        else{
            this.disco = 0;
        }
    }

    public int getDisco() {
        return disco;
    }
}
