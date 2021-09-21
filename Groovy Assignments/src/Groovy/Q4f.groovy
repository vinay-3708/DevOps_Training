package assignment

/*Use array notation to print the last word, but reversed.
 * string = Hello, World. How are you?
 */
String str="Hello, World. How are you?"
def L1=str.split()   //Using Split method
println L1[4].substring(0,3).reverse()