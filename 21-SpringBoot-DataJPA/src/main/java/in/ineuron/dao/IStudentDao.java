package in.ineuron.dao;

import org.springframework.data.repository.CrudRepository;

import in.ineuron.bo.Student;

public interface IStudentDao extends CrudRepository<Student, Integer> {

}
