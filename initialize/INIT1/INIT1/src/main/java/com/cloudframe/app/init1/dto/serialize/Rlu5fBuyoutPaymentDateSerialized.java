package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlu5fBuyoutPaymentDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rlu5fBuyoutPaymentDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlu5fBuyoutPaymentDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLU_5F_BUYOUT_PAYMENT_DATE_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlu5fBuyoutOnDateMm;
            protected  int beginRlu5fBuyoutOnDateDd;
            protected  int beginRlu5fBuyoutOnDateCc;
            protected  int beginRlu5fBuyoutOnDateYy;
	
	/**
	* Constructor for Rlu5fBuyoutPaymentDateSerialized
	**/
    public Rlu5fBuyoutPaymentDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlu5fBuyoutPaymentDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fBuyoutPaymentDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlu5fBuyoutPaymentDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1311); // serialize this field at offset 1311 by default 
    }
    
	/**
	* sets parent for this Rlu5fBuyoutPaymentDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1311 by default
    }    
	/**
	* initializes the field in Rlu5fBuyoutPaymentDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLU_5F_BUYOUT_PAYMENT_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlu5fBuyoutOnDateMm = getStartOffset() + 0;	// set offset for serialization
  
             beginRlu5fBuyoutOnDateDd = getStartOffset() + 2;	// set offset for serialization
  
             beginRlu5fBuyoutOnDateCc = getStartOffset() + 4;	// set offset for serialization
  
             beginRlu5fBuyoutOnDateYy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlu5fBuyoutOnDateMmCounter = -1;
     public boolean isRlu5fBuyoutOnDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fBuyoutOnDateMmCounter != sharedCounter;
         localRlu5fBuyoutOnDateMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fBuyoutOnDateMm
	 *	@return rlu5fBuyoutOnDateMm
	 */
	public char[]  getRlu5fBuyoutOnDateMmString() {
	     return getCharArray(beginRlu5fBuyoutOnDateMm,RLU_5F_BUYOUT_ON_DATE_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fBuyoutOnDateMmIsNumeric() {
	    return isNumeric(beginRlu5fBuyoutOnDateMm
	                    ,beginRlu5fBuyoutOnDateMm + RLU_5F_BUYOUT_ON_DATE_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_BUYOUT_ON_DATE_MM_LEN = 2;
  	/**
	 * serializeRlu5fBuyoutOnDateMm
	 */
	protected void serializeRlu5fBuyoutOnDateMm(int rlu5fBuyoutOnDateMm) {
		 putNumber(beginRlu5fBuyoutOnDateMm,rlu5fBuyoutOnDateMm,RLU_5F_BUYOUT_ON_DATE_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fBuyoutOnDateMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fBuyoutOnDateMm
	 */
   	protected  int serializeRlu5fBuyoutOnDateMm(char[] value) {
	    int  rlu5fBuyoutOnDateMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fBuyoutOnDateMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fBuyoutOnDateMm
		       ,2
		      );
		 localRlu5fBuyoutOnDateMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fBuyoutOnDateMm;
    }

   protected int checkRlu5fBuyoutOnDateMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fBuyoutOnDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fBuyoutOnDateMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fBuyoutOnDateMm
			                 ,RLU_5F_BUYOUT_ON_DATE_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fBuyoutOnDateMm", beginRlu5fBuyoutOnDateMm,RLU_5F_BUYOUT_ON_DATE_MM_LEN);
    }
   	}
     int localRlu5fBuyoutOnDateDdCounter = -1;
     public boolean isRlu5fBuyoutOnDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fBuyoutOnDateDdCounter != sharedCounter;
         localRlu5fBuyoutOnDateDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fBuyoutOnDateDd
	 *	@return rlu5fBuyoutOnDateDd
	 */
	public char[]  getRlu5fBuyoutOnDateDdString() {
	     return getCharArray(beginRlu5fBuyoutOnDateDd,RLU_5F_BUYOUT_ON_DATE_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fBuyoutOnDateDdIsNumeric() {
	    return isNumeric(beginRlu5fBuyoutOnDateDd
	                    ,beginRlu5fBuyoutOnDateDd + RLU_5F_BUYOUT_ON_DATE_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_BUYOUT_ON_DATE_DD_LEN = 2;
  	/**
	 * serializeRlu5fBuyoutOnDateDd
	 */
	protected void serializeRlu5fBuyoutOnDateDd(int rlu5fBuyoutOnDateDd) {
		 putNumber(beginRlu5fBuyoutOnDateDd,rlu5fBuyoutOnDateDd,RLU_5F_BUYOUT_ON_DATE_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fBuyoutOnDateDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fBuyoutOnDateDd
	 */
   	protected  int serializeRlu5fBuyoutOnDateDd(char[] value) {
	    int  rlu5fBuyoutOnDateDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fBuyoutOnDateDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fBuyoutOnDateDd
		       ,2
		      );
		 localRlu5fBuyoutOnDateDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fBuyoutOnDateDd;
    }

   protected int checkRlu5fBuyoutOnDateDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fBuyoutOnDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fBuyoutOnDateDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fBuyoutOnDateDd
			                 ,RLU_5F_BUYOUT_ON_DATE_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fBuyoutOnDateDd", beginRlu5fBuyoutOnDateDd,RLU_5F_BUYOUT_ON_DATE_DD_LEN);
    }
   	}
     int localRlu5fBuyoutOnDateCcCounter = -1;
     public boolean isRlu5fBuyoutOnDateCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fBuyoutOnDateCcCounter != sharedCounter;
         localRlu5fBuyoutOnDateCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fBuyoutOnDateCc
	 *	@return rlu5fBuyoutOnDateCc
	 */
	public char[]  getRlu5fBuyoutOnDateCcString() {
	     return getCharArray(beginRlu5fBuyoutOnDateCc,RLU_5F_BUYOUT_ON_DATE_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fBuyoutOnDateCcIsNumeric() {
	    return isNumeric(beginRlu5fBuyoutOnDateCc
	                    ,beginRlu5fBuyoutOnDateCc + RLU_5F_BUYOUT_ON_DATE_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_BUYOUT_ON_DATE_CC_LEN = 2;
  	/**
	 * serializeRlu5fBuyoutOnDateCc
	 */
	protected void serializeRlu5fBuyoutOnDateCc(int rlu5fBuyoutOnDateCc) {
		 putNumber(beginRlu5fBuyoutOnDateCc,rlu5fBuyoutOnDateCc,RLU_5F_BUYOUT_ON_DATE_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fBuyoutOnDateCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fBuyoutOnDateCc
	 */
   	protected  int serializeRlu5fBuyoutOnDateCc(char[] value) {
	    int  rlu5fBuyoutOnDateCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fBuyoutOnDateCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fBuyoutOnDateCc
		       ,2
		      );
		 localRlu5fBuyoutOnDateCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fBuyoutOnDateCc;
    }

   protected int checkRlu5fBuyoutOnDateCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fBuyoutOnDateCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fBuyoutOnDateCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fBuyoutOnDateCc
			                 ,RLU_5F_BUYOUT_ON_DATE_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fBuyoutOnDateCc", beginRlu5fBuyoutOnDateCc,RLU_5F_BUYOUT_ON_DATE_CC_LEN);
    }
   	}
     int localRlu5fBuyoutOnDateYyCounter = -1;
     public boolean isRlu5fBuyoutOnDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fBuyoutOnDateYyCounter != sharedCounter;
         localRlu5fBuyoutOnDateYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fBuyoutOnDateYy
	 *	@return rlu5fBuyoutOnDateYy
	 */
	public char[]  getRlu5fBuyoutOnDateYyString() {
	     return getCharArray(beginRlu5fBuyoutOnDateYy,RLU_5F_BUYOUT_ON_DATE_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fBuyoutOnDateYyIsNumeric() {
	    return isNumeric(beginRlu5fBuyoutOnDateYy
	                    ,beginRlu5fBuyoutOnDateYy + RLU_5F_BUYOUT_ON_DATE_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_BUYOUT_ON_DATE_YY_LEN = 2;
  	/**
	 * serializeRlu5fBuyoutOnDateYy
	 */
	protected void serializeRlu5fBuyoutOnDateYy(int rlu5fBuyoutOnDateYy) {
		 putNumber(beginRlu5fBuyoutOnDateYy,rlu5fBuyoutOnDateYy,RLU_5F_BUYOUT_ON_DATE_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fBuyoutOnDateYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fBuyoutOnDateYy
	 */
   	protected  int serializeRlu5fBuyoutOnDateYy(char[] value) {
	    int  rlu5fBuyoutOnDateYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fBuyoutOnDateYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fBuyoutOnDateYy
		       ,2
		      );
		 localRlu5fBuyoutOnDateYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fBuyoutOnDateYy;
    }

   protected int checkRlu5fBuyoutOnDateYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fBuyoutOnDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fBuyoutOnDateYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fBuyoutOnDateYy
			                 ,RLU_5F_BUYOUT_ON_DATE_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fBuyoutOnDateYy", beginRlu5fBuyoutOnDateYy,RLU_5F_BUYOUT_ON_DATE_YY_LEN);
    }
   	}




}
  
