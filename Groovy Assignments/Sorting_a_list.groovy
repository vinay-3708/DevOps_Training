package assignment

/* Create a class called Course,
 * with a String attribute called name and an int attribute called days.
 * Create a list of four course instances,
 * where at least two have the same number of days.
 * Sort the list by number of days.
 * Then, sort the list by days, but when the days are equal, sort by name.
*/


class Course {
	String name
	int days
	def setString(String course_name) {
		name = course_name
	}
	def setCoursedays(int course_days) {
		days = course_days
	}
	def sortlist(def x) {
		x.sort(){it.value}
	}
	static void main(args) {
		Course a = new Course()
		 def y=['python':40,
			'java':24,
			'c':18]
		println Course.sortlist(y) 	
		}
}
