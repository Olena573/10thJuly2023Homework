import java.util.Objects;

public class ClassForGeneric <Numeric, T> {
    // Here is a class for the task 2, with 2 generics.

    private Numeric someNumber;
    T something;

    public ClassForGeneric (Numeric someNumber, T something){
        this.someNumber = someNumber;
        this.something = something;
    }

    public Numeric getSomeNumber () {
        return someNumber;
    }

    public T something () {
        return something;
    }

    public void setSomeNumber(Numeric someNumber){
        this.someNumber = someNumber;
    }

    public void setSomething(T something){
        this.something = something;
    }

    // Here is a method with 2 generics:

    public String toString(T something, Numeric someNumber){
        String somethingToPrint = something.toString();
        String somethingElseToPrint = someNumber.toString();

        return "This is a class with generics." + '\n' +
                "And it has some data: " + somethingToPrint + '\n' +
                "It has some numbers: " + somethingElseToPrint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(someNumber);
    }


}
