#Questions and answers
## 1. Difference between String, StringBuffer, and StringBuilder in Java?
Ans :
1. String is immutable.
2. StringBuffer and StringBuilder are mutable
3. StringBuffer is synchronized
4. StringBuilder is not synchronized

## 2. Difference between HashMap and Hashtable in Java? 
1. HashMap and Hashtable are based upon hash table data structure
2. HashMap is non-synchronized while Hashtable is synchronized
3. HashMap allows a null key but Hashtable doesn't
## 3. Difference between TreeSet and TreeMap in Java? 
1. Both are sorted collections.
2. TreeSet is based on Set data structure that doesn't allow duplicate
3. TreeMap is an implementation of Map interface

## 4. Externalizable vs Serializable
1. In case of Externalizable, it's the programmer who should take care of the whole serialization and also deserialization process
2. If we need to serialize the entire object, the Serializable interface is a better fit. On the other hand, for custom serialization, we can control the process using Externalizable.
3. The java.io.Serializable interface uses reflection and metadata which causes relatively slow performance. By comparison, the Externalizable interface gives you full control over the serialization process
4. While using Externalizable, it's mandatory to read all the field states in the exact order as they were written.
##5. Difference between transient and volatile in Java?
Transient keyword is used in Serialization while volatile is used in multi-threading
##6. Difference between Association, Composition, and Aggregation?


##======SpringBoot Question====
##1. How Spring boot internally works?
#### 1. Spring boot application execution will start from the main() method.
#### 2. The main() method internally call SpringApplication.run() method.
#### 3. SpringApplication.run() method performs bootstrapping for our spring boot application.
#### 4. Starts StopWatch to identify the time taken to bootstrap the spring boot application.
#### 5. Prepares environment to run our spring boot application (dev, prod, qa, uat).
#### 6. Print banner ( Spring Boot Logo prints on console).
#### 7. Start the IOC container ( ApplicationContext) based on the classpath ( default, Web servlet/ Reactive).
#### 8. Refresh context.
#### 9. Trigger Runners (ApplicationRunner or CommandLineRunner).
#### 10. Return ApplicationContext reference ( Spring IOC) .

## 2. Explain @SpringBootApplication, @Configuration and @ComponentScan annotations
SpringBootApplication=@Configuration, @EnableAutoConfiguration, and @ComponentScan.

## 3. What Is the Minimum Baseline Java Version for Spring Boot 3?
Spring Boot 3.0 requires Java 17 or later. It also requires Spring Framework 6.0.
## 4. Name all Spring Boot Annotations?
SpringBootApplication
EnableAutoConfiguration
ConditionalOnClass
ConditionalOnMissingClass
ConditionalOnBean
ConditionalOnMissingBean
ConditionalOnProperties
ConditionOnResource
Conditional
ConditionalExpression
ConditionalOnWebApplication
ConditionalOnNotWebApplication
## 4. Why do we need a spring-boot-maven plugin?

The Spring Boot Maven plugin provides many convenient features:
1. It collects all the jars on the classpath and builds a single, runnable "über-jar", which makes it more convenient to execute and transport your service.
2. It searches for the public static void main() method to flag as a runnable class.
3. It provides a built-in dependency resolver that sets the version number to match Spring Boot dependencies. You can override any version you wish, but it will default to Boot’s chosen set of versions.
4. The Spring Boot Plugin has the following goals.
5. Spring-boot:run runs your Spring Boot application.
6. Spring-boot:repackage repackages your jar/war to be executable.
7. Spring-boot:start and spring-boot:stop to manage the lifecycle of your Spring Boot application (i.e. for integration tests).
9. Spring-boot:build-info generates build information that can be used by the Actuator.

## 5 How to Change Default Embedded Tomcat Server Port and Context Path in Spring Boot Application?
1. server.port=8080
2. server.servlet.context-path=/springboot2webapp
