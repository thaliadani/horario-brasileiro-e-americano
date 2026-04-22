import java.util.Scanner;

/**
 * Classe de entrada do sistema que gerencia a interação via console.
 */
public class Main {
    public static void main(String[] args) {
        // O try-with-resources garante que o Scanner será fechado automaticamente ao fim da execução
        try (Scanner scanner = new Scanner(System.in)) {
            // Instanciação dos dois tipos de relógios
            RelogioAmericano relogioAmericano = new RelogioAmericano();
            RelogioBrasileiro relogioBrasileiro =new RelogioBrasileiro();

            // Menu de escolha para o usuário
            System.out.println("Escolha o relógio:\n 1 - Brasileiro\n 2 - Americano");
            int op = scanner.nextInt();

            // Switch expression (recurso moderno do Java) para tratar as opções
            switch (op){
                case 1 -> {
                    System.out.println("Defina a hora:");
                    relogioBrasileiro.setHora(scanner.nextInt());

                    System.out.println("Defina o minuto:");
                    relogioBrasileiro.setMinuto(scanner.nextInt());

                    System.out.println("Defina o segundo:");
                    relogioBrasileiro.setSegundo(scanner.nextInt());

                    // Exibe a saída no formato 24h
                    relogioBrasileiro.formatoHora();
                }

                case 2 -> {
                    // Para o americano, o usuário deve informar a hora entre 1 e 12
                    System.out.println("Defina a hora:");
                    relogioAmericano.setHora(scanner.nextInt());

                    System.out.println("Defina o minuto:");
                    relogioAmericano.setMinuto(scanner.nextInt());

                    System.out.println("Defina o segundo:");
                    relogioAmericano.setSegundo(scanner.nextInt());

                    // Solicita o período do dia para a lógica AM/PM
                    System.out.println("1 - AM ou 2 - PM:");
                    int am = scanner.nextInt();
                    relogioAmericano.setAm(am == 1);

                    // Exibe a saída formatada com AM/PM
                    relogioAmericano.formatoHora();
                }
            }
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