package se.lexicon.g1.data_access;

import org.springframework.stereotype.Component;
import se.lexicon.g1.models.Student;

import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao {
    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
