package com.cloudframe.app.vsammon1.file.records.serialize;

/**
*  The class MonXcdtTskStrtDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:09. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MonXcdtTskStrtDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MonXcdtTskStrtDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MON_XCDT_TSK_STRT_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMonXcdtTskStrtDtYyyy;
            protected  int beginMonXcdtTskStrtDtMm;
            protected  int beginMonXcdtTskStrtDtDd;
	
	/**
	* Constructor for MonXcdtTskStrtDtSerialized
	**/
    public MonXcdtTskStrtDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MonXcdtTskStrtDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MonXcdtTskStrtDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MonXcdtTskStrtDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MonXcdtTskStrtDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MonXcdtTskStrtDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MON_XCDT_TSK_STRT_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMonXcdtTskStrtDtYyyy = getStartOffset() + 0;	// set offset for serialization
  
  
             beginMonXcdtTskStrtDtMm = getStartOffset() + 5;	// set offset for serialization
  
  
             beginMonXcdtTskStrtDtDd = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMonXcdtTskStrtDtYyyyCounter = -1;
     public boolean isMonXcdtTskStrtDtYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonXcdtTskStrtDtYyyyCounter != sharedCounter;
         localMonXcdtTskStrtDtYyyyCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_XCDT_TSK_STRT_DT_YYYY_LEN = 4;
	/**
	 * 	serialize this MonXcdtTskStrtDtYyyy
	 */
   protected void serializeMonXcdtTskStrtDtYyyy(char[] monXcdtTskStrtDtYyyy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monXcdtTskStrtDtYyyy,0,getStringValue(),beginMonXcdtTskStrtDtYyyy,MON_XCDT_TSK_STRT_DT_YYYY_LEN);
       localMonXcdtTskStrtDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonXcdtTskStrtDtYyyyConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMonXcdtTskStrtDtYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonXcdtTskStrtDtYyyy() {	 
   		return (substring(getStringValue(),beginMonXcdtTskStrtDtYyyy,beginMonXcdtTskStrtDtYyyy + MON_XCDT_TSK_STRT_DT_YYYY_LEN));
   	}
     int localMonXcdtTskStrtDtMmCounter = -1;
     public boolean isMonXcdtTskStrtDtMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonXcdtTskStrtDtMmCounter != sharedCounter;
         localMonXcdtTskStrtDtMmCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_XCDT_TSK_STRT_DT_MM_LEN = 2;
	/**
	 * 	serialize this MonXcdtTskStrtDtMm
	 */
   protected void serializeMonXcdtTskStrtDtMm(char[] monXcdtTskStrtDtMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monXcdtTskStrtDtMm,0,getStringValue(),beginMonXcdtTskStrtDtMm,MON_XCDT_TSK_STRT_DT_MM_LEN);
       localMonXcdtTskStrtDtMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonXcdtTskStrtDtMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMonXcdtTskStrtDtMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonXcdtTskStrtDtMm() {	 
   		return (substring(getStringValue(),beginMonXcdtTskStrtDtMm,beginMonXcdtTskStrtDtMm + MON_XCDT_TSK_STRT_DT_MM_LEN));
   	}
     int localMonXcdtTskStrtDtDdCounter = -1;
     public boolean isMonXcdtTskStrtDtDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonXcdtTskStrtDtDdCounter != sharedCounter;
         localMonXcdtTskStrtDtDdCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_XCDT_TSK_STRT_DT_DD_LEN = 2;
	/**
	 * 	serialize this MonXcdtTskStrtDtDd
	 */
   protected void serializeMonXcdtTskStrtDtDd(char[] monXcdtTskStrtDtDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monXcdtTskStrtDtDd,0,getStringValue(),beginMonXcdtTskStrtDtDd,MON_XCDT_TSK_STRT_DT_DD_LEN);
       localMonXcdtTskStrtDtDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonXcdtTskStrtDtDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMonXcdtTskStrtDtDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonXcdtTskStrtDtDd() {	 
   		return (substring(getStringValue(),beginMonXcdtTskStrtDtDd,beginMonXcdtTskStrtDtDd + MON_XCDT_TSK_STRT_DT_DD_LEN));
   	}




}
  
