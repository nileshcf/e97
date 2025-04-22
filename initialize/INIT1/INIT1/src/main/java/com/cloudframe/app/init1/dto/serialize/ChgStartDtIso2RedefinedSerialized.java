package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ChgStartDtIso2RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ChgStartDtIso2RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ChgStartDtIso2RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHG_START_DT_ISO_2_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChgStartYy2;
            protected  int beginChgStartMm2;
            protected  int beginChgStartDd2;
	
	/**
	* Constructor for ChgStartDtIso2RedefinedSerialized
	**/
    public ChgStartDtIso2RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ChgStartDtIso2RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgStartDtIso2RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ChgStartDtIso2RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,84); // serialize this field at offset 84 by default 
    }
    
	/**
	* sets parent for this ChgStartDtIso2RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 84 by default
    }    
	/**
	* initializes the field in ChgStartDtIso2RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHG_START_DT_ISO_2_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginChgStartYy2 = getStartOffset() + 0;	// set offset for serialization
  
             beginChgStartMm2 = getStartOffset() + 4;	// set offset for serialization
  
             beginChgStartDd2 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localChgStartYy2Counter = -1;
     public boolean isChgStartYy2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgStartYy2Counter != sharedCounter;
         localChgStartYy2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgStartYy2
	 *	@return chgStartYy2
	 */
	public char[]  getChgStartYy2String() {
	     return getCharArray(beginChgStartYy2,CHG_START_YY_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgStartYy2IsNumeric() {
	    return isNumeric(beginChgStartYy2
	                    ,beginChgStartYy2 + CHG_START_YY_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_START_YY_2_LEN = 4;
  	/**
	 * serializeChgStartYy2
	 */
	protected void serializeChgStartYy2(int chgStartYy2) {
		 putNumber(beginChgStartYy2,chgStartYy2,CHG_START_YY_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgStartYy2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgStartYy2
	 */
   	protected  int serializeChgStartYy2(char[] value) {
	    int  chgStartYy2;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgStartYy2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginChgStartYy2
		       ,4
		      );
		 localChgStartYy2Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgStartYy2;
    }

   protected int checkChgStartYy2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgStartYy2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgStartYy2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgStartYy2
			                 ,CHG_START_YY_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgStartYy2", beginChgStartYy2,CHG_START_YY_2_LEN);
    }
   	}
     int localChgStartMm2Counter = -1;
     public boolean isChgStartMm2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgStartMm2Counter != sharedCounter;
         localChgStartMm2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgStartMm2
	 *	@return chgStartMm2
	 */
	public char[]  getChgStartMm2String() {
	     return getCharArray(beginChgStartMm2,CHG_START_MM_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgStartMm2IsNumeric() {
	    return isNumeric(beginChgStartMm2
	                    ,beginChgStartMm2 + CHG_START_MM_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_START_MM_2_LEN = 2;
  	/**
	 * serializeChgStartMm2
	 */
	protected void serializeChgStartMm2(int chgStartMm2) {
		 putNumber(beginChgStartMm2,chgStartMm2,CHG_START_MM_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgStartMm2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgStartMm2
	 */
   	protected  int serializeChgStartMm2(char[] value) {
	    int  chgStartMm2;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgStartMm2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgStartMm2
		       ,2
		      );
		 localChgStartMm2Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgStartMm2;
    }

   protected int checkChgStartMm2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgStartMm2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgStartMm2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgStartMm2
			                 ,CHG_START_MM_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgStartMm2", beginChgStartMm2,CHG_START_MM_2_LEN);
    }
   	}
     int localChgStartDd2Counter = -1;
     public boolean isChgStartDd2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgStartDd2Counter != sharedCounter;
         localChgStartDd2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgStartDd2
	 *	@return chgStartDd2
	 */
	public char[]  getChgStartDd2String() {
	     return getCharArray(beginChgStartDd2,CHG_START_DD_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgStartDd2IsNumeric() {
	    return isNumeric(beginChgStartDd2
	                    ,beginChgStartDd2 + CHG_START_DD_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_START_DD_2_LEN = 2;
  	/**
	 * serializeChgStartDd2
	 */
	protected void serializeChgStartDd2(int chgStartDd2) {
		 putNumber(beginChgStartDd2,chgStartDd2,CHG_START_DD_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgStartDd2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgStartDd2
	 */
   	protected  int serializeChgStartDd2(char[] value) {
	    int  chgStartDd2;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgStartDd2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgStartDd2
		       ,2
		      );
		 localChgStartDd2Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgStartDd2;
    }

   protected int checkChgStartDd2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgStartDd2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgStartDd2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgStartDd2
			                 ,CHG_START_DD_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgStartDd2", beginChgStartDd2,CHG_START_DD_2_LEN);
    }
   	}




}
  
