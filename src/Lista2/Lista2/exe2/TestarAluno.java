package Lista2.exe2;

public class TestarAluno{

    public static void main(String[] args){

        Aluno obj1 = new Aluno();
        obj1.setNumeroAluno(123456);
        obj1.setNome("Kaiky");
        obj1.setIdade(19);
        obj1.setP1(7);
        obj1.setP2(9);
        System.out.println(obj1.dadosAluno());
        System.out.println(obj1.notaFinal());
    }
}
