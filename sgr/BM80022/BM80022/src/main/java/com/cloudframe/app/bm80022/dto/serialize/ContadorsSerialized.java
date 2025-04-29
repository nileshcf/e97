package com.cloudframe.app.bm80022.dto.serialize;

/**
*  The class ContadorsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ContadorsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ContadorsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CONTADORS_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLlegitsGe1801;
            protected  int beginGravatsGe0001w;
	
	/**
	* Constructor for ContadorsSerialized
	**/
    public ContadorsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ContadorsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CONTADORS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLlegitsGe1801 = getStartOffset() + 0;	// set offset for serialization
  
             beginGravatsGe0001w = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLlegitsGe1801Counter = -1;
     public boolean isLlegitsGe1801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLlegitsGe1801Counter != sharedCounter;
         localLlegitsGe1801Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of llegitsGe1801
	 *	@return llegitsGe1801
	 */
	public char[]  getLlegitsGe1801String() {
	     return getCharArray(beginLlegitsGe1801,LLEGITS_GE_1801_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean llegitsGe1801IsNumeric() {
	    return isNumeric(beginLlegitsGe1801
	                    ,beginLlegitsGe1801 + LLEGITS_GE_1801_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LLEGITS_GE_1801_LEN = 9;
  	/**
	 * serializeLlegitsGe1801
	 */
	protected void serializeLlegitsGe1801(long llegitsGe1801) {
		 putNumber(beginLlegitsGe1801,llegitsGe1801,LLEGITS_GE_1801_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLlegitsGe1801Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLlegitsGe1801
	 */
   	protected  long serializeLlegitsGe1801(char[] value) {
	    long  llegitsGe1801;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    llegitsGe1801 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginLlegitsGe1801
		       ,9
		      );
		 localLlegitsGe1801Counter = shareString.getSerializedField().getModifiedCounter();
		return  llegitsGe1801;
    }

   protected long checkLlegitsGe1801MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLlegitsGe1801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLlegitsGe1801() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginLlegitsGe1801
			                 ,LLEGITS_GE_1801_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("llegitsGe1801", beginLlegitsGe1801,LLEGITS_GE_1801_LEN);
    }
   	}
     int localGravatsGe0001wCounter = -1;
     public boolean isGravatsGe0001wModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGravatsGe0001wCounter != sharedCounter;
         localGravatsGe0001wCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of gravatsGe0001w
	 *	@return gravatsGe0001w
	 */
	public char[]  getGravatsGe0001wString() {
	     return getCharArray(beginGravatsGe0001w,GRAVATS_GE_0001W_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gravatsGe0001wIsNumeric() {
	    return isNumeric(beginGravatsGe0001w
	                    ,beginGravatsGe0001w + GRAVATS_GE_0001W_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int GRAVATS_GE_0001W_LEN = 9;
  	/**
	 * serializeGravatsGe0001w
	 */
	protected void serializeGravatsGe0001w(long gravatsGe0001w) {
		 putNumber(beginGravatsGe0001w,gravatsGe0001w,GRAVATS_GE_0001W_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localGravatsGe0001wCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeGravatsGe0001w
	 */
   	protected  long serializeGravatsGe0001w(char[] value) {
	    long  gravatsGe0001w;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    gravatsGe0001w = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginGravatsGe0001w
		       ,9
		      );
		 localGravatsGe0001wCounter = shareString.getSerializedField().getModifiedCounter();
		return  gravatsGe0001w;
    }

   protected long checkGravatsGe0001wMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshGravatsGe0001w is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshGravatsGe0001w() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginGravatsGe0001w
			                 ,GRAVATS_GE_0001W_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("gravatsGe0001w", beginGravatsGe0001w,GRAVATS_GE_0001W_LEN);
    }
   	}




}
  
