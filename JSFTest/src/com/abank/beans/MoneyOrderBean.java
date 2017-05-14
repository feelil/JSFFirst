package com.abank.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

import com.abank.pojo.Account;

@Named
@ManagedBean
@FlowScoped("moneyorder")
public class MoneyOrderBean implements Serializable {
	
	private Account sourceAccount;
    private Date selectedDate;
    private String orderType;
    private String targetIBAN;
    private Double amount;
    private String explanation;
    
	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getTargetIBAN() {
		return targetIBAN;
	}

	public void setTargetIBAN(String targetIBAN) {
		this.targetIBAN = targetIBAN;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Date getSelectedDate() {
		return selectedDate;
	}

	public void setSelectedDate(Date selectedDate) {
		this.selectedDate = selectedDate;
	}

	public Account getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(Account sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public String getReturnValue() {
		return "/home";
	}
	 @PostConstruct
	  public void init() {
	   sourceAccount=new Account();
	   //sourceAccount.setAccountNumber("123-456-78999");
	   }
	 
	 public List<Account> getCustomerAccounts(){
		 List<Account> rValue=new ArrayList<Account>();
		 Account tempAcc=null;
		 for (int i = 0; i < 5; i++) {
			tempAcc=new Account();
			tempAcc.setAccountId(i);
			tempAcc.setAccountNumber(i + "456-789");
			tempAcc.setCurrencyCode("TRY");
			tempAcc.setIbanNumber("TR-" + i + "- 98583213213223");
			rValue.add(tempAcc);
		}
		 
		 return rValue;
	 }

}
