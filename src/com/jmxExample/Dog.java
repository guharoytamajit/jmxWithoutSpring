package com.jmxExample;

public class Dog implements DogMBean {
	private String name1;
	int age1 = 9;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jmxExample.AnimalMBean#getName()
	 */
	@Override
	public String getName() {
		return name1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jmxExample.AnimalMBean#setName(java.lang.String)
	 */
	@Override
	public void name(String name) {
		this.name1 = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jmxExample.AnimalMBean#getAge()
	 */
	@Override
	public int age() {
		return age1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jmxExample.AnimalMBean#setAge(int)
	 */
	@Override
	public void setAge(int age) {
		this.age1 = age;
	}

}
