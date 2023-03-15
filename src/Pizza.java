public class Pizza {

    public String nome;
    public Double valor;
    public boolean borda;

    public Double valorPizza (Double valor, boolean borda){
        if (borda){
            valor += 5.0;
        }
        return this.valor;
    }
    public String getNome(){
        return this.nome;
    }
}
