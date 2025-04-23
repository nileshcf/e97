package com.cloudframe.app.mc154.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCnst1300;
            protected  int beginCnst4300;
            protected  int beginCnst9999300;
	
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
  
             beginCnst1300 = getStartOffset() + 0;	// set offset for serialization
  
             beginCnst4300 = getStartOffset() + 1;	// set offset for serialization
  
             beginCnst9999300 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys009CntlKeyCounter = -1;
     public boolean isSys009CntlKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys009CntlKeyCounter != sharedCounter;
         localSys009CntlKeyCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSys009CntlKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localCnst1300Counter = -1;
     public boolean isCnst1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCnst1300Counter != sharedCounter;
         localCnst1300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cnst1300
	 *	@return cnst1300
	 */
	public char[]  getCnst1300String() {
	     return getCharArray(beginCnst1300,CNST_1300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cnst1300IsNumeric() {
	    return isNumeric(beginCnst1300
	                    ,beginCnst1300 + CNST_1300_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CNST_1300_LEN = 1;
  	/**
	 * serializeCnst1300
	 */
	protected void serializeCnst1300(short cnst1300) {
		 putNumber(beginCnst1300,cnst1300,CNST_1300_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCnst1300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCnst1300
	 */
   	protected  short serializeCnst1300(char[] value) {
	    short  cnst1300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cnst1300 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,true/*isSigned?*/)
		       ,beginCnst1300
		       ,1
		      );
		 localCnst1300Counter = shareString.getSerializedField().getModifiedCounter();
		return  cnst1300;
    }

   protected short checkCnst1300MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshCnst1300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCnst1300() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginCnst1300
			                 ,CNST_1300_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cnst1300", beginCnst1300,CNST_1300_LEN);
    }
   	}
     int localCnst4300Counter = -1;
     public boolean isCnst4300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCnst4300Counter != sharedCounter;
         localCnst4300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cnst4300
	 *	@return cnst4300
	 */
	public char[]  getCnst4300String() {
	     return getCharArray(beginCnst4300,CNST_4300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cnst4300IsNumeric() {
	    return isNumeric(beginCnst4300
	                    ,beginCnst4300 + CNST_4300_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CNST_4300_LEN = 1;
  	/**
	 * serializeCnst4300
	 */
	protected void serializeCnst4300(short cnst4300) {
		 putNumber(beginCnst4300,cnst4300,CNST_4300_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCnst4300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCnst4300
	 */
   	protected  short serializeCnst4300(char[] value) {
	    short  cnst4300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cnst4300 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,true/*isSigned?*/)
		       ,beginCnst4300
		       ,1
		      );
		 localCnst4300Counter = shareString.getSerializedField().getModifiedCounter();
		return  cnst4300;
    }

   protected short checkCnst4300MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshCnst4300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCnst4300() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginCnst4300
			                 ,CNST_4300_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cnst4300", beginCnst4300,CNST_4300_LEN);
    }
   	}
     int localCnst9999300Counter = -1;
     public boolean isCnst9999300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCnst9999300Counter != sharedCounter;
         localCnst9999300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cnst9999300
	 *	@return cnst9999300
	 */
	public char[]  getCnst9999300String() {
	     return getCharArray(beginCnst9999300,CNST_9999300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cnst9999300IsNumeric() {
	    return isNumeric(beginCnst9999300
	                    ,beginCnst9999300 + CNST_9999300_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CNST_9999300_LEN = 4;
  	/**
	 * serializeCnst9999300
	 */
	protected void serializeCnst9999300(short cnst9999300) {
		 putNumber(beginCnst9999300,cnst9999300,CNST_9999300_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCnst9999300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCnst9999300
	 */
   	protected  short serializeCnst9999300(char[] value) {
	    short  cnst9999300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cnst9999300 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginCnst9999300
		       ,4
		      );
		 localCnst9999300Counter = shareString.getSerializedField().getModifiedCounter();
		return  cnst9999300;
    }

   protected short checkCnst9999300MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshCnst9999300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCnst9999300() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginCnst9999300
			                 ,CNST_9999300_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cnst9999300", beginCnst9999300,CNST_9999300_LEN);
    }
   	}




}
  
