//package com.lewisCode.EmployeeApi.dao;
//
//import com.lewisCode.EmployeeApi.entity.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.Query;
//import java.util.List;
//
//@Repository
//public class EmployeeDAOJpaImpl implements EmployeeDAO {
//
//    private EntityManager entityManager;
//
//    @Autowired
//    public EmployeeDAOJpaImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//    @Override
//    public List<Employee> findAll() {
//        Query theQuery = entityManager.createQuery("from Employee", Employee.class);
//        return (List<Employee>) theQuery.getResultList();
//
//    }
//
//    @Override
//    public Employee findById(Long id) {
//        return entityManager.find(Employee.class, id);
//    }
//
//    @Override
//    public void save(Employee employee) {
//        Employee theEmployee = entityManager.merge(employee);
//        theEmployee.setId(employee.getId());
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        Query theQuery = entityManager.createQuery("delete from Employee where id=:employeeId");
//        theQuery.setParameter("employeeId", id);
//        theQuery.executeUpdate();
//    }
//}
//Version 2 use EntityManager & standard JPA Api to do the job.
