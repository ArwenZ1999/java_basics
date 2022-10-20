# java_basics
non-static:
https://stackoverflow.com/questions/4969171/cannot-make-a-static-reference-to-the-non-static-method
# run java code in local 
1. add build file into palm file 
2. build maven 
3.  java -jar target/java_basics-1.0-SNAPSHOT.jar
4. you can also feed file into this custimized function by `cat pom.xml | java -jar target/java_basics-1.0-SNAPSHOT.jar`

##overload vs overwrite
cant overwrite main method in java, can overload main method in java. 
we can overload static method, cant overwirte static method. 
Overriding occurs when the method signature is the same in the superclass and the child class. Overloading occurs when two or more methods in the same class have the same name but different parameters.

##checked 
A checked exception is caught at compile time whereas a runtime or unchecked exception is, as it states, at runtime. A checked exception must be handled either by re-throwing or with a try catch block, whereas an unchecked isn't required to be handled.
