package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlu5fCellcryptRenewalRedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rlu5fCellcryptRenewalRedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlu5fCellcryptRenewalRedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLU_5F_CELLCRYPT_RENEWAL_RED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlu5fCellcryptRenewalMm;
            protected  int beginRlu5fCellcryptRenewalDd;
            protected  int beginRlu5fCellcryptRenewalCc;
            protected  int beginRlu5fCellcryptRenewalYy;
	
	/**
	* Constructor for Rlu5fCellcryptRenewalRedSerialized
	**/
    public Rlu5fCellcryptRenewalRedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlu5fCellcryptRenewalRedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fCellcryptRenewalRedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlu5fCellcryptRenewalRedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,650); // serialize this field at offset 650 by default 
    }
    
	/**
	* sets parent for this Rlu5fCellcryptRenewalRedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 650 by default
    }    
	/**
	* initializes the field in Rlu5fCellcryptRenewalRedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLU_5F_CELLCRYPT_RENEWAL_RED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlu5fCellcryptRenewalMm = getStartOffset() + 0;	// set offset for serialization
  
             beginRlu5fCellcryptRenewalDd = getStartOffset() + 2;	// set offset for serialization
  
             beginRlu5fCellcryptRenewalCc = getStartOffset() + 4;	// set offset for serialization
  
             beginRlu5fCellcryptRenewalYy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlu5fCellcryptRenewalMmCounter = -1;
     public boolean isRlu5fCellcryptRenewalMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCellcryptRenewalMmCounter != sharedCounter;
         localRlu5fCellcryptRenewalMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fCellcryptRenewalMm
	 *	@return rlu5fCellcryptRenewalMm
	 */
	public char[]  getRlu5fCellcryptRenewalMmString() {
	     return getCharArray(beginRlu5fCellcryptRenewalMm,RLU_5F_CELLCRYPT_RENEWAL_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fCellcryptRenewalMmIsNumeric() {
	    return isNumeric(beginRlu5fCellcryptRenewalMm
	                    ,beginRlu5fCellcryptRenewalMm + RLU_5F_CELLCRYPT_RENEWAL_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_CELLCRYPT_RENEWAL_MM_LEN = 2;
  	/**
	 * serializeRlu5fCellcryptRenewalMm
	 */
	protected void serializeRlu5fCellcryptRenewalMm(int rlu5fCellcryptRenewalMm) {
		 putNumber(beginRlu5fCellcryptRenewalMm,rlu5fCellcryptRenewalMm,RLU_5F_CELLCRYPT_RENEWAL_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fCellcryptRenewalMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fCellcryptRenewalMm
	 */
   	protected  int serializeRlu5fCellcryptRenewalMm(char[] value) {
	    int  rlu5fCellcryptRenewalMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fCellcryptRenewalMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fCellcryptRenewalMm
		       ,2
		      );
		 localRlu5fCellcryptRenewalMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fCellcryptRenewalMm;
    }

   protected int checkRlu5fCellcryptRenewalMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fCellcryptRenewalMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fCellcryptRenewalMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fCellcryptRenewalMm
			                 ,RLU_5F_CELLCRYPT_RENEWAL_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fCellcryptRenewalMm", beginRlu5fCellcryptRenewalMm,RLU_5F_CELLCRYPT_RENEWAL_MM_LEN);
    }
   	}
     int localRlu5fCellcryptRenewalDdCounter = -1;
     public boolean isRlu5fCellcryptRenewalDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCellcryptRenewalDdCounter != sharedCounter;
         localRlu5fCellcryptRenewalDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fCellcryptRenewalDd
	 *	@return rlu5fCellcryptRenewalDd
	 */
	public char[]  getRlu5fCellcryptRenewalDdString() {
	     return getCharArray(beginRlu5fCellcryptRenewalDd,RLU_5F_CELLCRYPT_RENEWAL_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fCellcryptRenewalDdIsNumeric() {
	    return isNumeric(beginRlu5fCellcryptRenewalDd
	                    ,beginRlu5fCellcryptRenewalDd + RLU_5F_CELLCRYPT_RENEWAL_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_CELLCRYPT_RENEWAL_DD_LEN = 2;
  	/**
	 * serializeRlu5fCellcryptRenewalDd
	 */
	protected void serializeRlu5fCellcryptRenewalDd(int rlu5fCellcryptRenewalDd) {
		 putNumber(beginRlu5fCellcryptRenewalDd,rlu5fCellcryptRenewalDd,RLU_5F_CELLCRYPT_RENEWAL_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fCellcryptRenewalDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fCellcryptRenewalDd
	 */
   	protected  int serializeRlu5fCellcryptRenewalDd(char[] value) {
	    int  rlu5fCellcryptRenewalDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fCellcryptRenewalDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fCellcryptRenewalDd
		       ,2
		      );
		 localRlu5fCellcryptRenewalDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fCellcryptRenewalDd;
    }

   protected int checkRlu5fCellcryptRenewalDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fCellcryptRenewalDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fCellcryptRenewalDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fCellcryptRenewalDd
			                 ,RLU_5F_CELLCRYPT_RENEWAL_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fCellcryptRenewalDd", beginRlu5fCellcryptRenewalDd,RLU_5F_CELLCRYPT_RENEWAL_DD_LEN);
    }
   	}
     int localRlu5fCellcryptRenewalCcCounter = -1;
     public boolean isRlu5fCellcryptRenewalCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCellcryptRenewalCcCounter != sharedCounter;
         localRlu5fCellcryptRenewalCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fCellcryptRenewalCc
	 *	@return rlu5fCellcryptRenewalCc
	 */
	public char[]  getRlu5fCellcryptRenewalCcString() {
	     return getCharArray(beginRlu5fCellcryptRenewalCc,RLU_5F_CELLCRYPT_RENEWAL_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fCellcryptRenewalCcIsNumeric() {
	    return isNumeric(beginRlu5fCellcryptRenewalCc
	                    ,beginRlu5fCellcryptRenewalCc + RLU_5F_CELLCRYPT_RENEWAL_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_CELLCRYPT_RENEWAL_CC_LEN = 2;
  	/**
	 * serializeRlu5fCellcryptRenewalCc
	 */
	protected void serializeRlu5fCellcryptRenewalCc(int rlu5fCellcryptRenewalCc) {
		 putNumber(beginRlu5fCellcryptRenewalCc,rlu5fCellcryptRenewalCc,RLU_5F_CELLCRYPT_RENEWAL_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fCellcryptRenewalCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fCellcryptRenewalCc
	 */
   	protected  int serializeRlu5fCellcryptRenewalCc(char[] value) {
	    int  rlu5fCellcryptRenewalCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fCellcryptRenewalCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fCellcryptRenewalCc
		       ,2
		      );
		 localRlu5fCellcryptRenewalCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fCellcryptRenewalCc;
    }

   protected int checkRlu5fCellcryptRenewalCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fCellcryptRenewalCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fCellcryptRenewalCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fCellcryptRenewalCc
			                 ,RLU_5F_CELLCRYPT_RENEWAL_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fCellcryptRenewalCc", beginRlu5fCellcryptRenewalCc,RLU_5F_CELLCRYPT_RENEWAL_CC_LEN);
    }
   	}
     int localRlu5fCellcryptRenewalYyCounter = -1;
     public boolean isRlu5fCellcryptRenewalYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCellcryptRenewalYyCounter != sharedCounter;
         localRlu5fCellcryptRenewalYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fCellcryptRenewalYy
	 *	@return rlu5fCellcryptRenewalYy
	 */
	public char[]  getRlu5fCellcryptRenewalYyString() {
	     return getCharArray(beginRlu5fCellcryptRenewalYy,RLU_5F_CELLCRYPT_RENEWAL_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fCellcryptRenewalYyIsNumeric() {
	    return isNumeric(beginRlu5fCellcryptRenewalYy
	                    ,beginRlu5fCellcryptRenewalYy + RLU_5F_CELLCRYPT_RENEWAL_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_CELLCRYPT_RENEWAL_YY_LEN = 2;
  	/**
	 * serializeRlu5fCellcryptRenewalYy
	 */
	protected void serializeRlu5fCellcryptRenewalYy(int rlu5fCellcryptRenewalYy) {
		 putNumber(beginRlu5fCellcryptRenewalYy,rlu5fCellcryptRenewalYy,RLU_5F_CELLCRYPT_RENEWAL_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fCellcryptRenewalYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fCellcryptRenewalYy
	 */
   	protected  int serializeRlu5fCellcryptRenewalYy(char[] value) {
	    int  rlu5fCellcryptRenewalYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fCellcryptRenewalYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fCellcryptRenewalYy
		       ,2
		      );
		 localRlu5fCellcryptRenewalYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fCellcryptRenewalYy;
    }

   protected int checkRlu5fCellcryptRenewalYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fCellcryptRenewalYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fCellcryptRenewalYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fCellcryptRenewalYy
			                 ,RLU_5F_CELLCRYPT_RENEWAL_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fCellcryptRenewalYy", beginRlu5fCellcryptRenewalYy,RLU_5F_CELLCRYPT_RENEWAL_YY_LEN);
    }
   	}




}
  
