package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ChgEndDtIsoRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ChgEndDtIsoRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ChgEndDtIsoRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHG_END_DT_ISO_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChgEndYy;
            protected  int beginChgEndMm;
            protected  int beginChgEndDd;
	
	/**
	* Constructor for ChgEndDtIsoRedefinedSerialized
	**/
    public ChgEndDtIsoRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ChgEndDtIsoRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgEndDtIsoRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ChgEndDtIsoRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,100); // serialize this field at offset 100 by default 
    }
    
	/**
	* sets parent for this ChgEndDtIsoRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 100 by default
    }    
	/**
	* initializes the field in ChgEndDtIsoRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHG_END_DT_ISO_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginChgEndYy = getStartOffset() + 0;	// set offset for serialization
  
             beginChgEndMm = getStartOffset() + 4;	// set offset for serialization
  
             beginChgEndDd = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localChgEndYyCounter = -1;
     public boolean isChgEndYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgEndYyCounter != sharedCounter;
         localChgEndYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgEndYy
	 *	@return chgEndYy
	 */
	public char[]  getChgEndYyString() {
	     return getCharArray(beginChgEndYy,CHG_END_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgEndYyIsNumeric() {
	    return isNumeric(beginChgEndYy
	                    ,beginChgEndYy + CHG_END_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_END_YY_LEN = 4;
  	/**
	 * serializeChgEndYy
	 */
	protected void serializeChgEndYy(int chgEndYy) {
		 putNumber(beginChgEndYy,chgEndYy,CHG_END_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgEndYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgEndYy
	 */
   	protected  int serializeChgEndYy(char[] value) {
	    int  chgEndYy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgEndYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginChgEndYy
		       ,4
		      );
		 localChgEndYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgEndYy;
    }

   protected int checkChgEndYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgEndYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgEndYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgEndYy
			                 ,CHG_END_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgEndYy", beginChgEndYy,CHG_END_YY_LEN);
    }
   	}
     int localChgEndMmCounter = -1;
     public boolean isChgEndMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgEndMmCounter != sharedCounter;
         localChgEndMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgEndMm
	 *	@return chgEndMm
	 */
	public char[]  getChgEndMmString() {
	     return getCharArray(beginChgEndMm,CHG_END_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgEndMmIsNumeric() {
	    return isNumeric(beginChgEndMm
	                    ,beginChgEndMm + CHG_END_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_END_MM_LEN = 2;
  	/**
	 * serializeChgEndMm
	 */
	protected void serializeChgEndMm(int chgEndMm) {
		 putNumber(beginChgEndMm,chgEndMm,CHG_END_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgEndMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgEndMm
	 */
   	protected  int serializeChgEndMm(char[] value) {
	    int  chgEndMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgEndMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgEndMm
		       ,2
		      );
		 localChgEndMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgEndMm;
    }

   protected int checkChgEndMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgEndMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgEndMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgEndMm
			                 ,CHG_END_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgEndMm", beginChgEndMm,CHG_END_MM_LEN);
    }
   	}
     int localChgEndDdCounter = -1;
     public boolean isChgEndDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgEndDdCounter != sharedCounter;
         localChgEndDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgEndDd
	 *	@return chgEndDd
	 */
	public char[]  getChgEndDdString() {
	     return getCharArray(beginChgEndDd,CHG_END_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgEndDdIsNumeric() {
	    return isNumeric(beginChgEndDd
	                    ,beginChgEndDd + CHG_END_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_END_DD_LEN = 2;
  	/**
	 * serializeChgEndDd
	 */
	protected void serializeChgEndDd(int chgEndDd) {
		 putNumber(beginChgEndDd,chgEndDd,CHG_END_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgEndDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgEndDd
	 */
   	protected  int serializeChgEndDd(char[] value) {
	    int  chgEndDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgEndDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgEndDd
		       ,2
		      );
		 localChgEndDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgEndDd;
    }

   protected int checkChgEndDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgEndDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgEndDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgEndDd
			                 ,CHG_END_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgEndDd", beginChgEndDd,CHG_END_DD_LEN);
    }
   	}




}
  
