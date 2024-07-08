package Fotos;

import java.util.ArrayList;

public class Pessoa extends Usuario {
        private String cpf, bio;

        private Data nasc;

        private ArrayList interesses = new ArrayList < Usuario >();


        public Pessoa(String login, String nome, String senha, String cpf, int dia, int mes, int ano){
                this.login = login;
                this.nome = nome;
                super.senha = senha;
                this.cpf = cpf;
                this.nasc = new Data(dia, mes, ano);
        }

        public String toString(){
                return nome + " (" + login + " - " + cpf + ")";
        }
}