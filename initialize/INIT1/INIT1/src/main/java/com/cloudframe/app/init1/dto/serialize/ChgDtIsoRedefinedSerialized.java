package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ChgDtIsoRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ChgDtIsoRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ChgDtIsoRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHG_DT_ISO_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChgYy;
            protected  int beginChgMm;
            protected  int beginChgDd;
	
	/**
	* Constructor for ChgDtIsoRedefinedSerialized
	**/
    public ChgDtIsoRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ChgDtIsoRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgDtIsoRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ChgDtIsoRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,68); // serialize this field at offset 68 by default 
    }
    
	/**
	* sets parent for this ChgDtIsoRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 68 by default
    }    
	/**
	* initializes the field in ChgDtIsoRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHG_DT_ISO_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginChgYy = getStartOffset() + 0;	// set offset for serialization
  
             beginChgMm = getStartOffset() + 4;	// set offset for serialization
  
             beginChgDd = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localChgYyCounter = -1;
     public boolean isChgYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgYyCounter != sharedCounter;
         localChgYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgYy
	 *	@return chgYy
	 */
	public char[]  getChgYyString() {
	     return getCharArray(beginChgYy,CHG_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgYyIsNumeric() {
	    return isNumeric(beginChgYy
	                    ,beginChgYy + CHG_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_YY_LEN = 4;
  	/**
	 * serializeChgYy
	 */
	protected void serializeChgYy(int chgYy) {
		 putNumber(beginChgYy,chgYy,CHG_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgYy
	 */
   	protected  int serializeChgYy(char[] value) {
	    int  chgYy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginChgYy
		       ,4
		      );
		 localChgYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgYy;
    }

   protected int checkChgYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgYy
			                 ,CHG_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgYy", beginChgYy,CHG_YY_LEN);
    }
   	}
     int localChgMmCounter = -1;
     public boolean isChgMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgMmCounter != sharedCounter;
         localChgMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgMm
	 *	@return chgMm
	 */
	public char[]  getChgMmString() {
	     return getCharArray(beginChgMm,CHG_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgMmIsNumeric() {
	    return isNumeric(beginChgMm
	                    ,beginChgMm + CHG_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_MM_LEN = 2;
  	/**
	 * serializeChgMm
	 */
	protected void serializeChgMm(int chgMm) {
		 putNumber(beginChgMm,chgMm,CHG_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgMm
	 */
   	protected  int serializeChgMm(char[] value) {
	    int  chgMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgMm
		       ,2
		      );
		 localChgMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgMm;
    }

   protected int checkChgMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgMm
			                 ,CHG_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgMm", beginChgMm,CHG_MM_LEN);
    }
   	}
     int localChgDdCounter = -1;
     public boolean isChgDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgDdCounter != sharedCounter;
         localChgDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgDd
	 *	@return chgDd
	 */
	public char[]  getChgDdString() {
	     return getCharArray(beginChgDd,CHG_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgDdIsNumeric() {
	    return isNumeric(beginChgDd
	                    ,beginChgDd + CHG_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_DD_LEN = 2;
  	/**
	 * serializeChgDd
	 */
	protected void serializeChgDd(int chgDd) {
		 putNumber(beginChgDd,chgDd,CHG_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgDd
	 */
   	protected  int serializeChgDd(char[] value) {
	    int  chgDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgDd
		       ,2
		      );
		 localChgDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgDd;
    }

   protected int checkChgDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgDd
			                 ,CHG_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgDd", beginChgDd,CHG_DD_LEN);
    }
   	}




}
  
