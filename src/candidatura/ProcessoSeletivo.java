package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
    }
    static void analisasrCandidato(double salarioCandidato){
        double salarioBase = 2000.0;
        if (salarioBase > salarioCandidato){
            System.out.println("Ligar parqa candiadto");
        } else if (salarioBase == salarioCandidato)
            System.out.println("Ligar para o candidato com contra proposta");
        else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
