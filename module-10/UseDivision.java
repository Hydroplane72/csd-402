
/**
 * Matthew Rozendaal
 * CSD 402
 * Module 10
 * UseDivision class is a driver class that demonstrates the usage of the Division, DomesticDivision, and InternationalDivision classes.
 */
public class UseDivision {

    public static void main(String[] args) {

        // Create instances of DomesticDivisions and InternationalDivisions
        DomesticDivision domesticDivision = new DomesticDivision("Domestic Division", "12345", "California");
        DomesticDivision domesticDivision2 = new DomesticDivision("Domestic Division 2", "67890", "Iowa");
        InternationalDivision internationalDivision = new InternationalDivision("International Division", "09876", "France", "French");
        InternationalDivision internationalDivision2 = new InternationalDivision("International Division 2", "54321", "England", "English");

        // Display the information of the domestic and international divisions
        System.out.println("Domestic Divisions:");
        domesticDivision.Display();
        domesticDivision2.Display();
        System.out.println();
        System.out.println("International Divisions:");
        internationalDivision.Display();
        internationalDivision2.Display();
    }
}
