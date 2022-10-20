
public class ContenedorMedicamentos {
    private Medicamento [] medicamento;
    private int cantidad;

    public ContenedorMedicamentos(){
        medicamento = new Medicamento[3];
        for(int i=0;i<3;i++) {
            medicamento[i] = null;
        }

    }
    public void agregarMed(Medicamento medi){
        boolean YaExiste = false;
        if(cantidad < 3){
            for(int i = 0;i<cantidad;i++){
                if(medicamento[i].getTipo() == medi.getTipo()){
                    System.out.println("Ya existe un medicamento de ese tipo en este estante");
                    YaExiste = true;
                }
            }
            if(YaExiste == false){
                medicamento[cantidad++] = medi;
            }
        }
        else {
            System.out.println("Ya no hay mas espacio en esta estanteria");
        }

    }
    public void mostrarMedicamentos(){
        for(int i=0;i<cantidad;i++){
            System.out.println(medicamento[i]);
        }
    }
}
