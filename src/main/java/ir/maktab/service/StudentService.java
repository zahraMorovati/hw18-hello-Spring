package ir.maktab.service;

import ir.maktab.dao.StudentDao;

public class StudentService {

    StudentDao studentDao;

    public void saveNewStudent() {
        studentDao.save();
    }

    public void removeStudent() {
        studentDao.delete();
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
