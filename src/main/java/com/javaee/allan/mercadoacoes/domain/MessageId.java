package com.javaee.allan.mercadoacoes.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageId {
	public MessageId(String id) {
		this.setId(id);
	}

	private String id;

}
