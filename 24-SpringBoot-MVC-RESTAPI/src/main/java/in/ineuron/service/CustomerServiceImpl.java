package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.Customer;
import in.ineuron.dao.ICustomerRepo;
@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepo repo;

	@Override
	public String registerCustomer(Customer customer) {
		Integer cid = repo.save(customer).getCid();
		return "customer saved with the id :: " + cid;
	}


}
