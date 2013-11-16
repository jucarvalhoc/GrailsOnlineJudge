/**
 * TODO - Inserir javadoc
 *
 * TODO - Inserir comentários
 */
package br.ufal.ic.pibit.model

/**
 *
 * @author Juliana Cavalcanti
 *
 * @author Marlos Tacio Silva
 *
 * @version 1.0 - 12/11/2013
 *
 */
class Solution {

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
	static belongsTo = [author: User, problem: Problem]

	/*
	 * 
	 */
	static constraints = {

		body (blank: false, maxSize: 1000)
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {

		return "Solution" + id
	}
}
