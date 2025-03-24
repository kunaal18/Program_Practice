package com.te.practice.javaconceptoftheday;

import java.util.List;
import java.util.Objects;

public class Company {

	String name;
	List<Job> jobs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	@Override
	public int hashCode() {
		return Objects.hash(jobs, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Objects.equals(jobs, other.jobs) && Objects.equals(name, other.name);
	}

	public Company(String name, List<Job> jobs) {
		super();
		this.name = name;
		this.jobs = jobs;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", jobs=" + jobs + "]";
	}

}
