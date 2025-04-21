package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01ReturnDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01ReturnDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01ReturnDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_RETURN_DATA_LENGTH = 6900;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01ReturnCode;
            protected  int beginBdms01ReturnSqlcode;
            protected  int beginBdms01RegCode;
	
	/**
	* Constructor for Bdms01ReturnDataSerialized
	**/
    public Bdms01ReturnDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01ReturnDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01ReturnDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01ReturnDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,100); // serialize this field at offset 100 by default 
    }
    
	/**
	* sets parent for this Bdms01ReturnDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 100 by default
    }    
	/**
	* initializes the field in Bdms01ReturnDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_RETURN_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01ReturnCode = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01ReturnSqlcode = getStartOffset() + 2;	// set offset for serialization
  
  
             beginBdms01RegCode = getStartOffset() + 14;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localBdms01ReturnCodeCounter = -1;
     public boolean isBdms01ReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ReturnCodeCounter != sharedCounter;
         localBdms01ReturnCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RETURN_CODE_LEN = 2;
	/**
	 * 	serialize this Bdms01ReturnCode
	 */
   protected void serializeBdms01ReturnCode(char[] bdms01ReturnCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ReturnCode,0,getStringValue(),beginBdms01ReturnCode,BDMS_01_RETURN_CODE_LEN);
       localBdms01ReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ReturnCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01ReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ReturnCode() {	 
   		return (substring(getStringValue(),beginBdms01ReturnCode,beginBdms01ReturnCode + BDMS_01_RETURN_CODE_LEN));
   	}
     int localBdms01ReturnSqlcodeCounter = -1;
     public boolean isBdms01ReturnSqlcodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ReturnSqlcodeCounter != sharedCounter;
         localBdms01ReturnSqlcodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01ReturnSqlcode
	 *	@return bdms01ReturnSqlcode
	 */
	public char[]  getBdms01ReturnSqlcodeString() {
	     return getCharArray(beginBdms01ReturnSqlcode,BDMS_01_RETURN_SQLCODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01ReturnSqlcodeIsNumeric() {
	    return isNumeric(beginBdms01ReturnSqlcode
	                    ,beginBdms01ReturnSqlcode + BDMS_01_RETURN_SQLCODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_RETURN_SQLCODE_LEN = 4;
  	/**
	 * serializeBdms01ReturnSqlcode
	 */
	protected void serializeBdms01ReturnSqlcode(int bdms01ReturnSqlcode) {
		 putNumber(beginBdms01ReturnSqlcode,bdms01ReturnSqlcode,BDMS_01_RETURN_SQLCODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01ReturnSqlcodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01ReturnSqlcode
	 */
   	protected  int serializeBdms01ReturnSqlcode(char[] value) {
	    int  bdms01ReturnSqlcode;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01ReturnSqlcode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01ReturnSqlcode
		       ,4
		      );
		 localBdms01ReturnSqlcodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01ReturnSqlcode;
    }

   protected int checkBdms01ReturnSqlcodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01ReturnSqlcode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01ReturnSqlcode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01ReturnSqlcode
			                 ,BDMS_01_RETURN_SQLCODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01ReturnSqlcode", beginBdms01ReturnSqlcode,BDMS_01_RETURN_SQLCODE_LEN);
    }
   	}
     int localBdms01RegCodeCounter = -1;
     public boolean isBdms01RegCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RegCodeCounter != sharedCounter;
         localBdms01RegCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_REG_CODE_LEN = 2;
	/**
	 * 	serialize this Bdms01RegCode
	 */
   protected void serializeBdms01RegCode(char[] bdms01RegCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RegCode,0,getStringValue(),beginBdms01RegCode,BDMS_01_REG_CODE_LEN);
       localBdms01RegCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RegCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01RegCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RegCode() {	 
   		return (substring(getStringValue(),beginBdms01RegCode,beginBdms01RegCode + BDMS_01_REG_CODE_LEN));
   	}




}
  
