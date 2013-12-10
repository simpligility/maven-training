# Intro to Maven Prerequisites

If you've enrolled in Takari's Intro to Maven you'll need to make sure
that you prepare for this class.  Before class begins there are three
things you'll need to do:

* Install the Java Development Kit 1.7.0 (Latest Update)

* Install Apache Maven 3.1.1

* Install Eclipse IDE for Java Developers 4.3.1

## Installing the Java Development Kit (JDK)

* Installing the JDK on Microsoft Windows:
  http://docs.oracle.com/javase/7/docs/webnotes/install/windows/jdk-installation-windows.html

* Installing the JDK on Apple's OSX:
  http://docs.oracle.com/javase/7/docs/webnotes/install/mac/mac-jdk.html


## Installing Apache Maven

* Installing Apache Maven: 

Maven is a Java tool, so you must have Java installed in order to
proceed. More precisely, you need a Java Development Kit (JDK), the
Java Runtime Environment (JRE) is not sufficient. Additional optional
installation steps are listed after the platform specific
instructions.

### Windows 2000/XP

1. Unzip the distribution archive, i.e. apache-maven-3.1.1-bin.zip to
   the directory you wish to install Maven 3.1.1. These instructions
   assume you chose C:\Program Files\Apache Software Foundation. The
   subdirectory apache-maven-3.1.1 will be created from the archive.

1. Add the M2_HOME environment variable by opening up the system
   properties (WinKey + Pause), selecting the "Advanced" tab, and the
   "Environment Variables" button, then adding the M2_HOME variable in
   the user variables with the value C:\Program Files\Apache Software
   Foundation\apache-maven-3.1.1. Be sure to omit any quotation marks
   around the path even if it contains spaces. Note: For Maven 2.0.9,
   also be sure that the M2_HOME doesn't have a '\' as last character.

1. In the same dialog, add the M2 environment variable in the user
   variables with the value %M2_HOME%\bin.

1. Optional: In the same dialog, add the MAVEN_OPTS environment
   variable in the user variables to specify JVM properties, e.g. the
   value -Xms256m -Xmx512m. This environment variable can be used to
   supply extra options to Maven.

1. In the same dialog, update/create the Path environment variable in
   the user variables and prepend the value %M2% to add Maven
   available in the command line.

1. In the same dialog, make sure that JAVA_HOME exists in your user
   variables or in the system variables and it is set to the location
   of your JDK, e.g. C:\Program Files\Java\jdk1.5.0_02 and that
   %JAVA_HOME%\bin is in your Path environment variable.

1. Open a new command prompt (Winkey + R then type cmd) and run 
   mvn --version to verify that it is correctly installed.

### Unix-based Operating Systems (Linux, Solaris and Mac OS X)

1. Extract the distribution archive,
   i.e. apache-maven-3.1.1-bin.tar.gz to the directory you wish to
   install Maven 3.1.1. These instructions assume you chose
   /usr/local/apache-maven. The subdirectory apache-maven-3.1.1 will
   be created from the archive.

1. In a command terminal, add the M2_HOME environment variable,
   e.g. export M2_HOME=/usr/local/apache-maven/apache-maven-3.1.1.

1. Add the M2 environment variable, e.g. export M2=$M2_HOME/bin.

1. Optional: Add the MAVEN_OPTS environment variable to specify JVM
   properties, e.g. export MAVEN_OPTS="-Xms256m -Xmx512m". This
   environment variable can be used to supply extra options to Maven.

1. Add M2 environment variable to your path, e.g. export
   PATH=$M2:$PATH.

1. Make sure that JAVA_HOME is set to the location of your JDK,
   e.g. export JAVA_HOME=/usr/java/jdk1.5.0_02 and that $JAVA_HOME/bin
   is in your PATH environment variable.

1. Run mvn --version to verify that it is correctly installed.

## Installing the Eclipse IDE

Download Eclipse from the Eclipse Downloads Page.

The download will be delivered as a compressed (i.e. a ".zip", or
".tar.gz") file. Decompress this file into the directory of your
choice (e.g. "c:\Program Files\Eclipse" on Windows). You can
optionally create a shortcut of the executable file ("eclipse.exe" on
Windows, or "eclipse" on Linux).

Note that there is a known problem with the built-in decompression
utility on all current versions of Windows. We recommend that you use
a more robust decompression utility such as the open source 7zip when
decompressing an Eclipse download. Some people report success when
initially decompressing Eclipse into a root directory (e.g. c:\) and
then moving it to a more appropriate home (e.g. c:\Program
Files\Eclipse)