Emploee Contacts with CURD operation
CURD operation implented for employee contact with RESTfull API using Java and MySQL

## Installation
1. MySQL Workbench
2. Eclipse
3. TOmcat server

## Usage
Need to run the spring application on tomcat server and trigger each services.

1.For List service - http://localhost:8080/contacts

Use curl tool for testing the remaing services i.e.
1.To get list - curl http://localhost:8080/contacts
2.For Add -curl -X POST -H "Content-Type: application/json" -d "{\"firstName\":\"ram\",\"lastName\":\"suryavanshi\",\"emailId\":\"ram@yahoo.com\",\"phoneNumber\":\"9999999\",\"status\":\"Active\"}" http://localhost:8080/contacts
3.To update exiting contact - curl -X PUT -H "Content-Type: application/json" -d "{\"id\":2,\"firstName\":\"ramnathan\",\"lastName\":\"suryavanshi\",\"emailId\":\"ramnath@yahoo.com\",\"phoneNumber\":\"9999000\",\"status\":\"Active\"}" http://localhost:8080/contacts/2 -v
4. To delete specific contact - curl -X DELETE http://localhost:8080/contacts/3
