package com.muratgulcu.springfundamentals.qualiferAndPrimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    @CustomQualifier("numericFormatter")
    private Formatter formatter;
}
