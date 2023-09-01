package Lista2.exe2;

public class Aluno{

    private int numeroAluno, idade;
    private String nome;
    private float p1, p2;

    public Aluno(){

    }

    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void setNumeroAluno(int numeroAluno){
        String numeroAlunoStr = Integer.toString(numeroAluno);
        if(numeroAlunoStr.length() == 6){
            this.numeroAluno = numeroAluno;
        }
        else{
            System.out.println("O número do aluno deve ter tamanho exatamente igual a 6");
        }
    }

    public int getNumeroAluno(){
        return numeroAluno;
    }

    public void setNome(String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else{
            System.out.println("O nome excedeu o limite de caracteres!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        }
        else{
            System.out.println("A idade não pode ser negativa");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setP1(float p1) {
        if(p1 >= 0){
            this.p1 = p1;
        }
        else{
            System.out.println("A nota da P1 não pode ser negativa");
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP2(float p2) {
        if(p2 >= 0){
            this.p2 = p2;
        }
        else{
            System.out.println("A nota da P2 não pode ser negativa");
        }
    }

    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }

    public String dadosAluno(){
        return "Número do Aluno: " + this.numeroAluno +
                "\nNome: " + this.nome +
                "\nIdade: " + this.idade;
    }
}
