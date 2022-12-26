import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        FamilyMember branch = new FamilyMember();
        List<Subject> society = new ArrayList<Subject>();
        Subject relative1 = new Subject("Николай", "Смирнов", 13, Sex.мужчина);
        Subject relative2 = new Subject("Елена", "Смирнова", 26, Sex.женщина);
        Subject relative3 = new Subject("Юрий", "Петров", 74, Sex.мужчина);
        Subject relative4 = new Subject("Юлия", "Лапшина", 47, Sex.женщина);
        Subject relative5 = new Subject("Иван", "Иванов", 60, Sex.мужчина);


        society.add(relative1);
        society.add(relative2);
        society.add(relative3);
        society.add(relative4);
        society.add(relative5);


        branch.addAddiction(relative1, relative2, Interrelation.брат, Interrelation.сестра);
        branch.addAddiction(relative1, relative3, Interrelation.правнук, Interrelation.прадед);
        branch.addAddiction(relative1, relative4, Interrelation.внучатыйПлемянник, Interrelation.мать);
        branch.addAddiction(relative1, relative5, Interrelation.брат, Interrelation.внучатыйДедушка);

        System.out.println(society);
        Comparator ageSocietyComparator = new FamilyMember();
        Collections.sort(society, ageSocietyComparator);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println(branch.getAddiction());

    }
}