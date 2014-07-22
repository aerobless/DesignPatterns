package ch.theowinter.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class AEmployee {
	String name;
	int telephonenr;
	
	public abstract int getEmployeeNumber();
	public abstract void print(String textDistance);

	protected AEmployee(String aName, int aTelephonenr) {
		super();
		name = aName;
		telephonenr = aTelephonenr;
	}

	public final String getName() {
		return name;
	}


	public final void setName(String aName) {
		name = aName;
	}

	public final int getTelephonenr() {
		return telephonenr;
	}

	public final void setTelephonenr(int aTelephonenr) {
		telephonenr = aTelephonenr;
	}
}

class AtomEmployee extends AEmployee{
	
	public AtomEmployee(String aName, int aTelephonenr){
		super(aName, aTelephonenr);
	}
	
	@Override
	public int getEmployeeNumber() {
		return 1;
	}
	
	@Override
	public void print(String textDistance){
		System.out.println(textDistance + getName()+"Tel.: "+ getTelephonenr());
	}
}

class SectionChief extends AEmployee{
	String section;
	List<AEmployee> employees = new ArrayList<AEmployee>();

	protected SectionChief(String aName, int aTelephonenr) {
		super(aName, aTelephonenr);
	}
	
	@Override
	public int getEmployeeNumber() {
		int sum = 1;
		for(AEmployee ae : employees){
			sum +=ae.getEmployeeNumber();
		}
		return sum;
	}

	public void add(AEmployee employee){
		employees.add(employee);
	}
	
	public void remove(AEmployee employee){
		employees.remove(employee);
	}
	
	public AEmployee getEmployee(int index){
		return employees.get(index);
	}
	
	public String getSection(){
		return section;
	}
	
	public void setSection(String section){
		this.section = section;
	}

	@Override
	public void print(String aTextDistance) {
		System.out.println(aTextDistance + "Section-Chief "+getName() + " ("+getSection()+"). Tel:"+getTelephonenr());
		for(AEmployee ae : employees){
			ae.print(aTextDistance+"        ");
		}
	}
}
