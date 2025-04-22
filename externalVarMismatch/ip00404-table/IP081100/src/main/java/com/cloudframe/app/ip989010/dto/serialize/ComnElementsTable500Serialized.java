package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ComnElementsTable500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ComnElementsTable500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ComnElementsTable500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int COMN_ELEMENTS_TABLE_500_LENGTH = 76125;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginComnTblEntry500;
           protected static final int COMN_TBL_ENTRY_500_SIZE = 75;
	
	/**
	* Constructor for ComnElementsTable500Serialized
	**/
    public ComnElementsTable500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ComnElementsTable500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(COMN_ELEMENTS_TABLE_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginComnTblEntry500 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int comnTblEntry500Size() {
			return COMN_TBL_ENTRY_500_SIZE;
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
  
