import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public non-sealed class RelogioAmericano extends Horario {
    boolean am;

    public void setAm(boolean am) {
        this.am = am;
    }

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

    public void formatoHora(){
        // Converte para formato 24h se necessário (baseado no flag AM/PM)
        int hora24 = am ? getHora() : getHora() + 12;
        if (hora24 == 12 && am) hora24 = 0; // meia-noite é 0:00
        if (hora24 == 24) hora24 = 12; // meio-dia é 12:00

        // Cria um LocalTime com os valores ajustados
        LocalTime time = LocalTime.of(hora24, getMinuto(), getSegundo());

        // Formata no padrão americano (12h com AM/PM)
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String horaFormatada = time.format(formato);
        System.out.println(horaFormatada);
    }
}
