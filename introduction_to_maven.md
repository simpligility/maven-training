# Introduction to Maven

Tim's Notes on Class:

* I'd like for this class to be focused on activity rather than theory.  There's nothing worse than standing up in front of a class and having to talk for an hour about the theory of dependency management.


## Prerequisites
 
* Student should understand how to set an environment variable on an OS.

## Target Platforms

Operation Systems:

* Windows 7 +
* OSX Mountain Lion +

Java Version:

* Java 7

IDEs:

* Eclipse Kepler

## Goals and Objectives

At the end of this class, students should be familiar with the following:

* How to download and install Maven
* How to run a simple build
* How to configure and locate dependencies for a project
* How to configure the Surefire plugin to run unit tests

 
# Modules

## Welcome and Objectives (10 minutes)

* Welcome Message
* Instructor introduction
* Brief overview of course objectives
* Planned class structure (we will learn this, then this, then this…)
* How to provide feedback during class

### Length: 

    Min: 5 minutes
    Max: 10 minutes

### Tim Notes:

* Don't dwell. This section needs to start and end in a manner of minutes.
* You might see this as a filler section, but it's important to provide a "roadmap" for the course.
* We should make sure to define what the instructor introduction is (and what it is not)
* Giving people a way to provide feedback during class is critical for virtual.

## Install and Run Maven (15 minutes)

* Downloading Maven
* Installing Maven
* Running Maven
* Questions

Length:

    Min: 10 minutes 
    Max: 15 minutes

Tim Notes: 

* Instead of starting with a VERY BORING "What is Maven?" section. We start with a demo.  
* Pay attention to prerequisites - if someone doesn't get how to set an environment, they shouldn't be in this class.

## Build a Simple Project (35 minutes)

* Checkout a Simple Project from Version Control
* Examine the pom.xml
* Introduce coordinates
* Introduce dependencies
* Explain directory structure
* Modify code
* Modify a dependency
* Examine the Output

Length: 

     Min: 25 minutes
     Max: 35 minutes

Tim Notes:

* Don't go into all the detail.  This class is not a reference book.  
* Don't talk about where resource filters go, they are not there yet.  src/main/java, src/test/java - that's it.

# BREAK (10 minutes)

## Working with Dependencies (45 minutes)

* Coordinate Details (5 minutes)
* Where do dependencies come from?
* Checkout a Project from Version Control
* Run a Build and Identify a New Requirement
* Locate the Appropriate Dependency in Central
* Add a new Dependency
* Modify Code to Use New Dependency
* Demonstrate Maven Downloading a Dependency
* Where dependencies go?
* Repository Format
* Release Versions

Tim Note:

* This is going to seem strange, but there's no mention of a snapshot here. Here's my thought: most users don't need to know what a snapshot is until they think of in-house software releases.   Almost no one is depending on SNAPSHOT versions from Apache.  Introducing SNAPSHOTs right now is confusing.

* Also note that this module isn't called 'Dependency Management'.  That's a fancy name that means nothing to a junior developer that just needs to use a new dependency.




## Writing and Executing Unit Tests (45 minutes)

* Checkout a Project from Version Control
* Demonstrate Surefire Plugin
* Introduce Surefire Plugin
* Show TestNG Tests
* Execute TestNG Tests
* Discuss Test Resources
* Demonstrate Test Resources
* Including and Excluding Tests
* Running a Single Test
* Parallel Test Execution
* Surefire Plugin Configuration Examples

Length:

     Min: 33 min
     Max: 45 min
     
Tim Notes:

* Unit tests are such a fundamental requirement, we should spend an entire module on it. 

## BREAK (10 minutes)