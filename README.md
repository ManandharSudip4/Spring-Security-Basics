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

    So, here basically we configure the Authentication Method, we define our own user whose credentials are saved in memory.

    It is written inside SecurityConfiguration inside security package.

    Logic is simple we build a create a User creating the instance of USerDetails.

