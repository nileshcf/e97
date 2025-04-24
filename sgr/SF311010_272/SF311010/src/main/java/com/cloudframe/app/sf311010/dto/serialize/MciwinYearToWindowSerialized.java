package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class MciwinYearToWindowSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciwinYearToWindowSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciwinYearToWindowSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIWIN_YEAR_TO_WINDOW_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for MciwinYearToWindowSerialized
	**/
    public MciwinYearToWindowSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MciwinYearToWindowSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIWIN_YEAR_TO_WINDOW_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
	   /*  end of offset */
	}




}
  
