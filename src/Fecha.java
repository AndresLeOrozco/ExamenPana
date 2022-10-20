public class Fecha {
    private int Dia;
    private int Mes;
    private int Anio;

    Fecha(int D,int M,int A){
        Dia = D;
        Mes = M;
        Anio = A;
    }
    public String toString(){
        return Dia+"/"+Mes+"/"+Anio;
    }

}
