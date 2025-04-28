package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00702CaTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00702CaTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00702CaTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00702_CA_TABLE_LENGTH = 2000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp00702CaEntry;
           protected static final int IP_00702_CA_ENTRY_SIZE = 500;
	
	/**
	* Constructor for Ip00702CaTableSerialized
	**/
    public Ip00702CaTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip00702CaTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00702_CA_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp00702CaEntry = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip00702CaEntrySize() {
			return IP_00702_CA_ENTRY_SIZE;
		}



}
  
