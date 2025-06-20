import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public non-sealed class RelogioBrasileiro extends Horario {
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
        // Cria um LocalTime com os valores atuais
        LocalTime time = LocalTime.of(getHora(), getMinuto(), getSegundo());

        // Formata a hora
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = time.format(formato);
        System.out.println(horaFormatada);
    }
}
