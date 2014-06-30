package com.sirius.sequenziatore.server.model;

import java.util.Date;
import java.util.List;

public class Process  implements ITransferObject
{
	//Fields
	private String name;
	private String description;
	private int completionsMax;
	private Date dateOfTermination;
	private boolean terminated;
	private	int maxTree;
	private List<Integer> stepsId;
	private int id;
	
	//Getter & Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCompletionsMax() {
		return completionsMax;
	}
	public void setCompletionsMax(int completionsMax) {
		this.completionsMax = completionsMax;
	}
	public Date getDateOfTermination() {
		return dateOfTermination;
	}
	public void setDateOfTermination(Date dateOfTermination) {
		this.dateOfTermination = dateOfTermination;
	}
	public boolean isTerminated() {
		return terminated;
	}
	public void setTerminated(boolean terminated) {
		this.terminated = terminated;
	}
	public int getMaxTree() {
		return maxTree;
	}
	public void setMaxTree(int maxTree) {
		this.maxTree = maxTree;
	}
	public List<Integer> getStepsId() {
		return stepsId;
	}
	public void setStepsId(List<Integer> stepsId) {
		this.stepsId = stepsId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
