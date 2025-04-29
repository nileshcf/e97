package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip2ooo1ErrorInfoTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip2ooo1ErrorInfoTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip2ooo1ErrorInfoTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_2OOO_1_ERROR_INFO_TABLE_LENGTH = 1710;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp2ooo1TableEntries;
           protected static final int IP_2OOO_1_TABLE_ENTRIES_SIZE = 10;
	
	/**
	* Constructor for Ip2ooo1ErrorInfoTableSerialized
	**/
    public Ip2ooo1ErrorInfoTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip2ooo1ErrorInfoTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip2ooo1ErrorInfoTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip2ooo1ErrorInfoTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip2ooo1ErrorInfoTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip2ooo1ErrorInfoTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_2OOO_1_ERROR_INFO_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp2ooo1TableEntries = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip2ooo1TableEntriesSize() {
			return IP_2OOO_1_TABLE_ENTRIES_SIZE;
		}



}
  
