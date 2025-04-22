package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip000904PdsSubAttrTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip000904PdsSubAttrTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip000904PdsSubAttrTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_000904_PDS_SUB_ATTR_TABLE_LENGTH = 140000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp000904PdsSubAttrRow;
           protected static final int IP_000904_PDS_SUB_ATTR_ROW_SIZE = 2000;
	
	/**
	* Constructor for Ip000904PdsSubAttrTableSerialized
	**/
    public Ip000904PdsSubAttrTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip000904PdsSubAttrTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_000904_PDS_SUB_ATTR_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp000904PdsSubAttrRow = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip000904PdsSubAttrRowSize() {
			return IP_000904_PDS_SUB_ATTR_ROW_SIZE;
		}



}
  
