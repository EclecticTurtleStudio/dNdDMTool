package org.launchcode.dNdDMTool.controllers;

import org.launchcode.dNdDMTool.models.WorldDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("world-generator")
public class WorldGeneratorController {

    @RequestMapping("")
    public String index(Model model) {

        model.addAttribute("title", "World Generator");

        return "world-generator";
    }

    @RequestMapping("add")
    public String displayAddWorldName(Model model) {

        model.addAttribute("title", "Add World Name");

        return "world-generator/add";
    }

}
