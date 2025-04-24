package com.cloudframe.app.search2.dto.serialize;

/**
*  The class WtFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WtFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WtFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WT_FIELDS_LENGTH = 170000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginCodeCtrl;
           protected static final int CODE_CTRL_SIZE = 10000;
	
	/**
	* Constructor for WtFieldsSerialized
	**/
    public WtFieldsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WtFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WT_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginCodeCtrl = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int codeCtrlSize() {
			return CODE_CTRL_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  17);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  17);
     }
}
  
