package com.cloudframe.app.vsammon7.file.records.serialize;

/**
*  The class MonPriKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:14. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MonPriKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MonPriKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MON_PRI_KEY_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMonXcdtProgNm;
	
	/**
	* Constructor for MonPriKeySerialized
	**/
    public MonPriKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MonPriKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MonPriKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MonPriKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MonPriKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MonPriKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MON_PRI_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMonXcdtProgNm = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMonXcdtProgNmCounter = -1;
     public boolean isMonXcdtProgNmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonXcdtProgNmCounter != sharedCounter;
         localMonXcdtProgNmCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_XCDT_PROG_NM_LEN = 8;
	/**
	 * 	serialize this MonXcdtProgNm
	 */
   protected void serializeMonXcdtProgNm(char[] monXcdtProgNm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monXcdtProgNm,0,getStringValue(),beginMonXcdtProgNm,MON_XCDT_PROG_NM_LEN);
       localMonXcdtProgNmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonXcdtProgNmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMonXcdtProgNm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonXcdtProgNm() {	 
   		return (substring(getStringValue(),beginMonXcdtProgNm,beginMonXcdtProgNm + MON_XCDT_PROG_NM_LEN));
   	}




}
  
