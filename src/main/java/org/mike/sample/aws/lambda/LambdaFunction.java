package org.mike.sample.aws.lambda;
import java.util.Arrays;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger; 
public class LambdaFunction {
	
	/**
	 * Main method, will be used as the handler for the lambda function
	 * @param input, parameters used by the function; list of names separated by comma
	 * @param context
	 * @return
	 */
	public String handleRequest(String input, Context context) {
		LambdaLogger logger = context.getLogger();
		logger.log("Inout is:".concat(input));
		
        return sortNames(input);
    }

	/**
	 * sort the list of names
	 * @param names
	 * @return
	 */
	private String sortNames(String names) {
		String[] listNames=names.split(",");
		Arrays.sort(listNames);
		return Arrays.toString(listNames);
	}
}
