package com.pcm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentMarksController
{
	@GetMapping("/student-marks-card-json")
	@ResponseBody
	public StudentMarks displayMarks(@RequestParam(name="physics", required=false, defaultValue="0") float physics, @RequestParam(name="chemistry", required=false, defaultValue="0") float chemistry, @RequestParam(name="maths", required=false, defaultValue="0") float maths)
	{



		StudentMarks marks = new StudentMarks();

		marks.setPhysics(physics);
		marks.setChemistry(chemistry);
		marks.setMaths(maths);
		
        marks.setTotal(marks.getPhysics() + marks.getChemistry() + marks.getMaths());
		
		marks.setAverage(marks.getTotal() / 1);
		
		if(marks.getAverage()<=200000)
		{
			marks.setGrade(0.00);
		}
		else if(marks.getAverage()<=300000)
		{
			marks.setGrade(0.1*(marks.getAverage()-200000));
		}
		else if(marks.getAverage()<=500000)
		{
			marks.setGrade(0.2*(marks.getAverage()-300000)+(0.1*100000));
		}
		else if(marks.getAverage()<=1000000)
		{
			marks.setGrade(0.3*(marks.getAverage()-500000)+(0.2*200000)+(0.1*100000));

		}
		else{

			marks.setGrade(0.4*(marks.getAverage()-1000000)+(0.3*500000)+(0.2*200000)+(0.1*100000));

		}
		
		marks.getPhysics();
		marks.getChemistry();
		marks.getMaths();
		marks.getTotal();
		marks.getGrade();
		
		
		return marks;
	}
	
	@GetMapping("/student-marks-card-html")
	public ModelAndView htmlView (Model model, @RequestParam(required=false, defaultValue="0") float physics, @RequestParam(required=false, defaultValue="0") float chemistry, @RequestParam(required=false, defaultValue="0") float maths)
	{
		StudentMarks marks = new StudentMarks();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("marks", marks);
		mav.setViewName("marksinput.html");
		return mav;
	}
	
	@GetMapping("/marks-output-html")
	public ModelAndView htmlProcess(Model model, @RequestParam(required=false) float physics, @RequestParam(required=false) float chemistry, @RequestParam(required=false) float maths)
	{
		double t=0;
		StudentMarks marks = new StudentMarks();
		
		
		marks.setPhysics(physics);
		marks.setChemistry(chemistry);
		marks.setMaths(maths);

		
		marks.setTotal(marks.getPhysics() + marks.getChemistry() + marks.getMaths());
		
		marks.setAverage(marks.getTotal() /1);

		if(marks.getAverage()<=200000)
		{
			marks.setGrade(0.00);
		}
		else if(marks.getAverage()<=300000)
		{
			marks.setGrade(0.1*(marks.getAverage()-200000));
		}
		else if(marks.getAverage()<=500000)
		{
			marks.setGrade(0.2*(marks.getAverage()-300000)+(0.1*100000));
		}
		else if(marks.getAverage()<=1000000)
		{
			marks.setGrade(0.3*(marks.getAverage()-500000)+(0.2*200000)+(0.1*100000));

		}
		else{

			marks.setGrade(0.4*(marks.getAverage()-1000000)+(0.3*500000)+(0.2*200000)+(0.1*100000));

		}


		marks.getPhysics();
		marks.getChemistry();
		marks.getMaths();
		marks.getTotal();
		marks.getGrade();
		
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("marks", marks);
		mav.setViewName("mymarks.html");
		
		return mav;
	}
	
}


