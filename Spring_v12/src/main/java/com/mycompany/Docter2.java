package com.mycompany;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Docter2 {
	@Value("#{d1}")
List<String>name;

public List<String> getName() {
	return name;
}

public void setName(List<String> name) {
	this.name = name;
}
}
