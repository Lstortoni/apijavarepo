/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruabapi.pruebaapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC
 */
@RestController
public class holamundoController {
    
    @GetMapping("/hello")
    public String sayHello(){
        
        return "Hola mundirijillo";
    }
    
    @GetMapping("bye")
    public String goodBye(){
        
        return "Bye bye";
    }
 
    @GetMapping("hello/{nombre}/{apellido}/{edad}")
     public String sayHelloCompleto(@PathVariable  String nombre,@PathVariable String apellido,@PathVariable int edad){
        
        return "Hola el nombre es " + nombre + "y tiene este apellido :" + apellido +"y tiene esta edad:" + edad;
     }
     
     
         
    @GetMapping("/hola")
    public String decirHola(@RequestParam String nombre,@RequestParam int edad ,@RequestParam String profesion ){
        
        return "Hola el nombre es "  + nombre + " y tiene esta edad : " +edad +" y esta profesion " + profesion;
    }
 
}
