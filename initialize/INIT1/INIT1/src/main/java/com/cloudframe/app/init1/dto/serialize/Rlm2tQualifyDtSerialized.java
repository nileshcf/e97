package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlm2tQualifyDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rlm2tQualifyDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlm2tQualifyDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLM_2T_QUALIFY_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlm2tQualifyMm;
            protected  int beginRlm2tQualifyDd;
            protected  int beginRlm2tQualifyYyyy;
	
	/**
	* Constructor for Rlm2tQualifyDtSerialized
	**/
    public Rlm2tQualifyDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlm2tQualifyDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlm2tQualifyDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlm2tQualifyDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,37); // serialize this field at offset 37 by default 
    }
    
	/**
	* sets parent for this Rlm2tQualifyDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 37 by default
    }    
	/**
	* initializes the field in Rlm2tQualifyDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLM_2T_QUALIFY_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlm2tQualifyMm = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRlm2tQualifyDd = getStartOffset() + 3;	// set offset for serialization
  
  
             beginRlm2tQualifyYyyy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlm2tQualifyMmCounter = -1;
     public boolean isRlm2tQualifyMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tQualifyMmCounter != sharedCounter;
         localRlm2tQualifyMmCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_QUALIFY_MM_LEN = 2;
	/**
	 * 	serialize this Rlm2tQualifyMm
	 */
   protected void serializeRlm2tQualifyMm(char[] rlm2tQualifyMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tQualifyMm,0,getStringValue(),beginRlm2tQualifyMm,RLM_2T_QUALIFY_MM_LEN);
       localRlm2tQualifyMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tQualifyMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlm2tQualifyMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tQualifyMm() {	 
   		return (substring(getStringValue(),beginRlm2tQualifyMm,beginRlm2tQualifyMm + RLM_2T_QUALIFY_MM_LEN));
   	}
     int localRlm2tQualifyDdCounter = -1;
     public boolean isRlm2tQualifyDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tQualifyDdCounter != sharedCounter;
         localRlm2tQualifyDdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_QUALIFY_DD_LEN = 2;
	/**
	 * 	serialize this Rlm2tQualifyDd
	 */
   protected void serializeRlm2tQualifyDd(char[] rlm2tQualifyDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tQualifyDd,0,getStringValue(),beginRlm2tQualifyDd,RLM_2T_QUALIFY_DD_LEN);
       localRlm2tQualifyDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tQualifyDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlm2tQualifyDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tQualifyDd() {	 
   		return (substring(getStringValue(),beginRlm2tQualifyDd,beginRlm2tQualifyDd + RLM_2T_QUALIFY_DD_LEN));
   	}
     int localRlm2tQualifyYyyyCounter = -1;
     public boolean isRlm2tQualifyYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tQualifyYyyyCounter != sharedCounter;
         localRlm2tQualifyYyyyCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_QUALIFY_YYYY_LEN = 4;
	/**
	 * 	serialize this Rlm2tQualifyYyyy
	 */
   protected void serializeRlm2tQualifyYyyy(char[] rlm2tQualifyYyyy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tQualifyYyyy,0,getStringValue(),beginRlm2tQualifyYyyy,RLM_2T_QUALIFY_YYYY_LEN);
       localRlm2tQualifyYyyyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tQualifyYyyyConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRlm2tQualifyYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tQualifyYyyy() {	 
   		return (substring(getStringValue(),beginRlm2tQualifyYyyy,beginRlm2tQualifyYyyy + RLM_2T_QUALIFY_YYYY_LEN));
   	}




}
  
