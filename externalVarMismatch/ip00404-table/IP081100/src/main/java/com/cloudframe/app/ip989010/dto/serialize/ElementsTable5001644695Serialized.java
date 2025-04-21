package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ElementsTable5001644695Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ElementsTable5001644695Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ElementsTable5001644695Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ELEMENTS_TABLE_5001644695_LENGTH = 76125;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTblEntry5001644695;
           protected static final int TBL_ENTRY_5001644695_SIZE = 75;
	
	/**
	* Constructor for ElementsTable5001644695Serialized
	**/
    public ElementsTable5001644695Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ElementsTable5001644695Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ELEMENTS_TABLE_5001644695_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTblEntry5001644695 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int tblEntry5001644695Size() {
			return TBL_ENTRY_5001644695_SIZE;
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
  
