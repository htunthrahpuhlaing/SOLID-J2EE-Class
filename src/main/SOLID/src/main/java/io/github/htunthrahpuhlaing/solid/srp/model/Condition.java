package io.github.htunthrahpuhlaing.solid.srp.model;

public interface Condition<T> {
	
	boolean isMatched(T item);

}
