import java.time.LocalDateTime;
import java.time.LocalDate;

import java.util.Locale;
import java.time.format.TextStyle;
public class dateTime {
    public static void main(String[] args) {

        String nome = "Mari";

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");

        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        LocalDateTime agora =  LocalDateTime.now();
        String saudacao;

        if (agora.getHour() >=0 && agora.getHour() < 12) {
            saudacao = "Bom Dia";
        } else if (agora.getHour() >=12 && agora.getHour() < 18) {
            saudacao = "Boa Tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa Noite";
        } else {
            saudacao = "Olá.";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s. %n", nome, diaDaSemana, saudacao.toUpperCase());
    }
}
