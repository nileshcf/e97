package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class IrdExtrFileRec800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IrdExtrFileRec800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IrdExtrFileRec800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IRD_EXTR_FILE_REC_800_LENGTH = 31;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for IrdExtrFileRec800Serialized
	**/
    public IrdExtrFileRec800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in IrdExtrFileRec800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IRD_EXTR_FILE_REC_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
