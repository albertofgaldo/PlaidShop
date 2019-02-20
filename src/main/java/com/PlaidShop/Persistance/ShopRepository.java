package com.PlaidShop.Persistance;

import java.util.ArrayList;
import java.util.List;

import com.PlaidShop.Domain.Shop;

public class ShopRepository {
	
	private static List<Shop> shops;
	
	public ShopRepository() {
		shops = new ArrayList<>();
	}

	public static List<Shop> getShops() {
		return shops;
	}

	public static void setShops(List<Shop> shops) {
		ShopRepository.shops = shops;
	}
	
	public void addShop(Shop shop) {
		shops.add(shop);
	}
	
	public void delShop(Shop shop) {
		shops.remove(shop);
	}
	
	public Shop getShopById(int id) {
		return shops.get(id);
	}
	
	public void delAllShops() {
		shops.clear();
	}

}
