package com.cognizant.sweetitemservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.sweetitemservice.dao.SweetItemDaoImpl;
import com.cognizant.sweetitemservice.model.SweetItem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SweetItemServiceImpl implements SweetItemService {

	@Autowired
	private SweetItemDaoImpl sweetItemDaoImpl;

	@Override
	public List<SweetItem> getSweetItemListAdmin() {
		log.info("START");
		List<SweetItem> sweetItemListAdmin = sweetItemDaoImpl.getSweetItemListAdmin();
		log.debug("SweetItemListAdmin: {}", sweetItemListAdmin);
		log.info("END");
		return sweetItemListAdmin;
	}

	@Override
	public List<SweetItem> getSweetItemListCustomer() {
		log.info("START");
		List<SweetItem> sweetItemListCustomer = sweetItemDaoImpl.getSweetItemListCustomer();
		log.debug("SweetItemListCustomer: {}", sweetItemListCustomer);
		log.info("END");
		return sweetItemListCustomer;
	}

	@Override
	public SweetItem modifySweetItem(int sweetItemId, SweetItem sweetItem) {

		log.info("START");
		SweetItem sweetItemModify = sweetItemDaoImpl.modifySweetItem(sweetItemId, sweetItem);
		log.info("END");
		return sweetItemModify;
	}

	@Override
	public SweetItem getSweetItem(int sweetItemId) {
		
		log.info("START");
		SweetItem sweetItem = sweetItemDaoImpl.getSweetItem(sweetItemId);
		log.debug("SweetItem : {}", sweetItem);
		log.info("END");
		return sweetItem;

	}

	@Override
	public SweetItem addSweetItem(SweetItem sweetItem) {
		
		log.info("START");
		SweetItem sweetItemAdd = sweetItemDaoImpl.addSweetItem(sweetItem);
		log.info("END");
		return sweetItemAdd;
	}

	@Override
	public SweetItem removeSweetItem(int sweetItemId) {
		
		log.info("START");
		SweetItem sweetItemRemove = sweetItemDaoImpl.removeSweetItem(sweetItemId);
		log.info("END");
		return sweetItemRemove;

	}

}
