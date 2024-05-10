package Trabalhos;
public class Estagiario extends Funcionario implements Trabalhavel {
    private String supervisor;

    public Estagiario(){
    }

    
    public Estagiario(String nome, int matricula, int horasTrabalho, float valorHora, String supervisor) {
        super(nome, matricula, horasTrabalho, valorHora);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public float calcularSalario() {
        return (getHorasTrabalho() * getValorHora());
    }
    
    @Override
    public String toString() {
        return super.toString() +
        "Cargo: Estagiário" +
        "\nGerente: " + supervisor +
        "\nSalário: :" + calcularSalario();
    }

    @Override
    public String trabalhar() {
        return"O estagiário " + getNome() + " está sendo supervisionado por " + getSupervisor();
    }

    @Override
    public String relatarProgresso() {
        return"De acordo com o " + getSupervisor() + " o estagiário " + getNome() + " está indo bem";
    }

    
}