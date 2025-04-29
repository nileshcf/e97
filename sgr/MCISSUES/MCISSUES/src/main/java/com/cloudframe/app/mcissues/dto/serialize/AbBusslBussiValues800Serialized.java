package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class AbBusslBussiValues800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AbBusslBussiValues800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AbBusslBussiValues800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AB_BUSSL_BUSSI_VALUES_800_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAb800;
            protected  int beginBussl800;
            protected  int beginBussi800;
	
	/**
	* Constructor for AbBusslBussiValues800Serialized
	**/
    public AbBusslBussiValues800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AbBusslBussiValues800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AB_BUSSL_BUSSI_VALUES_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAb800 = getStartOffset() + 0;	// set offset for serialization
  
             beginBussl800 = getStartOffset() + 3;	// set offset for serialization
  
             beginBussi800 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAb800Counter = -1;
     public boolean isAb800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAb800Counter != sharedCounter;
         localAb800Counter = sharedCounter; return hasModified;
     }
	protected static final int AB_800_LEN = 3;
	/**
	 * 	serialize this Ab800
	 */
   protected void serializeAb800(char[] ab800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ab800,0,getStringValue(),beginAb800,AB_800_LEN);
       localAb800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAb800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshAb800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAb800() {	 
   		return (substring(getStringValue(),beginAb800,beginAb800 + AB_800_LEN));
   	}
     int localBussl800Counter = -1;
     public boolean isBussl800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBussl800Counter != sharedCounter;
         localBussl800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bussl800
	 *	@return bussl800
	 */
	public char[]  getBussl800String() {
	     return getCharArray(beginBussl800,BUSSL_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bussl800IsNumeric() {
	    return isNumeric(beginBussl800
	                    ,beginBussl800 + BUSSL_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BUSSL_800_LEN = 1;
  	/**
	 * serializeBussl800
	 */
	protected void serializeBussl800(int bussl800) {
		 putNumber(beginBussl800,bussl800,BUSSL_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBussl800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBussl800
	 */
   	protected  int serializeBussl800(char[] value) {
	    int  bussl800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bussl800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBussl800
		       ,1
		      );
		 localBussl800Counter = shareString.getSerializedField().getModifiedCounter();
		return  bussl800;
    }

   protected int checkBussl800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBussl800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBussl800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBussl800
			                 ,BUSSL_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bussl800", beginBussl800,BUSSL_800_LEN);
    }
   	}
     int localBussi800Counter = -1;
     public boolean isBussi800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBussi800Counter != sharedCounter;
         localBussi800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bussi800
	 *	@return bussi800
	 */
	public char[]  getBussi800String() {
	     return getCharArray(beginBussi800,BUSSI_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bussi800IsNumeric() {
	    return isNumeric(beginBussi800
	                    ,beginBussi800 + BUSSI_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BUSSI_800_LEN = 1;
  	/**
	 * serializeBussi800
	 */
	protected void serializeBussi800(int bussi800) {
		 putNumber(beginBussi800,bussi800,BUSSI_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBussi800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBussi800
	 */
   	protected  int serializeBussi800(char[] value) {
	    int  bussi800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bussi800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBussi800
		       ,1
		      );
		 localBussi800Counter = shareString.getSerializedField().getModifiedCounter();
		return  bussi800;
    }

   protected int checkBussi800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBussi800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBussi800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBussi800
			                 ,BUSSI_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bussi800", beginBussi800,BUSSI_800_LEN);
    }
   	}




}
  
