package fr.dauphine.mido.as.jsftest.beans;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-23T15:48:14.561+0100")
@StaticMetamodel(Compte.class)
public class Compte_ {
	public static volatile SingularAttribute<Compte, String> nocompte;
	public static volatile SingularAttribute<Compte, String> nom;
	public static volatile SingularAttribute<Compte, String> prenom;
	public static volatile SingularAttribute<Compte, BigDecimal> solde;
}
