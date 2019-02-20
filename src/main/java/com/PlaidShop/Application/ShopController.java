package com.PlaidShop.Application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.PlaidShop.Domain.Paint;
import com.PlaidShop.Domain.Shop;
import com.PlaidShop.Persistance.PaintRepository;
import com.PlaidShop.Persistance.ShopRepository;

public class ShopController {

	private ShopRepository shopRepository;
	private PaintRepository paintRepository;
	
	public ShopController() {
		shopRepository = new ShopRepository();
		paintRepository = new PaintRepository();
	}
	
	public void createShop(Shop shop) {
		shopRepository.addShop(shop);
	}
	
	public List<Shop> listAllShops(){
		 return shopRepository.getShops();
	}
	
	public void createPaint(Paint paint) {
		paintRepository.addPaint(null);
	}
	
	public List<Paint> listAllPaints(){
		return paintRepository.getPaints();
	}
	
	public void burnThemAll() {
		paintRepository.delAllPaints();
	}
}
