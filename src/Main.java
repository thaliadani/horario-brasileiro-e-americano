import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RelogioAmericano relogioAmericano = new RelogioAmericano();
        RelogioBrasileiro relogioBrasileiro =new RelogioBrasileiro();

        System.out.println("Escolha o relógio:\n 1 - Brasileiro\n 2 - Americano");
        int op = scanner.nextInt();

        switch (op){
            case 1 :
                System.out.println("Defina a hora:");
                relogioBrasileiro.setHora(scanner.nextInt());

                System.out.println("Defina o minuto:");
                relogioBrasileiro.setMinuto(scanner.nextInt());

                System.out.println("Defina o segundo:");
                relogioBrasileiro.setSegundo(scanner.nextInt());

                relogioBrasileiro.formatoHora();

                break;

            case 2:
                System.out.println("Defina a hora:");
                relogioAmericano.setHora(scanner.nextInt());

                System.out.println("Defina o minuto:");
                relogioAmericano.setMinuto(scanner.nextInt());

                System.out.println("Defina o segundo:");
                relogioAmericano.setSegundo(scanner.nextInt());

                System.out.println("1 - AM ou 2 - PM:");
                int am = scanner.nextInt();
                relogioAmericano.setAm(am == 1);

                relogioAmericano.formatoHora();

                break;
        }
    }
}

// deverá retornar a hora no formato HH:MM:SS, a partir dessa classe crie 2 implementações,
// uma chamada relógio Americando e outra chamada relógio Brasileiro, lembrando que para o
// relógio americano não existem as horas de 13 até 24. Defina também na super classe um
// método que ficará por responsabilidade da classe que extende-la definir seu funcionamemnto,
// esse método deve receber um relógio ( independente da implementação) e deve-se extrair
//  as informações dele e usa-la no objeto que recebeu para setar as novas informações do
//  relógio.