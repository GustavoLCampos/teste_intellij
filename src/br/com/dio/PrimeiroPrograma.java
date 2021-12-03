package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro Livro1 = new Livro("O problema", 200);
        System.out.println(Livro1);

        /*int a = 5;
        int b =3;

        System.out.println("Hello World!" + (a+b));*/
    }
}
class Livro {
    private String name;
    private Integer nuuPag;

    public Livro(String name, Integer nuuPag) {
        this.name = name;
        this.nuuPag = nuuPag;
    }

    public Integer getNuuPag() {
        return nuuPag;
    }

    public void setNuuPag(Integer nuuPag) {
        this.nuuPag = nuuPag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}