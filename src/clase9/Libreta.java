package clase9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Libreta {
    Map<Materia, List<Nota>> notas = new HashMap<>();

    public double getPromedio(Materia materia) {
        List<Nota> notasMateria = notas.get(materia);
        double sumatoria = 0;
        for (Nota nota : notasMateria) {
            sumatoria += nota.getNota();
        }
        return sumatoria / notasMateria.size();
    }

    public void agregarNota(Materia materia, String trimestre, int nota) {
        Nota nuevaNota = new Nota(trimestre, nota);
        if (notas.containsKey(materia)) {
            notas.get(materia).add(nuevaNota);
        } else {
            List<Nota> notas = new ArrayList<>();
            notas.add(nuevaNota);
            this.notas.put(materia, notas);
        }
    }
}
