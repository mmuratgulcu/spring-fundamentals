package com.muratgulcu.springfundamentals.qualiferAndPrimary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Qualifier("numeric")
public class NumericFormatter implements Formatter{
}
