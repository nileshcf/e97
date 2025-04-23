package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class PdsStrTag300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PdsStrTag300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PdsStrTag300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PDS_STR_TAG_300_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPdsStrCd300;
	
	/**
	* Constructor for PdsStrTag300Serialized
	**/
    public PdsStrTag300Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PdsStrTag300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PDS_STR_TAG_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginPdsStrCd300 = getStartOffset() + 11;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localPdsStrCd300Counter = -1;
     public boolean isPdsStrCd300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPdsStrCd300Counter != sharedCounter;
         localPdsStrCd300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pdsStrCd300
	 *	@return pdsStrCd300
	 */
	public char[]  getPdsStrCd300String() {
	     return getCharArray(beginPdsStrCd300,PDS_STR_CD_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pdsStrCd300IsNumeric() {
	    return isNumeric(beginPdsStrCd300
	                    ,beginPdsStrCd300 + PDS_STR_CD_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PDS_STR_CD_300_LEN = 4;
  	/**
	 * serializePdsStrCd300
	 */
	protected void serializePdsStrCd300(int pdsStrCd300) {
		 putNumber(beginPdsStrCd300,pdsStrCd300,PDS_STR_CD_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPdsStrCd300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePdsStrCd300
	 */
   	protected  int serializePdsStrCd300(char[] value) {
	    int  pdsStrCd300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pdsStrCd300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginPdsStrCd300
		       ,4
		      );
		 localPdsStrCd300Counter = shareString.getSerializedField().getModifiedCounter();
		return  pdsStrCd300;
    }

   protected int checkPdsStrCd300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPdsStrCd300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPdsStrCd300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPdsStrCd300
			                 ,PDS_STR_CD_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pdsStrCd300", beginPdsStrCd300,PDS_STR_CD_300_LEN);
    }
   	}




}
  
