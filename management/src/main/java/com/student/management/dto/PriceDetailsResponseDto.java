package com.student.management.dto;

import java.util.List;

public class PriceDetailsResponseDto {

	Float toatalPrice;
	Boolean coupounAvailable;
	List<String> paymentOptions;
	public Float getToatalPrice() {
		return toatalPrice;
	}
	public void setToatalPrice(Float toatalPrice) {
		this.toatalPrice = toatalPrice;
	}
	public Boolean getCoupounAvailable() {
		return coupounAvailable;
	}
	public void setCoupounAvailable(Boolean coupounAvailable) {
		this.coupounAvailable = coupounAvailable;
	}
	public List<String> getPaymentOptions() {
		return paymentOptions;
	}
	public void setPaymentOptions(List<String> paymentOptions) {
		this.paymentOptions = paymentOptions;
	}
	
	

}
