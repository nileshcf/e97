package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ChgStartDtIso3RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ChgStartDtIso3RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ChgStartDtIso3RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHG_START_DT_ISO_3_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChgStartYy3;
            protected  int beginChgStartMm3;
            protected  int beginChgStartDd3;
	
	/**
	* Constructor for ChgStartDtIso3RedefinedSerialized
	**/
    public ChgStartDtIso3RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ChgStartDtIso3RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgStartDtIso3RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ChgStartDtIso3RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,92); // serialize this field at offset 92 by default 
    }
    
	/**
	* sets parent for this ChgStartDtIso3RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 92 by default
    }    
	/**
	* initializes the field in ChgStartDtIso3RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHG_START_DT_ISO_3_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginChgStartYy3 = getStartOffset() + 0;	// set offset for serialization
  
             beginChgStartMm3 = getStartOffset() + 4;	// set offset for serialization
  
             beginChgStartDd3 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localChgStartYy3Counter = -1;
     public boolean isChgStartYy3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgStartYy3Counter != sharedCounter;
         localChgStartYy3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgStartYy3
	 *	@return chgStartYy3
	 */
	public char[]  getChgStartYy3String() {
	     return getCharArray(beginChgStartYy3,CHG_START_YY_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgStartYy3IsNumeric() {
	    return isNumeric(beginChgStartYy3
	                    ,beginChgStartYy3 + CHG_START_YY_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_START_YY_3_LEN = 4;
  	/**
	 * serializeChgStartYy3
	 */
	protected void serializeChgStartYy3(int chgStartYy3) {
		 putNumber(beginChgStartYy3,chgStartYy3,CHG_START_YY_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgStartYy3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgStartYy3
	 */
   	protected  int serializeChgStartYy3(char[] value) {
	    int  chgStartYy3;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgStartYy3 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginChgStartYy3
		       ,4
		      );
		 localChgStartYy3Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgStartYy3;
    }

   protected int checkChgStartYy3MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgStartYy3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgStartYy3() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgStartYy3
			                 ,CHG_START_YY_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgStartYy3", beginChgStartYy3,CHG_START_YY_3_LEN);
    }
   	}
     int localChgStartMm3Counter = -1;
     public boolean isChgStartMm3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgStartMm3Counter != sharedCounter;
         localChgStartMm3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgStartMm3
	 *	@return chgStartMm3
	 */
	public char[]  getChgStartMm3String() {
	     return getCharArray(beginChgStartMm3,CHG_START_MM_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgStartMm3IsNumeric() {
	    return isNumeric(beginChgStartMm3
	                    ,beginChgStartMm3 + CHG_START_MM_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_START_MM_3_LEN = 2;
  	/**
	 * serializeChgStartMm3
	 */
	protected void serializeChgStartMm3(int chgStartMm3) {
		 putNumber(beginChgStartMm3,chgStartMm3,CHG_START_MM_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgStartMm3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgStartMm3
	 */
   	protected  int serializeChgStartMm3(char[] value) {
	    int  chgStartMm3;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgStartMm3 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgStartMm3
		       ,2
		      );
		 localChgStartMm3Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgStartMm3;
    }

   protected int checkChgStartMm3MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgStartMm3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgStartMm3() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgStartMm3
			                 ,CHG_START_MM_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgStartMm3", beginChgStartMm3,CHG_START_MM_3_LEN);
    }
   	}
     int localChgStartDd3Counter = -1;
     public boolean isChgStartDd3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgStartDd3Counter != sharedCounter;
         localChgStartDd3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgStartDd3
	 *	@return chgStartDd3
	 */
	public char[]  getChgStartDd3String() {
	     return getCharArray(beginChgStartDd3,CHG_START_DD_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgStartDd3IsNumeric() {
	    return isNumeric(beginChgStartDd3
	                    ,beginChgStartDd3 + CHG_START_DD_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_START_DD_3_LEN = 2;
  	/**
	 * serializeChgStartDd3
	 */
	protected void serializeChgStartDd3(int chgStartDd3) {
		 putNumber(beginChgStartDd3,chgStartDd3,CHG_START_DD_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgStartDd3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgStartDd3
	 */
   	protected  int serializeChgStartDd3(char[] value) {
	    int  chgStartDd3;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgStartDd3 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgStartDd3
		       ,2
		      );
		 localChgStartDd3Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgStartDd3;
    }

   protected int checkChgStartDd3MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgStartDd3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgStartDd3() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgStartDd3
			                 ,CHG_START_DD_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgStartDd3", beginChgStartDd3,CHG_START_DD_3_LEN);
    }
   	}




}
  
