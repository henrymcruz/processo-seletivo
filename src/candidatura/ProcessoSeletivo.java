package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandadatos();
    }
    static void selecaoCandadatos(){

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUTOS", "FABRICIO", "MONICA", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionado = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionado < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioCandidato = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioCandidato);
            if(salarioBase >= salarioCandidato){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
                candidatosSelecionado++;
            }
            candidatosAtual++;
        }
    }
    static  double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisasrCandidato(double salarioCandidato){
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
