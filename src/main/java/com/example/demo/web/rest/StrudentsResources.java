package com.example.demo.web.rest;

import com.example.demo.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StrudentsResources {
    @GetMapping("/student/all")
    public ResponseEntity getAll() {
        Student student = new Student(1, "Aziz", "Qurbonov", "3-kurs");
        Student student1 = new Student(1, "Jalol", "Aliyev", "3-kurs");
        Student student2 = new Student(1, "Bobur", "G'aniyev", "3-kurs");
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity getOne(@PathVariable int id) {
        Student student = new Student(id, "Aziz", "Qurbonov", "3-kurs");
        return ResponseEntity.ok(student);
    }

    @GetMapping("/student")
    public ResponseEntity getOne(@RequestParam int id,
                                 @RequestParam String  name,
                                 @RequestParam String  lastName,
                                 @RequestParam String  course ) {
        Student student = new Student(id, name, lastName, course);
        return ResponseEntity.ok(student);
    }
    @DeleteMapping("/students/{id}")
    public ResponseEntity delete(@PathVariable int id){
        return ResponseEntity.ok("Successfully deleted");
    }

    @PostMapping("/students")
    public ResponseEntity create (@RequestBody Student student){
        return ResponseEntity.ok("success");
    }

    @PutMapping("/students/{id}")
    public ResponseEntity update (@PathVariable int id, @RequestBody Student studentNew){
        Student student = new Student(id, "Aziz", "Qurbonov", "3-kurs");
        student.setId(id);
        student.setName(studentNew.getName());
        student.setLastName(studentNew.getName());
        return ResponseEntity.ok("good");
    }
}