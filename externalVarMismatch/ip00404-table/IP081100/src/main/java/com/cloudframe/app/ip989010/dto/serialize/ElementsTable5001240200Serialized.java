package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ElementsTable5001240200Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ElementsTable5001240200Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ElementsTable5001240200Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ELEMENTS_TABLE_5001240200_LENGTH = 76125;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTblEntry5001240200;
           protected static final int TBL_ENTRY_5001240200_SIZE = 75;
	
	/**
	* Constructor for ElementsTable5001240200Serialized
	**/
    public ElementsTable5001240200Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ElementsTable5001240200Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ELEMENTS_TABLE_5001240200_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTblEntry5001240200 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int tblEntry5001240200Size() {
			return TBL_ENTRY_5001240200_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  1015);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  1015);
     }
}
  
