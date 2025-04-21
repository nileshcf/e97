package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00060aDeAttrTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00060aDeAttrTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00060aDeAttrTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00060A_DE_ATTR_TABLE_LENGTH = 16000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp00060aDeAttrRow;
           protected static final int IP_00060A_DE_ATTR_ROW_SIZE = 200;
	
	/**
	* Constructor for Ip00060aDeAttrTableSerialized
	**/
    public Ip00060aDeAttrTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip00060aDeAttrTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00060A_DE_ATTR_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp00060aDeAttrRow = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip00060aDeAttrRowSize() {
			return IP_00060A_DE_ATTR_ROW_SIZE;
		}



}
  
