Creating a Class vs. Creating an Object
	If you are ever asked what the difference is between creating a class and creating an object. Please teach this person that an object is an instance of a class. A class is the blueprint for a house, while an object is the actual house with all its attributes filled in. A definition I have heard is: a class defines the essential parts of a thing, while an object is the thing itself. A class for a dog would have properties for hair, eyes, legs, and Tail. A dog with long hair, blue eyes, 3 legs, and a short tail is an object.

Below is an example of a class being instantiated to create an object.

EXAMPLE  "ANIMALEXAMPLE" GOES HERE DON'T FORGET

Accessing and Modifying Attributes
	I don't like the name of the Attributes class in Java. Most of my issues with calling fields in a class's Attributes stem from the fact that the keyword "Attributes" is used in many languages to describe the mechanism for adding metadata to classes. This difference can confuse others when you are talking about adding Attributes to a class in Java vs. C#. A more common name for Attributes in Java is "Fields," and this is also a common name in C# and VB.NET. With that said, if you ever talk to me directly, I will use 'properties' rather than 'fields' when discussing classes and the data they contain. There is a difference between properties and fields, though it's small enough not to matter for this discussion.

	With my rant about Attributes done ...

	Modifying Attributes is done after a class has been instantiated into an object, and you are setting the class's Fields to specific values. Generally, it is considered a bad idea to modify an object's Attributes without first instantiating it. I encourage everyone to try it out anyway, mainly so they can get used to seeing the best error message in the world of "Object reference is null". I can't tell you how many times I've seen this message; it's come up so often over the years. 
	Trying to access Attributes on objects that have not been instantiated yet also gives you either that lovely error message or, better yet, the absolute gem of a message: "Null value reference found". 

	Please note the sarcasm throughout this post. I just spent the last 7 hours before writing this debugging an issue in an ancient system that only gave me these messages to go by. Also, as a side note for anyone who's actually read this far, I recommend logging as much as possible about exceptions. Especially, make sure to include in your logs the stack trace where the exception occurred, not just the exception message.

Below is an example of me creating a simple object of a class. Setting a value and then retrieving it from the object.

EXAMPLE  "AttributeAccessModificationExample" GOES HERE DON'T FORGET