package fullstack.CRUDfullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fullstack.backend.DAO.LibrariesDAO;


@Controller
public class PageController {
    @Autowired
    private LibrariesDAO librariesDAO;
    @RequestMapping(value = {"/", "/home", "/index"})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("libraries", librariesDAO.getList());
        mv.addObject("greeting", "Welcome to the application!!");
        return mv;
    }
    @RequestMapping(value = {"/libraries"})
    public ModelAndView index1() {
        ModelAndView mv = new ModelAndView("libraries");
        mv.addObject("libraries", librariesDAO.getList());
        //mv.addObject("greeting", "Welcome to the application!!");
        return mv;
    }

}
