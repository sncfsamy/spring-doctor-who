package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    @GetMapping("/doctor/0")
    @ResponseBody
    public String doctor0() {
        return "Jo Martin";
    }

    @GetMapping("/doctor/1")
    @ResponseBody
    public String doctor1() {
        return "William Hartnell";
    }
    
    @GetMapping("/doctor/2")
    @ResponseBody
    public String doctor2() {
        return "Patrick Troughton";
    }
    
    @GetMapping("/doctor/3")
    @ResponseBody
    public String doctor3() {
        return "Jon Pertwee";
    }

    
    @GetMapping("/doctor/4")
    @ResponseBody
    public String doctor4() {
        return "Tom Baker";
    }

    
    @GetMapping("/doctor/5")
    @ResponseBody
    public String doctor5() {
        return "Peter Davison";
    }

    
    @GetMapping("/doctor/6")
    @ResponseBody
    public String doctor6() {
        return "Colin Baker";
    }
    
    @GetMapping("/doctor/7")
    @ResponseBody
    public String doctor7() {
        return "Sylvester McCoy";
    }
    
    @GetMapping("/doctor/8")
    @ResponseBody
    public String doctor8() {
        return "Paul McGann";
    }
    
    @GetMapping("/doctor/war")
    @ResponseBody
    public String doctorWar() {
        return "John Hurt";
    }
    
    @GetMapping("/doctor/9")
    @ResponseBody
    public String doctor9() {
        return "Christopher Eccleston";
    }
    
    @GetMapping("/doctor/10")
    @ResponseBody
    public String doctor10() {
        return "David Tennant";
    }
    
    @GetMapping("/doctor/11")
    @ResponseBody
    public String doctor11() {
        return "Matt Smith";
    }

    @GetMapping("/doctor/12")
    @ResponseBody
    public String doctor12() {
        return "Peter Capaldi";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String doctor13() {
        return "Jodie Whittaker";
    }
}
