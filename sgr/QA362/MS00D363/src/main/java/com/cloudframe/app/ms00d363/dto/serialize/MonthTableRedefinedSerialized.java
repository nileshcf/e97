package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class MonthTableRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MonthTableRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MonthTableRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MONTH_TABLE_REDEFINED_LENGTH = 444;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginMonthEntries;
           protected static final int MONTH_ENTRIES_SIZE = 12;
	
	/**
	* Constructor for MonthTableRedefinedSerialized
	**/
    public MonthTableRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MonthTableRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MonthTableRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MonthTableRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MonthTableRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MonthTableRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MONTH_TABLE_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginMonthEntries = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int monthEntriesSize() {
			return MONTH_ENTRIES_SIZE;
		}



}
  
