package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip67002Date2Redefined01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip67002Date2Redefined01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip67002Date2Redefined01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_67002_DATE_2_REDEFINED_01_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip67002Date2Redefined01Serialized
	**/
    public Ip67002Date2Redefined01Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip67002Date2Redefined01Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Date2Redefined01Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip67002Date2Redefined01Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,9); // serialize this field at offset 9 by default 
    }
    
	/**
	* sets parent for this Ip67002Date2Redefined01Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 9 by default
    }    
	/**
	* initializes the field in Ip67002Date2Redefined01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_67002_DATE_2_REDEFINED_01_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
