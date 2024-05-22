package se.lexicon.g1.service;

import org.springframework.stereotype.Component;
import se.lexicon.g1.data_access.StudentDao;
import se.lexicon.g1.models.Student;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Component
public class StudentManagementConsoleImpl implements StudentManagement {

    private StudentDao studentDao;
    private UserInputService scannerService;

    public StudentManagementConsoleImpl(StudentDao studentDao, UserInputService scannerService) {
        this.studentDao = studentDao;
        this.scannerService = scannerService;
    }

    @Override
    public Student create() {
        //0. Take inputs from scanner
        //1. Validate parameters
        //2. Set student object parameters
        //3. Save to storage
        System.out.println("Enter student name: ");
        String name = scannerService.getString();
        System.out.println("Enter student id: ");
        int id = scannerService.getInt();
        Student student = new Student();
        student.setName(name);
        student.setId(id);

        studentDao.save(student);

        return student;
    }

    @Override
    public Student save(Student student) {
        studentDao.save(student);
        return student;
    }

    @Override
    public Student find(int id) {
        Optional<Student> optionalStudent = Optional.ofNullable(studentDao.find(id));
        if (optionalStudent.isPresent()) {
            return optionalStudent.get();
        } else {
            System.out.println("Student with ID " + id + " not found.");
            return null;
        }
    }

    @Override
    public Student remove(int id) {
        Optional<Student> optionalStudent = Optional.ofNullable(studentDao.find(id));
        if (optionalStudent.isPresent()) {
            studentDao.delete(id);
            return optionalStudent.get();
        } else {
            System.out.println("Student with ID " + id + " not found.");
            return null;
        }
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        System.out.println("Edit student name (Y/N)?: ");
        if (scannerService.getString().equals("Y")) {
            System.out.println("Enter name: ");
            student.setName(scannerService.getString());
        }

        System.out.println("Edit student id (Y/N)?: ");
        if (scannerService.getString().equals("Y")) {
            System.out.println("Enter id: ");
            student.setId(scannerService.getInt());
        }
        return student;
    }
}
