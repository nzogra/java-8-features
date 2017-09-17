/**
 * 
 */
package ca.zografakis.lambda.explore.person.lambda;

import ca.zografakis.lambda.explore.person.oprations.PersonOps;

/**
 * @author nomik
 *
 */
public class PersonLambda {
	
	public static PersonOps nameOps = (person) -> person.getFirstName() + " " + person.getLastName();
	
	public static PersonOps ageOps = (person) -> person.getFirstName() + " " + person.getLastName() + " is " + person.getAge() + " years old";

}
