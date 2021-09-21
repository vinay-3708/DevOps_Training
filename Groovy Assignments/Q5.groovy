package assignment

/*Write a method called isPrime that takes an integer argument and returns a boolean. Determine
whether the number is prime by dividing it by all numbers from 2 up to one less than the number.
That limit is too high, of course. How high do you have to check to be sure whether you've gone far
enough?
*/


def isPrime(num) {
	def factors=0
	for (def x=2; x<num; x++) {
		if ((num%x)==0) {
			factor=+1
			break
		}		
	}
	if (factors==0) {
		return true
	}else {
		return false
	}
}
