package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlatuRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlatuRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlatuRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLATU_REC_LENGTH = 150;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for RlatuRecSerialized
	**/
    public RlatuRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RlatuRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLATU_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
