
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
            @RequestParam("opcion3") String opcion3) {
         String test1, test2, test3, test4, test5; 
         int suma1, suma2, suma3, suma4, suma5 =0;  
         String respuesta1= "nunca";
         String respuesta2= "de vez encuando ";
         String repuesta3= "son las tres menos cuarto";  
       

        System.out.println("BIENVENIDO AL TEST 2.0 ULTIMA GENRACION - SUPER FIVE QUESTIONS ¿ ESTOY CUERDO ?");

       /*
        System.out.println(" respuesta1= nunca " + " respuesta2= de vez encuando " +
                            " respuesta3= son las tres menos cuarto " );
         
         */
         
        System.out.println("1.¿con que frecuencia te dicen estas loco?"); 
            test1 = System.console().readLine();
           if (test1.equals(respuesta1)){
               suma1 = 0;
           }else if (test1.equals(respuesta2)){
               suma1 = 1;
           }else if (test1.equals(respuesta3)){
               suma1 = 2;
           }
         
        System.out.println("2.¿cuantas veces has acabado desnudo en una fiesta?"); 
            test2 = System.console().readLine();
           if (test2.equals(respuesta1)){
               suma2 = 0;
           }else if (test2.equals(respuesta2)){
               suma2 = 1;
           }else if (test2.equals(respuesta3)){
               suma2 = 2;
           }
         
        System.out.println("3.¿cuantas veces le has quitado el sitio a una ancianita en el autobus?"); 
            test3 = System.console().readLine();
           if (test3.equals(respuesta1)){
               suma3 = 0;
           }else if (test3.equals(respuesta2)){
               suma3 = 1;
           }else if (test3.equals(respuesta3)){
               suma3 = 2;
           }

        System.out.println("4.¿cuando un compañero te ha pedido ayuda le has contestado jurando y maldiciendo en arameo (valido otro idioma)?"); 
            test4 = System.console().readLine();
           if (test4.equals(respuesta1)){
               suma4 = 0;
           }else if (test4.equals(respuesta2)){
               suma4 = 1;
           }else if (test3.equals(respuesta3)){
               suma4 = 2;
           }

        System.out.println("5.¿cuandote dicen que hay examen del curso de programacion , te pones mas nervioso que espinete vendiendo condones?"); 
            test5 = System.console().readLine();
           if (test5.equals(respuesta1)){
               suma5 = 0;
           }else if (test4.equals(respuesta2)){
               suma5 = 1;
           }else if (test3.equals(respuesta3)){
               suma5 = 2;
           }

    int suma;
    suma = suma1 + suma2 + suma3 + suma4 + suma5;
    System.out.println("\nHas obtenido " + suma + " puntos.");
    
    System.out.println();

       if (suma>=o and suma<4){
           return "estas al principio de la escala, completamente cuerdo pero MUY ABURRIDO";
       }else if (suma>=4 and suma<9){
           return "estas en la parte media de la escala, vas en CAMINO HACIA LA LOCURA, BIEN!!!";
       }else if (suma=9 or suma=10){
           return "enhorabuena ERES DIOS, eres el nuevo NORMAN BATES!!!";
           }

 }


private int calcula1(
    String opcion1,
    String opcion2,
    String opcion3
) {
    int suma1 = 0;

           if (opcion1.equals(respuesta1)){
              return suma1 = 0;
           }else if (opcion2.equals(respuesta2)){
              return suma1 = 1;
           }else if (opcion3.equals(respuesta3)){
             return suma1 = 2;
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