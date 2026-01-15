class Program
{
    // Method with three parameters
    static void DisplayInfo(string name, int age, string city)
    {
        Console.WriteLine($"Name: {name}");
        Console.WriteLine($"Age: {age}");
        Console.WriteLine($"City: {city}");
    }

    static void Main()
    {
        // Calling parameters in the declared order
        DisplayInfo("Alice", 30, "New York");

        Console.WriteLine("\n--- Calling parameters OUT of order using named arguments ---");

        // Calling parameters out of order
        DisplayInfo(city: "Chicago", name: "Bob", age: 25);

        Console.WriteLine("\n--- Mixing positional and named arguments ---");

        // You can mix them, but positional arguments must come first
        DisplayInfo("Charlie", city: "Los Angeles", age: 40);
    }
}