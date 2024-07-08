package Fotos;

import java.util.ArrayList;

public class Sistema {

    private ArrayList <Pessoa> pessoas = new ArrayList <Pessoa>() ;
    private ArrayList <Empresa> empresas = new ArrayList <Empresa>() ;

    public Usuario buscarUsuario(String login) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).login.equals(login)) {
                return pessoas.get(i);
            }
        }

        for (int i = 0; i < empresas.size(); i++) {
            if (empresas.get(i).login.equals(login)) {
                return empresas.get(i);
            }
        }
        return null;
    }

    public void novaPessoa (Pessoa p) {
        pessoas.add(p);
    }

    public void novaEmpresa (Empresa emp) {
        empresas.add(emp);
    }

    public void listarUsuarios(){
        System.out.println("Lista de pessoas: ");
        for (int i = 0; i < pessoas.size(); i++){
            System.out.println(pessoas.get(i).nome + "\n");
        }

        System.out.println("Lista de empresas: ");
        for (int i = 0; i < empresas.size(); i++){
            System.out.println(empresas.get(i).nome + "\n");
        }
    }
}
