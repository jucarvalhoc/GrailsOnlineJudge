package br.ufal.ic.pibit.problems

class Problem {
	
	String baseText
	String enunciation
	String tags
	Solution referenceSolutions
	User authors
	Date creationDate
	Test tests

    static constraints = {
		baseText blank: false, maxSize: 1000
		enunciation blank: false, maxSize: 1000
		tags blank: false
		referenceSolutions blank: false
		authors blank: false
		creationDate blank: false
		tests blank: false
    }
}
