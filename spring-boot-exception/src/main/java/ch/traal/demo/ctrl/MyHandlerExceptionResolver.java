package ch.traal.demo.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
  
  /* methods */
  @Override
  public ModelAndView resolveException(
      HttpServletRequest httpServletRequest, 
      HttpServletResponse httpServletResponse,
      @Nullable Object o, 
      Exception exception
  ) {
    ModelAndView mv = new ModelAndView();
    if (exception instanceof ArithmeticException) {
      mv.setViewName("mathError");
    }
    if (exception instanceof NullPointerException) {
      mv.setViewName("nullPointerError");
    }
    mv.addObject("exception", exception.toString());
    return mv;
  }
}