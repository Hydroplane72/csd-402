	When comparing Swing to JavaFX, new applications should probably be created in JavaFX. If you need to make your program compatible with legacy systems, though, then you should use Swing instead. 

I used Copilot to generate two different code sets that should do the same thing. One is a Swing Example, and the other is a JavaFX example.

One thing to note about the are that, in Swing, it sets the default Close Operation, while in Java FX, it just assumes that closing the UI means stopping the app.

Another significant difference between the two is how they set up a simple "Click Me" button. For Swing, you have a Frame and a JButton to worry about. In JavaFX, they seem to have split things out, so you also need to set up a "Scene" and a "Stage" to show the UI. This probably freed up the ability to do more customization in the UI. The need for these components causes unnecessary stress on developers who might convert from Swing to JavaFX. This also aligns with the GeeksforGeeks article that says JavaFX can be harder to learn for beginners than AWT and Swing.

When you start comparing JavaFX to Swing, the article I read on GeeksforGeeks basically said that JavaFX is better for newer applications that require advanced multimedia features. According to one of the articles I looked at, Swing opens faster, though only on average, which makes sense since it is a lighter-weight library.

Getting off Topic here, but I can't help it: ( Ignore if you want) 
A lot of the opinions expressed here are based on my also comparing Java to C# .NET, where I already know how to create desktop applications that work. In my mind, C# is much easier to learn for making a desktop UI than JavaFX and the "Scene Builder" tool. It is hard to do an apples-to-apples comparison because JavaFX works on other systems, while C# is primarily used on Windows. Considering that about 66% (down from about 88% back in January 2020) of the world uses Windows as the desktop operating system of choice (StatCounter). C# is very viable for desktop use, especially for business applications.

Another thing to note is that while desktop apps are nice and all, many people don't actually use them anymore. Instead, they are more likely to open a browser and use your web app, which negates the entire point of using JavaFX (or any of these other older tools), since it is primarily for desktop applications.

I want to compare these two Hello World videos on how to create a Hello World app in C# vs JavaFX. It very well illustrates the difference in how easy it is to create a simple desktop app in C# compared to JavaFX.
C#  Hello World:
https://www.youtube.com/watch?v=ze1xMQeBOYY

JavaFX Hello World:
https://www.youtube.com/watch?v=RxFnaWbJYrk

The main point I am making here is that if you find JavaFX confusing. You are better off learning C# Windows Forms functionality, since you can experiment with different UI concepts more quickly there than with JavaFX. Then, when you try JavaFX again, you might do better with the basis of how C# Windows Forms work. 

My main gripe about JavaFX is the complexity of building it and the fact that Scene Builder is so difficult to use compared to other GUI builders.

References:

GeeksforGeeks. (2024, February). Java AWT vs Java Swing vs Java FX. GeeksforGeeks. https://www.geeksforgeeks.org/java/java-awt-vs-java-swing-vs-java-fx/#java-awt-vs-java-swing-vs-java-fx
‌
Microsoft. (2025). Copilot (GPT-4) [Large Language Model]. https://copilot.microsoft.com/. 

StatCounter. (2019). StatCounter Global Stats - Browser, OS, Search Engine, Including Mobile Usage Share. StatCounter Global Stats. https://gs.statcounter.com/

Macro Nepal. (2025, November 7). Swing vs JavaFX: Comprehensive Comparison for Java GUI Development https://macronepal.com/2025/11/07/swing-vs-javafx-comprehensive-comparison-for-java-gui-development/blog/

For how to use Scene Builder:
https://www.youtube.com/watch?v=NpQU1xU6U8w


‌