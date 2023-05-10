public class Gerente extends Empregado{
    
    private String departamento;

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    } 
    public String getDeparmento() {
        return departamento;
    }    

    public Gerente(String nome,float salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }
    public Gerente(){

    }

}
