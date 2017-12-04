package com.crafaelsouza.backtothefight.domain.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class GameFlow {

	private String question;
	private String name;
	private List<GameFlow> possibleNextFlows;
	
	public List<String> getOptions() {
		List<String> options = new ArrayList<>();
		if (getPossibleNextFlows() != null) {
			for (int i = 0; i < getPossibleNextFlows().size(); i++) {
				GameFlow nextFlow = getPossibleNextFlows().get(i); 
				String option = String.format("%s : %s", i, nextFlow.getName());
				options.add(option);
			}
		}
		return options;
	}
}
