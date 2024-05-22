package se.lexicon.g1.data_access;

import org.springframework.stereotype.Component;
import se.lexicon.g1.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class StudentDaoListImpl implements StudentDao {
    private List<Student> studentList;

    @Override
    public Student save(Student student) {
        studentList.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        Optional<Student> optionalStudent = studentList.stream().
                filter(student -> student.getId() == id)
                .findFirst();

        return optionalStudent.orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentList);
    }

    @Override
    public void delete(int id) {
        studentList.removeIf(student -> student.getId() == id);
    }


}
