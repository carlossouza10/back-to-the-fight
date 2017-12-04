package com.crafaelsouza.backtothefight.domain.service.impl;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.crafaelsouza.backtothefight.domain.model.GameFlow;
import com.crafaelsouza.backtothefight.domain.service.FlowService;

@Service
public class FlowServiceImpl implements FlowService {

	public GameFlow startGameFlow() {
		GameFlow flow = new GameFlow();
		flow.setQuestion(
				"Welcome to the Back To The Fight."
						+ "Please enter an option to start the game: ");
		GameFlow next1 = new GameFlow();
		next1.setName("Select an existing Character");
		GameFlow next2 = new GameFlow();
		next2.setName("Create a Character");
		
		flow.setPossibleNextFlows(Arrays.asList(next1, next2));
		
		return flow;
		
	}
}
