package edu.miu.cs.cs425.eregistrarapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/eregistrar")
public class SystemAdminController {
    @GetMapping(value = "sysadmin")
    public String displaySysAdminPage() {
        return "/secured/sysadmin/sysadmin";
    }

}
