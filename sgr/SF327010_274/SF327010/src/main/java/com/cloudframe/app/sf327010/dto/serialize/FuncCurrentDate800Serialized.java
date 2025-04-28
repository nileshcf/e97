package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class FuncCurrentDate800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FuncCurrentDate800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FuncCurrentDate800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FUNC_CURRENT_DATE_800_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFuncCurrTime800;
	
	/**
	* Constructor for FuncCurrentDate800Serialized
	**/
    public FuncCurrentDate800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FuncCurrentDate800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FUNC_CURRENT_DATE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFuncCurrTime800 = getStartOffset() + 8;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFuncCurrTime800Counter = -1;
     public boolean isFuncCurrTime800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFuncCurrTime800Counter != sharedCounter;
         localFuncCurrTime800Counter = sharedCounter; return hasModified;
     }
	protected static final int FUNC_CURR_TIME_800_LEN = 6;
	/**
	 * 	serialize this FuncCurrTime800
	 */
   protected void serializeFuncCurrTime800(char[] funcCurrTime800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(funcCurrTime800,0,getStringValue(),beginFuncCurrTime800,FUNC_CURR_TIME_800_LEN);
       localFuncCurrTime800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFuncCurrTime800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFuncCurrTime800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFuncCurrTime800() {	 
   		return (substring(getStringValue(),beginFuncCurrTime800,beginFuncCurrTime800 + FUNC_CURR_TIME_800_LEN));
   	}




}
  
