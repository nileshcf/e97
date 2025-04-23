package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlm2tEndDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rlm2tEndDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlm2tEndDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLM_2T_END_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlm2tEndMm;
            protected  int beginRlm2tEndDd;
            protected  int beginRlm2tEndYyyy;
	
	/**
	* Constructor for Rlm2tEndDtSerialized
	**/
    public Rlm2tEndDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlm2tEndDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlm2tEndDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlm2tEndDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,47); // serialize this field at offset 47 by default 
    }
    
	/**
	* sets parent for this Rlm2tEndDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 47 by default
    }    
	/**
	* initializes the field in Rlm2tEndDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLM_2T_END_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlm2tEndMm = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRlm2tEndDd = getStartOffset() + 3;	// set offset for serialization
  
  
             beginRlm2tEndYyyy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlm2tEndMmCounter = -1;
     public boolean isRlm2tEndMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tEndMmCounter != sharedCounter;
         localRlm2tEndMmCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_END_MM_LEN = 2;
	/**
	 * 	serialize this Rlm2tEndMm
	 */
   protected void serializeRlm2tEndMm(char[] rlm2tEndMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tEndMm,0,getStringValue(),beginRlm2tEndMm,RLM_2T_END_MM_LEN);
       localRlm2tEndMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tEndMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlm2tEndMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tEndMm() {	 
   		return (substring(getStringValue(),beginRlm2tEndMm,beginRlm2tEndMm + RLM_2T_END_MM_LEN));
   	}
     int localRlm2tEndDdCounter = -1;
     public boolean isRlm2tEndDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tEndDdCounter != sharedCounter;
         localRlm2tEndDdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_END_DD_LEN = 2;
	/**
	 * 	serialize this Rlm2tEndDd
	 */
   protected void serializeRlm2tEndDd(char[] rlm2tEndDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tEndDd,0,getStringValue(),beginRlm2tEndDd,RLM_2T_END_DD_LEN);
       localRlm2tEndDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tEndDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlm2tEndDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tEndDd() {	 
   		return (substring(getStringValue(),beginRlm2tEndDd,beginRlm2tEndDd + RLM_2T_END_DD_LEN));
   	}
     int localRlm2tEndYyyyCounter = -1;
     public boolean isRlm2tEndYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tEndYyyyCounter != sharedCounter;
         localRlm2tEndYyyyCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_END_YYYY_LEN = 4;
	/**
	 * 	serialize this Rlm2tEndYyyy
	 */
   protected void serializeRlm2tEndYyyy(char[] rlm2tEndYyyy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tEndYyyy,0,getStringValue(),beginRlm2tEndYyyy,RLM_2T_END_YYYY_LEN);
       localRlm2tEndYyyyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tEndYyyyConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRlm2tEndYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tEndYyyy() {	 
   		return (substring(getStringValue(),beginRlm2tEndYyyy,beginRlm2tEndYyyy + RLM_2T_END_YYYY_LEN));
   	}




}
  
