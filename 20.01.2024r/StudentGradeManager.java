import java.util.*;

public class StudentGradeManager {
    public static void main(String[] args) {
        Map<String, String> studentGrades = new HashMap<>();

        dodaj(studentGrades, "Carl", "db+");
        dodaj(studentGrades, "Joe", "db");
        dodaj(studentGrades, "Susan", "bdb");

        wypisz(studentGrades);

        zmien(studentGrades, "Joe", "bdb");

        wypisz(studentGrades);

        usun(studentGrades, "Carl");

        wypisz(studentGrades);
    }

    private static void dodaj(Map<String, String> studentGrades, String nazwisko, String ocena) {
        studentGrades.put(nazwisko, ocena);
    }

    private static void usun(Map<String, String> studentGrades, String nazwisko) {
        studentGrades.remove(nazwisko);
    }

    private static void zmien(Map<String, String> studentGrades, String nazwisko, String nowaOcena) {
        if (studentGrades.containsKey(nazwisko)) {
            studentGrades.put(nazwisko, nowaOcena);
        } else {
            System.out.println("Student o nazwisku " + nazwisko + " nie istnieje.");
        }
    }

    private static void wypisz(Map<String, String> studentGrades) {
        List<String> posortowaniStudenci = new ArrayList<>(studentGrades.keySet());
        Collections.sort(posortowaniStudenci);

        for (String nazwisko : posortowaniStudenci) {
            System.out.println(nazwisko + ": " + studentGrades.get(nazwisko));
        }

        System.out.println();
    }
}
