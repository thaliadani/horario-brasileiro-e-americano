/**
 * Classe base que representa um horário genérico (hora, minuto, segundo).
 * O modificador 'sealed' (selada) restringe quais classes podem estendê-la,
 * garantindo um controle maior sobre a hierarquia de herança.
 */
public sealed class Horario permits RelogioAmericano, RelogioBrasileiro{
    // Atributos encapsulados para armazenar os componentes do tempo
    int hora;
    int minuto;
    int segundo;

    // Métodos Getter e Setter para acesso e modificação segura dos dados
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

}
