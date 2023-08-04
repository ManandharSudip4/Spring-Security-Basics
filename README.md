## Spring Security

### Module 1. Basic Spring Security
#### What I did:
    What i did here is created a simple-minimal API and added a Spring Security to access that particular URL

    We don't actually need to create all the forms and manage authentication, thanks to Spring Security Dependency which provides all this authentication part.

    We can see the dependency on pom file.

    Here Spring security acts as filter sits between user requests and application.


#### Little Customization:
    By default Spring security creates an user named user and provides default password in console

    But i customized little bit to create my own user by just adding these two particular lines in 'application.properties'.

```
spring.security.user.name=<Your-Username>
spring.security.user.password=<Your-Password>
```

### Module 2. Spring In-Memory Authentication
    Spring Security’s InMemoryUserDetailsManager implements UserDetailsService to provide support for username/password based authentication that is stored in memory.

    So, here basically i configure the Authentication Method, i defined my own user whose credentials are saved in memory.

    It is written inside SecurityConfiguration inside security package.

    Logic is simple we build or create a User creating the instance of USerDetails.
    And at last i create a new instance of InMemoryUserDetais and ed the created users into that instance to actually create the in memory user.


### Module 3. Simple Authorization
    So, here i added authorization feature which helps us to access the specific api based on the role user has got.

    Higher User can access all APIs and if we do down to hierarchy we get less authorization to specific APIs.

    For this i changed only two pages
        - HomeResources 
            - Created 2 more APIs
        -SecurityConfiguration
            - Created a filterchain which is logic for the authorization
            - will understand after utilizing this more and more