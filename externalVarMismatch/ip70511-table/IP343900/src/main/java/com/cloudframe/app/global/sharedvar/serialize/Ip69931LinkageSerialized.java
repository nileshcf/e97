package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip69931LinkageSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip69931LinkageSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip69931LinkageSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_69931_LINKAGE_LENGTH = 138;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip69931LinkageSerialized
	**/
    public Ip69931LinkageSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip69931LinkageSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_69931_LINKAGE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
