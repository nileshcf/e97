package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class WhenCompDate800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WhenCompDate800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WhenCompDate800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WHEN_COMP_DATE_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWhenDateYyyy800;
            protected  int beginWhenDateMm800;
            protected  int beginWhenDateDd800;
	
	/**
	* Constructor for WhenCompDate800Serialized
	**/
    public WhenCompDate800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WhenCompDate800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WhenCompDate800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WhenCompDate800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WhenCompDate800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WhenCompDate800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WHEN_COMP_DATE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWhenDateYyyy800 = getStartOffset() + 0;	// set offset for serialization
  
             beginWhenDateMm800 = getStartOffset() + 4;	// set offset for serialization
  
             beginWhenDateDd800 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWhenDateYyyy800Counter = -1;
     public boolean isWhenDateYyyy800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWhenDateYyyy800Counter != sharedCounter;
         localWhenDateYyyy800Counter = sharedCounter; return hasModified;
     }
	protected static final int WHEN_DATE_YYYY_800_LEN = 4;
	/**
	 * 	serialize this WhenDateYyyy800
	 */
   protected void serializeWhenDateYyyy800(char[] whenDateYyyy800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(whenDateYyyy800,0,getStringValue(),beginWhenDateYyyy800,WHEN_DATE_YYYY_800_LEN);
       localWhenDateYyyy800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWhenDateYyyy800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshWhenDateYyyy800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWhenDateYyyy800() {	 
   		return (substring(getStringValue(),beginWhenDateYyyy800,beginWhenDateYyyy800 + WHEN_DATE_YYYY_800_LEN));
   	}
     int localWhenDateMm800Counter = -1;
     public boolean isWhenDateMm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWhenDateMm800Counter != sharedCounter;
         localWhenDateMm800Counter = sharedCounter; return hasModified;
     }
	protected static final int WHEN_DATE_MM_800_LEN = 2;
	/**
	 * 	serialize this WhenDateMm800
	 */
   protected void serializeWhenDateMm800(char[] whenDateMm800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(whenDateMm800,0,getStringValue(),beginWhenDateMm800,WHEN_DATE_MM_800_LEN);
       localWhenDateMm800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWhenDateMm800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWhenDateMm800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWhenDateMm800() {	 
   		return (substring(getStringValue(),beginWhenDateMm800,beginWhenDateMm800 + WHEN_DATE_MM_800_LEN));
   	}
     int localWhenDateDd800Counter = -1;
     public boolean isWhenDateDd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWhenDateDd800Counter != sharedCounter;
         localWhenDateDd800Counter = sharedCounter; return hasModified;
     }
	protected static final int WHEN_DATE_DD_800_LEN = 2;
	/**
	 * 	serialize this WhenDateDd800
	 */
   protected void serializeWhenDateDd800(char[] whenDateDd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(whenDateDd800,0,getStringValue(),beginWhenDateDd800,WHEN_DATE_DD_800_LEN);
       localWhenDateDd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWhenDateDd800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWhenDateDd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWhenDateDd800() {	 
   		return (substring(getStringValue(),beginWhenDateDd800,beginWhenDateDd800 + WHEN_DATE_DD_800_LEN));
   	}




}
  
