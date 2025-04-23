package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class EvenValue800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EvenValue800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EvenValue800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EVEN_VALUE_800_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEvenMsb800;
            protected  int beginEvenLsb800;
	
	/**
	* Constructor for EvenValue800Serialized
	**/
    public EvenValue800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for EvenValue800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EvenValue800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this EvenValue800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1302); // serialize this field at offset 1302 by default 
    }
    
	/**
	* sets parent for this EvenValue800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1302 by default
    }    
	/**
	* initializes the field in EvenValue800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EVEN_VALUE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEvenMsb800 = getStartOffset() + 0;	// set offset for serialization
  
             beginEvenLsb800 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEvenMsb800Counter = -1;
     public boolean isEvenMsb800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEvenMsb800Counter != sharedCounter;
         localEvenMsb800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of evenMsb800
	 *	@return evenMsb800
	 */
	public char[]  getEvenMsb800String() {
	     return getCharArray(beginEvenMsb800,EVEN_MSB_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean evenMsb800IsNumeric() {
	    return isNumeric(beginEvenMsb800
	                    ,beginEvenMsb800 + EVEN_MSB_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EVEN_MSB_800_LEN = 1;
  	/**
	 * serializeEvenMsb800
	 */
	protected void serializeEvenMsb800(int evenMsb800) {
		 putNumber(beginEvenMsb800,evenMsb800,EVEN_MSB_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEvenMsb800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEvenMsb800
	 */
   	protected  int serializeEvenMsb800(char[] value) {
	    int  evenMsb800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    evenMsb800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginEvenMsb800
		       ,1
		      );
		 localEvenMsb800Counter = shareString.getSerializedField().getModifiedCounter();
		return  evenMsb800;
    }

   protected int checkEvenMsb800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEvenMsb800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEvenMsb800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginEvenMsb800
			                 ,EVEN_MSB_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("evenMsb800", beginEvenMsb800,EVEN_MSB_800_LEN);
    }
   	}
     int localEvenLsb800Counter = -1;
     public boolean isEvenLsb800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEvenLsb800Counter != sharedCounter;
         localEvenLsb800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of evenLsb800
	 *	@return evenLsb800
	 */
	public char[]  getEvenLsb800String() {
	     return getCharArray(beginEvenLsb800,EVEN_LSB_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean evenLsb800IsNumeric() {
	    return isNumeric(beginEvenLsb800
	                    ,beginEvenLsb800 + EVEN_LSB_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EVEN_LSB_800_LEN = 1;
  	/**
	 * serializeEvenLsb800
	 */
	protected void serializeEvenLsb800(int evenLsb800) {
		 putNumber(beginEvenLsb800,evenLsb800,EVEN_LSB_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEvenLsb800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEvenLsb800
	 */
   	protected  int serializeEvenLsb800(char[] value) {
	    int  evenLsb800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    evenLsb800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginEvenLsb800
		       ,1
		      );
		 localEvenLsb800Counter = shareString.getSerializedField().getModifiedCounter();
		return  evenLsb800;
    }

   protected int checkEvenLsb800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEvenLsb800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEvenLsb800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginEvenLsb800
			                 ,EVEN_LSB_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("evenLsb800", beginEvenLsb800,EVEN_LSB_800_LEN);
    }
   	}




}
  
