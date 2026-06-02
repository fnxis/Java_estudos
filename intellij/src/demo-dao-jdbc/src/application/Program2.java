package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

import java.sql.SQLException;

public class Program2 {
    static void main(String[] args){

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

    }
}
