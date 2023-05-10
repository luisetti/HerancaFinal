public class Empregado {
    public String nome;
    protected float salario;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setSalario(float salario){
        this.salario=salario;
    }
    public float getSalario(){
        return salario;
    }

    public Empregado(String nome, float salario){
        this.nome = nome;
        this.salario=salario;
    }

    public Empregado(){

    }
    public String toString(){
        return "O nome do empregado é: " + (nome+getNome());
    }
}
