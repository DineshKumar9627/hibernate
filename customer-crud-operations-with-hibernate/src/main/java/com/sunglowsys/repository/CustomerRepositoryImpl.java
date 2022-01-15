package com.sunglowsys.repository;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Customer save(Customer customer) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long id = (Long) session.save(customer);
        session.getTransaction().commit();
        Customer result = session.get(Customer.class, id);
        return result;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(Long id) {
        Session session = sessionFactory.openSession();
        return session.get(Customer.class, id);
    }

    @Override
    public void delete(Long id) {

    }
}
