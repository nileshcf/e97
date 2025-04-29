package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip66601UserTagTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:19. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66601UserTagTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66601UserTagTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66601_USER_TAG_TABLE_LENGTH = 9100;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp66601UserTag;
           protected static final int IP_66601_USER_TAG_SIZE = 700;
	
	/**
	* Constructor for Ip66601UserTagTableSerialized
	**/
    public Ip66601UserTagTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip66601UserTagTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66601UserTagTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip66601UserTagTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Ip66601UserTagTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Ip66601UserTagTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66601_USER_TAG_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp66601UserTag = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip66601UserTagSize() {
			return IP_66601_USER_TAG_SIZE;
		}



}
  
