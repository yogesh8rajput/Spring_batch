package com.mycompany;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	List<String> skills;//list
	Set<Integer> mobile;//set
	Map<String,String> project;//map
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Set<Integer> getMobile() {
		return mobile;
	}
	public void setMobile(Set<Integer> mobile) {
		this.mobile = mobile;
	}
	public Map<String, String> getProject() {
		return project;
	}
	public void setProject(Map<String, String> project) {
		this.project = project;
	}

}
