/**
 * 
 */
package ca.zografakis.lambda.explore.person.exec;

import ca.zografakis.lambda.explore.person.Person;
import ca.zografakis.lambda.explore.person.lambda.PersonLambda;


/**
 * @author nomik
 *
 */
public class Exec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person person = new Person("Nomikos", "Zografakis", 25);
		
		System.out.println(PersonLambda.nameOps.personOperations(person));
		System.out.println(PersonLambda.ageOps.personOperations(person));
	}

}
