package com.newbie.ajou.web.dto;

import lombok.Getter;

@Getter
public class AnswerDto {
	private int[] answers;

	public AnswerDto(int answers[]) {
		this.answers = answers;
	}
}
