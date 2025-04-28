package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Sys295EffDateGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys295EffDateGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys295EffDateGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_295_EFF_DATE_GROUP_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys295EffDate;
	
	/**
	* Constructor for Sys295EffDateGroupSerialized
	**/
    public Sys295EffDateGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys295EffDateGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_295_EFF_DATE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys295EffDate = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys295EffDateCounter = -1;
     public boolean isSys295EffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys295EffDateCounter != sharedCounter;
         localSys295EffDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sys295EffDate
	 *	@return sys295EffDate
	 */
	public char[]  getSys295EffDateString() {
	     return getCharArray(beginSys295EffDate,SYS_295_EFF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys295EffDateIsNumeric() {
	    return isNumeric(beginSys295EffDate
	                    ,beginSys295EffDate + SYS_295_EFF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SYS_295_EFF_DATE_LEN = 10;
  	/**
	 * serializeSys295EffDate
	 */
	protected void serializeSys295EffDate(long sys295EffDate) {
		 putNumber(beginSys295EffDate,sys295EffDate,SYS_295_EFF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys295EffDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSys295EffDate
	 */
   	protected  long serializeSys295EffDate(char[] value) {
	    long  sys295EffDate;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sys295EffDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSys295EffDate
		       ,10
		      );
		 localSys295EffDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  sys295EffDate;
    }

   protected long checkSys295EffDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSys295EffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSys295EffDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSys295EffDate
			                 ,SYS_295_EFF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sys295EffDate", beginSys295EffDate,SYS_295_EFF_DATE_LEN);
    }
   	}




}
  
