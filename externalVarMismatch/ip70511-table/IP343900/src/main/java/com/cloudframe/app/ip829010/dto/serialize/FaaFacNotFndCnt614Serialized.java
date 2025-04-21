package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class FaaFacNotFndCnt614Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FaaFacNotFndCnt614Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FaaFacNotFndCnt614Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FAA_FAC_NOT_FND_CNT_614_LENGTH = 61;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFacNotFndCnt614;
	
	/**
	* Constructor for FaaFacNotFndCnt614Serialized
	**/
    public FaaFacNotFndCnt614Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FaaFacNotFndCnt614Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FAA_FAC_NOT_FND_CNT_614_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginFacNotFndCnt614 = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFacNotFndCnt614Counter = -1;
     public boolean isFacNotFndCnt614Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFacNotFndCnt614Counter != sharedCounter;
         localFacNotFndCnt614Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of facNotFndCnt614
	 *	@return facNotFndCnt614
	 */
	public char[]  getFacNotFndCnt614String() {
	     return getCharArray(beginFacNotFndCnt614,FAC_NOT_FND_CNT_614_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean facNotFndCnt614IsNumeric() {
	    return isNumeric(beginFacNotFndCnt614
	                    ,beginFacNotFndCnt614 + FAC_NOT_FND_CNT_614_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FAC_NOT_FND_CNT_614_LEN = 9;
  	/**
	 * serializeFacNotFndCnt614
	 */
	protected void serializeFacNotFndCnt614(long facNotFndCnt614) {
		 putNumber(beginFacNotFndCnt614,facNotFndCnt614,FAC_NOT_FND_CNT_614_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFacNotFndCnt614Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFacNotFndCnt614
	 */
   	protected  long serializeFacNotFndCnt614(char[] value) {
	    long  facNotFndCnt614;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    facNotFndCnt614 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginFacNotFndCnt614
		       ,9
		      );
		 localFacNotFndCnt614Counter = shareString.getSerializedField().getModifiedCounter();
		return  facNotFndCnt614;
    }

   protected long checkFacNotFndCnt614MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFacNotFndCnt614 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFacNotFndCnt614() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFacNotFndCnt614
			                 ,FAC_NOT_FND_CNT_614_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("facNotFndCnt614", beginFacNotFndCnt614,FAC_NOT_FND_CNT_614_LEN);
    }
   	}




}
  
