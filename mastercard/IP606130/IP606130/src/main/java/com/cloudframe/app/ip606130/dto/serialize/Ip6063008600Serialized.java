package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip6063008600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip6063008600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip6063008600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_6063008600_LENGTH = 58;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMaxEntries6003008;
	
	/**
	* Constructor for Ip6063008600Serialized
	**/
    public Ip6063008600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip6063008600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_6063008600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMaxEntries6003008 = getStartOffset() + 45;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localMaxEntries6003008Counter = -1;
     public boolean isMaxEntries6003008Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxEntries6003008Counter != sharedCounter;
         localMaxEntries6003008Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maxEntries6003008
	 *	@return maxEntries6003008
	 */
	public char[]  getMaxEntries6003008String() {
	     return getCharArray(beginMaxEntries6003008,MAX_ENTRIES_6003008_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxEntries6003008IsNumeric() {
	    return isNumeric(beginMaxEntries6003008
	                    ,beginMaxEntries6003008 + MAX_ENTRIES_6003008_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAX_ENTRIES_6003008_LEN = 4;
  	/**
	 * serializeMaxEntries6003008
	 */
	protected void serializeMaxEntries6003008(int maxEntries6003008) {
		 putNumber(beginMaxEntries6003008,maxEntries6003008,MAX_ENTRIES_6003008_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaxEntries6003008Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaxEntries6003008
	 */
   	protected  int serializeMaxEntries6003008(char[] value) {
	    int  maxEntries6003008;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maxEntries6003008 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMaxEntries6003008
		       ,4
		      );
		 localMaxEntries6003008Counter = shareString.getSerializedField().getModifiedCounter();
		return  maxEntries6003008;
    }

   protected int checkMaxEntries6003008MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaxEntries6003008 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMaxEntries6003008() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMaxEntries6003008
			                 ,MAX_ENTRIES_6003008_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maxEntries6003008", beginMaxEntries6003008,MAX_ENTRIES_6003008_LEN);
    }
   	}




}
  
