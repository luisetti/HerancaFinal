public class IngressoVIP extends Ingresso{

    private float valorAdicional;

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public float getValorAdicional() {
        return valorAdicional;
    }

    public IngressoVIP(float valor, float valorAdicional){
        super(valor);
        this.valorAdicional = valorAdicional;
    }
    public IngressoVIP(){

    }

    public String toString(){

        return "O valor total é: R$" + (valorAdicional+getValor());

    }




}
