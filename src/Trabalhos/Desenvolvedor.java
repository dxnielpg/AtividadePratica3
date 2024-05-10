package Trabalhos;
public class Desenvolvedor extends Funcionario implements Trabalhavel {
    private String techDominadas;

    public Desenvolvedor(){        
    }

    public Desenvolvedor(String nome, int matricula, int horasTrabalho, float valorHora, 
    String techDominadas) {
        super(nome, matricula, horasTrabalho, valorHora);
        this.techDominadas = techDominadas;
    }

    public String getTechDominadas() {
        return techDominadas;
    }

    public void setTechDominadas(String techDominadas) {
        this.techDominadas = techDominadas;
    }

    @Override
    public float calcularSalario() {
        return (getHorasTrabalho() * getValorHora());        
    }

    @Override
    public String toString() {
        
        return super.toString() + 
        "\nCargo: Desenvolvedor" +
        "\nTecnologia dominada: " + techDominadas +
        "\nSalário: " + calcularSalario();
    }

    @Override
    public String trabalhar() {
        return "O desenvolvedor " + getNome() + " está trabalhando";
    }
    
    @Override
    public String relatarProgresso() {
        return"O desenvolvedor " + getNome() + " está finalizando o projeto.";
    }
}