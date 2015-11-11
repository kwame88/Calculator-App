package cc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CalculatorController
{
    
    //private double result;
    @RequestMapping("/Compute.do")
    public ModelAndView compute(Calculator calculator, @RequestParam ("operation") String ops) {
        double result=0;
        
        switch(ops){
        
        case "+":
            result= calculator.getAdd ();
            break;
        case "-":
            result= calculator.getSubtract ();
            break;
        case "/":
            result= calculator.getDivide ();
            break;
        case "*":
            result= calculator.getMultiply();
            break;
        }
        
//        ModelAndView mv = new ModelAndView ();
//        mv.setViewName ("DisplayResults.jsp");
//        mv.set
        
       return new ModelAndView ("DisplayResults.jsp", "mathops", result); 
    }
    
}
