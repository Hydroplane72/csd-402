HashMap

	A HashMap in Java is a collection of key-value pairs of data. Where you have a key to find a value, the unique thing about HashMaps compared to List is that the key will always be unique in the HashMap. Adding a duplicate key will cause the old value to be overwritten and returned. Another unique fact about HashMaps is that they have a time complexity of O(1), meaning that retrieving a key-value pair takes constant time. 
	HashMaps are great for storing a list of UserIDs as keys and UserInfos as values. The time to look up is speedy, especially compared to Lists. While you can use a HashMap for a contains lookup, for instance, to make sure a UserName is unique. It is easier to use a HashSet for that use case.
	In relation to other programming languages, in both C# and VB.NET, the equivalent of a HashMap is a Dictionary. Something to note: Java also has a Dictionary class. During my research, I found that the Dictionary class in Java is considered Obsolete and should not be used. Another interesting thing to note when comparing C# and Java is that adding a duplicate key in C# will cause an Error, while in Java, it will just overwrite the old value.

HASH MAP EXAMPLE GOES HERE DON'T Forget

Java Dictionary Class. (2025). Tutorialspoint.com. https://www.tutorialspoint.com/java/util/java_util_dictionary.htm
‌


Inheritance
	Inheritance is a relatively simple concept to understand. You have a parent class object that holds general information. You also have a child object that automatically inherits everything from the parent object, without duplicating code. As you will find out in just a minute, I have a very high dislike for the use of Inheritance in anything I do. I have been foolish enough in the past to try to create "complex" parent/child classes. What normally happens is the code gets too complex and unmaintainable, and I end up rewriting it to avoid inheritance altogether.
	It is relatively easy to determine what is available in a single-depth parent class. It gets very complicated when you have a parent class of a parent class. The amount of code reuse is nice, but you will want to start praying (and potentially cry) if you ever need to change a parent class used by 14+ other child classes. There is a very sophisticated and old application that I have to help support within my team at work. We once, as a joke, started with a random object and counted the number of Parent/Child connections to that object. We reached 14 until we hit the Microsoft Windows Forms class used as a base class.
	An example of the time wastage that Inheritance causes is when I had to figure out how settings were getting loaded into an application. The settings variable is set using a base class that is overridden by the subclasses. They created objects to get settings from the following sources: file, registry key, database, and Azure Configuration. Each implemented the same BaseClass, which was precisely what it was intended for. At one point, we needed to find where a particular setting was coming from. It was over 5 hours of a call with 3 developers, having to manually walk through the code to determine the source of that setting. Even then, we were not entirely sure that was the correct location of the setting value.

Inheritance example goes here DONT FORGET