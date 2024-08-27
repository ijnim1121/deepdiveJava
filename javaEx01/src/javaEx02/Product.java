package javaEx02;

import java.time.LocalDate;

public class Product {

	//프로덕트 필드 
	private int pNum; //상품번호를 숫자로 받으면 자릿수 맞추기 힘들 수 있음(Ex: 0으로 시작하는 경우)
	private String pName;
	private int pPrice;
	private String pCompany; //maker
	private LocalDate pDate;
	private int pRemain; //stock
	@Override
	public String toString() {
		return "Product [pNum=" + pNum + ", pName=" + pName + ", pPrice=" + pPrice + ", pCompany=" + pCompany
				+ ", pDate=" + pDate + ", pRemain=" + pRemain + "]";
	}
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public String getpCompany() {
		return pCompany;
	}
	public void setpCompany(String pCompany) {
		this.pCompany = pCompany;
	}
	public LocalDate getpDate() {
		return pDate;
	}
	public void setpDate(LocalDate pDate) {
		this.pDate = pDate;
	}
	public int getpRemain() {
		return pRemain;
	}
	public void setpRemain(int pRemain) {
		this.pRemain = pRemain;
	}
	public Product(int pNum, String pName, int pPrice, String pCompany, LocalDate pDate, int pRemain) {
		super();
		this.pNum = pNum;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pCompany = pCompany;
		this.pDate = pDate;
		this.pRemain = pRemain;
	}

}
