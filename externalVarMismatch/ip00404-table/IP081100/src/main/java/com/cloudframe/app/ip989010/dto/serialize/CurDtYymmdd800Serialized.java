package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class CurDtYymmdd800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurDtYymmdd800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurDtYymmdd800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CUR_DT_YYMMDD_800_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurDtYy800;
            protected  int beginCurDtMm800;
            protected  int beginCurDtDd800;
	
	/**
	* Constructor for CurDtYymmdd800Serialized
	**/
    public CurDtYymmdd800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CurDtYymmdd800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurDtYymmdd800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CurDtYymmdd800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1266); // serialize this field at offset 1266 by default 
    }
    
	/**
	* sets parent for this CurDtYymmdd800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1266 by default
    }    
	/**
	* initializes the field in CurDtYymmdd800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CUR_DT_YYMMDD_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurDtYy800 = getStartOffset() + 0;	// set offset for serialization
  
             beginCurDtMm800 = getStartOffset() + 2;	// set offset for serialization
  
             beginCurDtDd800 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurDtYy800Counter = -1;
     public boolean isCurDtYy800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurDtYy800Counter != sharedCounter;
         localCurDtYy800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUR_DT_YY_800_LEN = 2;
	/**
	 * 	serialize this CurDtYy800
	 */
   protected void serializeCurDtYy800(char[] curDtYy800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(curDtYy800,0,getStringValue(),beginCurDtYy800,CUR_DT_YY_800_LEN);
       localCurDtYy800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurDtYy800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurDtYy800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurDtYy800() {	 
   		return (substring(getStringValue(),beginCurDtYy800,beginCurDtYy800 + CUR_DT_YY_800_LEN));
   	}
     int localCurDtMm800Counter = -1;
     public boolean isCurDtMm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurDtMm800Counter != sharedCounter;
         localCurDtMm800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUR_DT_MM_800_LEN = 2;
	/**
	 * 	serialize this CurDtMm800
	 */
   protected void serializeCurDtMm800(char[] curDtMm800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(curDtMm800,0,getStringValue(),beginCurDtMm800,CUR_DT_MM_800_LEN);
       localCurDtMm800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurDtMm800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurDtMm800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurDtMm800() {	 
   		return (substring(getStringValue(),beginCurDtMm800,beginCurDtMm800 + CUR_DT_MM_800_LEN));
   	}
     int localCurDtDd800Counter = -1;
     public boolean isCurDtDd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurDtDd800Counter != sharedCounter;
         localCurDtDd800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUR_DT_DD_800_LEN = 2;
	/**
	 * 	serialize this CurDtDd800
	 */
   protected void serializeCurDtDd800(char[] curDtDd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(curDtDd800,0,getStringValue(),beginCurDtDd800,CUR_DT_DD_800_LEN);
       localCurDtDd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurDtDd800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurDtDd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurDtDd800() {	 
   		return (substring(getStringValue(),beginCurDtDd800,beginCurDtDd800 + CUR_DT_DD_800_LEN));
   	}




}
  
