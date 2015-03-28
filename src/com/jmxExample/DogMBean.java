package com.jmxExample;

public interface DogMBean {

	public abstract String getName();

	public abstract void name(String name);

	public abstract int age();

	public abstract void setAge(int age);

}