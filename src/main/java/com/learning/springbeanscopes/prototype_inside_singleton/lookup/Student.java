package com.learning.springbeanscopes.prototype_inside_singleton.lookup;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Getter
@Component(value = "studentLookup")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Slf4j
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Student {
    private String name;

}
