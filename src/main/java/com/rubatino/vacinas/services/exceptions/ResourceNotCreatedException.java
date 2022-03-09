package com.rubatino.vacinas.services.exceptions;

public class ResourceNotCreatedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotCreatedException(Object obj) {
		super("Resource not createad." + obj);
	}

}
