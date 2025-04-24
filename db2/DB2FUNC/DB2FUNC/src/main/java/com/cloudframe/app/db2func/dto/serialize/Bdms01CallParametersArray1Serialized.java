package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01CallParametersArray1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01CallParametersArray1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01CallParametersArray1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_CALL_PARAMETERS_ARRAY_1_LENGTH = 33;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01SecurityDesc;
            protected  int beginBdms01SecurityDescLang;
            protected  int beginBdms01TypeDescCd;
	
	/**
	* Constructor for Bdms01CallParametersArray1Serialized
	**/
    public Bdms01CallParametersArray1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01CallParametersArray1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01CallParametersArray1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01CallParametersArray1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1046); // serialize this field at offset 1046 by default 
    }
    
	/**
	* sets parent for this Bdms01CallParametersArray1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1046 by default
    }    
	/**
	* initializes the field in Bdms01CallParametersArray1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_CALL_PARAMETERS_ARRAY_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01SecurityDesc = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01SecurityDescLang = getStartOffset() + 30;	// set offset for serialization
  
             beginBdms01TypeDescCd = getStartOffset() + 32;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01SecurityDescCounter = -1;
     public boolean isBdms01SecurityDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SecurityDescCounter != sharedCounter;
         localBdms01SecurityDescCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SECURITY_DESC_LEN = 30;
	/**
	 * 	serialize this Bdms01SecurityDesc
	 */
   protected void serializeBdms01SecurityDesc(char[] bdms01SecurityDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SecurityDesc,0,getStringValue(),beginBdms01SecurityDesc,BDMS_01_SECURITY_DESC_LEN);
       localBdms01SecurityDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SecurityDescConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBdms01SecurityDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SecurityDesc() {	 
   		return (substring(getStringValue(),beginBdms01SecurityDesc,beginBdms01SecurityDesc + BDMS_01_SECURITY_DESC_LEN));
   	}
     int localBdms01SecurityDescLangCounter = -1;
     public boolean isBdms01SecurityDescLangModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SecurityDescLangCounter != sharedCounter;
         localBdms01SecurityDescLangCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SECURITY_DESC_LANG_LEN = 2;
	/**
	 * 	serialize this Bdms01SecurityDescLang
	 */
   protected void serializeBdms01SecurityDescLang(char[] bdms01SecurityDescLang) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SecurityDescLang,0,getStringValue(),beginBdms01SecurityDescLang,BDMS_01_SECURITY_DESC_LANG_LEN);
       localBdms01SecurityDescLangCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SecurityDescLangConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01SecurityDescLang is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SecurityDescLang() {	 
   		return (substring(getStringValue(),beginBdms01SecurityDescLang,beginBdms01SecurityDescLang + BDMS_01_SECURITY_DESC_LANG_LEN));
   	}
     int localBdms01TypeDescCdCounter = -1;
     public boolean isBdms01TypeDescCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TypeDescCdCounter != sharedCounter;
         localBdms01TypeDescCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TYPE_DESC_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01TypeDescCd
	 */
   protected void serializeBdms01TypeDescCd(char[] bdms01TypeDescCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TypeDescCd,0,getStringValue(),beginBdms01TypeDescCd,BDMS_01_TYPE_DESC_CD_LEN);
       localBdms01TypeDescCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TypeDescCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01TypeDescCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TypeDescCd() {	 
   		return (substring(getStringValue(),beginBdms01TypeDescCd,beginBdms01TypeDescCd + BDMS_01_TYPE_DESC_CD_LEN));
   	}




}
  
