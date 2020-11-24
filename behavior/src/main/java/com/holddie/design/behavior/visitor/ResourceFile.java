package com.holddie.design.behavior.visitor;

public abstract class ResourceFile {
	protected String filePath;

	public ResourceFile(String filePath) {
		this.filePath = filePath;
	}

	public abstract void accept(Visitor visitor);
}
