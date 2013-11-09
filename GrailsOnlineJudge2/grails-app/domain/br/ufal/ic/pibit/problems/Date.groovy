package br.ufal.ic.pibit.problems

class Date {
	
	int day
	int month
	int year
	
    static constraints = {
		day blank: false, min: 1, max: 31
		month blank: false, min: 1, max: 12
		year blank: false, min: 1000, max: 9999
    }
}
