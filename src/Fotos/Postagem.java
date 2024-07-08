package Fotos;

import Fotos.Data;

public class Postagem {
    private String foto;
    private String legenda;
    private Data d;

    public Postagem(String foto, String legenda, Data hoje){
        this.foto = foto;
        this.legenda = legenda;
        this.d = hoje;
    }

    public void mostrarDados(){
        System.out.print(foto + "\n");
        System.out.print(legenda + "\n");
        System.out.print(d + "\n");
    }
}
