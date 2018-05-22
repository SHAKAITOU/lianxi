package sha.work.controller.sansu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sha.framework.controller.ScreenBaseController;

/**
 * S002 Thymeleaf 
 * @author 000001A009A6A
 *
 */
@Controller
public class SansuController extends ScreenBaseController{

	@RequestMapping(path="/sansu1", method=RequestMethod.GET)
	public ModelAndView exapmle(@ModelAttribute Object greeting)  {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("lianxi/sansu1");
		return mav;
	}
	
	@RequestMapping(path="/sansu2", method=RequestMethod.GET)
	public ModelAndView exapmle2(@ModelAttribute Object greeting)  {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("lianxi/sansu2");
		return mav;
	}

}
