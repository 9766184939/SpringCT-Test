# SpringCT-Test
Interview test for SpringCT



- First create the testdb in mysql database.
- username and password I kept root/root for my mysql db
- And use the below endpoints to call the apis
Post method => localhost:8080/addStudent
Request payload =>
{
	"studentName":"Kailas Satale",
	"email":"kailas@gmail.com",
	"phone":"9766184931",
	"course": [{
		"name":"java",
		"professorName":"XYZ",
		"description":"this is the demo description"
	}]
}

Post method => localhost:8080/addCourse
Request payload =>
{
	"name":"java",
	"professorName":"XYZ",
	"description":"java professor"
}

Delete method => localhost:8080/deleteCourseById/<id which wants to delete>
