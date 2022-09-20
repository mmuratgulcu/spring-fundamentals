package com.muratgulcu.springfundamentals.qualiferAndPrimary;

import org.springframework.stereotype.Component;

@Component
//@Primary
@CustomQualifier("numeric")
public class NumericFormatter implements Formatter{
}
