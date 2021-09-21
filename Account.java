package com.runoob.text;
import java.util.Date;
public class Account {
	private String id,name;
	private double balance;
	private Date datetime;
	public String getId() {return id;}
	public void setId(String id) {this.id=id;}
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
	public double getBalance() {return balance;}
	public void setBalance(double balance) {this.balance=balance;}
	public Date getDatetime() {return datetime;}
	public void setDatetime(Date datetime) {this.datetime=datetime;}
	public Account(String id,String name,double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
		this.datetime=new Date();
	}
	public Account() {
		this.id="";
		this.name="";
		this.balance=0;
		this.datetime=new Date();
	}
	public void deposite(double money) {this.balance=this.balance+money;}
	public void withdraw(double money) {
		if(this.balance<money) {
			System.out.println("�������㣬����ȡǮ");
			return;
		}
		this.balance=this.balance-money;
	}
	public void changeMoney(Account other,double money) {
		if(this.balance<money) {
			System.out.println("�������㣬����ȡǮ");
			return;
		}
		this.balance=this.balance-money;
		other.balance=other.balance+money;
	}
	public void print() {
		System.out.println("�˺�:"+id" ����:"+name+" ���:"+balance);
	}
}
