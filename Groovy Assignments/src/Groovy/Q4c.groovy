package assignment

/*Demonstrate that "racecar" is a palindrome by comparing it to its reverse. Do the same with "Bob",
  removing case sensitivity first.
*/

String x="racecar"
String y=x.reverse()
if (x==y) {
	println "$x is a Palindrome"
}else {
	println "$x is a Palindrome"
}

String z="Bob"
String a=z.toLowerCase()
if (a == a.reverse()) {
	println "$z is a Palindrome"
}else {
	println "$z is a Palindrome"
}
