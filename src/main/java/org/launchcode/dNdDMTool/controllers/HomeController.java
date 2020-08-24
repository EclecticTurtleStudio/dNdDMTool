package org.launchcode.dNdDMTool.controllers;

import org.launchcode.dNdDMTool.models.WorldDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("")
    public String index(Model model) {
        WorldDetails details = new WorldDetails();

        model.addAttribute("title", "D&D DM Tool");
        model.addAttribute("name", details.getName());

        return "index";
    }
}
