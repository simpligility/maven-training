#!/bin/bash

./node_modules/phantomjs/lib/phantom/bin/phantomjs plugin/print-pdf/print-pdf.js "http://localhost:8000/installing-running-maven.html" takari-training-slides/TakariTraining-InstallingAndRunningMaven.pdf
./node_modules/phantomjs/lib/phantom/bin/phantomjs plugin/print-pdf/print-pdf.js "http://localhost:8000/intro-to-maven.html?print-pdf" takari-training-slides/TakariTraining-IntroductionToMaven.pdf
