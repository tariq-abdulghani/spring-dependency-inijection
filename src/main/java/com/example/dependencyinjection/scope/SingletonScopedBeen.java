package com.example.dependencyinjection.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class SingletonScopedBeen {
	
	public  SingletonScopedBeen() {
		System.out.println("................singleton been .............");
	}
}
