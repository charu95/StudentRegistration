package com.example.demo.student;

import com.example.demo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    /*private List<Student> students = new ArrayList<>(Arrays.asList(
                new Student
                        (
                                "1",
                                "Charu",
                                "charu95vinodi@gmail.com",
                                21,
                                LocalDate.of(2021, Month.JULY,19)
                        ),
                new Student
                        (
                                "2",
                                "Vinodi",
                                "Vinodi95vinodi@gmail.com",
                                22,
                                LocalDate.of(2021, Month.JULY,19)
                        ),
                new Student
                        (
                                "3",
                                "Vinodi",
                                "Vinodi95vinodi@gmail.com",
                                22,
                                LocalDate.of(2021, Month.JULY,19)
                        )
                      ));*/
    public List<Student> getAllStudents(){
        //return students;
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(String id){
      // return students.stream().filter(s -> s.getId().equals(id)).findFirst().get();
        return studentRepository.findById(Integer.parseInt(id));
    }

    public void addStudent(Student student) {
        //return students.add(student);
         studentRepository.save(student);
    }

    public void updateStudent(String id, Student student) {
       /* for (int i=0; i<students.size();i++){
            Student s= students.get(i);
            if(s.getId().equals(id)){
                students.set(i,student);
            }
            return ;
        }*/
        studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        //students.removeIf(s ->s.getId().equals(id));
        studentRepository.deleteById(Integer.parseInt(id));
    }
}
