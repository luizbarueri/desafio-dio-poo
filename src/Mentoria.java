public class Mentoria extends Conteudo {
    
    private String data;

    //Contrutor
    public Mentoria() {
     
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    
     //get  
    public String getData() {
        return data;
    }
    //set
    public void setData(String data) {
        this.data = data;
    }

}
