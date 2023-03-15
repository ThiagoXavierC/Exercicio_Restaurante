public class Hamburguer {


    public String nome;
    public Double valor;
    public boolean artesanal;

    public Double valorPizza(Double valor, boolean artesanal){
        if(artesanal){
            valor += 8.0;
        }
        return this.valor;
    }
    public String getNome(){
        return this.nome;
    }
}
