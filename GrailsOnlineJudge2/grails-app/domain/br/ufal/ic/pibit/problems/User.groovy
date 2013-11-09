package br.ufal.ic.pibit.problems

class User {

	String name
	String email
	Date creationDate
	
    static constraints = {
		name blank: false, size: 4..50
		email blank: false, email: true
		creationDate blank: false
    }
}
