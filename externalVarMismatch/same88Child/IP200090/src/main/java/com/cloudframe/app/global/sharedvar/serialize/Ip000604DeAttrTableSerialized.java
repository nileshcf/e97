package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip000604DeAttrTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip000604DeAttrTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip000604DeAttrTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_000604_DE_ATTR_TABLE_LENGTH = 10752;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp000604DeAttrRow;
           protected static final int IP_000604_DE_ATTR_ROW_SIZE = 128;
	
	/**
	* Constructor for Ip000604DeAttrTableSerialized
	**/
    public Ip000604DeAttrTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip000604DeAttrTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_000604_DE_ATTR_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp000604DeAttrRow = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip000604DeAttrRowSize() {
			return IP_000604_DE_ATTR_ROW_SIZE;
		}



}
  
