
public class Curso extends Conteudo {

    private int cargaHorarria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHorarria;
    }

    //Contrutor
    public Curso() {

    }
    //get
    public int getCargaHorarria() {
        return cargaHorarria;
    }
    //set
    public void setCargaHorarria(int cargaHorarria) {
        this.cargaHorarria = cargaHorarria;
    }
    
}
