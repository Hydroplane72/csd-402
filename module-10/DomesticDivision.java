/**
 * DomesticDivision class is a subclass of Division that represents a domestic division in a company.
 * It contains an additional attribute: State, and it implements the Display() method to display the information of the domestic division.
 */
public class DomesticDivision extends Division {

    public String State;

    public DomesticDivision(String divisionName, String accountNumber, String state) {
        this.DivisionName = divisionName;
        this.AccountNumber = accountNumber;
        this.State = state;
    }

    @Override
    void Display() {
        System.out.println("Division Name: " + DivisionName);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("State: " + State);
    }

}
