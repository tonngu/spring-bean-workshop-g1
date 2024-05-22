package se.lexicon.g1.service;

import se.lexicon.g1.data_access.StudentDao;
import se.lexicon.g1.models.Student;

import java.util.List;
import java.util.Scanner;

public class StudentManagementConsoleImpl implements StudentManagement{

    private StudentDao studentDao;
    private UserInputService scannerService;

    public StudentManagementConsoleImpl(StudentDao studentDao, UserInputService scannerService) {
        this.studentDao = studentDao;
        this.scannerService = scannerService;
    }

    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public Student remove(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
