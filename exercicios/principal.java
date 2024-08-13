package aulasAlura.exercicios;

public class principal {
    public static void main(String[] args) {
        idadePessoa gabriel = new idadePessoa();

        gabriel.setNome("Gabriel Silva");
        gabriel.setIdade(20);

        System.out.println("Nome: " + gabriel.getNome());
        System.out.println("Idade: " + gabriel.getIdade());
    }
}
