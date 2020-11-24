package com.holddie.design.behavior.visitor;

public class PdfFile extends ResourceFile {

	public PdfFile(String s) {
		super(s);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitor(this);
	}
}
