
package com.alfonsotienda.holaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * MainController
 */

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String holaMundo(@RequestParam("nombre") String name, @RequestParam("edad") Integer edad) {

        return "Hola " + name + " tienes " + edad + " años ";
    }

    @GetMapping("/ingles")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/nuevo")
    public ModelAndView helloHTML() {
        ModelAndView respuesta = new ModelAndView("hello");
        String msg = "Hola mundo html";
        respuesta.addObject("mensaje", msg);
        return respuesta;

    }
   
    @GetMapping("/test")
    @ResponseBody
    public String testdelocura(@RequestParam("opcion1") String opcion1, @RequestParam("opcion2") String opcion2,
            @RequestParam("opcion3") String opcion3, @RequestParam("opcion4") String respuesta4) {
         String test1, test2, test3, test4, test5, test6, test7, test8; 
         int suma1, suma2, suma3, suma4, suma5, suma6, suma7, suma8 =0;  
         String respuesta1= "nunca";
         String respuesta2= "una vez al año";
         String respuesta3= "a menudo ";
         String repuesta4= "son las tres menos cuarto";  
       
         System.out.println("respuesta1= nunca " + "respuesta2= una vez al año " +
                            "respuesta3= a menudo " + "respuesta4= son las tres menos cuarto " );
         

        System.out.println("¿con que frecuencia te dicen estas loco?"); 
        
           if (test1.equals(respuesta1)){
               suma1 = 0;
           }else if (test1.equals(respuesta2)){
               suma1 = 1;
           }else if (test1.equals(respuesta3)){
               suma1 = 2;
           }else if (test1.equals(respuesta4)){
               suma1 = 3;
           }
         
           
         

                  
             


            }














































    @GetMapping("/calculadora") 
    @ResponseBody
    public ModelAndView calculadoraHTML() {
        ModelAndView modelAndView = new ModelAndView("hello"); 
        modelAndView.addObject("mensaje", "");
        return modelAndView;
    }
    
    
    @PostMapping("/calculadora") 
    @ResponseBody

    public ModelAndView calculadoraHTMLPost(@RequestParam("numero1") Double numero1, @RequestParam(value ="numero2", required = false) Double numero2,
            @RequestParam("operacion") String operacion) {
      
      ModelAndView modelAndView = new ModelAndView("hello");

      String resultado = calcula(numero1, numero2, operacion);

      modelAndView.addObject("mensaje", resultado);
                 
       return modelAndView;

}


private String calcula(
    Double numero1,
    Double numero2,
    String operacion
) {
    double res = 0;

    if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") || operacion.equals("X")
            || operacion.equals("/") || operacion.equals("*") || operacion.equals("^") || operacion.equals("raiz cuadrada") || operacion.equals("potencia")|| operacion.equals("raiz") ) {

    } else {
        return "que noooooooo";
    }

    switch (operacion) {
    case "+":
        res = numero1 + numero2;
        break;
    case "-":
        res = numero1 - numero2;
        break;
    case "x":
    case "X":
    case "*":
        res = numero1 * numero2;
        break;
    case "/":
        res = numero1 / numero2;
        break;
     case "^":
     case "potencia": 
        res = (int) Math.pow (numero1, numero2);     
        break;
      case "raiz":
      case "raiz cuadrada":
         res = Math.sqrt (numero1);
        break;      
    }

    return "el resultado de " + numero1 + " " + operacion + " " + numero2 + " es " + res;
}
}