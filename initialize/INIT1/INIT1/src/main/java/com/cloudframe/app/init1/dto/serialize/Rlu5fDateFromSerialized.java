package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlu5fDateFromSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rlu5fDateFromSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlu5fDateFromSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLU_5F_DATE_FROM_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlu5fDateFromMm;
            protected  int beginRlu5fDateFromDd;
            protected  int beginRlu5fDateFromCc;
            protected  int beginRlu5fDateFromYy;
	
	/**
	* Constructor for Rlu5fDateFromSerialized
	**/
    public Rlu5fDateFromSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlu5fDateFromSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fDateFromSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlu5fDateFromSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,89); // serialize this field at offset 89 by default 
    }
    
	/**
	* sets parent for this Rlu5fDateFromSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 89 by default
    }    
	/**
	* initializes the field in Rlu5fDateFromSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLU_5F_DATE_FROM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlu5fDateFromMm = getStartOffset() + 0;	// set offset for serialization
  
             beginRlu5fDateFromDd = getStartOffset() + 2;	// set offset for serialization
  
             beginRlu5fDateFromCc = getStartOffset() + 4;	// set offset for serialization
  
             beginRlu5fDateFromYy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlu5fDateFromMmCounter = -1;
     public boolean isRlu5fDateFromMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fDateFromMmCounter != sharedCounter;
         localRlu5fDateFromMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fDateFromMm
	 *	@return rlu5fDateFromMm
	 */
	public char[]  getRlu5fDateFromMmString() {
	     return getCharArray(beginRlu5fDateFromMm,RLU_5F_DATE_FROM_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fDateFromMmIsNumeric() {
	    return isNumeric(beginRlu5fDateFromMm
	                    ,beginRlu5fDateFromMm + RLU_5F_DATE_FROM_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_DATE_FROM_MM_LEN = 2;
  	/**
	 * serializeRlu5fDateFromMm
	 */
	protected void serializeRlu5fDateFromMm(int rlu5fDateFromMm) {
		 putNumber(beginRlu5fDateFromMm,rlu5fDateFromMm,RLU_5F_DATE_FROM_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fDateFromMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fDateFromMm
	 */
   	protected  int serializeRlu5fDateFromMm(char[] value) {
	    int  rlu5fDateFromMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fDateFromMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fDateFromMm
		       ,2
		      );
		 localRlu5fDateFromMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fDateFromMm;
    }

   protected int checkRlu5fDateFromMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fDateFromMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fDateFromMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fDateFromMm
			                 ,RLU_5F_DATE_FROM_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDateFromMm", beginRlu5fDateFromMm,RLU_5F_DATE_FROM_MM_LEN);
    }
   	}
     int localRlu5fDateFromDdCounter = -1;
     public boolean isRlu5fDateFromDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fDateFromDdCounter != sharedCounter;
         localRlu5fDateFromDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fDateFromDd
	 *	@return rlu5fDateFromDd
	 */
	public char[]  getRlu5fDateFromDdString() {
	     return getCharArray(beginRlu5fDateFromDd,RLU_5F_DATE_FROM_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fDateFromDdIsNumeric() {
	    return isNumeric(beginRlu5fDateFromDd
	                    ,beginRlu5fDateFromDd + RLU_5F_DATE_FROM_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_DATE_FROM_DD_LEN = 2;
  	/**
	 * serializeRlu5fDateFromDd
	 */
	protected void serializeRlu5fDateFromDd(int rlu5fDateFromDd) {
		 putNumber(beginRlu5fDateFromDd,rlu5fDateFromDd,RLU_5F_DATE_FROM_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fDateFromDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fDateFromDd
	 */
   	protected  int serializeRlu5fDateFromDd(char[] value) {
	    int  rlu5fDateFromDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fDateFromDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fDateFromDd
		       ,2
		      );
		 localRlu5fDateFromDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fDateFromDd;
    }

   protected int checkRlu5fDateFromDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fDateFromDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fDateFromDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fDateFromDd
			                 ,RLU_5F_DATE_FROM_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDateFromDd", beginRlu5fDateFromDd,RLU_5F_DATE_FROM_DD_LEN);
    }
   	}
     int localRlu5fDateFromCcCounter = -1;
     public boolean isRlu5fDateFromCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fDateFromCcCounter != sharedCounter;
         localRlu5fDateFromCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fDateFromCc
	 *	@return rlu5fDateFromCc
	 */
	public char[]  getRlu5fDateFromCcString() {
	     return getCharArray(beginRlu5fDateFromCc,RLU_5F_DATE_FROM_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fDateFromCcIsNumeric() {
	    return isNumeric(beginRlu5fDateFromCc
	                    ,beginRlu5fDateFromCc + RLU_5F_DATE_FROM_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_DATE_FROM_CC_LEN = 2;
  	/**
	 * serializeRlu5fDateFromCc
	 */
	protected void serializeRlu5fDateFromCc(int rlu5fDateFromCc) {
		 putNumber(beginRlu5fDateFromCc,rlu5fDateFromCc,RLU_5F_DATE_FROM_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fDateFromCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fDateFromCc
	 */
   	protected  int serializeRlu5fDateFromCc(char[] value) {
	    int  rlu5fDateFromCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fDateFromCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fDateFromCc
		       ,2
		      );
		 localRlu5fDateFromCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fDateFromCc;
    }

   protected int checkRlu5fDateFromCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fDateFromCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fDateFromCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fDateFromCc
			                 ,RLU_5F_DATE_FROM_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDateFromCc", beginRlu5fDateFromCc,RLU_5F_DATE_FROM_CC_LEN);
    }
   	}
     int localRlu5fDateFromYyCounter = -1;
     public boolean isRlu5fDateFromYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fDateFromYyCounter != sharedCounter;
         localRlu5fDateFromYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fDateFromYy
	 *	@return rlu5fDateFromYy
	 */
	public char[]  getRlu5fDateFromYyString() {
	     return getCharArray(beginRlu5fDateFromYy,RLU_5F_DATE_FROM_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fDateFromYyIsNumeric() {
	    return isNumeric(beginRlu5fDateFromYy
	                    ,beginRlu5fDateFromYy + RLU_5F_DATE_FROM_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_DATE_FROM_YY_LEN = 2;
  	/**
	 * serializeRlu5fDateFromYy
	 */
	protected void serializeRlu5fDateFromYy(int rlu5fDateFromYy) {
		 putNumber(beginRlu5fDateFromYy,rlu5fDateFromYy,RLU_5F_DATE_FROM_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fDateFromYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fDateFromYy
	 */
   	protected  int serializeRlu5fDateFromYy(char[] value) {
	    int  rlu5fDateFromYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fDateFromYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fDateFromYy
		       ,2
		      );
		 localRlu5fDateFromYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fDateFromYy;
    }

   protected int checkRlu5fDateFromYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fDateFromYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fDateFromYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fDateFromYy
			                 ,RLU_5F_DATE_FROM_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDateFromYy", beginRlu5fDateFromYy,RLU_5F_DATE_FROM_YY_LEN);
    }
   	}




}
  
