package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.Student;
import in.ineuron.dao.IStudentDao;
@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private IStudentDao repo;

	@Override
	public String regStudent(Student student) {
		Student saveStudent=null;
		if(student!=null)
			saveStudent=repo.save(student);
		return saveStudent!=null?"student registered successfully with id "+student.getSid():"student not registered";
	}

}
