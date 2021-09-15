package com.example.dependencyinjection.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class PrototypeScopedBeen {
	
	public PrototypeScopedBeen() {
		System.out.println(".....prototype scoped been .......");
	}
}
