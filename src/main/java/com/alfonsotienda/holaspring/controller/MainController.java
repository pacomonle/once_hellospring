
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
    public ModelAndView testlocuraHTML() {
        ModelAndView modelAndView = new ModelAndView("test"); 
        modelAndView.addObject("mensaje", "");
        return modelAndView;
    
    }

    @PostMapping("/test") 
    @ResponseBody

    public ModelAndView testloculraHTMLPost(@RequestParam("respuesta1") String respuesta1, @RequestParam("respuesta2") String respuesta2,
            @RequestParam("respuesta3") String respuesta3, @RequestParam("respuesta4") String respuesta4,
            @RequestParam("respuesta5") String respuesta5) {
      
      ModelAndView modelAndView = new ModelAndView("test");

      String resultado = calcula1(respuesta1, respuesta2, respuesta3,
                                respuesta4, respuesta5);

      modelAndView.addObject("mensaje", resultado);
                 
       return modelAndView;

    }
    
    
private String calcula1(
    String respuesta1, respuesta2, respuesta3, respuesta4, respuesta5;
    ) {
    int suma1, suma2, suma3, suma4, suma5 = 0;
// pregunta 1
           if (respuesta1.equals("0")){
             suma1 = 0;
           }else if (respuesta1.equals("1")){
              suma1 = 1;
           }else if (respuesta1.equals("2")){
             suma1 = 2;
           }

  // pregunta 2         
           if (respuesta2.equals("0")){
            suma2 = 0;
          }else if (respuesta2.equals("1")){
             suma2 = 1;
          }else if (respuesta2.equals("2")){
            suma2 = 2;
          } 
  // pregunta 3        
         if (respuesta3.equals("0")){
           suma3 = 0;
         }else if (respuesta3.equals("1")){
           suma3 = 1;
         }else if (respuesta3.equals("2")){
           suma3 = 2;
         } 
  // pregunta 4       
         if (respuesta4.equals("0")){
            suma4 = 0;
         }else if (respuesta4.equals("1")){
            suma4 = 1;
         }else if (respuesta4.equals("2")){
            suma4 = 2;
         } 
   // pregunta 5       
         if (respuesta5.equals("0")){
            suma5 = 0;
         }else if (respuesta5.equals("1")){
            suma5 = 1;
         }else if (respuesta5.equals("2")){
            suma5 = 2;
         } 

 // calculo de la suma de puntos obtenidos en el test        

         int suma;
         suma = suma1 + suma2 + suma3 + suma4 + suma5;
         
         System.out.println("RESULTADOS TEST 2.0 ULTIMA GENRACION - SUPER FIVE QUESTIONS?");

         System.out.println();

         System.out.println("\nHas obtenido " + suma + " puntos.");
         
         System.out.println();
     
 // cerramos la funcion con el return de los resulatdos obtenidos segun nuestra clasificacion
         if (suma>=o and suma<4){
            return "estas al principio de la escala, completamente cuerdo pero MUY ABURRIDO";
        }else if (suma>=4 and suma<9){
            return "estas en la parte media de la escala, vas en CAMINO HACIA LA LOCURA, BIEN!!!";
        }else if (suma=9 or suma=10){
            return "enhorabuena ERES DIOS, eres el nuevo NORMAN BATES!!!";
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