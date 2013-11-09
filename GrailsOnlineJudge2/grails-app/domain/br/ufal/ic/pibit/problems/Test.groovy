package br.ufal.ic.pibit.problems

class Test {
	
	String input
	String output
	String explanation
	Date creationDate

    static constraints = {
		input  blank: false
		output blank: false
		explanation blank: false, maxSize: 1000
		creationDate blank: false
    }
}
