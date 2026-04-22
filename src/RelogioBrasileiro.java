import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Implementação de relógio que segue o padrão brasileiro (24 horas).
 * O modificador 'non-sealed' permite que esta classe seja estendida por outras no futuro.
 */
public non-sealed class RelogioBrasileiro extends Horario {
    // Sobrescrita dos métodos da superclasse para manter o comportamento padrão
    @Override
    public void setHora(int hora) {
        super.setHora(hora);
    }

    @Override
    public void setMinuto(int minuto) {
        super.setMinuto(minuto);
    }

    @Override
    public void setSegundo(int segundo) {
        super.setSegundo(segundo);
    }

    @Override
    public int getHora() {
        return super.getHora();
    }

    @Override
    public int getMinuto() {
        return super.getMinuto();
    }

    @Override
    public int getSegundo() {
        return super.getSegundo();
    }

    /**
     * Formata e imprime a hora no padrão de 24 horas (ex: 23:59:59).
     */
    public void formatoHora(){
        // Cria um objeto LocalTime da API java.time com os valores atuais de hora, minuto e segundo
        LocalTime time = LocalTime.of(getHora(), getMinuto(), getSegundo());

        // Define o padrão brasileiro de 24h
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = time.format(formato);
        System.out.println(horaFormatada);
    }
}
