package springbootapi.restapi.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootapi.objects.HelloObject;
import springbootapi.restapi.Hello;

import java.util.ArrayList;





/*
* A key difference between a traditional MVC controller and the RESTful
* web service controller above is the way that the HTTP response body
* is created. Rather than relying on a view technology to perform server-side
* rendering of the greeting data to HTML, this RESTful web service controller
* simply populates and returns an object. The object data will be
* written directly to the HTTP response as JSON.
*
*/





/*
* This code uses Spring 4’s new @RestController annotation,
* which marks the class as a controller where every method
* returns a domain object instead of a view
*
*/



@RestController
@RequestMapping("/Hello/")
public class HelloController {



    @Autowired
    Hello hello;



    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }





     @RequestMapping("getHelloObjects")
     public ArrayList<HelloObject> getHelloObjects(){



         return hello.getHelloObjects();
     }




}