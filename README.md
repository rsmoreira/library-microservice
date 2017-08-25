# library-microservice
Library Microservice


Project using Spring Boot with microservices. 
It is just a small project to get started with Spring Boot. 

Contents
This folder holds all files that you will need to run this Micro Service. 
Into the folder /src/database you will have the schema.sql file. Use it to create the Oracle database. On it there are all tables, indexes and contraints needed to run this project.

** Remember: to have this project running you need to have the database properly configurated and running. 

About the Services
This is a little library with Books, Patrons (persons that can take books) and Transactions (when a Patron gets a Book, it is persisted into the Transaction).

Get started
Import this project into Eclipse;

Configuring
Into the project explorer, click with the right button and go to "Run As / Run Configurations...".
You will create two Java Application Configurations.

First of them:
Main - Registration
Select Java Application and click New. 
Project: RSMoreLibraryMS
Main class: com.rsmoreira.microservices.Main
Arguments (Program arguments): registration

Second of them:
Main - Library
 Select Java Application and click New. 
Project: RSMoreLibraryMS
Main class: com.rsmoreira.microservices.Main
Arguments (Program arguments): library

Save all of them.

Running
Into the project explorer, click with the right button and go to "Run As / Run Configurations...".
First: Into the Java Application select Main - Registration and click in Run.
Second: Into the Java Application select Main - Library and click in Run.

Services
All services all exposed basically using RESTful and Spring HATEOAS. 
So, to get a little flavor of this, just execute these gets:

http://localhost:<port>/library/books/findAll
http://localhost:<port>/library/patrons/findAll
http://localhost:<port>/library/transactions/findAll

Spring HATEOAS will provide the next URLs to navigate through the data. 





