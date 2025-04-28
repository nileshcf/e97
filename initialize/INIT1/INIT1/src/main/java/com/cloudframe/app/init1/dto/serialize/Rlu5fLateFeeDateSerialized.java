package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlu5fLateFeeDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rlu5fLateFeeDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlu5fLateFeeDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLU_5F_LATE_FEE_DATE_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlu5fLateFeeDateMm;
            protected  int beginRlu5fLateFeeDateDd;
            protected  int beginRlu5fLateFeeDateCc;
            protected  int beginRlu5fLateFeeDateYy;
	
	/**
	* Constructor for Rlu5fLateFeeDateSerialized
	**/
    public Rlu5fLateFeeDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlu5fLateFeeDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fLateFeeDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlu5fLateFeeDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1011); // serialize this field at offset 1011 by default 
    }
    
	/**
	* sets parent for this Rlu5fLateFeeDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1011 by default
    }    
	/**
	* initializes the field in Rlu5fLateFeeDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLU_5F_LATE_FEE_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlu5fLateFeeDateMm = getStartOffset() + 0;	// set offset for serialization
  
             beginRlu5fLateFeeDateDd = getStartOffset() + 2;	// set offset for serialization
  
             beginRlu5fLateFeeDateCc = getStartOffset() + 4;	// set offset for serialization
  
             beginRlu5fLateFeeDateYy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlu5fLateFeeDateMmCounter = -1;
     public boolean isRlu5fLateFeeDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fLateFeeDateMmCounter != sharedCounter;
         localRlu5fLateFeeDateMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fLateFeeDateMm
	 *	@return rlu5fLateFeeDateMm
	 */
	public char[]  getRlu5fLateFeeDateMmString() {
	     return getCharArray(beginRlu5fLateFeeDateMm,RLU_5F_LATE_FEE_DATE_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fLateFeeDateMmIsNumeric() {
	    return isNumeric(beginRlu5fLateFeeDateMm
	                    ,beginRlu5fLateFeeDateMm + RLU_5F_LATE_FEE_DATE_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_LATE_FEE_DATE_MM_LEN = 2;
  	/**
	 * serializeRlu5fLateFeeDateMm
	 */
	protected void serializeRlu5fLateFeeDateMm(int rlu5fLateFeeDateMm) {
		 putNumber(beginRlu5fLateFeeDateMm,rlu5fLateFeeDateMm,RLU_5F_LATE_FEE_DATE_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fLateFeeDateMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fLateFeeDateMm
	 */
   	protected  int serializeRlu5fLateFeeDateMm(char[] value) {
	    int  rlu5fLateFeeDateMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fLateFeeDateMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fLateFeeDateMm
		       ,2
		      );
		 localRlu5fLateFeeDateMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fLateFeeDateMm;
    }

   protected int checkRlu5fLateFeeDateMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fLateFeeDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fLateFeeDateMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fLateFeeDateMm
			                 ,RLU_5F_LATE_FEE_DATE_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fLateFeeDateMm", beginRlu5fLateFeeDateMm,RLU_5F_LATE_FEE_DATE_MM_LEN);
    }
   	}
     int localRlu5fLateFeeDateDdCounter = -1;
     public boolean isRlu5fLateFeeDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fLateFeeDateDdCounter != sharedCounter;
         localRlu5fLateFeeDateDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fLateFeeDateDd
	 *	@return rlu5fLateFeeDateDd
	 */
	public char[]  getRlu5fLateFeeDateDdString() {
	     return getCharArray(beginRlu5fLateFeeDateDd,RLU_5F_LATE_FEE_DATE_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fLateFeeDateDdIsNumeric() {
	    return isNumeric(beginRlu5fLateFeeDateDd
	                    ,beginRlu5fLateFeeDateDd + RLU_5F_LATE_FEE_DATE_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_LATE_FEE_DATE_DD_LEN = 2;
  	/**
	 * serializeRlu5fLateFeeDateDd
	 */
	protected void serializeRlu5fLateFeeDateDd(int rlu5fLateFeeDateDd) {
		 putNumber(beginRlu5fLateFeeDateDd,rlu5fLateFeeDateDd,RLU_5F_LATE_FEE_DATE_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fLateFeeDateDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fLateFeeDateDd
	 */
   	protected  int serializeRlu5fLateFeeDateDd(char[] value) {
	    int  rlu5fLateFeeDateDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fLateFeeDateDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fLateFeeDateDd
		       ,2
		      );
		 localRlu5fLateFeeDateDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fLateFeeDateDd;
    }

   protected int checkRlu5fLateFeeDateDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fLateFeeDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fLateFeeDateDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fLateFeeDateDd
			                 ,RLU_5F_LATE_FEE_DATE_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fLateFeeDateDd", beginRlu5fLateFeeDateDd,RLU_5F_LATE_FEE_DATE_DD_LEN);
    }
   	}
     int localRlu5fLateFeeDateCcCounter = -1;
     public boolean isRlu5fLateFeeDateCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fLateFeeDateCcCounter != sharedCounter;
         localRlu5fLateFeeDateCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fLateFeeDateCc
	 *	@return rlu5fLateFeeDateCc
	 */
	public char[]  getRlu5fLateFeeDateCcString() {
	     return getCharArray(beginRlu5fLateFeeDateCc,RLU_5F_LATE_FEE_DATE_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fLateFeeDateCcIsNumeric() {
	    return isNumeric(beginRlu5fLateFeeDateCc
	                    ,beginRlu5fLateFeeDateCc + RLU_5F_LATE_FEE_DATE_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_LATE_FEE_DATE_CC_LEN = 2;
  	/**
	 * serializeRlu5fLateFeeDateCc
	 */
	protected void serializeRlu5fLateFeeDateCc(int rlu5fLateFeeDateCc) {
		 putNumber(beginRlu5fLateFeeDateCc,rlu5fLateFeeDateCc,RLU_5F_LATE_FEE_DATE_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fLateFeeDateCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fLateFeeDateCc
	 */
   	protected  int serializeRlu5fLateFeeDateCc(char[] value) {
	    int  rlu5fLateFeeDateCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fLateFeeDateCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fLateFeeDateCc
		       ,2
		      );
		 localRlu5fLateFeeDateCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fLateFeeDateCc;
    }

   protected int checkRlu5fLateFeeDateCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fLateFeeDateCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fLateFeeDateCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fLateFeeDateCc
			                 ,RLU_5F_LATE_FEE_DATE_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fLateFeeDateCc", beginRlu5fLateFeeDateCc,RLU_5F_LATE_FEE_DATE_CC_LEN);
    }
   	}
     int localRlu5fLateFeeDateYyCounter = -1;
     public boolean isRlu5fLateFeeDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fLateFeeDateYyCounter != sharedCounter;
         localRlu5fLateFeeDateYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fLateFeeDateYy
	 *	@return rlu5fLateFeeDateYy
	 */
	public char[]  getRlu5fLateFeeDateYyString() {
	     return getCharArray(beginRlu5fLateFeeDateYy,RLU_5F_LATE_FEE_DATE_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fLateFeeDateYyIsNumeric() {
	    return isNumeric(beginRlu5fLateFeeDateYy
	                    ,beginRlu5fLateFeeDateYy + RLU_5F_LATE_FEE_DATE_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_LATE_FEE_DATE_YY_LEN = 2;
  	/**
	 * serializeRlu5fLateFeeDateYy
	 */
	protected void serializeRlu5fLateFeeDateYy(int rlu5fLateFeeDateYy) {
		 putNumber(beginRlu5fLateFeeDateYy,rlu5fLateFeeDateYy,RLU_5F_LATE_FEE_DATE_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fLateFeeDateYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fLateFeeDateYy
	 */
   	protected  int serializeRlu5fLateFeeDateYy(char[] value) {
	    int  rlu5fLateFeeDateYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fLateFeeDateYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fLateFeeDateYy
		       ,2
		      );
		 localRlu5fLateFeeDateYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fLateFeeDateYy;
    }

   protected int checkRlu5fLateFeeDateYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fLateFeeDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fLateFeeDateYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fLateFeeDateYy
			                 ,RLU_5F_LATE_FEE_DATE_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fLateFeeDateYy", beginRlu5fLateFeeDateYy,RLU_5F_LATE_FEE_DATE_YY_LEN);
    }
   	}




}
  
