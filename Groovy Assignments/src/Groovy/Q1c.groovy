package assignment

/*What do you get when you divide 5 by 2? 
 * What is the resulting data type? 
 * If you wanted to do integer
 * division (no remainder), what method would you call?
*/
def x=5/2
println x
println x.getClass().getName()
def y=5
def z=y.intdiv(2)
println z
println z.getClass().getName()