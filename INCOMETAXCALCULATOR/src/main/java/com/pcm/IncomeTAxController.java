package com.pcm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IncomeTAxController
{
	@GetMapping("/student-marks-card-json")
	@ResponseBody
	public IncomeTAX displayMarks(@RequestParam(name="salary", required=false, defaultValue="0") float salary, @RequestParam(name="allownace", required=false, defaultValue="0") float allowance, @RequestParam(name="bonuss", required=false, defaultValue="0") float bonus)
	{


		IncomeTAX marks = new IncomeTAX();

		ModelAndView mav = new ModelAndView();
		mav.addObject("marks", marks);
		mav.setViewName("marksinput.html");
		return marks;
	}

	@GetMapping("/marks-output-html")
	public ModelAndView htmlProcess(Model model, @RequestParam(required=false) float salary, @RequestParam(required=false) float allowance, @RequestParam(required=false) float bonus)
	{
		double t=0;
		IncomeTAX marks = new IncomeTAX();


		marks.setSalary(salary);
		marks.setAllowance(allowance);
		marks.setBonus(bonus);


		marks.setTotal(marks.getSalary() + marks.getAllowance() + marks.getBonus());

		marks.setAverage(marks.getTotal() /1);

		if(marks.getAverage()<=200000)
		{
			marks.setTax(0.00);
		}
		else if(marks.getAverage()<=300000)
		{
			marks.setTax(0.1*(marks.getAverage()-200000));
		}
		else if(marks.getAverage()<=500000)
		{
			marks.setTax(0.2*(marks.getAverage()-300000)+(0.1*100000));
		}
		else if(marks.getAverage()<=1000000)
		{
			marks.setTax(0.3*(marks.getAverage()-500000)+(0.2*200000)+(0.1*100000));

		}
		else{

			marks.setTax(0.4*(marks.getAverage()-1000000)+(0.3*500000)+(0.2*200000)+(0.1*100000));

		}


		marks.getSalary();
		marks.getAllowance();
		marks.getBonus();
		marks.getTotal();
		marks.getTax();


		ModelAndView mav = new ModelAndView();
		mav.addObject("marks", marks);
		mav.setViewName("mymarks.html");
		return marks;
	}

	@GetMapping("/student-marks-card-html")
	public ModelAndView htmlView (Model model, @RequestParam(required=false, defaultValue="0") float physics, @RequestParam(required=false, defaultValue="0") float chemistry, @RequestParam(required=false, defaultValue="0") float maths)
	{
		IncomeTAX marks = new IncomeTAX();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("marks", marks);
		mav.setViewName("marksinput.html");
		return mav;
	}
	
	@GetMapping("/marks-output-html")
	public ModelAndView htmlProcess(Model model, @RequestParam(required=false) float salary, @RequestParam(required=false) float allowance, @RequestParam(required=false) float bonus)
	{
		double t=0;
		IncomeTAX marks = new IncomeTAX();
		
		
		marks.setSalary(salary);
		marks.setAllowance(allowance);
		marks.setBonus(bonus);

		
		marks.setTotal(marks.getSalary() + marks.getAllowance() + marks.getBonus());
		
		marks.setAverage(marks.getTotal() /1);

		if(marks.getAverage()<=200000)
		{
			marks.setTax(0.00);
		}
		else if(marks.getAverage()<=300000)
		{
			marks.setTax(0.1*(marks.getAverage()-200000));
		}
		else if(marks.getAverage()<=500000)
		{
			marks.setTax(0.2*(marks.getAverage()-300000)+(0.1*100000));
		}
		else if(marks.getAverage()<=1000000)
		{
			marks.setTax(0.3*(marks.getAverage()-500000)+(0.2*200000)+(0.1*100000));

		}
		else{

			marks.setTax(0.4*(marks.getAverage()-1000000)+(0.3*500000)+(0.2*200000)+(0.1*100000));

		}


		marks.getSalary();
		marks.getAllowance();
		marks.getBonus();
		marks.getTotal();
		marks.getTax();
		
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("marks", marks);
		mav.setViewName("mymarks.html");
		
		return mav;
	}
	
}


