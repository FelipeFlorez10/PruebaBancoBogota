FROM openjdk:8-jdk-slim
COPY "./target/EmployeeRest-1.0.war" "employee.war"
ENTRYPOINT ["java","-war","employee.war"]

#CMD ["/bin/sh"]
