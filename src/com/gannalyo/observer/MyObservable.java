package com.gannalyo.observer;

import java.util.Observable;

/**
 * One observable tool, it means like a broadcast.
 * 
 * @author Gannalyo
 * @since 2018-07-26
 */
public class MyObservable extends Observable {
	private String data = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		// the value will be never null for this.data
		if (data != null && !data.equals(this.data)) {
			this.data = data;
			// a mark for changing to data
			setChanged();
		}

		// to notify all observers when the data was changed
		notifyObservers();
	}

}
