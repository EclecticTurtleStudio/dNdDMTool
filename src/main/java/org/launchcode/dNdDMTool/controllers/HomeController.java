package org.launchcode.dNdDMTool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("")
    public String index(Model model) {

        model.addAttribute("title", "D&D DM Tool");

        return "index";
    }
}
