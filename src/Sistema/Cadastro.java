package Sistema;
import java.util.ArrayList;
import java.util.List;
import Trabalhos.Desenvolvedor;
import Trabalhos.Estagiario;
import Trabalhos.Gerente;
public class Cadastro {
    
    private static List<Gerente> listaGerente = new ArrayList<>();
    private static List<Desenvolvedor> listaDesenvolvedor = new ArrayList<>();
    private static List<Estagiario> listaEstagiario = new ArrayList<>();

    
    public static void cadastrarGerente (Gerente gerente){
        listaGerente.add(gerente);
    }
    
    public static void cadastrarDesenvolvedor(Desenvolvedor desenvolvedor){
        listaDesenvolvedor.add(desenvolvedor);
    }

    public static void cadastrarEstagiario(Estagiario estagiario){
        listaEstagiario.add(estagiario);
    }

    public static boolean removerGerente(int matricula){
        for (Gerente temp : listaGerente) {
            if(temp.getMatricula() == matricula) {
                listaGerente.remove(temp);
                return true;
            }
        }
        return false;
    }

    public static boolean removerDesenvolvedor(int matricula){
         for (Desenvolvedor temp : listaDesenvolvedor) {
            if(temp.getMatricula() == matricula) {
                listaDesenvolvedor.remove(temp);
                return true;
            }
        }
        return false;
    }

   public static boolean removerEstagiario(int matricula){
    for (Estagiario temp : listaEstagiario) {
       if(temp.getMatricula() == matricula) {
           listaEstagiario.remove(temp);
           return true;
       }
   }
   return false;
}


    public static List<Gerente> getListaGerente() {
        return listaGerente;
    }
    public static List<Desenvolvedor> getListaDesenvolvedor() {
        return listaDesenvolvedor;
    }

    public static List<Estagiario> getListaEstagiario() {
        return listaEstagiario;
    }

    public static Estagiario buscarEstagiario(int matricula){
        for (Estagiario temp : listaEstagiario) {
            if (temp.getMatricula() == matricula){
                return temp;
            }
        }
        return null;
    }

    public static Desenvolvedor buscarDesenvolvedor(int matricula){
        for (Desenvolvedor temp : listaDesenvolvedor) {
            if (temp.getMatricula() == matricula){
                return temp;
            }
        }
        return null;
    }

    public static Gerente buscarGerente(int matricula){
        for (Gerente temp : listaGerente) {
            if (temp.getMatricula() == matricula){
                return temp;
            }
        }
        return null;
    }



}