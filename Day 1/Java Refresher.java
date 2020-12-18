/*
What is Java?
  -[Beginner-friendly] Easy to learn and understand
  -[Secure] Designed to be platform-independent and secure, using virtual machine
      -Why is Platform Independence important?
          -Many programming languages needa compiler to reduce code into machine
          language that user device can understand.
          -Problem is many devices have diff machine languages to compile into 
          -Solution is java compilers convert java code to bytecode which is
          interpreted by a Java Virtual Machine [Dalvik VM]. As long as system has
          Dalvik VM, Java code can run.
          
      -Why is Java Secure?
        -Java apps run on virtual and is separate from the actual device
          -Operating system can shut down Android apps if they become exceed 
          certain limits
  -Object oriented programming
*/

/*
Why is Java easy to learn?

 +Vast amt of resources to learn: websites, books, tutorials, classes
 +Similar syntax to other popular programming languages
 +One of the most human-readable languages
 
char character = 'a';

if (character == 'a')
{
  doSomething();
}
 else
{
  doSomethingElse();
}

*/

/*
File Type Jargon

JAR - Jar Archive

Android applications take JAR files and package them for deployment on devices as 
APK - Android Package files
*/

/*
What is an Object Oriented Programming Language?

-Objects are custom data types
  -Dog Object as blueprint for a generic dog, with instance variables for
  name, breed, and gender
  -Can create diff instances of Dog object to represent specific dogs

Dog dog1 = new Dog("Lassie", collie, female);
Dog dog2 = new Dog("Fifi", poodle, female);
Dog dog3 = new Dog("Asta", foxterrier, male);

Class provides the definitino for an object 
Class will be defined in its own file with the filename matching the class
name e.g. Dog.jafva
  -Exception is when a class has a helper class (aka inner class)
  
When one wants to reference an object from within another  class, need to
incdue import statement 

Class describes the data and behavior of an object 
  -Methods = the behavior
    -aka subroutine (sub in VBA)
*/

/*
Understanding Inheritance

Inheritance means that objects have hieriarchies

-the lower the more specific a class is
  -inherits behavior from higher, more generic classes
  
Example: Aquarium
  -Fish class: species, color, size, behaviors[eat(), sleep(), makeBabyFish()]

Inheritance utilizes the extends keyword

subclass = dervied class
superclass = parent class

Fish: FreshwaterFish and SaltwaterFish

Key words:
super -> calls parent methods
@Override --> overide a parent method
*/

/*
Organizing Object Behavior with Interfaces

Class --> defines an object
Interface --> defines some behavior that can be applied to an object

Ex. Swimmer Interface (bunch of methods that  can be applied to anything
that can swim.

Keyword: implements
similar to extends but copies the interface's methods 
*/

/*
Organizing Classes and Interfaces with Packages

Package = set of classes and interfaces bundled together
*/
