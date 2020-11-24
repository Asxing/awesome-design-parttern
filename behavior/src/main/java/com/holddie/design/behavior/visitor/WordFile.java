package com.holddie.design.behavior.visitor;

public class WordFile extends ResourceFile {
	public WordFile(String s) {
		super(s);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitor(this);
	}
}
