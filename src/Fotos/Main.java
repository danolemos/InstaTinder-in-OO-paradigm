package Fotos;

public class Main {
    public static void main(String[] args) {
        Sistema s = new Sistema();

        Entrada e = new Entrada();

        int opc = e.menu1();

        while (opc != 0) {
            if (opc == 1) {
                e.cadPessoa(s);
                opc = e.menu1();
            }
            else if (opc == 2) {
                e.cadEmpresa(s);
                opc = e.menu1();
            }
            else if (opc == 3) {
                e.login(s);
                opc = e.menu1();
            }
        };
    }
}