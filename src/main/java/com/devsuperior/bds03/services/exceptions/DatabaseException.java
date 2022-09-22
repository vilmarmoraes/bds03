
package com.devsuperior.bds03.services.exceptions;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	// uso do "super" é pra passar o valor do argumento para o construtor da super
	// classe.

	public DatabaseException(String msg) {
		super(msg);
	}
}
