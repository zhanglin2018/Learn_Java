package com.imooc;

public class Animal {

	public void run() {
		System.out.println("动物具有跑步的能力");
	}
	
	public void eat(){
		System.out.println("动物具有吃饭的能力");
	}
	
	public Animal(String str) {
		System.out.println("Animal 类执行了");
	}
	



	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + ", subName=" + subName + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((subName == null) ? 0 : subName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subName == null) {
			if (other.subName != null)
				return false;
		} else if (!subName.equals(other.subName))
			return false;
		return true;
	}






	public int age;
	public String name;
	public String subName;
}
