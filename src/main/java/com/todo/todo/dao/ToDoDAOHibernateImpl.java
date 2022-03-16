package com.todo.todo.dao;

import com.todo.todo.entity.ToDo;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class ToDoDAOHibernateImpl implements ToDoDAO
{
    //define field for entitymanager
    private EntityManager entityManager;
    //setup constructor injection
    public ToDoDAOHibernateImpl (EntityManager theEntityManager){
        entityManager=theEntityManager;
    }
    public List<ToDo> findAll(){
        //get the current hibernate session
        Session currentSession=entityManager.unwrap(Session.class);

        //create a query using native Hibernate API
       Query<ToDo> theQuery=currentSession.createQuery("from ToDo",ToDo.class);

       //execute query and get result List
        List<ToDo> toDos=theQuery.getResultList();

        //return results
        return toDos;

    }
}
