package com.jsp.jst_ticket_booking_spring_boot.daoimpl;

import com.jsp.jst_ticket_booking_spring_boot.dao.CustomerDao;

import com.jsp.jst_ticket_booking_spring_boot.dto.Customer;
import com.jsp.jst_ticket_booking_spring_boot.repository.CustomerRepository;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomerDao(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findCustomerByEmailDao(String email) {
      return customerRepository.findByEmail(email);
    }
}
