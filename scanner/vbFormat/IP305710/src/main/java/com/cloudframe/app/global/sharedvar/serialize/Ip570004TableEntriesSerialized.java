package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip570004TableEntriesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip570004TableEntriesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip570004TableEntriesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_570004_TABLE_ENTRIES_LENGTH = 1800000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp570004TableEntry;
           protected static final int IP_570004_TABLE_ENTRY_SIZE = 100000;
	
	/**
	* Constructor for Ip570004TableEntriesSerialized
	**/
    public Ip570004TableEntriesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip570004TableEntriesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip570004TableEntriesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip570004TableEntriesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,18); // serialize this field at offset 18 by default 
    }
    
	/**
	* sets parent for this Ip570004TableEntriesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 18 by default
    }    
	/**
	* initializes the field in Ip570004TableEntriesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_570004_TABLE_ENTRIES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp570004TableEntry = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip570004TableEntrySize() {
			return IP_570004_TABLE_ENTRY_SIZE;
		}



}
  
