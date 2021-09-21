package assignment

/* Define a string variable containing the sentence, "Hello, World. How are you?". Split the sentence into
an array using the split method. Count the number of words. Do the same using
the tokenize method.
*/


String str="Hello, World. How are you?"
def L1=str.split()   //Using Split method
println L1
println L1.length

def TK=str.tokenize()  //Using Tokenize method
println TK
println TK.size()