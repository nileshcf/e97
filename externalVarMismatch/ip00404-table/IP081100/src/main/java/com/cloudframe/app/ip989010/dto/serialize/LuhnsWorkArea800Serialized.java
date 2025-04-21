package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class LuhnsWorkArea800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LuhnsWorkArea800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LuhnsWorkArea800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LUHNS_WORK_AREA_800_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEvenValueDoubled800;
            protected  int beginCurrentByte800;
            protected  int beginOddEvenTotal800;
	
	/**
	* Constructor for LuhnsWorkArea800Serialized
	**/
    public LuhnsWorkArea800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for LuhnsWorkArea800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LuhnsWorkArea800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this LuhnsWorkArea800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1302); // serialize this field at offset 1302 by default 
    }
    
	/**
	* sets parent for this LuhnsWorkArea800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1302 by default
    }    
	/**
	* initializes the field in LuhnsWorkArea800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LUHNS_WORK_AREA_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEvenValueDoubled800 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginCurrentByte800 = getStartOffset() + 2;	// set offset for serialization
  
             beginOddEvenTotal800 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEvenValueDoubled800Counter = -1;
     public boolean isEvenValueDoubled800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEvenValueDoubled800Counter != sharedCounter;
         localEvenValueDoubled800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of evenValueDoubled800
	 *	@return evenValueDoubled800
	 */
	public char[]  getEvenValueDoubled800String() {
	     return getCharArray(beginEvenValueDoubled800,EVEN_VALUE_DOUBLED_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean evenValueDoubled800IsNumeric() {
	    return isNumeric(beginEvenValueDoubled800
	                    ,beginEvenValueDoubled800 + EVEN_VALUE_DOUBLED_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EVEN_VALUE_DOUBLED_800_LEN = 2;
  	/**
	 * serializeEvenValueDoubled800
	 */
	protected void serializeEvenValueDoubled800(int evenValueDoubled800) {
		 putNumber(beginEvenValueDoubled800,evenValueDoubled800,EVEN_VALUE_DOUBLED_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEvenValueDoubled800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEvenValueDoubled800
	 */
   	protected  int serializeEvenValueDoubled800(char[] value) {
	    int  evenValueDoubled800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    evenValueDoubled800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginEvenValueDoubled800
		       ,2
		      );
		 localEvenValueDoubled800Counter = shareString.getSerializedField().getModifiedCounter();
		return  evenValueDoubled800;
    }

   protected int checkEvenValueDoubled800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEvenValueDoubled800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEvenValueDoubled800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginEvenValueDoubled800
			                 ,EVEN_VALUE_DOUBLED_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("evenValueDoubled800", beginEvenValueDoubled800,EVEN_VALUE_DOUBLED_800_LEN);
    }
   	}
     int localCurrentByte800Counter = -1;
     public boolean isCurrentByte800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentByte800Counter != sharedCounter;
         localCurrentByte800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of currentByte800
	 *	@return currentByte800
	 */
	public char[]  getCurrentByte800String() {
	     return getCharArray(beginCurrentByte800,CURRENT_BYTE_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean currentByte800IsNumeric() {
	    return isNumeric(beginCurrentByte800
	                    ,beginCurrentByte800 + CURRENT_BYTE_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CURRENT_BYTE_800_LEN = 1;
  	/**
	 * serializeCurrentByte800
	 */
	protected void serializeCurrentByte800(int currentByte800) {
		 putNumber(beginCurrentByte800,currentByte800,CURRENT_BYTE_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurrentByte800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurrentByte800
	 */
   	protected  int serializeCurrentByte800(char[] value) {
	    int  currentByte800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    currentByte800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginCurrentByte800
		       ,1
		      );
		 localCurrentByte800Counter = shareString.getSerializedField().getModifiedCounter();
		return  currentByte800;
    }

   protected int checkCurrentByte800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurrentByte800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCurrentByte800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCurrentByte800
			                 ,CURRENT_BYTE_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("currentByte800", beginCurrentByte800,CURRENT_BYTE_800_LEN);
    }
   	}
     int localOddEvenTotal800Counter = -1;
     public boolean isOddEvenTotal800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOddEvenTotal800Counter != sharedCounter;
         localOddEvenTotal800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of oddEvenTotal800
	 *	@return oddEvenTotal800
	 */
	public char[]  getOddEvenTotal800String() {
	     return getCharArray(beginOddEvenTotal800,ODD_EVEN_TOTAL_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean oddEvenTotal800IsNumeric() {
	    return isNumeric(beginOddEvenTotal800
	                    ,beginOddEvenTotal800 + ODD_EVEN_TOTAL_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ODD_EVEN_TOTAL_800_LEN = 3;
  	/**
	 * serializeOddEvenTotal800
	 */
	protected void serializeOddEvenTotal800(int oddEvenTotal800) {
		 putNumber(beginOddEvenTotal800,oddEvenTotal800,ODD_EVEN_TOTAL_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOddEvenTotal800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOddEvenTotal800
	 */
   	protected  int serializeOddEvenTotal800(char[] value) {
	    int  oddEvenTotal800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    oddEvenTotal800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginOddEvenTotal800
		       ,3
		      );
		 localOddEvenTotal800Counter = shareString.getSerializedField().getModifiedCounter();
		return  oddEvenTotal800;
    }

   protected int checkOddEvenTotal800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOddEvenTotal800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOddEvenTotal800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOddEvenTotal800
			                 ,ODD_EVEN_TOTAL_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("oddEvenTotal800", beginOddEvenTotal800,ODD_EVEN_TOTAL_800_LEN);
    }
   	}




}
  
