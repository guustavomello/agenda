package agenda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Compromisso c1 = new Compromisso(
                LocalDate.parse("24/03/2025", formatter),
                LocalDate.parse("24/03/2025", formatter),
                "Reunião com equipe");

        Compromisso c2 = new Compromisso(
                LocalDate.parse("25/03/2025", formatter),
                LocalDate.parse("25/03/2025", formatter),
                "Consulta médica");

        minhaAgenda.adicionarCompromisso(c1);
        minhaAgenda.adicionarCompromisso(c2);

        minhaAgenda.verificarCompromissos(7);
    }
}
