package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WvDecPartGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvDecPartGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvDecPartGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_DEC_PART_GROUP_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvDecPart;
            protected  int beginWvDecPartN;
	
	/**
	* Constructor for WvDecPartGroupSerialized
	**/
    public WvDecPartGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WvDecPartGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_DEC_PART_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvDecPart = getStartOffset() + 0;	// set offset for serialization
  
             beginWvDecPartN = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvDecPartCounter = -1;
     public boolean isWvDecPartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvDecPartCounter != sharedCounter;
         localWvDecPartCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_DEC_PART_LEN = 16;
	/**
	 * 	serialize this WvDecPart
	 */
   protected void serializeWvDecPart(char[] wvDecPart) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvDecPart,0,getStringValue(),beginWvDecPart,WV_DEC_PART_LEN);
       localWvDecPartCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvDecPartConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,true, false);
   }
    /**
	 *	refreshWvDecPart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvDecPart() {	 
   		return (substring(getStringValue(),beginWvDecPart,beginWvDecPart + WV_DEC_PART_LEN));
   	}
     int localWvDecPartNCounter = -1;
     public boolean isWvDecPartNModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvDecPartNCounter != sharedCounter;
         localWvDecPartNCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wvDecPartN
	 *	@return wvDecPartN
	 */
	public char[]  getWvDecPartNString() {
	     return getCharArray(beginWvDecPartN,WV_DEC_PART_N_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvDecPartNIsNumeric() {
	    return isNumeric(beginWvDecPartN
	                    ,beginWvDecPartN + WV_DEC_PART_N_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WV_DEC_PART_N_LEN = 16;
  	/**
	 * serializeWvDecPartN
	 */
	protected void serializeWvDecPartN(long wvDecPartN) {
		 putNumber(beginWvDecPartN,wvDecPartN,WV_DEC_PART_N_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvDecPartNCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWvDecPartN
	 */
   	protected  long serializeWvDecPartN(char[] value) {
	    long  wvDecPartN;
	    if(value.length >0 && value.length!= 16)
            value = new String(value).trim().toCharArray();
	    if (value.length < 16) value = pad(16, value, ' ', LEFT_PAD);
	    else if (value.length > 16) value = substring(value,0,16);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wvDecPartN = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(16,value,false/*isSigned?*/)
		       ,beginWvDecPartN
		       ,16
		      );
		 localWvDecPartNCounter = shareString.getSerializedField().getModifiedCounter();
		return  wvDecPartN;
    }

   protected long checkWvDecPartNMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10P/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWvDecPartN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWvDecPartN() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWvDecPartN
			                 ,WV_DEC_PART_N_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wvDecPartN", beginWvDecPartN,WV_DEC_PART_N_LEN);
    }
   	}




}
  
