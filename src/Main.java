import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;




// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        // for (int i = 1; i <= 5; i++) {

        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.
        //  System.out.println("i = " + i);

        //Here is TreeSet for the inner class is added.
        Set<Dogs> set = new TreeSet<Dogs>();
        set.add(new Dogs("Barbos", "small", 12, "light brown"));
        set.add(new Dogs("Brovko", "medium height", 2, "black"));
        set.add(new Dogs("Lucy", "tiny", 1, "white"));
        set.add(new Dogs("Daisie", "large", 4, "orange"));

         System.out.println(set);

        // Here is an ArrayList for the outer class.
        ArrayList<Dogs> dogsSet = new ArrayList<Dogs>();

        ArrayList<Animals> animalsArrayList = new ArrayList<Animals>();
        animalsArrayList.add(new Animals("Fluffy", "small", 12));
        animalsArrayList.add(new Animals("Shawn", "big", 2));
        animalsArrayList.add(new Animals("Lola", "very big", 5));

         System.out.println(animalsArrayList);

        System.out.println("--------------------");
        //Here is an object for the task 2.


        ArrayList<ClassForGeneric> simpleClass = new ArrayList<ClassForGeneric>();

        simpleClass.add(new ClassForGeneric(1.2, "yttu"));
        simpleClass.add(new ClassForGeneric(345L, "hty"));
        simpleClass.add(new ClassForGeneric(-126, "Some Letters"));
        simpleClass.add(new ClassForGeneric(0, "retr ghjhg"));

        System.out.println(simpleClass);
    }
}
