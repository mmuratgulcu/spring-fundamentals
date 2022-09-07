package com.muratgulcu.springfundamentals.qualiferAndPrimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    @Qualifier("numericFormatter")
    private Formatter formatter;
}
