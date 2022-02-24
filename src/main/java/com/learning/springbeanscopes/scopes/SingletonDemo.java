package com.learning.springbeanscopes.scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "singletonDemo")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonDemo {

}
