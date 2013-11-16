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
class Test {

	/*
	 *
	 */
	String explanation

	/*
	 * TODO - Alterar para uma lista de Strings
	 */
	String inputs

	/*
	 * TODO - Alterar para uma lista de Strings
	 */
	String outputs

	/*
	 *
	 */
	Date dateCreated
	
	/*
	 * 
	 */
	static belongsTo = [problem : Problem]

	/*
	 * 
	 */
	static constraints = {

		inputs			(nullable: true, maxSize:100)
		
		outputs			(nullable: true, maxSize:100)
		
		explanation 	(blank: false, maxSize: 1000)
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	String toString() {
	
		return "Test " + id	
		
	}
}