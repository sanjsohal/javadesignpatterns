package com.iterator.pattern.menuexample.solutionlevel1;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
	
	List<MenuItem> items;
	int position = 0;
	
	public PancakeHouseMenuIterator(List<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(position+1==items.size()||items.get(position)==null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items.get(position);
		position = position+1;
		return menuItem;
	}

}
