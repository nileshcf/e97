package com.cloudframe.app.casecb01.dto.serialize;

/**
*  The class Xmlpc103LinkageSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:47. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Xmlpc103LinkageSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Xmlpc103LinkageSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XMLPC_103_LINKAGE_LENGTH = 14862;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Xmlpc103LinkageSerialized
	**/
    public Xmlpc103LinkageSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Xmlpc103LinkageSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XMLPC_103_LINKAGE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
