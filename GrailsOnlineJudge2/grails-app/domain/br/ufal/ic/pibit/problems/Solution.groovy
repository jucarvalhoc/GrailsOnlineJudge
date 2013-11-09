package br.ufal.ic.pibit.problems

class Solution {

	User author
	Date creationDate
	String body
	
    static constraints = {
		author blank: false
		creationDate blank: false
		body blank: false, maxSixe: 1000
    }
}
