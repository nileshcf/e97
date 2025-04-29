package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class Ov4ParameterListSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ov4ParameterListSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ov4ParameterListSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OV_4_PARAMETER_LIST_LENGTH = 525;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOv4BankNo;
            protected  int beginOv4DeptNo;
	
	/**
	* Constructor for Ov4ParameterListSerialized
	**/
    public Ov4ParameterListSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ov4ParameterListSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OV_4_PARAMETER_LIST_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOv4BankNo = getStartOffset() + 0;	// set offset for serialization
  
             beginOv4DeptNo = getStartOffset() + 3;	// set offset for serialization
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localOv4BankNoCounter = -1;
     public boolean isOv4BankNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4BankNoCounter != sharedCounter;
         localOv4BankNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4BankNo
	 *	@return ov4BankNo
	 */
	public char[]  getOv4BankNoString() {
	     return getCharArray(beginOv4BankNo,OV_4_BANK_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4BankNoIsNumeric() {
	    return isNumeric(beginOv4BankNo
	                    ,beginOv4BankNo + OV_4_BANK_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_BANK_NO_LEN = 3;
  	/**
	 * serializeOv4BankNo
	 */
	protected void serializeOv4BankNo(int ov4BankNo) {
		 putNumber(beginOv4BankNo,ov4BankNo,OV_4_BANK_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4BankNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4BankNo
	 */
   	protected  int serializeOv4BankNo(char[] value) {
	    int  ov4BankNo;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4BankNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginOv4BankNo
		       ,3
		      );
		 localOv4BankNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4BankNo;
    }

   protected int checkOv4BankNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4BankNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOv4BankNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOv4BankNo
			                 ,OV_4_BANK_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4BankNo", beginOv4BankNo,OV_4_BANK_NO_LEN);
    }
   	}
     int localOv4DeptNoCounter = -1;
     public boolean isOv4DeptNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4DeptNoCounter != sharedCounter;
         localOv4DeptNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4DeptNo
	 *	@return ov4DeptNo
	 */
	public char[]  getOv4DeptNoString() {
	     return getCharArray(beginOv4DeptNo,OV_4_DEPT_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4DeptNoIsNumeric() {
	    return isNumeric(beginOv4DeptNo
	                    ,beginOv4DeptNo + OV_4_DEPT_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_DEPT_NO_LEN = 2;
  	/**
	 * serializeOv4DeptNo
	 */
	protected void serializeOv4DeptNo(int ov4DeptNo) {
		 putNumber(beginOv4DeptNo,ov4DeptNo,OV_4_DEPT_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4DeptNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4DeptNo
	 */
   	protected  int serializeOv4DeptNo(char[] value) {
	    int  ov4DeptNo;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4DeptNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginOv4DeptNo
		       ,2
		      );
		 localOv4DeptNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4DeptNo;
    }

   protected int checkOv4DeptNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4DeptNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOv4DeptNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOv4DeptNo
			                 ,OV_4_DEPT_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4DeptNo", beginOv4DeptNo,OV_4_DEPT_NO_LEN);
    }
   	}




}
  
