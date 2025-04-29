package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlu5fDateToSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rlu5fDateToSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlu5fDateToSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLU_5F_DATE_TO_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlu5fDateToMm;
            protected  int beginRlu5fDateToDd;
            protected  int beginRlu5fDateToCc;
            protected  int beginRlu5fDateToYy;
	
	/**
	* Constructor for Rlu5fDateToSerialized
	**/
    public Rlu5fDateToSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlu5fDateToSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fDateToSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlu5fDateToSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,97); // serialize this field at offset 97 by default 
    }
    
	/**
	* sets parent for this Rlu5fDateToSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 97 by default
    }    
	/**
	* initializes the field in Rlu5fDateToSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLU_5F_DATE_TO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlu5fDateToMm = getStartOffset() + 0;	// set offset for serialization
  
             beginRlu5fDateToDd = getStartOffset() + 2;	// set offset for serialization
  
             beginRlu5fDateToCc = getStartOffset() + 4;	// set offset for serialization
  
             beginRlu5fDateToYy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlu5fDateToMmCounter = -1;
     public boolean isRlu5fDateToMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fDateToMmCounter != sharedCounter;
         localRlu5fDateToMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fDateToMm
	 *	@return rlu5fDateToMm
	 */
	public char[]  getRlu5fDateToMmString() {
	     return getCharArray(beginRlu5fDateToMm,RLU_5F_DATE_TO_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fDateToMmIsNumeric() {
	    return isNumeric(beginRlu5fDateToMm
	                    ,beginRlu5fDateToMm + RLU_5F_DATE_TO_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_DATE_TO_MM_LEN = 2;
  	/**
	 * serializeRlu5fDateToMm
	 */
	protected void serializeRlu5fDateToMm(int rlu5fDateToMm) {
		 putNumber(beginRlu5fDateToMm,rlu5fDateToMm,RLU_5F_DATE_TO_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fDateToMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fDateToMm
	 */
   	protected  int serializeRlu5fDateToMm(char[] value) {
	    int  rlu5fDateToMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fDateToMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fDateToMm
		       ,2
		      );
		 localRlu5fDateToMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fDateToMm;
    }

   protected int checkRlu5fDateToMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fDateToMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fDateToMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fDateToMm
			                 ,RLU_5F_DATE_TO_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDateToMm", beginRlu5fDateToMm,RLU_5F_DATE_TO_MM_LEN);
    }
   	}
     int localRlu5fDateToDdCounter = -1;
     public boolean isRlu5fDateToDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fDateToDdCounter != sharedCounter;
         localRlu5fDateToDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fDateToDd
	 *	@return rlu5fDateToDd
	 */
	public char[]  getRlu5fDateToDdString() {
	     return getCharArray(beginRlu5fDateToDd,RLU_5F_DATE_TO_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fDateToDdIsNumeric() {
	    return isNumeric(beginRlu5fDateToDd
	                    ,beginRlu5fDateToDd + RLU_5F_DATE_TO_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_DATE_TO_DD_LEN = 2;
  	/**
	 * serializeRlu5fDateToDd
	 */
	protected void serializeRlu5fDateToDd(int rlu5fDateToDd) {
		 putNumber(beginRlu5fDateToDd,rlu5fDateToDd,RLU_5F_DATE_TO_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fDateToDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fDateToDd
	 */
   	protected  int serializeRlu5fDateToDd(char[] value) {
	    int  rlu5fDateToDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fDateToDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fDateToDd
		       ,2
		      );
		 localRlu5fDateToDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fDateToDd;
    }

   protected int checkRlu5fDateToDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fDateToDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fDateToDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fDateToDd
			                 ,RLU_5F_DATE_TO_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDateToDd", beginRlu5fDateToDd,RLU_5F_DATE_TO_DD_LEN);
    }
   	}
     int localRlu5fDateToCcCounter = -1;
     public boolean isRlu5fDateToCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fDateToCcCounter != sharedCounter;
         localRlu5fDateToCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fDateToCc
	 *	@return rlu5fDateToCc
	 */
	public char[]  getRlu5fDateToCcString() {
	     return getCharArray(beginRlu5fDateToCc,RLU_5F_DATE_TO_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fDateToCcIsNumeric() {
	    return isNumeric(beginRlu5fDateToCc
	                    ,beginRlu5fDateToCc + RLU_5F_DATE_TO_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_DATE_TO_CC_LEN = 2;
  	/**
	 * serializeRlu5fDateToCc
	 */
	protected void serializeRlu5fDateToCc(int rlu5fDateToCc) {
		 putNumber(beginRlu5fDateToCc,rlu5fDateToCc,RLU_5F_DATE_TO_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fDateToCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fDateToCc
	 */
   	protected  int serializeRlu5fDateToCc(char[] value) {
	    int  rlu5fDateToCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fDateToCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fDateToCc
		       ,2
		      );
		 localRlu5fDateToCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fDateToCc;
    }

   protected int checkRlu5fDateToCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fDateToCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fDateToCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fDateToCc
			                 ,RLU_5F_DATE_TO_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDateToCc", beginRlu5fDateToCc,RLU_5F_DATE_TO_CC_LEN);
    }
   	}
     int localRlu5fDateToYyCounter = -1;
     public boolean isRlu5fDateToYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fDateToYyCounter != sharedCounter;
         localRlu5fDateToYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fDateToYy
	 *	@return rlu5fDateToYy
	 */
	public char[]  getRlu5fDateToYyString() {
	     return getCharArray(beginRlu5fDateToYy,RLU_5F_DATE_TO_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fDateToYyIsNumeric() {
	    return isNumeric(beginRlu5fDateToYy
	                    ,beginRlu5fDateToYy + RLU_5F_DATE_TO_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_DATE_TO_YY_LEN = 2;
  	/**
	 * serializeRlu5fDateToYy
	 */
	protected void serializeRlu5fDateToYy(int rlu5fDateToYy) {
		 putNumber(beginRlu5fDateToYy,rlu5fDateToYy,RLU_5F_DATE_TO_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fDateToYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fDateToYy
	 */
   	protected  int serializeRlu5fDateToYy(char[] value) {
	    int  rlu5fDateToYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fDateToYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fDateToYy
		       ,2
		      );
		 localRlu5fDateToYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fDateToYy;
    }

   protected int checkRlu5fDateToYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fDateToYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fDateToYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fDateToYy
			                 ,RLU_5F_DATE_TO_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDateToYy", beginRlu5fDateToYy,RLU_5F_DATE_TO_YY_LEN);
    }
   	}




}
  
