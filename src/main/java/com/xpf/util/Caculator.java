package com.xpf.util;

import org.springframework.stereotype.Component;

@Component
public class Caculator {
	public double add(double a, double b) {
		return a + b;
	}

	public double sub(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double div(double a, double b) {
		return a / b;
	}
}
