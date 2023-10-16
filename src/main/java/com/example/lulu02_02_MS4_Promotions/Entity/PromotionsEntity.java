package com.example.lulu02_02_MS4_Promotions.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "promotons")
public class PromotionsEntity {
	@Id
	int id;
	int month;
	double cost;
	int durationDays;
	String mediaPartner;
	public PromotionsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PromotionsEntity(int id, int month, double cost, int durationDays, String mediaPartner) {
		super();
		this.id = id;
		this.month = month;
		this.cost = cost;
		this.durationDays = durationDays;
		this.mediaPartner = mediaPartner;
	}
	@Override
	public String toString() {
		return "PromotionsEntity [id=" + id + ", month=" + month + ", cost=" + cost + ", durationDays=" + durationDays
				+ ", mediaPartner=" + mediaPartner + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getDurationDays() {
		return durationDays;
	}
	public void setDurationDays(int durationDays) {
		this.durationDays = durationDays;
	}
	public String getMediaPartner() {
		return mediaPartner;
	}
	public void setMediaPartner(String mediaPartner) {
		this.mediaPartner = mediaPartner;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, durationDays, id, mediaPartner, month);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PromotionsEntity other = (PromotionsEntity) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost)
				&& durationDays == other.durationDays && id == other.id
				&& Objects.equals(mediaPartner, other.mediaPartner) && month == other.month;
	}
	
	
	

}
