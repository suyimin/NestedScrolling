package com.xdroid.adapter.listview;


import com.xdroid.adapter.listview.base.ViewHolder;

public interface ItemViewDelegate<T> {

    public abstract int getItemViewLayoutId();

    public abstract boolean isForViewType(T item, int position);

    public abstract void convert(ViewHolder holder, T t, int position);

}
