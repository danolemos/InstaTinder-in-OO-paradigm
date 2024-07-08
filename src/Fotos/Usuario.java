package Fotos;

import java.util.ArrayList;

public class Usuario {
    protected String login, nome, senha;
    protected Localidade cidade;

    protected ArrayList < Usuario > seguindo = new ArrayList < Usuario >();
    protected ArrayList < Usuario > seguidores = new ArrayList < Usuario >() ;
    protected ArrayList <Pessoa> interessados = new ArrayList <Pessoa>() ;
    protected ArrayList <Postagem> posts = new ArrayList <Postagem>() ;

    public boolean validarAcesso(String pwd){
        return true;
    }

    public String toString(){
        return this.nome + this.login;
    }

    public void postar(String f, String leg, Data hoje, String senha) {

        // criar postagem //
        Postagem p = new Postagem(f, leg, hoje);

        if (senha.equals(this.senha)) {
            // inserir na lista de posts //
            posts.add(p);
        }
    }

    public void seguir(Usuario u){
            seguindo.add(u);
        };

    public void mostrarPosts(){
        for (int i = 0; i < posts.size() ; i++){
            this.posts.get(i).mostrarDados();
            System.out.println("*");
        }
    }

    public void feed(){

        // O método feed exibe todos os posts de todos os usuários que ele segue //

        System.out.println("Feed de " + this.login + ":\n*");
        for (int i = 0; i < seguindo.size(); i++) {
            for (int j = 0; j < seguindo.get(i).posts.size() ; j++) {
                System.out.println(seguindo.get(i).toString());
                seguindo.get(i).posts.get(j).mostrarDados();
                System.out.println("*");
            }
        }
    }
}
