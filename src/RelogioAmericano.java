import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Implementação de relógio que segue o padrão americano (12 horas com AM/PM).
 */
public non-sealed class RelogioAmericano extends Horario {
    // Atributo booleano para identificar se o horário é AM (true) ou PM (false)
    boolean am;

    public void setAm(boolean am) {
        this.am = am;
    }

    /*
     * Sobrescrita dos métodos herdados de Horario.
     */
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
     * Realiza a conversão da lógica de 12 horas para o sistema interno e imprime
     * a hora formatada com o sufixo AM ou PM.
     */
    public void formatoHora(){
        // Converte a lógica de 12h para o formato 24h exigido pelo LocalTime.of()
        int hora24 = am ? getHora() : getHora() + 12;
        if (hora24 == 12 && am) hora24 = 0; // meia-noite é 0:00
        if (hora24 == 24) hora24 = 12; // meio-dia é 12:00

        // Cria o objeto de tempo com os valores ajustados para a API do Java
        LocalTime time = LocalTime.of(hora24, getMinuto(), getSegundo());

        // Define o padrão americano: 'hh' para 12h e 'a' para o marcador AM/PM
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String horaFormatada = time.format(formato);
        System.out.println(horaFormatada);
    }
}
