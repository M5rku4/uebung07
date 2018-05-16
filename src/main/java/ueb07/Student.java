package ueb07;

import java.util.Comparator;

class Student{
	private int matrikel;
	private String name;

	Student(int m, String n) {
		setMatrikel(m);
		setName(n);
	}

	public static Comparator<Student> sortNameAndMat= (s1, s2) ->
	{
		if(s1.getName().compareTo(s2.getName()) > 0){
			return 1;
		} else if(s1.getName().compareTo(s2.getName()) < 0){
			return -1;
		} else {
			return Integer.compare(s1.getMatrikel(), s2.getMatrikel());
		}
	};

	public String getName() {
		return name;
	}

	public void setName(String n) {
		if (n == null)
			throw new IllegalArgumentException();
		name = n;
	}

	public int getMatrikel() {
		return matrikel;
	}

	public void setMatrikel(int m) {
		if (m <= 0)
			throw new IllegalArgumentException();
		matrikel = m;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof Student))
			return false;

		Student s = (Student) o;

		return this.matrikel == s.matrikel && this.name.equals(s.name);
	}

	@Override
	public String toString() {
		return name + " (" + matrikel + ") [" + this.hashCode() + "]";
	}
}
