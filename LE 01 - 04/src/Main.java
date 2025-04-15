public class Main {
    public static void main(String[] args) {
        // Criando dois robôs aspiradores
        RoboAspirador robo1 = new RoboAspirador(1, 100);
        RoboAspirador robo2 = new RoboAspirador(2, 150);

        // Testando robo 1
        System.out.println("Testando Robô 1");
        System.out.println(robo1);

        robo1.ligar();
        System.out.println(robo1);

        robo1.andar(5, 3);
        System.out.println(robo1);

        robo1.parar();
        System.out.println(robo1);

        robo1.aspirar(30);
        System.out.println(robo1);

        robo1.andar(-2, 4);
        System.out.println(robo1);

        robo1.aspirar(80); // Se atingir o limite desliga
        System.out.println(robo1);

        // Tentar operações com robô desligado
        robo1.andar(1, 1);
        robo1.aspirar(10);

        // Testando operações com o robô 2
        System.out.println("Testando Robô 2");
        System.out.println(robo2);

        robo2.ligar();
        System.out.println(robo2);

        robo2.andar(10, 0);
        System.out.println(robo2);

        robo2.aspirar(50);
        System.out.println(robo2);

        robo2.andar(0, 5);
        System.out.println(robo2);

        robo2.parar();
        System.out.println(robo2);

        robo2.desligar();
        System.out.println(robo2);
    }
}