package com.icia.ex1.controlloer;

import com.icia.ex1.dto.StudentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {
   @GetMapping("/")
    public String index() {
       return "index";
   }

   @GetMapping("/hello1")
    public String hello1() {
       return "hello1";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "hello2";
    }

    @GetMapping("/hello-param1")
    public String param1(HttpServletRequest request) {
       String age = request.getParameter("age");
       String name = request.getParameter(("name"));
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        return "index";
    }

//    @GetMapping("/hello-param1")
//    public String helloparam1(HttpServletRequest request,
//                              @RequestParam("name") String name, @RequestParam("age") int age) {
//        System.out.println("name = " + name + ", age = " + age);
//        int age1 = Integer.parseInt(request.getParameter("age"));
//        return "index";

    @GetMapping("/form-param1")
    public String parameter1 (HttpServletRequest request) {
       String v1 = request.getParameter("p1");
       String v2 = request.getParameter("p2");
        System.out.println("p1 = " + v1);
        System.out.println("p2 = " + v2);
        return "index";
    }
    @RequestMapping(value = "/form-param2", method = RequestMethod.POST)
    public String parameter2 (@RequestParam String p3, @RequestParam String p4) {
//       변수이름과 파라미터 변수이름을 같게하면 생략가능하다.
        System.out.println("p3 = " + p3 + ", p4 = " + p4);
        return "index";
    }

    @GetMapping("/hello3")
    public String hello3(Model model) {
        String s1 = "안녕하세요";
        model.addAttribute("m1",s1);
        return "hello3";
    }

    @GetMapping("/hello4")
    public String hello4(Model model) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("학생1");
        studentDTO.setStudentNumber("12345678");
        model.addAttribute("student", studentDTO);
        return "hello4";
    }

        // hello5 요청을 처리하는 메소드
        // 실행내용 : StudentDTO 객체를 담는 ArrayList를 선언하고 학생 2명의 정보를 리스트에 저장후
        // 리스트를 모델에 담자

    @GetMapping("/hello5")
    public String hello5(Model model) {
//        StudentDTO s1 = new StudentDTO();
//        StudentDTO s2 = new StudentDTO();
        List<StudentDTO> list = new ArrayList<>();
//        s1.setId(2L);
//        s1.setStudentName("학생2");
//        s1.setStudentNumber("00000000");
//        list.add(s1);
//            s2.setId(3L);
//            s2.setStudentName("학생3");
//            s2.setStudentNumber("11111111");
//            list.add(s2);
//            model.addAttribute("studentList",list);
        for(int i=0; i<=10; i++) {
        list.add(newStudent(i));
        }
        model.addAttribute("studentList",list);
            return "hello5";
        }

        private StudentDTO newStudent(int i) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId((long) i);
        studentDTO.setStudentName("학생"+i);
        studentDTO.setStudentNumber("11111110"+i);
        return studentDTO;

        }

    }



//@GetMapping @PostMapping @PutMapping @DeleteMapping

