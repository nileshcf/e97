package com.cloudframe.app.comput.dto.serialize;

/**
*  The class Msp3pprcsIcaNumGroup300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Msp3pprcsIcaNumGroup300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Msp3pprcsIcaNumGroup300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSP_3PPRCS_ICA_NUM_GROUP_300_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsp3pprcsIcaNum300;
	
	/**
	* Constructor for Msp3pprcsIcaNumGroup300Serialized
	**/
    public Msp3pprcsIcaNumGroup300Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Msp3pprcsIcaNumGroup300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSP_3PPRCS_ICA_NUM_GROUP_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsp3pprcsIcaNum300 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localMsp3pprcsIcaNum300Counter = -1;
     public boolean isMsp3pprcsIcaNum300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsp3pprcsIcaNum300Counter != sharedCounter;
         localMsp3pprcsIcaNum300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msp3pprcsIcaNum300
	 *	@return msp3pprcsIcaNum300
	 */
	public char[]  getMsp3pprcsIcaNum300String() {
	     return getCharArray(beginMsp3pprcsIcaNum300,MSP_3PPRCS_ICA_NUM_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msp3pprcsIcaNum300IsNumeric() {
	    return isNumeric(beginMsp3pprcsIcaNum300
	                    ,beginMsp3pprcsIcaNum300 + MSP_3PPRCS_ICA_NUM_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSP_3PPRCS_ICA_NUM_300_LEN = 11;
  	/**
	 * serializeMsp3pprcsIcaNum300
	 */
	protected void serializeMsp3pprcsIcaNum300(long msp3pprcsIcaNum300) {
		 putNumber(beginMsp3pprcsIcaNum300,msp3pprcsIcaNum300,MSP_3PPRCS_ICA_NUM_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsp3pprcsIcaNum300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsp3pprcsIcaNum300
	 */
   	protected  long serializeMsp3pprcsIcaNum300(char[] value) {
	    long  msp3pprcsIcaNum300;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msp3pprcsIcaNum300 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginMsp3pprcsIcaNum300
		       ,11
		      );
		 localMsp3pprcsIcaNum300Counter = shareString.getSerializedField().getModifiedCounter();
		return  msp3pprcsIcaNum300;
    }

   protected long checkMsp3pprcsIcaNum300MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsp3pprcsIcaNum300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsp3pprcsIcaNum300() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsp3pprcsIcaNum300
			                 ,MSP_3PPRCS_ICA_NUM_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msp3pprcsIcaNum300", beginMsp3pprcsIcaNum300,MSP_3PPRCS_ICA_NUM_300_LEN);
    }
   	}




}
  
