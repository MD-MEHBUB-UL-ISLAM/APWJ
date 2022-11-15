package com.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Employee {



    public boolean create(Employee employee throws SQLException {
        SessionFactory sessionFactory;
        Session session = sessionFactory.getCurrentSession();
        session.save(employee);
        return true;
    }
    public Employee get(Long id) throws SQLException {

        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }


     public boolean update(Employee employee) throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
        preparedStatement.setString(1, employee.getname());

        preparedStatement.setLong(3, employee.getId());
        return preparedStatement.execute();
    }

    public boolean delete(Long id) throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
        preparedStatement.setLong(1, id);
        return preparedStatement.execute();
    }

    private List<Employee> mapper(ResultSet resultSet) throws SQLException {
        List<Employee> students = new ArrayList<>();
        while(resultSet.next()) {
            Employee employee = new Employee();
            employee.setId(resultSet.getLong(1));
            employee.setname(resultSet.getString(2));

            employees.add(employee);
        }
        return employees;

}
}