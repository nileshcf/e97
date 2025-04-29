package com.cloudframe.app.sf326010.dto.serialize;

/**
*  The class Sys001MiplogDate801Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001MiplogDate801Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001MiplogDate801Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_MIPLOG_DATE_801_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001MiplogDateMm801;
            protected  int beginSys001MiplogDateDd801;
            protected  int beginSys001MiplogDateYy801;
	
	/**
	* Constructor for Sys001MiplogDate801Serialized
	**/
    public Sys001MiplogDate801Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sys001MiplogDate801Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys001MiplogDate801Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sys001MiplogDate801Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,29); // serialize this field at offset 29 by default 
    }
    
	/**
	* sets parent for this Sys001MiplogDate801Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 29 by default
    }    
	/**
	* initializes the field in Sys001MiplogDate801Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_MIPLOG_DATE_801_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys001MiplogDateMm801 = getStartOffset() + 0;	// set offset for serialization
  
             beginSys001MiplogDateDd801 = getStartOffset() + 1;	// set offset for serialization
  
             beginSys001MiplogDateYy801 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001MiplogDateMm801Counter = -1;
     public boolean isSys001MiplogDateMm801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001MiplogDateMm801Counter != sharedCounter;
         localSys001MiplogDateMm801Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_MIPLOG_DATE_MM_801_LEN = 1;
	/**
	 * 	serialize this Sys001MiplogDateMm801
	 */
   protected void serializeSys001MiplogDateMm801(char[] sys001MiplogDateMm801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001MiplogDateMm801,0,getStringValue(),beginSys001MiplogDateMm801,SYS_001_MIPLOG_DATE_MM_801_LEN);
       localSys001MiplogDateMm801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001MiplogDateMm801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSys001MiplogDateMm801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001MiplogDateMm801() {	 
   		return (substring(getStringValue(),beginSys001MiplogDateMm801,beginSys001MiplogDateMm801 + SYS_001_MIPLOG_DATE_MM_801_LEN));
   	}
     int localSys001MiplogDateDd801Counter = -1;
     public boolean isSys001MiplogDateDd801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001MiplogDateDd801Counter != sharedCounter;
         localSys001MiplogDateDd801Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_MIPLOG_DATE_DD_801_LEN = 1;
	/**
	 * 	serialize this Sys001MiplogDateDd801
	 */
   protected void serializeSys001MiplogDateDd801(char[] sys001MiplogDateDd801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001MiplogDateDd801,0,getStringValue(),beginSys001MiplogDateDd801,SYS_001_MIPLOG_DATE_DD_801_LEN);
       localSys001MiplogDateDd801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001MiplogDateDd801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSys001MiplogDateDd801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001MiplogDateDd801() {	 
   		return (substring(getStringValue(),beginSys001MiplogDateDd801,beginSys001MiplogDateDd801 + SYS_001_MIPLOG_DATE_DD_801_LEN));
   	}
     int localSys001MiplogDateYy801Counter = -1;
     public boolean isSys001MiplogDateYy801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001MiplogDateYy801Counter != sharedCounter;
         localSys001MiplogDateYy801Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_MIPLOG_DATE_YY_801_LEN = 1;
	/**
	 * 	serialize this Sys001MiplogDateYy801
	 */
   protected void serializeSys001MiplogDateYy801(char[] sys001MiplogDateYy801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001MiplogDateYy801,0,getStringValue(),beginSys001MiplogDateYy801,SYS_001_MIPLOG_DATE_YY_801_LEN);
       localSys001MiplogDateYy801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001MiplogDateYy801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSys001MiplogDateYy801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001MiplogDateYy801() {	 
   		return (substring(getStringValue(),beginSys001MiplogDateYy801,beginSys001MiplogDateYy801 + SYS_001_MIPLOG_DATE_YY_801_LEN));
   	}




}
  
