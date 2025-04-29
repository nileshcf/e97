package com.cloudframe.app.ip670010.dto.serialize;

/**
*  The class CtcMmdd802Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CtcMmdd802Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CtcMmdd802Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CTC_MMDD_802_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCtcMm802;
            protected  int beginCtcDd802;
	
	/**
	* Constructor for CtcMmdd802Serialized
	**/
    public CtcMmdd802Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CtcMmdd802Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CtcMmdd802Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CtcMmdd802Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this CtcMmdd802Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in CtcMmdd802Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CTC_MMDD_802_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCtcMm802 = getStartOffset() + 0;	// set offset for serialization
  
             beginCtcDd802 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCtcMm802Counter = -1;
     public boolean isCtcMm802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCtcMm802Counter != sharedCounter;
         localCtcMm802Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ctcMm802
	 *	@return ctcMm802
	 */
	public char[]  getCtcMm802String() {
	     return getCharArray(beginCtcMm802,CTC_MM_802_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcMm802IsNumeric() {
	    return isNumeric(beginCtcMm802
	                    ,beginCtcMm802 + CTC_MM_802_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CTC_MM_802_LEN = 2;
  	/**
	 * serializeCtcMm802
	 */
	protected void serializeCtcMm802(int ctcMm802) {
		 putNumber(beginCtcMm802,ctcMm802,CTC_MM_802_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCtcMm802Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCtcMm802
	 */
   	protected  int serializeCtcMm802(char[] value) {
	    int  ctcMm802;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ctcMm802 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCtcMm802
		       ,2
		      );
		 localCtcMm802Counter = shareString.getSerializedField().getModifiedCounter();
		return  ctcMm802;
    }

   protected int checkCtcMm802MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCtcMm802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCtcMm802() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCtcMm802
			                 ,CTC_MM_802_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ctcMm802", beginCtcMm802,CTC_MM_802_LEN);
    }
   	}
     int localCtcDd802Counter = -1;
     public boolean isCtcDd802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCtcDd802Counter != sharedCounter;
         localCtcDd802Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ctcDd802
	 *	@return ctcDd802
	 */
	public char[]  getCtcDd802String() {
	     return getCharArray(beginCtcDd802,CTC_DD_802_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcDd802IsNumeric() {
	    return isNumeric(beginCtcDd802
	                    ,beginCtcDd802 + CTC_DD_802_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CTC_DD_802_LEN = 2;
  	/**
	 * serializeCtcDd802
	 */
	protected void serializeCtcDd802(int ctcDd802) {
		 putNumber(beginCtcDd802,ctcDd802,CTC_DD_802_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCtcDd802Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCtcDd802
	 */
   	protected  int serializeCtcDd802(char[] value) {
	    int  ctcDd802;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ctcDd802 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCtcDd802
		       ,2
		      );
		 localCtcDd802Counter = shareString.getSerializedField().getModifiedCounter();
		return  ctcDd802;
    }

   protected int checkCtcDd802MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCtcDd802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCtcDd802() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCtcDd802
			                 ,CTC_DD_802_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ctcDd802", beginCtcDd802,CTC_DD_802_LEN);
    }
   	}




}
  
