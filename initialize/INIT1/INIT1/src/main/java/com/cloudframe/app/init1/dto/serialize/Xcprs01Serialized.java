package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Xcprs01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Xcprs01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Xcprs01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XCPRS_01_LENGTH = 5294;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Xcprs01Serialized
	**/
    public Xcprs01Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Xcprs01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XCPRS_01_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
