package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WvIntPartGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvIntPartGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvIntPartGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_INT_PART_GROUP_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvIntPart;
            protected  int beginWvIntPartN;
	
	/**
	* Constructor for WvIntPartGroupSerialized
	**/
    public WvIntPartGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WvIntPartGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_INT_PART_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvIntPart = getStartOffset() + 0;	// set offset for serialization
  
             beginWvIntPartN = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvIntPartCounter = -1;
     public boolean isWvIntPartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvIntPartCounter != sharedCounter;
         localWvIntPartCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_INT_PART_LEN = 16;
	/**
	 * 	serialize this WvIntPart
	 */
   protected void serializeWvIntPart(char[] wvIntPart) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvIntPart,0,getStringValue(),beginWvIntPart,WV_INT_PART_LEN);
       localWvIntPartCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvIntPartConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,true, false);
   }
    /**
	 *	refreshWvIntPart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvIntPart() {	 
   		return (substring(getStringValue(),beginWvIntPart,beginWvIntPart + WV_INT_PART_LEN));
   	}
     int localWvIntPartNCounter = -1;
     public boolean isWvIntPartNModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvIntPartNCounter != sharedCounter;
         localWvIntPartNCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wvIntPartN
	 *	@return wvIntPartN
	 */
	public char[]  getWvIntPartNString() {
	     return getCharArray(beginWvIntPartN,WV_INT_PART_N_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvIntPartNIsNumeric() {
	    return isNumeric(beginWvIntPartN
	                    ,beginWvIntPartN + WV_INT_PART_N_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WV_INT_PART_N_LEN = 16;
  	/**
	 * serializeWvIntPartN
	 */
	protected void serializeWvIntPartN(long wvIntPartN) {
		 putNumber(beginWvIntPartN,wvIntPartN,WV_INT_PART_N_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvIntPartNCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWvIntPartN
	 */
   	protected  long serializeWvIntPartN(char[] value) {
	    long  wvIntPartN;
	    if(value.length >0 && value.length!= 16)
            value = new String(value).trim().toCharArray();
	    if (value.length < 16) value = pad(16, value, ' ', LEFT_PAD);
	    else if (value.length > 16) value = substring(value,0,16);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wvIntPartN = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(16,value,false/*isSigned?*/)
		       ,beginWvIntPartN
		       ,16
		      );
		 localWvIntPartNCounter = shareString.getSerializedField().getModifiedCounter();
		return  wvIntPartN;
    }

   protected long checkWvIntPartNMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10P/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWvIntPartN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWvIntPartN() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWvIntPartN
			                 ,WV_INT_PART_N_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wvIntPartN", beginWvIntPartN,WV_INT_PART_N_LEN);
    }
   	}




}
  
