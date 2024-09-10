package com.jsp.jst_ticket_booking_spring_boot.customercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.jst_ticket_booking_spring_boot.dto.Customer;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;
import com.jsp.jst_ticket_booking_spring_boot.service.CustomerService;

//@Controller
//@ResponseBody
@RestController // it is the combination of above two annotations
@RequestMapping(value = "/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping(value = "/register")
	public ResponseStructure<Customer> saveCustomerService(@RequestBody Customer customer) {
		return customerService.saveCustomerService(customer);
	}

	@GetMapping(value = "/login/{email}/{password}")
	public ResponseStructure<Customer> loginCustomerWithEmailAndPasswordService(@PathVariable String email,
			@PathVariable String password) {
		return customerService.loginCustomerWithEmailAndPasswordService(email, password);
	}

}
