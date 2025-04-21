package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class DisplayTable501Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DisplayTable501Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DisplayTable501Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DISPLAY_TABLE_501_LENGTH = 640000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginDisplayData501;
           protected static final int DISPLAY_DATA_501_SIZE = 10000;
	
	/**
	* Constructor for DisplayTable501Serialized
	**/
    public DisplayTable501Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DisplayTable501Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DISPLAY_TABLE_501_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginDisplayData501 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int displayData501Size() {
			return DISPLAY_DATA_501_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  64);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  64);
     }
}
  
