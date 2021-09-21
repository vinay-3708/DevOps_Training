package assignment

/*Create a list of numbers. Add them together. First double each number, then add them up. Compute
their average
*/

List lis=[1,25,89,46,79,100,120,146]
def total=lis.sum()
def length_=lis.size()
println "Total-1: $total"
def Average = total/length_
println "Average: $Average"
List lis_2=[]
for (x in lis) {
	x=x*2
	lis_2.add(x)
}
println lis_2
def total2=lis_2.sum()
def length2_=lis_2.size()
println "Total-2: $total2"
def Average2 = total2/length2_
println "Average-2: $Average2"