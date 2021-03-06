package com.nextgen.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nextgen.model.Customers;
import com.nextgen.utl.HibernaCustomerteUtil;

public class CustomerDao {

	/**
	 * Save User
	 * 
	 * @param user
	 */
	public void saveUser(Customers customer) {
		Transaction transaction = null;
		try (Session session = HibernaCustomerteUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(customer);
			// commit transaction
			transaction.commit();
			;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			 throw new RuntimeException(e);
		}
	}

	/**
	 * Update User
	 * 
	 * @param user
	 */
	public void updateUser(Customers customer) {
		Transaction transaction = null;
		try (Session session = HibernaCustomerteUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.update(customer);
			// commit transaction
			transaction.commit();
			
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			 throw new RuntimeException(e);
		}
	}

	/**
	 * Delete User
	 * 
	 * @param id
	 */
	public void deleteUser(int id) {

		Transaction transaction = null;
		try (Session session = HibernaCustomerteUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a user object
			Customers customer = session.get(Customers.class, id);
			if (customer != null) {
				session.delete(customer);
				System.out.println("user is deleted");
			}

			// commit transaction
			transaction.commit();
		
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			 throw new RuntimeException(e);
		}
	}

	/**
	 * Get User By ID
	 * 
	 * @param id
	 * @return
	 */
	
	//session.beginTransaction();
	//session.getTransaction().commit();
	
	public Customers getUser(int id) {

		Transaction transaction = null;
		Customers customer = null;
		try (Session session = HibernaCustomerteUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			customer = session.get(Customers.class, id);
			// commit transaction
			transaction.commit();
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			 throw new RuntimeException(e);
		}
		return customer;
		
	}

	/**
	 * Get all Users
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Customers> getAllUser() {

		Transaction transaction = null;
		List<Customers> listOfUser = null;
		try (Session session = HibernaCustomerteUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object

			listOfUser = session.createQuery("FROM customers").getResultList();

			// commit transaction
			transaction.commit();
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfUser;
		
	}

	public boolean validate(String userName, String password) {

		Transaction transaction = null;
		Customers customer = null;
		try (Session session = HibernaCustomerteUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			customer = (Customers) session.createQuery("FROM customers U WHERE U.username = :userName")
					.setParameter("userName", userName).uniqueResult();

			if (customer != null && customer.getPassword().equals(password)) {
				return true;
			}
			// commit transaction
			transaction.commit();
			session.close();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			 throw new RuntimeException(e);
		}
		return false;
	}
}
