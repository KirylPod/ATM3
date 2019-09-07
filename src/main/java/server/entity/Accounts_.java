package server.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Accounts.class)
public abstract class Accounts_ {

	public static volatile SingularAttribute<Accounts, String> accountId;
	public static volatile SingularAttribute<Accounts, String> accountPin;
	public static volatile SingularAttribute<Accounts, Integer> accountCash;
	public static volatile SingularAttribute<Accounts, Integer> id;

	public static final String ACCOUNT_ID = "accountId";
	public static final String ACCOUNT_PIN = "accountPin";
	public static final String ACCOUNT_CASH = "accountCash";
	public static final String ID = "id";

}

