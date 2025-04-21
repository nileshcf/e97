package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Grp1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Grp1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Grp1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GRP_1_LENGTH = 34;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Grp1Serialized
	**/
    public Grp1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Grp1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GRP_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
