package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ChgEndDtIso2RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ChgEndDtIso2RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ChgEndDtIso2RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHG_END_DT_ISO_2_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChgEndYy2;
            protected  int beginChgEndMm2;
            protected  int beginChgEndDd2;
	
	/**
	* Constructor for ChgEndDtIso2RedefinedSerialized
	**/
    public ChgEndDtIso2RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ChgEndDtIso2RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgEndDtIso2RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ChgEndDtIso2RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,108); // serialize this field at offset 108 by default 
    }
    
	/**
	* sets parent for this ChgEndDtIso2RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 108 by default
    }    
	/**
	* initializes the field in ChgEndDtIso2RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHG_END_DT_ISO_2_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginChgEndYy2 = getStartOffset() + 0;	// set offset for serialization
  
             beginChgEndMm2 = getStartOffset() + 4;	// set offset for serialization
  
             beginChgEndDd2 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localChgEndYy2Counter = -1;
     public boolean isChgEndYy2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgEndYy2Counter != sharedCounter;
         localChgEndYy2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgEndYy2
	 *	@return chgEndYy2
	 */
	public char[]  getChgEndYy2String() {
	     return getCharArray(beginChgEndYy2,CHG_END_YY_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgEndYy2IsNumeric() {
	    return isNumeric(beginChgEndYy2
	                    ,beginChgEndYy2 + CHG_END_YY_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_END_YY_2_LEN = 4;
  	/**
	 * serializeChgEndYy2
	 */
	protected void serializeChgEndYy2(int chgEndYy2) {
		 putNumber(beginChgEndYy2,chgEndYy2,CHG_END_YY_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgEndYy2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgEndYy2
	 */
   	protected  int serializeChgEndYy2(char[] value) {
	    int  chgEndYy2;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgEndYy2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginChgEndYy2
		       ,4
		      );
		 localChgEndYy2Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgEndYy2;
    }

   protected int checkChgEndYy2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgEndYy2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgEndYy2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgEndYy2
			                 ,CHG_END_YY_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgEndYy2", beginChgEndYy2,CHG_END_YY_2_LEN);
    }
   	}
     int localChgEndMm2Counter = -1;
     public boolean isChgEndMm2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgEndMm2Counter != sharedCounter;
         localChgEndMm2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgEndMm2
	 *	@return chgEndMm2
	 */
	public char[]  getChgEndMm2String() {
	     return getCharArray(beginChgEndMm2,CHG_END_MM_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgEndMm2IsNumeric() {
	    return isNumeric(beginChgEndMm2
	                    ,beginChgEndMm2 + CHG_END_MM_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_END_MM_2_LEN = 2;
  	/**
	 * serializeChgEndMm2
	 */
	protected void serializeChgEndMm2(int chgEndMm2) {
		 putNumber(beginChgEndMm2,chgEndMm2,CHG_END_MM_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgEndMm2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgEndMm2
	 */
   	protected  int serializeChgEndMm2(char[] value) {
	    int  chgEndMm2;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgEndMm2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgEndMm2
		       ,2
		      );
		 localChgEndMm2Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgEndMm2;
    }

   protected int checkChgEndMm2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgEndMm2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgEndMm2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgEndMm2
			                 ,CHG_END_MM_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgEndMm2", beginChgEndMm2,CHG_END_MM_2_LEN);
    }
   	}
     int localChgEndDd2Counter = -1;
     public boolean isChgEndDd2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgEndDd2Counter != sharedCounter;
         localChgEndDd2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgEndDd2
	 *	@return chgEndDd2
	 */
	public char[]  getChgEndDd2String() {
	     return getCharArray(beginChgEndDd2,CHG_END_DD_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgEndDd2IsNumeric() {
	    return isNumeric(beginChgEndDd2
	                    ,beginChgEndDd2 + CHG_END_DD_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_END_DD_2_LEN = 2;
  	/**
	 * serializeChgEndDd2
	 */
	protected void serializeChgEndDd2(int chgEndDd2) {
		 putNumber(beginChgEndDd2,chgEndDd2,CHG_END_DD_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgEndDd2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgEndDd2
	 */
   	protected  int serializeChgEndDd2(char[] value) {
	    int  chgEndDd2;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgEndDd2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgEndDd2
		       ,2
		      );
		 localChgEndDd2Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgEndDd2;
    }

   protected int checkChgEndDd2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgEndDd2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgEndDd2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgEndDd2
			                 ,CHG_END_DD_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgEndDd2", beginChgEndDd2,CHG_END_DD_2_LEN);
    }
   	}




}
  
