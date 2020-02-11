
package com.alfonsotienda.holaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.Scanner; // Importación de la clase Scanner.

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

    @GetMapping("/calculadora")
    @ResponseBody

    public String calculadora(@RequestParam("numero1") Double num1, @RequestParam(value ="numero2", required = false) Double num2,
            @RequestParam("operador") String operacion) {

        double res = 0;

        if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") || operacion.equals("X")
                || operacion.equals("/") || operacion.equals("*") || operacion.equals("^") || operacion.equals("raiz cuadrada") || operacion.equals("potencia")|| operacion.equals("raiz") ) {

        } else {
            return "que noooooooo";
        }

        switch (operacion) {
        case "+":
            res = num1 + num2;
            break;
        case "-":
            res = num1 - num2;
            break;
        case "x":
        case "X":
        case "*":
            res = num1 * num2;
            break;
        case "/":
            res = num1 / num2;
            break;
         case "^":
         case "potencia": 
            res = (int) Math.pow (num1, num2);     
            break;
          case "raiz":
          case "raiz cuadrada":
             res = Math.sqrt (num1);
            break;      
        }

        return "el resultado de " + num1 + " " + operacion + " " + num2 + " es " + res;
    }

}