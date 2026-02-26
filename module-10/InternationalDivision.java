
/**
 * InternationalDivision class is a subclass of Division that represents an international division in a company.
 * It contains two additional attributes: Country and SpokenLanguage, and it implements the Display() method to display the information of the international division.
 */
public class InternationalDivision extends Division {

    public String Country;
    public String SpokenLanguage;

    public InternationalDivision(String divisionName, String accountNumber, String country, String spokenLanguage) {
        this.DivisionName = divisionName;
        this.AccountNumber = accountNumber;
        this.Country = country;
        this.SpokenLanguage = spokenLanguage;
    }

    @Override
    void Display() {
        System.out.println("Division Name: " + DivisionName);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Country: " + Country);
        System.out.println("Spoken Language: " + SpokenLanguage);
    }

}
