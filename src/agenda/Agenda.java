package agenda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Compromisso> compromissos = new ArrayList<>();

    public void adicionarCompromisso(Compromisso novo) {
        compromissos.add(novo);
    }

    public void verificarCompromissos(int numeroDias) {
        LocalDate hoje = LocalDate.now();
        System.out.println("Compromissos nos próximos " + numeroDias + " dias:");
        for (Compromisso c : compromissos) {
            if (c.pertencePeriodo(hoje, numeroDias)) {
                System.out.println(c);
            }
        }
    }
}
