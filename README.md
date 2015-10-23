# Car Health Check
Its an Java implementation for Car Health check.Its a stand alone java application which could be ran from command line interface in Jar format.

### Feature
very basic text console java application:
* It Application that simulates the health status of a car (engine, transmission, brakes, overall)
* User is asked to enter either e, t, or b to get a status report of each component the car has including an overall status that returns broken if at least one component is less reliable than 65%.
* Every component gets initialized on random base at start up.

### Code Quality
The development has been carried out with Test Driven Development with 90% code coverage.
![alt tag](https://github.com/akhileshkshatriya/car-health/blob/master/code-coverage.png)
### Instruction.
* To Run the application
 * Make sure you have Java 8.
 * Download "CarHealth.jar".
 * Open console/Terminal and execute "java -jar CarHealth.jar and follow instruction
 

* For Developers
 * Make sure you have Maven installed.
 * I have used maven assembly plugin to generate am executable jar, The jar could be generated with Maven command _"mvn clean compile assembly:single"_
 * Cobertura plugin has been used to generate code covergae report, The report could be reproduced with maven command _"mvn clean cobertura:cobertura"_
