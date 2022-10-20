public class Estanteria {
    private Medicamento [][] estanteria;
    private int filas;
    private int columnas;
    private int cantidad;

    public Estanteria(int Fila, int Columna){
        estanteria = new Medicamento[Fila][Columna];
        filas = Fila;
        columnas = Columna;
        cantidad = 0;
        for(int i = 0;i<Fila;i++){
            for(int j=0;j<Columna;j++){
                estanteria[i][j] = null;
            }
        }
    }
    public void MostrarEstanteria(){
        for(int i = 0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                if(estanteria[i][j] != null) {
                    System.out.print(estanteria[i][j]); System.out.print("          ");
                }
                else{
                    System.out.print("             ");
                }
            }
            System.out.print("\n");
        }
    }
    public void InsertarElemento(Medicamento med, int F, int C){
        if(F < filas && C < columnas){
            if(estanteria[F][C] == null){
                estanteria[F][C] = med;
                cantidad++;
            }
            else{
                System.out.println("Ese espacio ya tiene un medicamento");
            }
        }else{
            System.out.println("Ese espacio no existe");
        }
    }
    public Medicamento Entregar(String per,int F,int C,String Fech){
        if(F < filas && C < columnas){
            if(estanteria[F][C] != null){
                Medicamento m = estanteria[F][C];
                m.setNomPersonaQueRetira(per);
                m.setRetiro(Fech);
                estanteria[F][C] = null;
                cantidad--;
                return m;
            }
            else{
               return null;
            }
        }else {
            return null;
        }
    }
    public void ImprimirEstatdisticas(){
        double Cre = 0, Jar = 0, pas = 0;
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                if(estanteria[i][j] != null){
                    if(estanteria[i][j].getTipo().equals("Pastillas")){
                        pas++;
                    }
                    if(estanteria[i][j].getTipo().equals("Crema")){
                        Cre++;
                    }
                    if(estanteria[i][j].getTipo().equals("Jarabe")){
                        Jar++;
                    }
                }
            }
        }
        System.out.println("\tEstadisticas: ");
        double pstat = (pas/cantidad)*100;
        double cstat = (Cre/cantidad)*100;
        double jstat = (Jar/cantidad)*100;
        System.out.println("Pastillas: "+pstat+" Cremas: "+cstat+" Jarabes: "+ jstat);
    }
}
