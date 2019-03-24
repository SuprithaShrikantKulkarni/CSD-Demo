package com.tutorial.sample.numberexample;

public class NumberProgram {
	int n1=0;
	int n2=0;
	public NumberProgram(int n1, int n2) {		
		this.n1 = n1;
		this.n2 = n2;
	}
	public NumberProgram() {
		
	}
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int summation(){
		return n1+n2;
	}
	public int getGreaterNumber(){
		return (n1>n2)?n1:n2;
	}
	public static void main(String[] args){
		NumberProgram n = new NumberProgram(5, 5);
		System.out.println("Sum: "+n.summation());
		
	}
}
