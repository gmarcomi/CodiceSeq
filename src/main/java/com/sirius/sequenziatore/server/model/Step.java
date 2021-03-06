package com.sirius.sequenziatore.server.model;

import java.util.List;

public class Step implements ITransferObject
{
	//Fields
	private int id;
	private boolean first;
	private String description;
	private int nextStepId;
	private boolean requiresApproval;
	private boolean optional;
	private int processId;
	private List<NumericData> numericData;
	private List<TextualData> textualData;
	private List<ImageData> imageData;
	private GeographicData geographicData;
	
	//Getter & Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNextStepId() {
		return nextStepId;
	}
	public void setNextStepId(int nextStepId) {
		this.nextStepId = nextStepId;
	}
	public boolean requiresApproval() {
		return requiresApproval;
	}
	public void setRequiresApproval(boolean requiresApproval) {
		this.requiresApproval = requiresApproval;
	}
	public boolean isOptional() {
		return optional;
	}
	public void setOptional(boolean optional) {
		this.optional = optional;
	}
	public int getProcessId() {
		return processId;
	}
	public void setProcessId(int processId) {
		this.processId = processId;
	}
	public List<NumericData> getNumericData() {
		return numericData;
	}
	public void setNumericData(List<NumericData> numericData) {
		this.numericData = numericData;
	}
	public List<TextualData> getTextualData() {
		return textualData;
	}
	public void setTextualData(List<TextualData> textualData) {
		this.textualData = textualData;
	}
	public List<ImageData> getImageData() {
		return imageData;
	}
	public void setImageData(List<ImageData> imageData) {
		this.imageData = imageData;
	}
	public GeographicData getRequiredPosition() {
		return geographicData;
	}
	public void setRequiredPosition(GeographicData requiredPosition) {
		this.geographicData = requiredPosition;
	}
	public boolean isFirst() {
		return first;
	}
	public void setFirst(boolean first) {
		this.first = first;
	}
}