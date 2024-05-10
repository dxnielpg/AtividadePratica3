package Sistema;
import Trabalhos.Desenvolvedor;
import Trabalhos.Estagiario;
import Trabalhos.Gerente;

public class Sistema {

    private static String mensagemDefault(){
        return "Opção inválida, tente novamente...";
    }
    
    private static void menuPrincipal(){
        System.out.println("\nO QUE DESEJA FAZER?");
        System.out.println("1 - Cadastrar funcionário");
        System.out.println("2 - Remover funcionário");
        System.out.println("3 - Listar funcionário");
        System.out.println("4 - Buscar funcionário");
        System.out.println("5 - Listar todos");
        System.out.println("0 - Sair do programa");
    }
    private static void menuFuncionarios(){
        System.out.println("\nSELECIONE O CARGO");
        System.out.println("1 - GERENTE");
        System.out.println("2 - DESENVOLVEDOR");
        System.out.println("3 - ESTÁGIARIO");
    }
    private static void cadastrarGerente(){
        System.out.println("\nCADASTRO DE GERENTE\n");
        System.out.print("Nome: ");
        String nome = Console.lerString();
        int matricula;
        while (true) { 
            System.out.print("Matrícula: ");
            matricula = Console.lerInt();

            if (Cadastro.buscarGerente(matricula) != null) {
                System.out.println("\nGerente " + matricula +
                        " já está cadastrado!");
            } 
            else {
                break; 
            }
        }
        System.out.print("Valor da hora: ");
        float valorHora = Console.lerFloat();
        System.out.print("Horas trabalhadas: ");
        int horasTrabalho = Console.lerInt();
        System.out.print("Bônus: ");
        float bonusAnual = Console.lerFloat();
        System.out.print("Equipe: ");
        String equipeGerenciada = Console.lerString();

        Gerente g = new Gerente(nome, matricula, horasTrabalho, valorHora, bonusAnual, equipeGerenciada);
        Cadastro.cadastrarGerente(g);
    }
    private static void cadastrarDesenvolvedor(){
        System.out.println("\nCADASTRO DE DESENVOLVEDOR\n");
        System.out.print("Nome: ");
        String nome = Console.lerString();
        int matricula;
        while (true) { 
            System.out.print("Matrícula: ");
            matricula = Console.lerInt();

            if (Cadastro.buscarDesenvolvedor(matricula) != null) {
                System.out.println("\nDesenvolvedor " + matricula +
                        " já está cadastrado!");
            } 
            else {
                break; 
            }
        }
        System.out.print("Valor da hora: ");
        float valorHora = Console.lerFloat();
        System.out.print("Horas trabalhadas: ");
        int horasTrabalho = Console.lerInt();
        System.out.print("Tecnologias que domina: ");
        String techDominadas = Console.lerString();

        Desenvolvedor d = new Desenvolvedor(nome, matricula, horasTrabalho, valorHora, techDominadas);
        Cadastro.cadastrarDesenvolvedor(d);
    }
    private static void cadastrarEstagiario(){
        System.out.println("\nCADASTRO DE ESTÁGIARIO\n");
        System.out.print("Nome: ");
        String nome = Console.lerString();
        int matricula;
        while (true) { 
            System.out.print("Matrícula: ");
            matricula = Console.lerInt();

            if (Cadastro.buscarEstagiario(matricula) != null) {
                System.out.println("\nEstágiario " + matricula +
                        " já está cadastrado!");
            } 
            else {
                break; 
            }
        }
        System.out.print("Valor da hora: ");
        float valorHora = Console.lerFloat();
        System.out.print("Horas trabalhadas: ");
        int horasTrabalho = Console.lerInt();
        System.out.print("Supervisor: ");
        String supervisor = Console.lerString();

        Estagiario e = new Estagiario(nome, matricula, horasTrabalho, valorHora, supervisor);
        Cadastro.cadastrarEstagiario(e);
    }
    private static void removerGerente(){
        if(Cadastro.getListaGerente().size() == 0){
            System.out.println("Não há gerentes cadastrados!");
            return;
        }
        System.out.print("Matricula do gerente: ");
        int mat = Console.lerInt();
        Gerente g = Cadastro.buscarGerente(mat);
        if (g == null){
            System.out.println("Matricula não encontrada");
            return;
        }
        Cadastro.removerGerente(mat);
        System.out.println("Gerente removido com sucesso!");
    }
    private static void removerDesenvolvedor(){
        if(Cadastro.getListaDesenvolvedor().size() == 0){
            System.out.println("Não há desenvolvedores cadastrados!");
            return;
        }
        System.out.print("Matricula do desenvolvedor: ");
        int mat = Console.lerInt();
        Desenvolvedor d = Cadastro.buscarDesenvolvedor(mat);
        if (d == null){
            System.out.println("Matricula não encontrada");
            return;
        }
        Cadastro.removerDesenvolvedor(mat);
        System.out.println("Desenvolvedor removido com sucesso!");
    }
    private static void removerEstagiario(){
        if(Cadastro.getListaEstagiario().size() == 0){
            System.out.println("Não há estagiários cadastrados!");
            return;
        }
        System.out.print("Matricula do estagiário: ");
        int mat = Console.lerInt();
        Estagiario e = Cadastro.buscarEstagiario(mat);
        if (e == null){
            System.out.println("Matricula não encontrada");
            return;
        }
        Cadastro.removerEstagiario(mat);
        System.out.println("Estagiário removido com sucesso!");
    }
    private static void listarGerente(){
        if(Cadastro.getListaGerente().size() == 0){
            System.out.println("Não há gerentes cadastrados!");
            return;
        }
        System.out.println("\nLISTA DE GERENTES\n");
        for(Gerente temp : Cadastro.getListaGerente()){
            System.out.println(temp);
        }
    }
    private static void listarDesenvolvedor(){
        if(Cadastro.getListaDesenvolvedor().size() == 0){
            System.out.println("Não há desenvolvedores cadastrados!");
            return;
        }
        System.out.println("\nLISTA DE DESENVOLVEDORES\n");
        for(Desenvolvedor temp : Cadastro.getListaDesenvolvedor()){
            System.out.println(temp);
        }
    }
    private static void listarEstagiario(){
        if(Cadastro.getListaEstagiario().size() == 0){
            System.out.println("Não há estagiários cadastrados!");
            return;
        }
        System.out.println("\nLISTA DE ESTAGIÁRIOS\n");
        for(Estagiario temp : Cadastro.getListaEstagiario()){
            System.out.println(temp);
        }
    }
    private static void buscarGerente(){
        if(Cadastro.getListaGerente().size() == 0){
            System.out.println("Não há gerentes cadastrados!");
            return;
        }
        System.out.print("Matricula do gerente: ");
        int mat = Console.lerInt();
        Gerente g = Cadastro.buscarGerente(mat);
        if (g == null){
            System.out.println("Gerente não encontrado");
            return;
        }
        System.out.println(g.toString());
        System.out.println(g.trabalhar());
        System.out.println(g.relatarProgresso());
    }
    private static void buscarDesenvolvedor(){
        if(Cadastro.getListaDesenvolvedor().size() == 0){
            System.out.println("Não há desenvolvedores cadastrados!");
            return;
        }
        System.out.print("Matricula do Desenvolvedor: ");
        int mat = Console.lerInt();
        Desenvolvedor d = Cadastro.buscarDesenvolvedor(mat);
        if (d == null){
            System.out.println("Desenvolvedor não encontrado");
            return;
        }
        System.out.println(d.toString());
        System.out.println(d.trabalhar());
        System.out.println(d.relatarProgresso());
    }
    private static void buscarEstagiario(){
        if(Cadastro.getListaEstagiario().size() == 0){
            System.out.println("Não há estagiários cadastrados!");
            return;
        }
        System.out.print("Matricula do Estagiário: ");
        int mat = Console.lerInt();
        Estagiario e = Cadastro.buscarEstagiario(mat);
        if (e == null){
            System.out.println("Estagiário não encontrado");
            return;
        }
        System.out.println(e.toString());
        System.out.println(e.trabalhar());
        System.out.println(e.relatarProgresso());
    }


    public static void executar(){
        
        int op;
        int op2;

        do {
            menuPrincipal();
            op = Console.lerInt();
            switch (op) {
                case 1:
                    menuFuncionarios();
                    op2 = Console.lerInt();
                    switch (op2) {
                        case 1:
                            cadastrarGerente();
                            break;
                        
                        case 2:
                            cadastrarDesenvolvedor();
                            break;

                        case 3:
                            cadastrarEstagiario();
                            break;
                    
                        default:
                            System.out.println(mensagemDefault());
                            break;
                    }
                    break;

                case 2:
                    menuFuncionarios();
                    op2 = Console.lerInt();
                    switch (op2) {
                        case 1:
                            removerGerente();
                            break;
                        
                        case 2:
                            removerDesenvolvedor();
                            break;

                        case 3:
                            removerEstagiario();
                            break;
                    
                        default:
                            System.out.println(mensagemDefault());
                            break;
                    }
                    break;

                case 3:
                    menuFuncionarios();
                    op2 = Console.lerInt();
                    switch (op2) {
                        case 1:
                            listarGerente();
                            break;
                        
                        case 2:
                            listarDesenvolvedor();
                            break;

                        case 3:
                            listarEstagiario();
                            break;
                    
                        default:
                            System.out.println(mensagemDefault());
                            break;
                    }
                    break;

                case 4:
                    menuFuncionarios();
                    op2 = Console.lerInt();
                    switch (op2) {
                        case 1:
                            buscarGerente();
                            break;
                        
                        case 2:
                            buscarDesenvolvedor();
                            break;

                        case 3:
                            buscarEstagiario();
                            break;
                    
                        default:
                            System.out.println(mensagemDefault());
                            break;
                    }
                    break;

                case 5:
                    listarGerente();
                    listarDesenvolvedor();
                    listarEstagiario();
                    break;

                case 0:
                    System.out.println("Finalizando");
                    break;
            
                default:
                    System.out.println(mensagemDefault());
                    break;
            }
                
        } while (op != 0);
    }
    

}