package tpjava;

import tpjava.domain.Address;
import tpjava.domain.Contact;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-unit-1");

        EntityManager em = emf.createEntityManager();

        List<Contact> list = em.createQuery("from Contact ").getResultList();
        for (Contact c: list) {
            System.out.println(c);
        }
        List<Address> list2 = em.createQuery("from Address ").getResultList();
        for (Address a: list2) {
            System.out.println(a);
        }
        em.close();
        emf.close();
    }
}
