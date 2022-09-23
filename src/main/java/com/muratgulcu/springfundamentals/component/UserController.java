package com.muratgulcu.springfundamentals.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller(value = "bean3")
//@ResponseBody
@RestController(value = "restTestBean")
@Primary
public class UserController {


}
