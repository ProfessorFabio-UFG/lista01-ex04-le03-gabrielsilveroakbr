public class RoboAspirador {
    private int identificacao;
    private String status;
    private int posicaoX;
    private int posicaoY;
    private int quantidadePo;
    private int limitePo;

    public RoboAspirador(int identificacao, int limitePo) {
        this.identificacao = identificacao;
        this.status = "desligado";
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.quantidadePo = 0;
        this.limitePo = limitePo;
    }

    public void ligar() {
        if (status.equals("desligado")) {
            status = "ligado";
            System.out.println("Robô " + identificacao + " ligado.");
        } else {
            System.out.println("Robô " + identificacao + " já está ligado ou em outro estado.");
        }
    }

    public void desligar() {
        status = "desligado";
        System.out.println("Robô " + identificacao + " desligado.");
    }
// usei o ! pra inverter o true ou false em alguns métodos pra fazer uma ação meio que contraria
    public void andar(int deltaX, int deltaY) {
        if (!status.equals("ligado") && !status.equals("parado")) {
            System.out.println("Robô " + identificacao + " não pode andar porque não está ligado ou pronto.");
            return;
        }

        posicaoX += deltaX;
        posicaoY += deltaY;
        status = "andando";
        System.out.println("Robô " + identificacao + " andou para (" + posicaoX + ", " + posicaoY + ").");
    }

    public void aspirar(int quantidade) {
        if (!status.equals("ligado")){
            System.out.println("Robô " + identificacao + " não pode aspirar porque não está ligado.");
            return;
        }

        if (quantidadePo + quantidade >= limitePo) {
            quantidadePo = limitePo;
            status = "desligado";
            System.out.println("Robô " + identificacao + " atingiu o limite de pó e foi desligado automaticamente.");
        } else {
            quantidadePo += quantidade;
            System.out.println("Robô " + identificacao + " aspirou " + quantidade + " unidades de pó.");
        }
    }

    public void parar() {
        if (status.equals("andando")) {
            status = "parado";
            System.out.println("Robô " + identificacao + " parou.");
        } else {
            System.out.println("Robô " + identificacao + " não está andando para poder parar.");
        }
    }

    // toString dos robos
    @Override
    public String toString() {
        return "Robô " + identificacao + ":\n" +
                "Status: " + status + "\n" +
                "Posição: (" + posicaoX + ", " + posicaoY + ")\n" +
                "Quantidade de pó: " + quantidadePo + "/" + limitePo + "\n";
    }
}