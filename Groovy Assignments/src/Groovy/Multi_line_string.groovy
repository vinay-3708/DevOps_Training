package assignment

/*  Make a multi-line string.
 *  Compute the number of vowels on each line 
*/
String str = /Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, 
quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. 
Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. 
Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
/
def Lineno=1
str.eachLine { line ->
	def count=0
	for(def i=0; i<line.size(); i++) {
		y=line[i].toLowerCase()
		if ((y=='a')||(y=='e')||(y=='i')||(y=='o')||(y=='u')) {
			count=count+1
		}
	} 
	println "Line $Lineno has $count vowels"
	Lineno=Lineno+1
}