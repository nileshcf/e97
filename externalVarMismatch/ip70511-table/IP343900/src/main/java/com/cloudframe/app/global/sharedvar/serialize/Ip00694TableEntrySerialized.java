package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00694TableEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00694TableEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00694TableEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00694_TABLE_ENTRY_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip00694TableEntrySerialized
	**/
    public Ip00694TableEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip00694TableEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00694_TABLE_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
