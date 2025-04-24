package com.cloudframe.app.gp004760.dto.serialize;

/**
*  The class NspkExtractRec800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class NspkExtractRec800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(NspkExtractRec800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int NSPK_EXTRACT_REC_800_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNspkCabCd800;
            protected  int beginNspkTcc800;
	
	/**
	* Constructor for NspkExtractRec800Serialized
	**/
    public NspkExtractRec800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in NspkExtractRec800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(NSPK_EXTRACT_REC_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginNspkCabCd800 = getStartOffset() + 0;	// set offset for serialization
  
             beginNspkTcc800 = getStartOffset() + 4;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localNspkCabCd800Counter = -1;
     public boolean isNspkCabCd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNspkCabCd800Counter != sharedCounter;
         localNspkCabCd800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of nspkCabCd800
	 *	@return nspkCabCd800
	 */
	public char[]  getNspkCabCd800String() {
	     return getCharArray(beginNspkCabCd800,NSPK_CAB_CD_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean nspkCabCd800IsNumeric() {
	    return isNumeric(beginNspkCabCd800
	                    ,beginNspkCabCd800 + NSPK_CAB_CD_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NSPK_CAB_CD_800_LEN = 4;
  	/**
	 * serializeNspkCabCd800
	 */
	protected void serializeNspkCabCd800(int nspkCabCd800) {
		 putNumber(beginNspkCabCd800,nspkCabCd800,NSPK_CAB_CD_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNspkCabCd800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNspkCabCd800
	 */
   	protected  int serializeNspkCabCd800(char[] value) {
	    int  nspkCabCd800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    nspkCabCd800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginNspkCabCd800
		       ,4
		      );
		 localNspkCabCd800Counter = shareString.getSerializedField().getModifiedCounter();
		return  nspkCabCd800;
    }

   protected int checkNspkCabCd800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNspkCabCd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNspkCabCd800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNspkCabCd800
			                 ,NSPK_CAB_CD_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("nspkCabCd800", beginNspkCabCd800,NSPK_CAB_CD_800_LEN);
    }
   	}
     int localNspkTcc800Counter = -1;
     public boolean isNspkTcc800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNspkTcc800Counter != sharedCounter;
         localNspkTcc800Counter = sharedCounter; return hasModified;
     }
	protected static final int NSPK_TCC_800_LEN = 1;
	/**
	 * 	serialize this NspkTcc800
	 */
   protected void serializeNspkTcc800(char[] nspkTcc800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(nspkTcc800,0,getStringValue(),beginNspkTcc800,NSPK_TCC_800_LEN);
       localNspkTcc800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNspkTcc800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshNspkTcc800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNspkTcc800() {	 
   		return (substring(getStringValue(),beginNspkTcc800,beginNspkTcc800 + NSPK_TCC_800_LEN));
   	}




}
  
