package com.Bags Hub.dao;

import com.Bags Hub.dao.OrderDao;
import com.Bags Hub.model.UserOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Transactional
public class OrderDaoImpl implements OrderDao{

        @Autowired
        private SessionFactory sessionFactory;

        public void addOrder(UserOrder userOrder) {
            Session session = sessionFactory.getCurrentSession();
            Transaction tx=session.beginTransaction();
            session.saveOrUpdate(userOrder);
            tx.commit();
            
        }
}
