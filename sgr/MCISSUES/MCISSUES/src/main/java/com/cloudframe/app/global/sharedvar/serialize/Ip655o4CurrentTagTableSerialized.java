package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip655o4CurrentTagTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip655o4CurrentTagTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip655o4CurrentTagTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_655O_4_CURRENT_TAG_TABLE_LENGTH = 2800;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp655o4TagArea;
           protected static final int IP_655O_4_TAG_AREA_SIZE = 700;
	
	/**
	* Constructor for Ip655o4CurrentTagTableSerialized
	**/
    public Ip655o4CurrentTagTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip655o4CurrentTagTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_655O_4_CURRENT_TAG_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp655o4TagArea = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip655o4TagAreaSize() {
			return IP_655O_4_TAG_AREA_SIZE;
		}



}
  
