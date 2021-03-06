package org.esupportail.jefyco.portlet.web.springmvc;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.esupportail.commons.services.logging.Logger;
import org.esupportail.commons.services.logging.LoggerImpl;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.portlet.ModelAndView;


public abstract class AbastractExceptionController {

	private final Logger logger = new LoggerImpl(this.getClass());

	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception ex) {
		
		logger.error("Exception catching in spring mvc controller ... ", ex);
		
		ModelMap model = new ModelMap();
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
    	PrintStream print = new PrintStream(output);
    	ex.printStackTrace(print);
    	String exceptionStackTrace = new String(output.toByteArray());
    	model.put("exceptionStackTrace", exceptionStackTrace);
    	
    	model.put("exceptionMessage", ex.getMessage());

    	
        return new ModelAndView("exception", model);
	}

	
}
