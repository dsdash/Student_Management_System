package com.StudentsSystemManagement.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.StudentsSystemManagement.entity.Student;
import com.StudentsSystemManagement.repositry.Studentrepository;
import com.StudentsSystemManagement.service.StudentService;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	private Studentrepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getById(int id) {
		return studentRepository.findById(id).orElse(null); // safer than .get()
	}

	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);
	}
}
