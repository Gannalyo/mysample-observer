package com.gannalyo.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Observer
 * 
 * @author Gannalyo
 * @since 2018-07-26
 */
public class BObserver implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("The Observer B receives the new data [" + ((MyObservable) arg0).getData() + "].");
	}

}
