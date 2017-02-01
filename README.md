# spark-scala-base-project
This is a basic template to build Spark scala projects. It includes a basic pom.xml with dependencies and plugins set up and a starting point with some logic (Main.scala).

## Maven pom.xml
The pom.xml file includes:

Dependencies:
* Scala-lang libraries (version 10.6)
* Spark-core dependencies (version 1.6.0 2.10)

Plugins:
* maven-jar-plugin
* maven-compiler-plugin (set for java 1.7)
* scala-maven-plugin (version 3.1.4)
* maven-assembly-plugin (set to build a jar-with-dependencies fat jar file)

## Code
The src/java folder contains a basic main package:

### Main.scala
Basic starting point of your application with Ted Malaska's [recommended local/cluster mode selector](https://www.youtube.com/watch?v=4U9Me6shpno). Checks for the "local" argument to be the first one passed to the application and sets the proper parameters if so.

After that it will create a SparkConf and start a SparkContext.

### MainJob.scala
Code goes here inside the execute() method. The SparkContext started in Main.scala is passed onto this class when constructed.
