package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ResultReason603RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ResultReason603RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ResultReason603RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RESULT_REASON_603_REDEFINED_LENGTH = 29;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginResultBkupEndpt603;
	
	/**
	* Constructor for ResultReason603RedefinedSerialized
	**/
    public ResultReason603RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ResultReason603RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ResultReason603RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ResultReason603RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,9); // serialize this field at offset 9 by default 
    }
    
	/**
	* sets parent for this ResultReason603RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 9 by default
    }    
	/**
	* initializes the field in ResultReason603RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RESULT_REASON_603_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginResultBkupEndpt603 = getStartOffset() + 22;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localResultBkupEndpt603Counter = -1;
     public boolean isResultBkupEndpt603Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultBkupEndpt603Counter != sharedCounter;
         localResultBkupEndpt603Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_BKUP_ENDPT_603_LEN = 7;
	/**
	 * 	serialize this ResultBkupEndpt603
	 */
   protected void serializeResultBkupEndpt603(char[] resultBkupEndpt603) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultBkupEndpt603,0,getStringValue(),beginResultBkupEndpt603,RESULT_BKUP_ENDPT_603_LEN);
       localResultBkupEndpt603Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultBkupEndpt603Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshResultBkupEndpt603 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultBkupEndpt603() {	 
   		return (substring(getStringValue(),beginResultBkupEndpt603,beginResultBkupEndpt603 + RESULT_BKUP_ENDPT_603_LEN));
   	}




}
  
