package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RecDate800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RecDate800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RecDate800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REC_DATE_800_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRecDateCc800;
            protected  int beginRecDateYy800;
            protected  int beginRecDateMm800;
            protected  int beginRecDateDd800;
	
	/**
	* Constructor for RecDate800Serialized
	**/
    public RecDate800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RecDate800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RecDate800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RecDate800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RecDate800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RecDate800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REC_DATE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRecDateCc800 = getStartOffset() + 0;	// set offset for serialization
  
             beginRecDateYy800 = getStartOffset() + 2;	// set offset for serialization
  
  
             beginRecDateMm800 = getStartOffset() + 5;	// set offset for serialization
  
  
             beginRecDateDd800 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRecDateCc800Counter = -1;
     public boolean isRecDateCc800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecDateCc800Counter != sharedCounter;
         localRecDateCc800Counter = sharedCounter; return hasModified;
     }
	protected static final int REC_DATE_CC_800_LEN = 2;
	/**
	 * 	serialize this RecDateCc800
	 */
   protected void serializeRecDateCc800(char[] recDateCc800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recDateCc800,0,getStringValue(),beginRecDateCc800,REC_DATE_CC_800_LEN);
       localRecDateCc800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecDateCc800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRecDateCc800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecDateCc800() {	 
   		return (substring(getStringValue(),beginRecDateCc800,beginRecDateCc800 + REC_DATE_CC_800_LEN));
   	}
     int localRecDateYy800Counter = -1;
     public boolean isRecDateYy800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecDateYy800Counter != sharedCounter;
         localRecDateYy800Counter = sharedCounter; return hasModified;
     }
	protected static final int REC_DATE_YY_800_LEN = 2;
	/**
	 * 	serialize this RecDateYy800
	 */
   protected void serializeRecDateYy800(char[] recDateYy800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recDateYy800,0,getStringValue(),beginRecDateYy800,REC_DATE_YY_800_LEN);
       localRecDateYy800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecDateYy800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRecDateYy800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecDateYy800() {	 
   		return (substring(getStringValue(),beginRecDateYy800,beginRecDateYy800 + REC_DATE_YY_800_LEN));
   	}
     int localRecDateMm800Counter = -1;
     public boolean isRecDateMm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecDateMm800Counter != sharedCounter;
         localRecDateMm800Counter = sharedCounter; return hasModified;
     }
	protected static final int REC_DATE_MM_800_LEN = 2;
	/**
	 * 	serialize this RecDateMm800
	 */
   protected void serializeRecDateMm800(char[] recDateMm800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recDateMm800,0,getStringValue(),beginRecDateMm800,REC_DATE_MM_800_LEN);
       localRecDateMm800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecDateMm800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRecDateMm800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecDateMm800() {	 
   		return (substring(getStringValue(),beginRecDateMm800,beginRecDateMm800 + REC_DATE_MM_800_LEN));
   	}
     int localRecDateDd800Counter = -1;
     public boolean isRecDateDd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecDateDd800Counter != sharedCounter;
         localRecDateDd800Counter = sharedCounter; return hasModified;
     }
	protected static final int REC_DATE_DD_800_LEN = 2;
	/**
	 * 	serialize this RecDateDd800
	 */
   protected void serializeRecDateDd800(char[] recDateDd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recDateDd800,0,getStringValue(),beginRecDateDd800,REC_DATE_DD_800_LEN);
       localRecDateDd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecDateDd800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRecDateDd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecDateDd800() {	 
   		return (substring(getStringValue(),beginRecDateDd800,beginRecDateDd800 + REC_DATE_DD_800_LEN));
   	}




}
  
