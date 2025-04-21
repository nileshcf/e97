package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ChgEndDtIso3RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ChgEndDtIso3RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ChgEndDtIso3RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHG_END_DT_ISO_3_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChgEndYy3;
            protected  int beginChgEndMm3;
            protected  int beginChgEndDd3;
	
	/**
	* Constructor for ChgEndDtIso3RedefinedSerialized
	**/
    public ChgEndDtIso3RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ChgEndDtIso3RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgEndDtIso3RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ChgEndDtIso3RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,116); // serialize this field at offset 116 by default 
    }
    
	/**
	* sets parent for this ChgEndDtIso3RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 116 by default
    }    
	/**
	* initializes the field in ChgEndDtIso3RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHG_END_DT_ISO_3_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginChgEndYy3 = getStartOffset() + 0;	// set offset for serialization
  
             beginChgEndMm3 = getStartOffset() + 4;	// set offset for serialization
  
             beginChgEndDd3 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localChgEndYy3Counter = -1;
     public boolean isChgEndYy3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgEndYy3Counter != sharedCounter;
         localChgEndYy3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgEndYy3
	 *	@return chgEndYy3
	 */
	public char[]  getChgEndYy3String() {
	     return getCharArray(beginChgEndYy3,CHG_END_YY_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgEndYy3IsNumeric() {
	    return isNumeric(beginChgEndYy3
	                    ,beginChgEndYy3 + CHG_END_YY_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_END_YY_3_LEN = 4;
  	/**
	 * serializeChgEndYy3
	 */
	protected void serializeChgEndYy3(int chgEndYy3) {
		 putNumber(beginChgEndYy3,chgEndYy3,CHG_END_YY_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgEndYy3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgEndYy3
	 */
   	protected  int serializeChgEndYy3(char[] value) {
	    int  chgEndYy3;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgEndYy3 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginChgEndYy3
		       ,4
		      );
		 localChgEndYy3Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgEndYy3;
    }

   protected int checkChgEndYy3MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgEndYy3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgEndYy3() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgEndYy3
			                 ,CHG_END_YY_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgEndYy3", beginChgEndYy3,CHG_END_YY_3_LEN);
    }
   	}
     int localChgEndMm3Counter = -1;
     public boolean isChgEndMm3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgEndMm3Counter != sharedCounter;
         localChgEndMm3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgEndMm3
	 *	@return chgEndMm3
	 */
	public char[]  getChgEndMm3String() {
	     return getCharArray(beginChgEndMm3,CHG_END_MM_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgEndMm3IsNumeric() {
	    return isNumeric(beginChgEndMm3
	                    ,beginChgEndMm3 + CHG_END_MM_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_END_MM_3_LEN = 2;
  	/**
	 * serializeChgEndMm3
	 */
	protected void serializeChgEndMm3(int chgEndMm3) {
		 putNumber(beginChgEndMm3,chgEndMm3,CHG_END_MM_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgEndMm3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgEndMm3
	 */
   	protected  int serializeChgEndMm3(char[] value) {
	    int  chgEndMm3;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgEndMm3 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgEndMm3
		       ,2
		      );
		 localChgEndMm3Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgEndMm3;
    }

   protected int checkChgEndMm3MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgEndMm3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgEndMm3() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgEndMm3
			                 ,CHG_END_MM_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgEndMm3", beginChgEndMm3,CHG_END_MM_3_LEN);
    }
   	}
     int localChgEndDd3Counter = -1;
     public boolean isChgEndDd3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgEndDd3Counter != sharedCounter;
         localChgEndDd3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgEndDd3
	 *	@return chgEndDd3
	 */
	public char[]  getChgEndDd3String() {
	     return getCharArray(beginChgEndDd3,CHG_END_DD_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgEndDd3IsNumeric() {
	    return isNumeric(beginChgEndDd3
	                    ,beginChgEndDd3 + CHG_END_DD_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_END_DD_3_LEN = 2;
  	/**
	 * serializeChgEndDd3
	 */
	protected void serializeChgEndDd3(int chgEndDd3) {
		 putNumber(beginChgEndDd3,chgEndDd3,CHG_END_DD_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgEndDd3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgEndDd3
	 */
   	protected  int serializeChgEndDd3(char[] value) {
	    int  chgEndDd3;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgEndDd3 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginChgEndDd3
		       ,2
		      );
		 localChgEndDd3Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgEndDd3;
    }

   protected int checkChgEndDd3MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgEndDd3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChgEndDd3() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChgEndDd3
			                 ,CHG_END_DD_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgEndDd3", beginChgEndDd3,CHG_END_DD_3_LEN);
    }
   	}




}
  
