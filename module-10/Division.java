
/**
 * Division class is an abstract class that represents a division in a company.
 * It contains two attributes: DivisionName and AccountNumber, and an abstract method Display() that must be implemented by any subclass that extends this class.
 */
public abstract class Division {

    public String DivisionName;
    public String AccountNumber;

    abstract void Display();
}
