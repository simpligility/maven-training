# Takari Training

This project contains the Takari Maven and TDM training slides with embedded
speaker notes as well as the student exercises.

The slides are using [reveal.js] (https://github.com/hakimel/reveal.js) so check
out the docs there for keyboard shortcuts and more.

## Teaching

To teach with the material use 

````
grunt serve
````

and then look at [http://localhost:8000] (http://localhost:8000). Serving it
from a local server like that will make sure the speaker notes work. (Press "s" to 
show the notes).

Familiarize yourself with the exercises in the labs folder up front also taking the
comments inline as well as the speaker notes into account.  

## Materials for Students

The labs as well as these PDF's are checked into the materials folder for
convenience.

To create a PDF print version use

* [http://localhost:8000/installing-running-maven.html?print-pdf](http://localhost:8000/installing-running-maven.html?print-pdf)
* [http://localhost:8000/intro-to-maven.html?print-pdf](http://localhost:8000/intro-to-maven.html?print-pdf#/)

and then print to the PDF files in the materials folder. You have to use Chrome
for this to work. More info at
[https://github.com/hakimel/reveal.js](https://github.com/hakimel/reveal.js).

Check those files into git to make things easier for next time. Then create the
overall archive with these PDF files as well as the labs by running

````
grunt package
````

and provide the file 'target/'




 