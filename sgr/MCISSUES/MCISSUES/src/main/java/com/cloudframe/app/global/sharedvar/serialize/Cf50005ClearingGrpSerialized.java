package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Cf50005ClearingGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Cf50005ClearingGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Cf50005ClearingGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CF_50005_CLEARING_GRP_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCf50005ClearingDtX;
            protected  int beginCf50005ClearingDtN;
            protected  int beginCf50005ClearingTmX;
	
	/**
	* Constructor for Cf50005ClearingGrpSerialized
	**/
    public Cf50005ClearingGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Cf50005ClearingGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CF_50005_CLEARING_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCf50005ClearingDtX = getStartOffset() + 0;	// set offset for serialization
  
             beginCf50005ClearingDtN = getStartOffset() + 0;	// set offset for serialization
  
             beginCf50005ClearingTmX = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCf50005ClearingDtXCounter = -1;
     public boolean isCf50005ClearingDtXModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCf50005ClearingDtXCounter != sharedCounter;
         localCf50005ClearingDtXCounter = sharedCounter; return hasModified;
     }
	protected static final int CF_50005_CLEARING_DT_X_LEN = 8;
	/**
	 * 	serialize this Cf50005ClearingDtX
	 */
   protected void serializeCf50005ClearingDtX(char[] cf50005ClearingDtX) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cf50005ClearingDtX,0,getStringValue(),beginCf50005ClearingDtX,CF_50005_CLEARING_DT_X_LEN);
       localCf50005ClearingDtXCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCf50005ClearingDtXConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCf50005ClearingDtX is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCf50005ClearingDtX() {	 
   		return (substring(getStringValue(),beginCf50005ClearingDtX,beginCf50005ClearingDtX + CF_50005_CLEARING_DT_X_LEN));
   	}
     int localCf50005ClearingDtNCounter = -1;
     public boolean isCf50005ClearingDtNModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCf50005ClearingDtNCounter != sharedCounter;
         localCf50005ClearingDtNCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cf50005ClearingDtN
	 *	@return cf50005ClearingDtN
	 */
	public char[]  getCf50005ClearingDtNString() {
	     return getCharArray(beginCf50005ClearingDtN,CF_50005_CLEARING_DT_N_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cf50005ClearingDtNIsNumeric() {
	    return isNumeric(beginCf50005ClearingDtN
	                    ,beginCf50005ClearingDtN + CF_50005_CLEARING_DT_N_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CF_50005_CLEARING_DT_N_LEN = 8;
  	/**
	 * serializeCf50005ClearingDtN
	 */
	protected void serializeCf50005ClearingDtN(long cf50005ClearingDtN) {
		 putNumber(beginCf50005ClearingDtN,cf50005ClearingDtN,CF_50005_CLEARING_DT_N_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCf50005ClearingDtNCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCf50005ClearingDtN
	 */
   	protected  long serializeCf50005ClearingDtN(char[] value) {
	    long  cf50005ClearingDtN;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cf50005ClearingDtN = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginCf50005ClearingDtN
		       ,8
		      );
		 localCf50005ClearingDtNCounter = shareString.getSerializedField().getModifiedCounter();
		return  cf50005ClearingDtN;
    }

   protected long checkCf50005ClearingDtNMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCf50005ClearingDtN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCf50005ClearingDtN() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCf50005ClearingDtN
			                 ,CF_50005_CLEARING_DT_N_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cf50005ClearingDtN", beginCf50005ClearingDtN,CF_50005_CLEARING_DT_N_LEN);
    }
   	}
     int localCf50005ClearingTmXCounter = -1;
     public boolean isCf50005ClearingTmXModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCf50005ClearingTmXCounter != sharedCounter;
         localCf50005ClearingTmXCounter = sharedCounter; return hasModified;
     }
	protected static final int CF_50005_CLEARING_TM_X_LEN = 2;
	/**
	 * 	serialize this Cf50005ClearingTmX
	 */
   protected void serializeCf50005ClearingTmX(char[] cf50005ClearingTmX) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cf50005ClearingTmX,0,getStringValue(),beginCf50005ClearingTmX,CF_50005_CLEARING_TM_X_LEN);
       localCf50005ClearingTmXCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCf50005ClearingTmXConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCf50005ClearingTmX is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCf50005ClearingTmX() {	 
   		return (substring(getStringValue(),beginCf50005ClearingTmX,beginCf50005ClearingTmX + CF_50005_CLEARING_TM_X_LEN));
   	}




}
  
