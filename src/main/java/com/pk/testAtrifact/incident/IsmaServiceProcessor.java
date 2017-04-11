package com.pk.testAtrifact.incident;

import org.apache.camel.Processor;
import org.apache.camel.Exchange;
public class IsmaServiceProcessor implements Processor{
	@Override
    public void process(Exchange exchange) throws Exception {
        // set reply
		  String name = exchange.getIn().getBody(InputSetName.class).getNameInput();
		OutputSetName output = new OutputSetName();
        output.setOutputName("The name you try to set is : "+name);
        exchange.getOut().setBody(output);
    }
}
