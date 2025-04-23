package com.cloudframe.app.si994010.dto.serialize;

/**
*  The class Si520DeAndLengthsGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Si520DeAndLengthsGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Si520DeAndLengthsGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SI_520_DE_AND_LENGTHS_GROUP_LENGTH = 384;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Si520DeAndLengthsGroupSerialized
	**/
    public Si520DeAndLengthsGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Si520DeAndLengthsGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SI_520_DE_AND_LENGTHS_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
