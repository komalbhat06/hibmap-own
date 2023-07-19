package org.example.mappingshibernate;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Laptop.class);

        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();

        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        
        /*many to many done
     // Create two students
        Student student1 = new Student();
        student1.setName("John Doe");

        Student student2 = new Student();
        student2.setName("Jane Smith");

        // Create two laptops
        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Dell");

        Laptop laptop2 = new Laptop();
        laptop2.setBrand("HP");

        // Add laptops to the students
        student1.getLaptops().add(laptop1);
        student1.getLaptops().add(laptop2);

        student2.getLaptops().add(laptop1);
        student2.getLaptops().add(laptop2);

        // Save the students and laptops to the database
        session.save(student1);
        session.save(student2);
        session.save(laptop1);
        session.save(laptop2);

        // Commit the transaction
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();*/


/*one to many done
        // Create two new Laptops
        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Dell");
        laptop1.setStudent(student);

        Laptop laptop2 = new Laptop();
        laptop2.setBrand("HP");
        laptop2.setStudent(student);

        // Add the Laptops to the Student's laptops list
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        student.setLaptops(laptops);

        // Save the Student along with the associated Laptops
        session.save(student);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();*/
        
        
        
       
        /*one to one done
        // Create a new Student and Laptop
        Student student = new Student();
        student.setName("John Doe");

        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");

        // Associate the Student with the Laptop
        student.setLaptop(laptop); // Set the Laptop for the Student
        laptop.setStudent(student); // Set the Student for the Laptop

        // Save both entities to the database
        session.save(student);
        session.save(laptop);*/

        // Commit the transaction
       
    }
}

