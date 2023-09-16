package com.portafolio.personal;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {

    private ArrayList<Skill> listSkill = new ArrayList();
    private String name = "Juan Esteban";

    public void appendListSkill() {
        // Crear instancias de Skill y agregarlas a la lista
        listSkill.add(new Skill(1, "Diseño Web Profesional","Intermedio", "HTML, CSS, JS, SASS, TypeScript, MySQL, PHP, SQL Server", "2 Años"));
        listSkill.add(new Skill(2, "SQL Server","Intermedio", "SQL, SQL Integration Services (SSIS), Power BI", "2 Años"));
        listSkill.add(new Skill(3, "ETL's con Python","Básico", "Python", "4 Meses"));
        listSkill.add(new Skill(4, "Frameworks y Librerías","Básico", "Angular, React, Node.js", "1 Año"));
        listSkill.add(new Skill(5, "Java","Básico", "Java Spring", "2 Meses"));
        listSkill.add(new Skill(6, "Control de Versiones","Intermedio", "Git, GitHub", "2 Años"));
        listSkill.add(new Skill(7, "Diseño y Prototipado","Básico", "Figma", "1 Año"));
    }


    @GetMapping("/")
    public String about(Model model){
        appendListSkill();
        model.addAttribute("concatname","Portafolio " +name);
        model.addAttribute("listSkill", listSkill);
        return "about";
    }

    @GetMapping("/projects")
    public String projects(Model model){
        model.addAttribute("concatname","Portafolio " +name);
        return "projects";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("concatname","Portafolio " +name);
        return "contact";
    }

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("concatname","Portafolio " +name);
        return "home";
    }

}
