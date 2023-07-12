import java.util.Objects;

public class ClassForGeneric <T> {
    // Here is a class for the task 2, with 2 generics.

    T something;

    public ClassForGeneric (T something){
        this.something = something;
    }

    public T something () {
        return something;
    }

    public void setSomething(T something){
        this.something = something;
    }

    // Here is a method with 2 generics:

    public String toString(T something){
        String somethingToPrint = something.toString();

        return "This is a class with generics." + '\n' +
                "And it has some data: " + somethingToPrint + '.';
    }

    public void fill (T account){
        System.out.println(account);
    }



}
