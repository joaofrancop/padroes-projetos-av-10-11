package questao2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Questao 2 - Tarifa de Estacionamento\n");

        int minutos = 95;
        String placa = "ABC1D23";

        System.out.println("Tempo: " + minutos + " minutos\n");

        Ticket rotativo = new Ticket(placa, minutos, new PerfilRotativo());
        System.out.println("Perfil " + rotativo.getNomePerfilAtual() + ": R$ "
                + String.format("%.2f", rotativo.calcularValorAPagar()));

        Ticket mensalista = new Ticket(placa, minutos, new PerfilMensalista());
        System.out.println("Perfil " + mensalista.getNomePerfilAtual() + ": R$ "
                + String.format("%.2f", mensalista.calcularValorAPagar()));

        Ticket conveniado = new Ticket(placa, minutos, new PerfilConveniado());
        System.out.println("Perfil " + conveniado.getNomePerfilAtual() + ": R$ "
                + String.format("%.2f", conveniado.calcularValorAPagar()));

        System.out.println("\nTroca de perfil no mesmo ticket");
        Ticket ticket = new Ticket(placa, minutos, new PerfilRotativo());
        imprimirTicket(ticket);

        ticket.alterarPerfilCobranca(new PerfilMensalista());
        imprimirTicket(ticket);

        ticket.alterarPerfilCobranca(new PerfilConveniado());
        imprimirTicket(ticket);
    }

    private static void imprimirTicket(Ticket ticket) {
        System.out.println(ticket.getPlacaVeiculo() + " | " + ticket.getNomePerfilAtual() + " | R$ "
                + String.format("%.2f", ticket.calcularValorAPagar()));
    }
}
