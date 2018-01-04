# spring-boot-batch-swagger

The application is a web application, which uses Maven, Hibernate, Spring (Boot, Batch, Data), and Swagger. 
Regarding the business there are some entities in the project including Person, Child, House, and Meal. 
A Person has a House and can have multiple Children. Every Child has favorite meals.

This application covers following tasks:

1.	Implemented a Restful Controller to provide information about person and children.

(1-1) /persons/{person_id}/house : This endpoint returns the House for a given person

(1-2) /children/{child_id}/info : This endpoint returns the Parent and the most favorite meal of a child 

(1-3) /children/{child_id}/color : returns, for a given Child, the hairColor if the Child is a Daughter or 
the bicycleColor if the Child is a Son.

2.	Implemented a page for testing the Rest API by swagger framework which can be reached through this url (http://localhost:8080/swagger-ui.html)

3.	Caching Person entity using second level cache in Hibernate to seed up the service performance.

4.	Implemented an endpoint persons/children which returns an array in which the element n is the amount of people having n children. 
To speed up this request, there is a job (whith spring-batch and schedular) which runs every 15 minutes, 
calculates those numbers and puts them into a new entity ParentSummary

