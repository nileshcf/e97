package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlu5fCellcryptTransactionRdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rlu5fCellcryptTransactionRdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlu5fCellcryptTransactionRdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLU_5F_CELLCRYPT_TRANSACTION_RD_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlu5fCellcryptTransactionMm;
            protected  int beginRlu5fCellcryptTransactionDd;
            protected  int beginRlu5fCellcryptTransactionCc;
            protected  int beginRlu5fCellcryptTransactionYy;
	
	/**
	* Constructor for Rlu5fCellcryptTransactionRdSerialized
	**/
    public Rlu5fCellcryptTransactionRdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlu5fCellcryptTransactionRdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fCellcryptTransactionRdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlu5fCellcryptTransactionRdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,665); // serialize this field at offset 665 by default 
    }
    
	/**
	* sets parent for this Rlu5fCellcryptTransactionRdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 665 by default
    }    
	/**
	* initializes the field in Rlu5fCellcryptTransactionRdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLU_5F_CELLCRYPT_TRANSACTION_RD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlu5fCellcryptTransactionMm = getStartOffset() + 0;	// set offset for serialization
  
             beginRlu5fCellcryptTransactionDd = getStartOffset() + 2;	// set offset for serialization
  
             beginRlu5fCellcryptTransactionCc = getStartOffset() + 4;	// set offset for serialization
  
             beginRlu5fCellcryptTransactionYy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlu5fCellcryptTransactionMmCounter = -1;
     public boolean isRlu5fCellcryptTransactionMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCellcryptTransactionMmCounter != sharedCounter;
         localRlu5fCellcryptTransactionMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fCellcryptTransactionMm
	 *	@return rlu5fCellcryptTransactionMm
	 */
	public char[]  getRlu5fCellcryptTransactionMmString() {
	     return getCharArray(beginRlu5fCellcryptTransactionMm,RLU_5F_CELLCRYPT_TRANSACTION_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fCellcryptTransactionMmIsNumeric() {
	    return isNumeric(beginRlu5fCellcryptTransactionMm
	                    ,beginRlu5fCellcryptTransactionMm + RLU_5F_CELLCRYPT_TRANSACTION_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_CELLCRYPT_TRANSACTION_MM_LEN = 2;
  	/**
	 * serializeRlu5fCellcryptTransactionMm
	 */
	protected void serializeRlu5fCellcryptTransactionMm(int rlu5fCellcryptTransactionMm) {
		 putNumber(beginRlu5fCellcryptTransactionMm,rlu5fCellcryptTransactionMm,RLU_5F_CELLCRYPT_TRANSACTION_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fCellcryptTransactionMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fCellcryptTransactionMm
	 */
   	protected  int serializeRlu5fCellcryptTransactionMm(char[] value) {
	    int  rlu5fCellcryptTransactionMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fCellcryptTransactionMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fCellcryptTransactionMm
		       ,2
		      );
		 localRlu5fCellcryptTransactionMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fCellcryptTransactionMm;
    }

   protected int checkRlu5fCellcryptTransactionMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fCellcryptTransactionMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fCellcryptTransactionMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fCellcryptTransactionMm
			                 ,RLU_5F_CELLCRYPT_TRANSACTION_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fCellcryptTransactionMm", beginRlu5fCellcryptTransactionMm,RLU_5F_CELLCRYPT_TRANSACTION_MM_LEN);
    }
   	}
     int localRlu5fCellcryptTransactionDdCounter = -1;
     public boolean isRlu5fCellcryptTransactionDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCellcryptTransactionDdCounter != sharedCounter;
         localRlu5fCellcryptTransactionDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fCellcryptTransactionDd
	 *	@return rlu5fCellcryptTransactionDd
	 */
	public char[]  getRlu5fCellcryptTransactionDdString() {
	     return getCharArray(beginRlu5fCellcryptTransactionDd,RLU_5F_CELLCRYPT_TRANSACTION_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fCellcryptTransactionDdIsNumeric() {
	    return isNumeric(beginRlu5fCellcryptTransactionDd
	                    ,beginRlu5fCellcryptTransactionDd + RLU_5F_CELLCRYPT_TRANSACTION_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_CELLCRYPT_TRANSACTION_DD_LEN = 2;
  	/**
	 * serializeRlu5fCellcryptTransactionDd
	 */
	protected void serializeRlu5fCellcryptTransactionDd(int rlu5fCellcryptTransactionDd) {
		 putNumber(beginRlu5fCellcryptTransactionDd,rlu5fCellcryptTransactionDd,RLU_5F_CELLCRYPT_TRANSACTION_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fCellcryptTransactionDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fCellcryptTransactionDd
	 */
   	protected  int serializeRlu5fCellcryptTransactionDd(char[] value) {
	    int  rlu5fCellcryptTransactionDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fCellcryptTransactionDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fCellcryptTransactionDd
		       ,2
		      );
		 localRlu5fCellcryptTransactionDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fCellcryptTransactionDd;
    }

   protected int checkRlu5fCellcryptTransactionDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fCellcryptTransactionDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fCellcryptTransactionDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fCellcryptTransactionDd
			                 ,RLU_5F_CELLCRYPT_TRANSACTION_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fCellcryptTransactionDd", beginRlu5fCellcryptTransactionDd,RLU_5F_CELLCRYPT_TRANSACTION_DD_LEN);
    }
   	}
     int localRlu5fCellcryptTransactionCcCounter = -1;
     public boolean isRlu5fCellcryptTransactionCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCellcryptTransactionCcCounter != sharedCounter;
         localRlu5fCellcryptTransactionCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fCellcryptTransactionCc
	 *	@return rlu5fCellcryptTransactionCc
	 */
	public char[]  getRlu5fCellcryptTransactionCcString() {
	     return getCharArray(beginRlu5fCellcryptTransactionCc,RLU_5F_CELLCRYPT_TRANSACTION_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fCellcryptTransactionCcIsNumeric() {
	    return isNumeric(beginRlu5fCellcryptTransactionCc
	                    ,beginRlu5fCellcryptTransactionCc + RLU_5F_CELLCRYPT_TRANSACTION_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_CELLCRYPT_TRANSACTION_CC_LEN = 2;
  	/**
	 * serializeRlu5fCellcryptTransactionCc
	 */
	protected void serializeRlu5fCellcryptTransactionCc(int rlu5fCellcryptTransactionCc) {
		 putNumber(beginRlu5fCellcryptTransactionCc,rlu5fCellcryptTransactionCc,RLU_5F_CELLCRYPT_TRANSACTION_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fCellcryptTransactionCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fCellcryptTransactionCc
	 */
   	protected  int serializeRlu5fCellcryptTransactionCc(char[] value) {
	    int  rlu5fCellcryptTransactionCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fCellcryptTransactionCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fCellcryptTransactionCc
		       ,2
		      );
		 localRlu5fCellcryptTransactionCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fCellcryptTransactionCc;
    }

   protected int checkRlu5fCellcryptTransactionCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fCellcryptTransactionCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fCellcryptTransactionCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fCellcryptTransactionCc
			                 ,RLU_5F_CELLCRYPT_TRANSACTION_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fCellcryptTransactionCc", beginRlu5fCellcryptTransactionCc,RLU_5F_CELLCRYPT_TRANSACTION_CC_LEN);
    }
   	}
     int localRlu5fCellcryptTransactionYyCounter = -1;
     public boolean isRlu5fCellcryptTransactionYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCellcryptTransactionYyCounter != sharedCounter;
         localRlu5fCellcryptTransactionYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fCellcryptTransactionYy
	 *	@return rlu5fCellcryptTransactionYy
	 */
	public char[]  getRlu5fCellcryptTransactionYyString() {
	     return getCharArray(beginRlu5fCellcryptTransactionYy,RLU_5F_CELLCRYPT_TRANSACTION_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fCellcryptTransactionYyIsNumeric() {
	    return isNumeric(beginRlu5fCellcryptTransactionYy
	                    ,beginRlu5fCellcryptTransactionYy + RLU_5F_CELLCRYPT_TRANSACTION_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_CELLCRYPT_TRANSACTION_YY_LEN = 2;
  	/**
	 * serializeRlu5fCellcryptTransactionYy
	 */
	protected void serializeRlu5fCellcryptTransactionYy(int rlu5fCellcryptTransactionYy) {
		 putNumber(beginRlu5fCellcryptTransactionYy,rlu5fCellcryptTransactionYy,RLU_5F_CELLCRYPT_TRANSACTION_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fCellcryptTransactionYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fCellcryptTransactionYy
	 */
   	protected  int serializeRlu5fCellcryptTransactionYy(char[] value) {
	    int  rlu5fCellcryptTransactionYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fCellcryptTransactionYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fCellcryptTransactionYy
		       ,2
		      );
		 localRlu5fCellcryptTransactionYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fCellcryptTransactionYy;
    }

   protected int checkRlu5fCellcryptTransactionYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fCellcryptTransactionYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fCellcryptTransactionYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fCellcryptTransactionYy
			                 ,RLU_5F_CELLCRYPT_TRANSACTION_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fCellcryptTransactionYy", beginRlu5fCellcryptTransactionYy,RLU_5F_CELLCRYPT_TRANSACTION_YY_LEN);
    }
   	}




}
  
