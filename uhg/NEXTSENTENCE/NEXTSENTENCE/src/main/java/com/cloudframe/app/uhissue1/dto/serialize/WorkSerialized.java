package com.cloudframe.app.uhissue1.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:23. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFlag1;
            protected  int beginFlag2;
            protected  int beginFlag3;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFlag1 = getStartOffset() + 0;	// set offset for serialization
  
             beginFlag2 = getStartOffset() + 1;	// set offset for serialization
  
             beginFlag3 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFlag1Counter = -1;
     public boolean isFlag1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFlag1Counter != sharedCounter;
         localFlag1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of flag1
	 *	@return flag1
	 */
	public char[]  getFlag1String() {
	     return getCharArray(beginFlag1,FLAG_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean flag1IsNumeric() {
	    return isNumeric(beginFlag1
	                    ,beginFlag1 + FLAG_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FLAG_1_LEN = 1;
  	/**
	 * serializeFlag1
	 */
	protected void serializeFlag1(int flag1) {
		 putNumber(beginFlag1,flag1,FLAG_1_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFlag1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFlag1
	 */
   	protected  int serializeFlag1(char[] value) {
	    int  flag1;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    flag1 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginFlag1
		       ,1
		      );
		 localFlag1Counter = shareString.getSerializedField().getModifiedCounter();
		return  flag1;
    }

   protected int checkFlag1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFlag1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFlag1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFlag1
			                 ,FLAG_1_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("flag1", beginFlag1,FLAG_1_LEN);
    }
   	}
     int localFlag2Counter = -1;
     public boolean isFlag2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFlag2Counter != sharedCounter;
         localFlag2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of flag2
	 *	@return flag2
	 */
	public char[]  getFlag2String() {
	     return getCharArray(beginFlag2,FLAG_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean flag2IsNumeric() {
	    return isNumeric(beginFlag2
	                    ,beginFlag2 + FLAG_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FLAG_2_LEN = 1;
  	/**
	 * serializeFlag2
	 */
	protected void serializeFlag2(int flag2) {
		 putNumber(beginFlag2,flag2,FLAG_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFlag2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFlag2
	 */
   	protected  int serializeFlag2(char[] value) {
	    int  flag2;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    flag2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginFlag2
		       ,1
		      );
		 localFlag2Counter = shareString.getSerializedField().getModifiedCounter();
		return  flag2;
    }

   protected int checkFlag2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFlag2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFlag2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFlag2
			                 ,FLAG_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("flag2", beginFlag2,FLAG_2_LEN);
    }
   	}
     int localFlag3Counter = -1;
     public boolean isFlag3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFlag3Counter != sharedCounter;
         localFlag3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of flag3
	 *	@return flag3
	 */
	public char[]  getFlag3String() {
	     return getCharArray(beginFlag3,FLAG_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean flag3IsNumeric() {
	    return isNumeric(beginFlag3
	                    ,beginFlag3 + FLAG_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FLAG_3_LEN = 1;
  	/**
	 * serializeFlag3
	 */
	protected void serializeFlag3(int flag3) {
		 putNumber(beginFlag3,flag3,FLAG_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFlag3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFlag3
	 */
   	protected  int serializeFlag3(char[] value) {
	    int  flag3;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    flag3 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginFlag3
		       ,1
		      );
		 localFlag3Counter = shareString.getSerializedField().getModifiedCounter();
		return  flag3;
    }

   protected int checkFlag3MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFlag3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFlag3() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFlag3
			                 ,FLAG_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("flag3", beginFlag3,FLAG_3_LEN);
    }
   	}




}
  
