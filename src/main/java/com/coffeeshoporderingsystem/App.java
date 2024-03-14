package com.coffeeshoporderingsystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = buildSessionFactory();

            // Create a new session
            Session session = sessionFactory.openSession();

            // Begin a transaction
            Transaction transaction = session.beginTransaction();

            // Perform database operations here
            // Example: Perform a simple query
            Object result = session.createQuery("from Admin").list();
            System.out.println(result);

            // Commit the transaction
            transaction.commit();

            // Close the session
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the SessionFactory when done
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    private static SessionFactory buildSessionFactory() {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            MetadataSources sources = new MetadataSources(registry);
            // Add your entity classes here
            // Example: sources.addAnnotatedClass(YourEntityName.class);

            Metadata metadata = sources.getMetadataBuilder().build();
            return metadata.getSessionFactoryBuilder().build();
        } catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy(registry);
            throw new ExceptionInInitializerError("Error initializing Hibernate SessionFactory: " + e);
        }
    }
}
