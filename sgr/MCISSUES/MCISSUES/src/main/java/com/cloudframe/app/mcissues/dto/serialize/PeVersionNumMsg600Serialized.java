package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class PeVersionNumMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PeVersionNumMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PeVersionNumMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PE_VERSION_NUM_MSG_600_LENGTH = 66;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPeVersionNum600;
            protected  int beginMpeVersionNum600;
	
	/**
	* Constructor for PeVersionNumMsg600Serialized
	**/
    public PeVersionNumMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PeVersionNumMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PE_VERSION_NUM_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginPeVersionNum600 = getStartOffset() + 25;	// set offset for serialization
  
  
             beginMpeVersionNum600 = getStartOffset() + 57;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localPeVersionNum600Counter = -1;
     public boolean isPeVersionNum600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPeVersionNum600Counter != sharedCounter;
         localPeVersionNum600Counter = sharedCounter; return hasModified;
     }
	protected static final int PE_VERSION_NUM_600_LEN = 7;
	/**
	 * 	serialize this PeVersionNum600
	 */
   protected void serializePeVersionNum600(char[] peVersionNum600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(peVersionNum600,0,getStringValue(),beginPeVersionNum600,PE_VERSION_NUM_600_LEN);
       localPeVersionNum600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPeVersionNum600Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshPeVersionNum600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPeVersionNum600() {	 
   		return (substring(getStringValue(),beginPeVersionNum600,beginPeVersionNum600 + PE_VERSION_NUM_600_LEN));
   	}
     int localMpeVersionNum600Counter = -1;
     public boolean isMpeVersionNum600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMpeVersionNum600Counter != sharedCounter;
         localMpeVersionNum600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mpeVersionNum600
	 *	@return mpeVersionNum600
	 */
	public char[]  getMpeVersionNum600String() {
	     return getCharArray(beginMpeVersionNum600,MPE_VERSION_NUM_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mpeVersionNum600IsNumeric() {
	    return isNumeric(beginMpeVersionNum600
	                    ,beginMpeVersionNum600 + MPE_VERSION_NUM_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MPE_VERSION_NUM_600_LEN = 8;
  	/**
	 * serializeMpeVersionNum600
	 */
	protected void serializeMpeVersionNum600(long mpeVersionNum600) {
		 putNumber(beginMpeVersionNum600,mpeVersionNum600,MPE_VERSION_NUM_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMpeVersionNum600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMpeVersionNum600
	 */
   	protected  long serializeMpeVersionNum600(char[] value) {
	    long  mpeVersionNum600;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mpeVersionNum600 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginMpeVersionNum600
		       ,8
		      );
		 localMpeVersionNum600Counter = shareString.getSerializedField().getModifiedCounter();
		return  mpeVersionNum600;
    }

   protected long checkMpeVersionNum600MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMpeVersionNum600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMpeVersionNum600() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMpeVersionNum600
			                 ,MPE_VERSION_NUM_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mpeVersionNum600", beginMpeVersionNum600,MPE_VERSION_NUM_600_LEN);
    }
   	}




}
  
