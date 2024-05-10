package Trabalhos;
public abstract class Funcionario {
    private String nome;
    private int matricula;
    private int horasTrabalho;
    private float valorHora;

    public Funcionario(){
    }
    
    public Funcionario(String nome, int matricula, int horasTrabalho, float valorHora) {
        this.nome = nome;
        this.matricula = matricula;
        this.horasTrabalho = horasTrabalho;
        this.valorHora = valorHora;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getMatricula() {
        return matricula;
    }
   
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }
    
    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }
    
    public float getValorHora() {
        return valorHora;
    }
    
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }



    public abstract float calcularSalario();

    @Override
    public String toString() {
        return "Funcionario: " + nome + 
        "\nMatricula: " + matricula;
    }

    

    
}
