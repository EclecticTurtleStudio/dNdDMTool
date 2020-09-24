package org.launchcode.dNdDMTool.controllers;

import org.launchcode.dNdDMTool.models.WorldDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorldGeneratorController {

    @RequestMapping("world-randomizer")
    public String index(Model model) {

        model.addAttribute("title", "World Randomizer");

        return "world-randomizer";
    }

}
