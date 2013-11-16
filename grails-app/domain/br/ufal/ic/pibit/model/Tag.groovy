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
class Tag {

	/*
	 * 
	 */
	String value

	/*
	 * 
	 */
	static belongsTo = Problem
	
	/*
	 * 
	 */
	static hasMany   = [problem: Problem]

	/*
	 * 
	 */
	static constraints = {

		value (blank: false, unique: true)
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {

		return value;
	}
}
