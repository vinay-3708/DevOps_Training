package assignment

/* Using the "Hello, World. How are you?" sentence, 
 * use array notation (square brackets) to print the substring "World".
 */

String str="Hello, World. How are you?"
def L1=str.split()   //Using Split method
println L1[1]

println str.substring(7,12)