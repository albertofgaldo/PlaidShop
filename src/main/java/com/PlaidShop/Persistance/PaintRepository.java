package com.PlaidShop.Persistance;

import java.util.ArrayList;
import java.util.List;

import com.PlaidShop.Domain.Paint;

public class PaintRepository {

	private static List<Paint> paints;
	
	public PaintRepository() {
		paints = new ArrayList<>();
	}

	public static List<Paint> getPaints() {
		return paints;
	}

	public static void setPaints(List<Paint> paints) {
		PaintRepository.paints = paints;
	}
	
	public void addPaint (Paint paint) {
		paints.add(paint);
	}
	
	public void delPaint(Paint paint) {
		paints.remove(paint);
	}
	
	public Paint getPaintById(int id) {
		return paints.get(id);
	}
	
	public List<Paint> getListByShopId(int shopId){
		List<Paint> listPaints = new ArrayList<>();
		for (Paint paint: paints) {
			if(paint.getShop().getId()==shopId) {
				listPaints.add(paint);
			}
		}
		return listPaints;
	}
	
	public void delAllPaints() {
		paints.clear();
	}
		
}

