package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Sys201CntGroup400Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201CntGroup400Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201CntGroup400Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_CNT_GROUP_400_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys201Cnt400;
            protected  int beginSys201CntX400;
	
	/**
	* Constructor for Sys201CntGroup400Serialized
	**/
    public Sys201CntGroup400Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys201CntGroup400Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_CNT_GROUP_400_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys201Cnt400 = getStartOffset() + 0;	// set offset for serialization
  
             beginSys201CntX400 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys201Cnt400Counter = -1;
     public boolean isSys201Cnt400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201Cnt400Counter != sharedCounter;
         localSys201Cnt400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sys201Cnt400
	 *	@return sys201Cnt400
	 */
	public char[]  getSys201Cnt400String() {
	     return getCharArray(beginSys201Cnt400,SYS_201_CNT_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys201Cnt400IsNumeric() {
	    return isNumeric(beginSys201Cnt400
	                    ,beginSys201Cnt400 + SYS_201_CNT_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SYS_201_CNT_400_LEN = 8;
  	/**
	 * serializeSys201Cnt400
	 */
	protected void serializeSys201Cnt400(long sys201Cnt400) {
		 putNumber(beginSys201Cnt400,sys201Cnt400,SYS_201_CNT_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys201Cnt400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSys201Cnt400
	 */
   	protected  long serializeSys201Cnt400(char[] value) {
	    long  sys201Cnt400;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sys201Cnt400 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSys201Cnt400
		       ,8
		      );
		 localSys201Cnt400Counter = shareString.getSerializedField().getModifiedCounter();
		return  sys201Cnt400;
    }

   protected long checkSys201Cnt400MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSys201Cnt400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSys201Cnt400() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSys201Cnt400
			                 ,SYS_201_CNT_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sys201Cnt400", beginSys201Cnt400,SYS_201_CNT_400_LEN);
    }
   	}
     int localSys201CntX400Counter = -1;
     public boolean isSys201CntX400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201CntX400Counter != sharedCounter;
         localSys201CntX400Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_CNT_X_400_LEN = 8;
	/**
	 * 	serialize this Sys201CntX400
	 */
   protected void serializeSys201CntX400(char[] sys201CntX400) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201CntX400,0,getStringValue(),beginSys201CntX400,SYS_201_CNT_X_400_LEN);
       localSys201CntX400Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201CntX400Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSys201CntX400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201CntX400() {	 
   		return (substring(getStringValue(),beginSys201CntX400,beginSys201CntX400 + SYS_201_CNT_X_400_LEN));
   	}




}
  
