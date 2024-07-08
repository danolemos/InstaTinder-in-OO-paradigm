package Fotos;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data (int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public String toString(){
        return Integer.parseInt(String.valueOf(this.dia)) + "/" + Integer.parseInt(String.valueOf(this.mes)) + "/" + Integer.parseInt(String.valueOf(this.ano));
    }

    public boolean anterior(Data data1, Data data2){
        if (data1.ano < data2.ano){return true;}
        else{
            if (data1.mes < data2.mes) {
                return true;
            }
            else{
                return data1.dia < data2.dia;
            }
        }
    }
}
