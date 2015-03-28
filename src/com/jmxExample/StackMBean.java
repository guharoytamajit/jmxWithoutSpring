package com.jmxExample;

public interface StackMBean {
	int getSize();

	void empty();

	void pushItem(String item);

	String popItem();
}
