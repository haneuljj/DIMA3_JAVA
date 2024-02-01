package cosmetic.service;

import java.util.ArrayList;
import java.util.List;

import cosmetic.vo.Foundation;
import cosmetic.vo.Lipstick;
import cosmetic.vo.Product;

public class CosmeticServiceImpl implements CosmeticService {
    List<Product> list = new ArrayList<>();
    int size = 0;

	@Override
	public boolean insert(Product product) {
		list.add(product);
		++size;
		return true;
	}

	@Override
	public boolean update(Product product) {
		int searchIndex = searchIndex(product.getProductNo());
		
		
		list.get(searchIndex).setName(product.getName());
		list.get(searchIndex).setPrice(product.getPrice());
		
		if(product instanceof Lipstick) {
			((Lipstick) list.get(searchIndex)).setType(((Lipstick) product).getType());
			((Lipstick) list.get(searchIndex)).setColor(((Lipstick) product).getColor());
			return true;
		}
		
		if(product instanceof Foundation) {
			((Foundation) list.get(searchIndex)).setTexture(((Foundation) product).getTexture());
			return true;
		}
		
		return false;
	}

	@Override
	public boolean delete(String productNo) {
		int index = searchIndex(productNo);
		list.remove(index);
		return true;
	}

	@Override
	public Product selectOne(String productNo) {
		int index = searchIndex(productNo);
		
		// 못찾으면 null 반환
		if (index == -1) 
			return null;
		
		return list.get(index);
	}

	@Override
	public List<Product> selectAll() {
		return list;
	}

	@Override
	public int getCount() {
		return size;
	}

	@Override
	public int searchIndex(String productNo) {
		int index = -1;
		for (int i=0; i<size; ++i) {
			if(list.get(i).getProductNo().equals(productNo)) {
				index = i;
				break;
			}
		}
		return index;
	}
    

}
