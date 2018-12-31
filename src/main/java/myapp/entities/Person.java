package myapp.entities;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pesron [name=" + name + "]";
	}
	

	
}
