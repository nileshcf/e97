package com.cloudframe.app.ip989010.file.records.serialize;

/**
*  The class Sys005InRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys005InRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys005InRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_005_IN_REC_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Sys005InRecSerialized
	**/
    public Sys005InRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys005InRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_005_IN_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
