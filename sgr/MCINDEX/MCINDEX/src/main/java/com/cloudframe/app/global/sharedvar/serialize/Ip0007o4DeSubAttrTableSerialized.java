package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip0007o4DeSubAttrTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0007o4DeSubAttrTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0007o4DeSubAttrTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0007O_4_DE_SUB_ATTR_TABLE_LENGTH = 14000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp0007o4DeSubAttrRow;
           protected static final int IP_0007O_4_DE_SUB_ATTR_ROW_SIZE = 200;
	
	/**
	* Constructor for Ip0007o4DeSubAttrTableSerialized
	**/
    public Ip0007o4DeSubAttrTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip0007o4DeSubAttrTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0007O_4_DE_SUB_ATTR_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp0007o4DeSubAttrRow = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip0007o4DeSubAttrRowSize() {
			return IP_0007O_4_DE_SUB_ATTR_ROW_SIZE;
		}



}
  
