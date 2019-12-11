package com.zipcodeWilmington.Bean.Learner.Lab;

public class Classroom {

    private Instructors instructors;
    private Students students;


    public Classroom(Instructors instructors, Students students)    {
        this.instructors = instructors;
        this.students = students;
    }

//    public void hostLecture(Instructor instructor, double numOfHours) {
//        instructor.lecture(this.students, numOfHours);
//    }

    public void hostLecture(Teacher teacher, double numOfHours) {
        teacher.lecture(this.students, numOfHours);
    }



}
