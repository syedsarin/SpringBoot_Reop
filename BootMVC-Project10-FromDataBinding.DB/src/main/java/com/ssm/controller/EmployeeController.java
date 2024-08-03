package com.ssm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ssm.entity.Employee;
import com.ssm.service.IserviceEmployee;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Controller
public class EmployeeController {

	@Autowired
	IserviceEmployee empService;
	
	@GetMapping("/")
	public String showHome() {
		 
		
		return "home";
	}
	
	@GetMapping("/register")
	public String registerEmp(@ModelAttribute("employee") Employee employee) {
		
		
		return "register";
	}
	
	@PostMapping("/register")
	public String Employee( RedirectAttributes attr, @ModelAttribute("employee") Employee employee ) {
		
		String insert = empService.insert(employee);
 		
		attr.addFlashAttribute("inserting", insert);
		
		return "redirect:/get";
	}
	
	@GetMapping("/get")
	public String view(Map<String,Object> map) {
		
		List<Employee> view = empService.view();
		map.put("Select", view);
		return "view";
	}
	

	/*   @GetMapping("/edit")
	public String findEmployee(@RequestParam("id") Integer id, Map<String,Object> map) {
	  Employee getEmp = empService.findById(id);
	    map.put("employee", getEmp);
	    return "find";	
	    }
	*/   	
		
	   @GetMapping("/edit")
	    public String findEmployee(@RequestParam("id") Integer id, @ModelAttribute("employee") Employee emp) {
	      Employee getEmp = empService.findById(id);
	       BeanUtils.copyProperties(getEmp, emp);
	        return "find";	
	        }
	 
    
    @PostMapping("/updat")
    public String update(RedirectAttributes attrs,@ModelAttribute("employee") Employee employee) {
    	Employee update = empService.update(employee);
    	attrs.addFlashAttribute("upd", update);
    	
    	return"redirect:/get";
    	
    }
    
    
    
    @GetMapping("/delete")
    public String deleteById(@RequestParam("id") Integer id, Map<String,Object> map) {
    	String removeById = empService.deleteById(id);
    	map.put("Deleted", removeById);
    	
    	return "forward:/get";
    }
    
    
    
}
