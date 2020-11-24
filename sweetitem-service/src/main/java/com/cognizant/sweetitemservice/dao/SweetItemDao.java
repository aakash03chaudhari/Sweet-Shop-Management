package com.cognizant.sweetitemservice.dao;

import java.util.List;

import com.cognizant.sweetitemservice.model.SweetItem;

public interface SweetItemDao {

	public List<SweetItem> getSweetItemListAdmin();

	public List<SweetItem> getSweetItemListCustomer();

	public SweetItem modifySweetItem(int sweetItemId,SweetItem sweetItem);

	public SweetItem getSweetItem(int sweetItemId);
	
	public SweetItem addSweetItem(SweetItem sweetItem);
	
	public SweetItem removeSweetItem(int sweetItemId);
}
