package assignment

/*Create a list of strings. Sort them alphabetically. Sort them by length. Sort them by length in descending
order.
Advanced: Sort by length, then sort equal length strings alphabetically
*/

List L1=['vinay','kumar','Hassan','ikea','strings']
println L1.sort() // sorts by aplhabetically
List sort_length=L1.sort{it.size()} // sorts by size
println sort_length
println sort_length.reverse() // reverse sorting by size