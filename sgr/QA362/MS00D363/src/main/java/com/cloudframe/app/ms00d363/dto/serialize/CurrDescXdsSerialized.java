package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class CurrDescXdsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrDescXdsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrDescXdsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURR_DESC_XDS_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSwchCerRecType;
            protected  int beginSwchCerNumKey;
	
	/**
	* Constructor for CurrDescXdsSerialized
	**/
    public CurrDescXdsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CurrDescXdsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrDescXdsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CurrDescXdsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CurrDescXdsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CurrDescXdsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURR_DESC_XDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSwchCerRecType = getStartOffset() + 0;	// set offset for serialization
  
             beginSwchCerNumKey = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSwchCerRecTypeCounter = -1;
     public boolean isSwchCerRecTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwchCerRecTypeCounter != sharedCounter;
         localSwchCerRecTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SWCH_CER_REC_TYPE_LEN = 2;
	/**
	 * 	serialize this SwchCerRecType
	 */
   protected void serializeSwchCerRecType(char[] swchCerRecType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(swchCerRecType,0,getStringValue(),beginSwchCerRecType,SWCH_CER_REC_TYPE_LEN);
       localSwchCerRecTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSwchCerRecTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSwchCerRecType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSwchCerRecType() {	 
   		return (substring(getStringValue(),beginSwchCerRecType,beginSwchCerRecType + SWCH_CER_REC_TYPE_LEN));
   	}
     int localSwchCerNumKeyCounter = -1;
     public boolean isSwchCerNumKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwchCerNumKeyCounter != sharedCounter;
         localSwchCerNumKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SWCH_CER_NUM_KEY_LEN = 3;
	/**
	 * 	serialize this SwchCerNumKey
	 */
   protected void serializeSwchCerNumKey(char[] swchCerNumKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(swchCerNumKey,0,getStringValue(),beginSwchCerNumKey,SWCH_CER_NUM_KEY_LEN);
       localSwchCerNumKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSwchCerNumKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSwchCerNumKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSwchCerNumKey() {	 
   		return (substring(getStringValue(),beginSwchCerNumKey,beginSwchCerNumKey + SWCH_CER_NUM_KEY_LEN));
   	}




}
  
