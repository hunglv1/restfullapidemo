# restfullapidemo
# IDE: Intellij

# To create a simple Spring project to build a Restful backend webservice, follow the steps:

1. Create a new Spring Boot project
- do step by step in the site: https://www.jetbrains.com/help/idea/your-first-spring-application.html#create-new-spring-boot-project
- note that in this sample project I used Spring boot v2.7.10 and java v11 (see it in the pom.xml in project)

2. Pay attention to java files under folder "restfulldemo", note that this folder is also project name (or atifactid) which is declared in pom.xml
- 2 files RestfulldemoApplication.java and ServletInitializer.java are generated automatically when create project Spring boot
- HelloWorldController.java: here I write code to provide API

3. In file HelloWorldController.java, Pay attention to some annotation
- @RestController: declare this annotation to make this class is kind of api provider
- @RequestMapping with a part of URL (you will see this value "/demo" occurs on API URL when make an API call)
- @GetMapping(value = "/hello"): declare a method/function is a GET API, API name is /hello
- @PostMapping(value = "/searchCustomer", produces = MediaType.APPLICATION_JSON_VALUE): declare a method/function is a POST API, this api will response a text with JSON format

4. Run service
- Open file HelloWorldController.java, select Run, you will see project is run with Spring 
- Test GET api /hello: paste the following url to browser and see result: http://localhost:8080/demo/hello
- Test GET api /getCustomerList: paste the following url to browser and see result: http://localhost:8080/demo/getCustomerList
- Test POST api /searchCustomer: install tool "postman" or use it online, paste url http://localhost:8080/demo/searchCustomer to url bar and then select method = POST, and fill 2 params 'id' and 'name' (these params occur in source code - (@RequestParam int id, @RequestParam String name))
