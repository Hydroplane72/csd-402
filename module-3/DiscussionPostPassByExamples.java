
public class DiscussionPostPassByExamples {

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before passByValue: " + number);
        passByValue(number);
        System.out.println("After passByValue: " + number);

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Before passByReference: " + sb.toString());
        passByReference(sb);
        System.out.println("After passByReference: " + sb.toString());

        System.out.println("Before passByReferenceAndMakeNewObject: " + sb.toString());
        passByReferenceAndMakeNewObject(sb);
        System.out.println("After passByReferenceAndMakeNewObject: " + sb.toString());

    }

    public static void passByValue(int num) {
        num = 20;
    }

    public static void passByReference(StringBuilder arr) {
        arr.append(" World");
    }

    public static void passByReferenceAndMakeNewObject(StringBuilder arr) {
        arr = new StringBuilder("New Object");
    }
}
