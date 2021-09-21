package assignment


/*Using the Groovy JDK, access your home page and display the source code. Print the length of each line
of the home page.
*/
def web_data = "https://www.learningcontainer.com/wp-content/uploads/2020/04/sample-text-file.txt".toURL().getText()
println web_data
def Lineno = 1
web_data.eachLine { line -> 
	println "Line No. ${Lineno} size is : "+line.size()
	Lineno=Lineno+1
}