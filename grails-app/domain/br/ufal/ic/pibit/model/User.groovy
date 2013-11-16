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
class User {

	/*
	 * 
	 */
	String name

	/*
	 * 
	 */
	String email

	/*
	 *
	 */
	Date dateCreated
	
	/*
	 * 
	 */
	static hasMany = [solutionsCreated: Solution, problemsCreated: Problem]

	/*
	 * 
	 */
	static constraints = {

		name  (blank: false, size: 2..50)

		email (blank: false, email: true, unique: true)
	}

	/**
	 * {@inheritDoc}}
	 */
	@Override
	String toString() {

		return name
	}
}
