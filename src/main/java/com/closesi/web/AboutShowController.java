/**
 * FileName: AboutShowController
 * Author:   closesi
 * Date:     2021/6/18 19:29
 * Description:
 */
package com.closesi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
