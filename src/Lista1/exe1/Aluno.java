package Lista1.exe1;

public class Aluno{
    public int numero, idade;
    public String nome;
    public float p1, p2;

    // construtores

    public Aluno(){

    }

    public Aluno(int numero, int idade, String nome, float p1, float p2){
        this.numero = numero;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    public String dadosAluno(){
        return "Número: " + this.numero +
               "\n Nome: " + this.nome +
               "\n Idade: " + this.idade +
               "\n Média: " + this.notaFinal() +
               "\n Foi " + this.passou();
    }

    public float notaFinal(){
        return (this.p1 + this.p2) * 2;
    }

    public String passou(){
        if(this.notaFinal() >= 6){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }
}
