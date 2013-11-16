/**
 * TODO - Inserir javadoc
 *
 * TODO - Inserir comentários
 */
package br.ufal.ic.pibit.model

import static org.junit.Assert.*;

/**
 *
 * @author Juliana Cavalcanti
 *
 * @author Marlos Tacio Silva
 *
 * @version 1.0 - 12/11/2013
 *
 */
class Problem {

	/*
	 * 
	 */
	String name

	/*
	 * 
	 */
	String body

	/*
	 *
	 */
	Date dateCreated

	/*
	 * 
	 */
	String enunciation


	/*
	 *
	 */
	static belongsTo = [author: User]

	/*
	 * 
	 */
	static hasMany = [tags: Tag, solutions: Solution, tests: Test]

	/*
	 * 
	 */
	static constraints = {

		name 		(blank: false, size: 6..50, unique: true)
		
		body 		(blank: false, size: 6..1000)
		
		enunciation (blank: false, size: 6..1000)
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {

		return name;
	}
	
}