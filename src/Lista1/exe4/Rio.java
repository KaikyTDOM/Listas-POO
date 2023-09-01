package Lista1.exe4;

public class Rio{
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(){

    }

    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void poluir(){
        this.poluido = true;
    }

    public void limpar(){
        this.poluido = false;
    }

    public void chover(float x){
        this.nivel += x;
    }

    public void ensolarar(float x){
        if(x <= this.nivel){
            this.nivel -= x;
        }
        else{
            this.nivel = 0;
        }
    }

    public String mostrar(){
        return "Nome: " + this.nome + " Nível: " + this.nivel + ((this.poluido) ? " Sim" : " Não");
    }
}
