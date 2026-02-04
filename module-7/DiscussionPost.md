The 'this' Reference
	The 'this' reference is a feature you will want to learn and understand beyond just Java. The 'this' method allows you to modify the instance object's data when there are parameters or other variables with the same names as the class's properties. Many other programming languages use the same functionality as 'this'. In C#, the 'this' keyword has the same syntax as Java. In Visual Basic, the equivalent keyword is Me.
	You will often need this functionality in constructors and set functions. You will do this because you usually want to name the parameters the same as the variables they set if you look at code made years ago or created by a more traditional programmer. You will see them naming parameters starting with 'p'. This naming convention is done to reduce the need to put 'this' for every set and get of instance-level variables. I usually name my parameters with a 'p' at the beginning to avoid issues where I thought I was setting an instance variable but forgot the 'this'. Granted, I usually only do it at work, since the code will be used and potentially modified by many others, and keeping code clarity is best. Class assignments, on the other hand, you won't really find me doing that for class work, since most of this code is expected to be a create-and-dump type.

Below is an example of using the 'this' reference, as you can see, if I had named my parameters with a 'p' at the beginning. I would not need to even worry about 'this' references.

PUT 'THIS EXAMPLE' HERE. DON'T FORGET

Variable Scope
	Variable scope is one of the most commonly annoying issues to deal with day to day. It is very easy to create a variable and mistakenly expect its value to persist. I have seen developers with 20+ years of experience make the mistake of creating a variable at the beginning of a function and then expecting that value to change across subsequent function calls.
	In Java, there are 4 variable scope types: Local, Instance, Static, and Block. I could write out in words the scope type, where it is declared, and how you can access that variable. I feel like it is more efficient to list the 4 below instead.
Block
Declared in a block of code. Think within if statements and/or loop statements
It can only be accessed within the block statement. There is no other way to get at the variable and its data.
Local
Inside a method/block
Can only be accessed from within the method or Block
Local is different from Block, since there can be multiple blocks of code within a function.
Instance
Inside a class as a property/field. It is not declared within a method.
Can be accessed from instance methods. Static Methods are not allowed to access this data.
Static
An instance property/field that is declared with static.
Can be accessed from instance and static methods.
Here are some examples of Block, Local, Instance, and Static Variables.

PUT ScopeExample HERE DON'T FORGET