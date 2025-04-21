package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class CurrentDate800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrentDate800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrentDate800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURRENT_DATE_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurDtCc800;
	
	/**
	* Constructor for CurrentDate800Serialized
	**/
    public CurrentDate800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CurrentDate800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentDate800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CurrentDate800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1264); // serialize this field at offset 1264 by default 
    }
    
	/**
	* sets parent for this CurrentDate800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1264 by default
    }    
	/**
	* initializes the field in CurrentDate800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURRENT_DATE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurDtCc800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCurDtCc800Counter = -1;
     public boolean isCurDtCc800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurDtCc800Counter != sharedCounter;
         localCurDtCc800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUR_DT_CC_800_LEN = 2;
	/**
	 * 	serialize this CurDtCc800
	 */
   protected void serializeCurDtCc800(char[] curDtCc800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(curDtCc800,0,getStringValue(),beginCurDtCc800,CUR_DT_CC_800_LEN);
       localCurDtCc800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurDtCc800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurDtCc800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurDtCc800() {	 
   		return (substring(getStringValue(),beginCurDtCc800,beginCurDtCc800 + CUR_DT_CC_800_LEN));
   	}




}
  
