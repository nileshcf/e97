package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip000804PdsAttrTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip000804PdsAttrTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip000804PdsAttrTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_000804_PDS_ATTR_TABLE_LENGTH = 210000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp000804PdsAttrRow;
           protected static final int IP_000804_PDS_ATTR_ROW_SIZE = 3000;
	
	/**
	* Constructor for Ip000804PdsAttrTableSerialized
	**/
    public Ip000804PdsAttrTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip000804PdsAttrTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000804PdsAttrTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip000804PdsAttrTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Ip000804PdsAttrTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Ip000804PdsAttrTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_000804_PDS_ATTR_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp000804PdsAttrRow = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip000804PdsAttrRowSize() {
			return IP_000804_PDS_ATTR_ROW_SIZE;
		}



}
  
