Prereqs

- break out the prerequisites into a document and probably the initial video so that people can prepare for the class themselves and can validate that it's working. we want to avoid people showing up and nothing working as it will be annoying for the instructor and annoying for everyone that does have the system working. if there is a document/video outlining what is required we can send out email reminders to prod the trainee to have it setup before they get there. so remove the maven environment setup from the slides and we will do the best to ensure they are setup and tell them the experience will be better if they do.

Module Objectives

- i don't want people having to check things out from source control. most of these corporate people may be using something different than Git and it's really irrelevant to the training how they get the material, i think. we just need all the projects self contained directory structure

Building the Project

mvn clean package : explain the install and repositories later

What is a Maven Project
- directory structure
- lifecycle
- coordinates
  - dependencies
  - parents
- plugins

Writing and Executing Tests? - still not sure this is the best use of time for them. I still think it's more useful to do this in m2e and show them the integration for running tests in the IDE. I think we need to find out how many people in the training courses used eclipse. I don't think most people work from the command line.

I would skip reporting all together, does anyone care with SonarQube?