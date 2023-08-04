## Basic Spring Security

### What I did:
    What i did here is created a simple-minimal API and added a Spring Security to access that particular URL

    We don't actually need to create all the forms and manage authentication, thanks to Spring Security Dependency which provides all this authentication part.

    We can see the dependency on pom file.

    Here Spring security acts as filter sits between user requests and application.


### Little Customization:
    By default Spring security creates an user named user and provides default password in console

    But i customized little bit to create my own user by just adding these two particular lines in 'application.properties'.

```
spring.security.user.name=<Your-Username>
spring.security.user.password=<Your-Password>
```

