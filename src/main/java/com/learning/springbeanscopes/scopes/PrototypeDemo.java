package com.learning.springbeanscopes.scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "prototypeDemo")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeDemo {
}
