package com.roger.beans;

import org.springframework.context.ApplicationContext;

public class Chinese implements Person{
	private Axe axe;
	private ApplicationContext ctx;
	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	public void useAxe(){
		System.out.println(axe.chop());
	}

	public ApplicationContext getCtx() {
		return ctx;
	}

	public void setApplicationContext(ApplicationContext ctx) {
		this.ctx = ctx;
	}
	
}
