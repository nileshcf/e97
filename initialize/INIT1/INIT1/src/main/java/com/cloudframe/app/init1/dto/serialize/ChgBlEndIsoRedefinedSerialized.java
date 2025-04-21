package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ChgBlEndIsoRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ChgBlEndIsoRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ChgBlEndIsoRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHG_BL_END_ISO_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChgBlEndYy;
            protected  int beginChgBlEndMm;
            protected  int beginChgBlEndDd;
	
	/**
	* Constructor for ChgBlEndIsoRedefinedSerialized
	**/
    public ChgBlEndIsoRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ChgBlEndIsoRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgBlEndIsoRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ChgBlEndIsoRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,60); // serialize this field at offset 60 by default 
    }
    
	/**
	* sets parent for this ChgBlEndIsoRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 60 by default
    }    
	/**
	* initializes the field in ChgBlEndIsoRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHG_BL_END_ISO_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginChgBlEndYy = getStartOffset() + 0;	// set offset for serialization
  
             beginChgBlEndMm = getStartOffset() + 4;	// set offset for serialization
  
             beginChgBlEndDd = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localChgBlEndYyCounter = -1;
     public boolean isChgBlEndYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgBlEndYyCounter != sharedCounter;
         localChgBlEndYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgBlEndYy
	 *	@return chgBlEndYy
	 */
	public char[]  getChgBlEndYyString() {
	     return getCharArray(beginChgBlEndYy,CHG_BL_END_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgBlEndYyIsNumeric() {
	    return isNumeric(beginChgBlEndYy
	                    ,beginChgBlEndYy + CHG_BL_END_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_BL_END_YY_LEN = 4;
  	/**
	 * serializeChgBlEndYy
	 */
	protected void serializeChgBlEndYy(int chgBlEndYy) {
		 putNumber(beginChgBlEndYy,chgBlEndYy,CHG_BL_END_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgBlEndYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgBlEndYy
	 */
   	protected  int serializeChgBlEndYy(char[] value) {
	    int  chgBlEndYy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgBlEndYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginChgBlEndYy
		       ,4
		      );
		 localChgBlEndYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgBlEndYy;
    }

   protected int checkChgBlEndYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgBlEndYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgBlEndYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgBlEndYy
			                 ,CHG_BL_END_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgBlEndYy", beginChgBlEndYy,CHG_BL_END_YY_LEN);
    }
   	}
     int localChgBlEndMmCounter = -1;
     public boolean isChgBlEndMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgBlEndMmCounter != sharedCounter;
         localChgBlEndMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgBlEndMm
	 *	@return chgBlEndMm
	 */
	public char[]  getChgBlEndMmString() {
	     return getCharArray(beginChgBlEndMm,CHG_BL_END_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgBlEndMmIsNumeric() {
	    return isNumeric(beginChgBlEndMm
	                    ,beginChgBlEndMm + CHG_BL_END_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_BL_END_MM_LEN = 2;
  	/**
	 * serializeChgBlEndMm
	 */
	protected void serializeChgBlEndMm(int chgBlEndMm) {
		 putNumber(beginChgBlEndMm,chgBlEndMm,CHG_BL_END_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgBlEndMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgBlEndMm
	 */
   	protected  int serializeChgBlEndMm(char[] value) {
	    int  chgBlEndMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgBlEndMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgBlEndMm
		       ,2
		      );
		 localChgBlEndMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgBlEndMm;
    }

   protected int checkChgBlEndMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgBlEndMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgBlEndMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgBlEndMm
			                 ,CHG_BL_END_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgBlEndMm", beginChgBlEndMm,CHG_BL_END_MM_LEN);
    }
   	}
     int localChgBlEndDdCounter = -1;
     public boolean isChgBlEndDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgBlEndDdCounter != sharedCounter;
         localChgBlEndDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgBlEndDd
	 *	@return chgBlEndDd
	 */
	public char[]  getChgBlEndDdString() {
	     return getCharArray(beginChgBlEndDd,CHG_BL_END_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgBlEndDdIsNumeric() {
	    return isNumeric(beginChgBlEndDd
	                    ,beginChgBlEndDd + CHG_BL_END_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_BL_END_DD_LEN = 2;
  	/**
	 * serializeChgBlEndDd
	 */
	protected void serializeChgBlEndDd(int chgBlEndDd) {
		 putNumber(beginChgBlEndDd,chgBlEndDd,CHG_BL_END_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgBlEndDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgBlEndDd
	 */
   	protected  int serializeChgBlEndDd(char[] value) {
	    int  chgBlEndDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgBlEndDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgBlEndDd
		       ,2
		      );
		 localChgBlEndDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgBlEndDd;
    }

   protected int checkChgBlEndDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgBlEndDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgBlEndDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgBlEndDd
			                 ,CHG_BL_END_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgBlEndDd", beginChgBlEndDd,CHG_BL_END_DD_LEN);
    }
   	}




}
  
