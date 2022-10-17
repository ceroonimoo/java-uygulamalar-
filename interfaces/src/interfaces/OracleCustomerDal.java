package interfaces;

public class OracleCustomerDal implements ICustomerDal, IRepository{ //extendsden farkı bir class birden fazla inetface'i implement edebilir

	@Override
	public void Add() {
		System.out.println("Oracle eklendi");
	}

}
