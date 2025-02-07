package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandadatos(); //puxa o método selecaoCandadatos
    }
    static void selecaoCandadatos(){

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUTOS", "FABRICIO", "MONICA", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionado = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionado < 5 && candidatosAtual < candidatos.length){ //laço de repetição até encontrar
            String candidato = candidatos[candidatosAtual];                      //cinco candidatos
            double salarioCandidato = valorPretendido();

            //verifica se o salario pedido pelo candidato é igual ao base, se for ele é inserido na lista
            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioCandidato);
            if(salarioBase >= salarioCandidato){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
                candidatosSelecionado++;
            }
            candidatosAtual++;
        }
    }
    static  double valorPretendido(){ //gera um valor aleatorio entre 1800 e 2200
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisasrCandidato(double salarioCandidato){ //verifica se o salario base é igua ao pedido pelo candadto
        double salarioBase = 2000.0;
        if (salarioBase > salarioCandidato){
            System.out.println("Ligar parqa candiadto");
        }else if (salarioBase == salarioCandidato)
            System.out.println("Ligar para o candidato com contra proposta");
        else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
