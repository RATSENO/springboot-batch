package me.onestar.step;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String>{

	private String[] message = {"javainuse.com", "Welcome to Spring Batch Example", "We use H2 Database for this example"};
	
	private int count = 0;
	
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		if(count < message.length) {
			return message[count++];
		}else {
			count = 0;
		}
		
		return null;
	}

}
