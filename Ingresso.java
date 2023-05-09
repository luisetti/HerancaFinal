public class Ingresso {

    private float valor;

    public void setValor(float valor) {
        this.valor = valor;
    }
    public float getValor() {
        return valor;
    }

    public String toString(){
        return "O valor do ingresso é: R$" + this.valor;
    }

    public Ingresso(){
        
    }
    public Ingresso(float valor){
        this.valor = valor;
    }
}
