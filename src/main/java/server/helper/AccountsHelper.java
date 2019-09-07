package server.helper;

import client.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import server.HibernateUtil;
import server.entity.Accounts;
import server.entity.Accounts_;

import javax.persistence.Query;
import javax.persistence.criteria.*;
import java.util.List;

public class AccountsHelper {
    private SessionFactory sessionFactory;

    String clientId = "0000-0000-0000-0001";

    public AccountsHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Accounts> getAccountsList(String clientId) {

        Session session = sessionFactory.openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(Accounts.class);

        Root<Accounts> root = cq.from(Accounts.class);

        Selection[] selections = {root.get(Accounts_.accountId), root.get(Accounts_.accountPin), root.get(Accounts_.accountCash)};

        ParameterExpression<String> nameParam = cb.parameter(String.class, "clientId");

       cq.select(cb.construct(Accounts.class, selections)).where(cb.like(root.get(Accounts_.accountId), nameParam));

        Query query = session.createQuery(cq);

        query.setParameter("clientId", clientId);

        List<Accounts> accountsList = query.getResultList();

        session.close();

        return accountsList;

    }

//    public Accounts getAccount(String clientId) {
//        Session session = sessionFactory.openSession();
//        CriteriaBuilder cb = session.getCriteriaBuilder();
//        CriteriaQuery cq = cb.createQuery(Accounts.class);
//
//        Root<Accounts> root = cq.from(Accounts.class);

//        Selection[] selections = {(root.get())}


//        cq.select(cb.construct(Accounts.class,
//                root.get(accounts.getAccountId()),
//                root.get(accounts.getAccountPin()),
//                root.get(String.valueOf(accounts.getAccountCash()))));

//
//        return null ;
//    }



    public Accounts getAccounts(String name){return null;}
}
