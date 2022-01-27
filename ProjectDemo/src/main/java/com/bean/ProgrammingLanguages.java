package com.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProgrammingLanguages {
	private List<String> name;
	private Set<String> function;
	private Map<String,String> mapRef;
	
	//getters and setters
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public Set<String> getFunction() {
		return function;
	}
	public void setFunction(Set<String> function) {
		this.function = function;
	}
	public Map<String, String> getMapRef() {
		return mapRef;
	}
	public void setMapRef(Map<String, String> mapRef) {
		this.mapRef = mapRef;
	}
	public ProgrammingLanguages(List<String> name, Set<String> function, Map<String, String> mapRef) {
		super();
		this.name = name;
		this.function = function;
		this.mapRef = mapRef;
	}
	public ProgrammingLanguages() {
		super();
	}
	@Override
	public String toString() {
		return "ProgrammingLanguages [name=" + name + ", function=" + function + ", mapRef=" + mapRef + "]";
	}
	

}
