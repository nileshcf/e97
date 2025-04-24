package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504CurrentTagTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504CurrentTagTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504CurrentTagTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_CURRENT_TAG_TABLE_LENGTH = 7700;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp65504TagArea;
           protected static final int IP_65504_TAG_AREA_SIZE = 700;
	
	/**
	* Constructor for Ip65504CurrentTagTableSerialized
	**/
    public Ip65504CurrentTagTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip65504CurrentTagTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_CURRENT_TAG_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp65504TagArea = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip65504TagAreaSize() {
			return IP_65504_TAG_AREA_SIZE;
		}



}
  
