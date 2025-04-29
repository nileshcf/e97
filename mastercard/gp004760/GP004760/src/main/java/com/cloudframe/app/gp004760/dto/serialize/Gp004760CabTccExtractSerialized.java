package com.cloudframe.app.gp004760.dto.serialize;

/**
*  The class Gp004760CabTccExtractSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Gp004760CabTccExtractSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Gp004760CabTccExtractSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GP_004760_CAB_TCC_EXTRACT_LENGTH = 256;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGp004760RecordId;
	
	/**
	* Constructor for Gp004760CabTccExtractSerialized
	**/
    public Gp004760CabTccExtractSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Gp004760CabTccExtractSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GP_004760_CAB_TCC_EXTRACT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginGp004760RecordId = getStartOffset() + 0;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localGp004760RecordIdCounter = -1;
     public boolean isGp004760RecordIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGp004760RecordIdCounter != sharedCounter;
         localGp004760RecordIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of gp004760RecordId
	 *	@return gp004760RecordId
	 */
	public char[]  getGp004760RecordIdString() {
	     return getCharArray(beginGp004760RecordId,GP_004760_RECORD_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gp004760RecordIdIsNumeric() {
	    return isNumeric(beginGp004760RecordId
	                    ,beginGp004760RecordId + GP_004760_RECORD_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int GP_004760_RECORD_ID_LEN = 2;
  	/**
	 * serializeGp004760RecordId
	 */
	protected void serializeGp004760RecordId(int gp004760RecordId) {
		 putNumber(beginGp004760RecordId,gp004760RecordId,GP_004760_RECORD_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localGp004760RecordIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeGp004760RecordId
	 */
   	protected  int serializeGp004760RecordId(char[] value) {
	    int  gp004760RecordId;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    gp004760RecordId = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginGp004760RecordId
		       ,2
		      );
		 localGp004760RecordIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  gp004760RecordId;
    }

   protected int checkGp004760RecordIdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshGp004760RecordId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGp004760RecordId() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginGp004760RecordId
			                 ,GP_004760_RECORD_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("gp004760RecordId", beginGp004760RecordId,GP_004760_RECORD_ID_LEN);
    }
   	}




}
  
