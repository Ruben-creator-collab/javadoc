package botanico;

import java.util.Comparator;

class ComparadorEspeciePlantaPorLongitud implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}
