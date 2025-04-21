package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ChgStartDtIsoRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ChgStartDtIsoRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ChgStartDtIsoRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHG_START_DT_ISO_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChgStartYy;
            protected  int beginChgStartMm;
            protected  int beginChgStartDd;
	
	/**
	* Constructor for ChgStartDtIsoRedefinedSerialized
	**/
    public ChgStartDtIsoRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ChgStartDtIsoRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgStartDtIsoRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ChgStartDtIsoRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,76); // serialize this field at offset 76 by default 
    }
    
	/**
	* sets parent for this ChgStartDtIsoRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 76 by default
    }    
	/**
	* initializes the field in ChgStartDtIsoRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHG_START_DT_ISO_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginChgStartYy = getStartOffset() + 0;	// set offset for serialization
  
             beginChgStartMm = getStartOffset() + 4;	// set offset for serialization
  
             beginChgStartDd = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localChgStartYyCounter = -1;
     public boolean isChgStartYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgStartYyCounter != sharedCounter;
         localChgStartYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgStartYy
	 *	@return chgStartYy
	 */
	public char[]  getChgStartYyString() {
	     return getCharArray(beginChgStartYy,CHG_START_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgStartYyIsNumeric() {
	    return isNumeric(beginChgStartYy
	                    ,beginChgStartYy + CHG_START_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_START_YY_LEN = 4;
  	/**
	 * serializeChgStartYy
	 */
	protected void serializeChgStartYy(int chgStartYy) {
		 putNumber(beginChgStartYy,chgStartYy,CHG_START_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgStartYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgStartYy
	 */
   	protected  int serializeChgStartYy(char[] value) {
	    int  chgStartYy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgStartYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginChgStartYy
		       ,4
		      );
		 localChgStartYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgStartYy;
    }

   protected int checkChgStartYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgStartYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgStartYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgStartYy
			                 ,CHG_START_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgStartYy", beginChgStartYy,CHG_START_YY_LEN);
    }
   	}
     int localChgStartMmCounter = -1;
     public boolean isChgStartMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgStartMmCounter != sharedCounter;
         localChgStartMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgStartMm
	 *	@return chgStartMm
	 */
	public char[]  getChgStartMmString() {
	     return getCharArray(beginChgStartMm,CHG_START_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgStartMmIsNumeric() {
	    return isNumeric(beginChgStartMm
	                    ,beginChgStartMm + CHG_START_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_START_MM_LEN = 2;
  	/**
	 * serializeChgStartMm
	 */
	protected void serializeChgStartMm(int chgStartMm) {
		 putNumber(beginChgStartMm,chgStartMm,CHG_START_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgStartMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgStartMm
	 */
   	protected  int serializeChgStartMm(char[] value) {
	    int  chgStartMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgStartMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgStartMm
		       ,2
		      );
		 localChgStartMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgStartMm;
    }

   protected int checkChgStartMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgStartMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgStartMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgStartMm
			                 ,CHG_START_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgStartMm", beginChgStartMm,CHG_START_MM_LEN);
    }
   	}
     int localChgStartDdCounter = -1;
     public boolean isChgStartDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgStartDdCounter != sharedCounter;
         localChgStartDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgStartDd
	 *	@return chgStartDd
	 */
	public char[]  getChgStartDdString() {
	     return getCharArray(beginChgStartDd,CHG_START_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgStartDdIsNumeric() {
	    return isNumeric(beginChgStartDd
	                    ,beginChgStartDd + CHG_START_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_START_DD_LEN = 2;
  	/**
	 * serializeChgStartDd
	 */
	protected void serializeChgStartDd(int chgStartDd) {
		 putNumber(beginChgStartDd,chgStartDd,CHG_START_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgStartDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgStartDd
	 */
   	protected  int serializeChgStartDd(char[] value) {
	    int  chgStartDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgStartDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgStartDd
		       ,2
		      );
		 localChgStartDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgStartDd;
    }

   protected int checkChgStartDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgStartDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgStartDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgStartDd
			                 ,CHG_START_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgStartDd", beginChgStartDd,CHG_START_DD_LEN);
    }
   	}




}
  
