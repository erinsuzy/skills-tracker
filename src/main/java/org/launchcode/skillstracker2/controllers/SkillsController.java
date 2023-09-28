package org.launchcode.skillstracker2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {


    @GetMapping
    public String languages () {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("/form")

    public String favoriteLanguageForm() {
        return "<form method= 'post' action ='/form'>" +
                "<label>Name: " +
                "<br>" +
                "<input type = 'text' name = 'name'>" +
                "</label>" +
                "<br>" +
                "<label>My Favorite Language: </label>" +
                "<br>" +
                "<select name = 'first' id= 'first'>" +
                "<option value = 'java'>Java</option>" +
                "<option value = 'javascript'>JavaScript</option>" +
                "<option value = 'python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label>My Second Favorite Language: </label>" +
                "<br>" +
                "<select name = 'second' id= 'second'>" +
                "<option value = 'java'>Java</option>" +
                "<option value = 'javascript'>JavaScript</option>" +
                "<option value = 'python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label>My Third Favorite Language: </label>" +
                "<br>" +
                "<select name = 'third' id='third'>" +
                "<option value = 'java'>Java</option>" +
                "<option value = 'javascript'>JavaScript</option>" +
                "<option value = 'python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<br>" +
                "<input type = 'submit' value = 'submit'/>" +

                "</form>";
    }

    @PostMapping("/form")
    public String userResponse(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return "<h1>" + name + "</h1><br>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>";

    }


}
