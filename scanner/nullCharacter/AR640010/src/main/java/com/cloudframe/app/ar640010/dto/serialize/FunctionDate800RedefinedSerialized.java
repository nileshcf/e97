package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FunctionDate800RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FunctionDate800RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FunctionDate800RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FUNCTION_DATE_800_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFunctionYear800;
            protected  int beginFunctionMonth800;
            protected  int beginFunctionDay800;
	
	/**
	* Constructor for FunctionDate800RedefinedSerialized
	**/
    public FunctionDate800RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FunctionDate800RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FunctionDate800RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FunctionDate800RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1235); // serialize this field at offset 1235 by default 
    }
    
	/**
	* sets parent for this FunctionDate800RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1235 by default
    }    
	/**
	* initializes the field in FunctionDate800RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FUNCTION_DATE_800_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFunctionYear800 = getStartOffset() + 0;	// set offset for serialization
  
             beginFunctionMonth800 = getStartOffset() + 4;	// set offset for serialization
  
             beginFunctionDay800 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFunctionYear800Counter = -1;
     public boolean isFunctionYear800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionYear800Counter != sharedCounter;
         localFunctionYear800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of functionYear800
	 *	@return functionYear800
	 */
	public char[]  getFunctionYear800String() {
	     return getCharArray(beginFunctionYear800,FUNCTION_YEAR_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean functionYear800IsNumeric() {
	    return isNumeric(beginFunctionYear800
	                    ,beginFunctionYear800 + FUNCTION_YEAR_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FUNCTION_YEAR_800_LEN = 4;
  	/**
	 * serializeFunctionYear800
	 */
	protected void serializeFunctionYear800(int functionYear800) {
		 putNumber(beginFunctionYear800,functionYear800,FUNCTION_YEAR_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFunctionYear800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFunctionYear800
	 */
   	protected  int serializeFunctionYear800(char[] value) {
	    int  functionYear800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    functionYear800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginFunctionYear800
		       ,4
		      );
		 localFunctionYear800Counter = shareString.getSerializedField().getModifiedCounter();
		return  functionYear800;
    }

   protected int checkFunctionYear800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFunctionYear800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFunctionYear800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFunctionYear800
			                 ,FUNCTION_YEAR_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("functionYear800", beginFunctionYear800,FUNCTION_YEAR_800_LEN);
    }
   	}
     int localFunctionMonth800Counter = -1;
     public boolean isFunctionMonth800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionMonth800Counter != sharedCounter;
         localFunctionMonth800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of functionMonth800
	 *	@return functionMonth800
	 */
	public char[]  getFunctionMonth800String() {
	     return getCharArray(beginFunctionMonth800,FUNCTION_MONTH_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean functionMonth800IsNumeric() {
	    return isNumeric(beginFunctionMonth800
	                    ,beginFunctionMonth800 + FUNCTION_MONTH_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FUNCTION_MONTH_800_LEN = 2;
  	/**
	 * serializeFunctionMonth800
	 */
	protected void serializeFunctionMonth800(int functionMonth800) {
		 putNumber(beginFunctionMonth800,functionMonth800,FUNCTION_MONTH_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFunctionMonth800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFunctionMonth800
	 */
   	protected  int serializeFunctionMonth800(char[] value) {
	    int  functionMonth800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    functionMonth800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginFunctionMonth800
		       ,2
		      );
		 localFunctionMonth800Counter = shareString.getSerializedField().getModifiedCounter();
		return  functionMonth800;
    }

   protected int checkFunctionMonth800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFunctionMonth800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFunctionMonth800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFunctionMonth800
			                 ,FUNCTION_MONTH_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("functionMonth800", beginFunctionMonth800,FUNCTION_MONTH_800_LEN);
    }
   	}
     int localFunctionDay800Counter = -1;
     public boolean isFunctionDay800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionDay800Counter != sharedCounter;
         localFunctionDay800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of functionDay800
	 *	@return functionDay800
	 */
	public char[]  getFunctionDay800String() {
	     return getCharArray(beginFunctionDay800,FUNCTION_DAY_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean functionDay800IsNumeric() {
	    return isNumeric(beginFunctionDay800
	                    ,beginFunctionDay800 + FUNCTION_DAY_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FUNCTION_DAY_800_LEN = 2;
  	/**
	 * serializeFunctionDay800
	 */
	protected void serializeFunctionDay800(int functionDay800) {
		 putNumber(beginFunctionDay800,functionDay800,FUNCTION_DAY_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFunctionDay800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFunctionDay800
	 */
   	protected  int serializeFunctionDay800(char[] value) {
	    int  functionDay800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    functionDay800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginFunctionDay800
		       ,2
		      );
		 localFunctionDay800Counter = shareString.getSerializedField().getModifiedCounter();
		return  functionDay800;
    }

   protected int checkFunctionDay800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFunctionDay800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFunctionDay800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFunctionDay800
			                 ,FUNCTION_DAY_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("functionDay800", beginFunctionDay800,FUNCTION_DAY_800_LEN);
    }
   	}




}
  
