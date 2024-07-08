package Fotos;

import Fotos.Area;
import Fotos.Usuario;

public class Empresa extends Usuario {
    private String cnpj, site, descricao, endereco;
    private Area area;

    public Empresa(String login, String nome, String senha, String cnpj) {
        this.login = login;
        this.nome = nome;
        this.senha = senha;
        this.cnpj = cnpj;
    }

    public String toString(){
        return nome + " (" + login + " - " + cnpj + ")";
    };
}
