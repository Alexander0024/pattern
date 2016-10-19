package com.lirenkj.pattern.iterator.entity;

import com.lirenkj.pattern.iterator.interfaces.Container;
import com.lirenkj.pattern.iterator.interfaces.Iterator;

/**
 * NameRepository
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class NameRepository implements Container {
    public String mNames[] = {"Alex", "John", "Julie", "Lora"};

    public NameRepository() {
    }

    public NameRepository(String[] names) {
        mNames = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int mIndex;

        @Override
        public boolean hasNext() {
            return mIndex < mNames.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return mNames[mIndex++];
            }
            return null;
        }
    }
}
