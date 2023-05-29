package in.ineuron.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.order.Order;
import in.ineuron.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	List<Order> findByUser(User user);
}
