package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping(value = "/")
    @ResponseBody
    public String displayHomePage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/forms")
    @ResponseBody
    public String displayForms() {
        return "<html>" +
                "<body>" +
                    "<form method='post'>" +
                        "Name:<br>" +
                        "<input type = 'text' name = 'name' />" +
                        "<br>My favorite language:<br>" +
                        "<select name = 'firstChoice'>" +
                            "<option value = 'Java'>Java</option>" +
                            "<option value = 'Javascript'>JavaScript</option>" +
                            "<option value = 'Python'>Python</option>" +
                        "</select>" +
                        "<br>My second favorite language:<br>" +
                        "<select name = 'secondChoice'>" +
                            "<option value = 'Java'>Java</option>" +
                            "<option value = 'Javascript'>JavaScript</option>" +
                            "<option value = 'Python'>Python</option>" +
                        "</select>" +
                        "<br>My third favorite language:<br>" +
                        "<select name = 'thirdChoice'>" +
                            "<option value = 'Java'>Java</option>" +
                            "<option value = 'Javascript'>JavaScript</option>" +
                            "<option value = 'Python'>Python</option>" +
                        "/select><br>" +
                        "<input type = 'submit' value = 'Submit' />" +
                    "</form>" +
                "</body>" +
                "</html>";
    }

//    @PostMapping(value = "/forms")
//    @ResponseBody
//    public String formPage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
//        return "<html>" +
//                "<body>" +
//                    "<h1>" + name + "</h1>" +
//                        "<ol>" +
//                            "<li>" + firstChoice + "</li>" +
//                            "<li>" + secondChoice + "</li>" +
//                            "<li>" + thirdChoice + "</li>" +
//                        "</ol>" +
//                "</body>" +
//                "</html>";
//    }

    @PostMapping(value = "/forms")
    @ResponseBody
    public String tablePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<table border = '1'>" +
                    "<tr> " +
                        "<th>Choice</th>" +
                        "<th>Language</th>" +
                    "</tr>" +
                    "<tr>" +
                        "<td>First Choice</td>" +
                        "<td>" + firstChoice + "</td>" +
                    "</tr>" +
                    "<tr>" +
                        "<td>Second Choice</td>" +
                        "<td>" + secondChoice + "</td>" +
                    "</tr>" +
                    "<tr>" +
                        "<td>Third Choice</td>" +
                        "<td>" + thirdChoice + "</td>" +
                    "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }




}
