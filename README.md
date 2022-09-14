# multithreading_app
A simple web server that can sum up numbers in a multi-threaded environment.


Instructions for deployment:
1) run the following command:
mvn package
2) from the "target" directory run the following command:
java -jar webapp-0.0.1-SNAPSHOT.war

Tests provided via the following files:
1) Multithreading test_post numbers.jmx
2) Multithreading test_end request.jmx

Instructions for testing:
Use Apache JMeter for testing:
1) open and run the first thread group: Multithreading test_post numbers.jmx 
2) open and run the second thread group: Multithreading test_end request.jmx
