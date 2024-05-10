package Trabalhos;

public class Gerente extends Funcionario implements Trabalhavel {
    private float bonusAnual;
    private String equipeGerenciada;

    public Gerente(){
    }
    
    public Gerente(String nome, int matricula, int horasTrabalho, float valorHora, float bonusAnual,
            String equipeGerenciada) {
        super(nome, matricula, horasTrabalho, valorHora);
        this.bonusAnual = bonusAnual;
        this.equipeGerenciada = equipeGerenciada;
    }

    public float getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(float bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public String getEquipeGerenciada() {
        return equipeGerenciada;
    }

    public void setEquipeGerenciada(String equipeGerenciada) {
        this.equipeGerenciada = equipeGerenciada;
    }

    @Override
    public float calcularSalario() {
        return (getValorHora() * getHorasTrabalho()) + 2000;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "Cargo: Gerente" +
        "\nEquipe: " + equipeGerenciada +
        "\nSalário:" + calcularSalario();
    }
    @Override
    public String trabalhar() {
        return "O gerente " + getNome() + " está gerenciando a equipe " + getEquipeGerenciada();
    }
    @Override
    public String relatarProgresso() {
        return getNome() + " relatou que a equipe " + getEquipeGerenciada() + " concluiu metade do projeto";
    }
    
}