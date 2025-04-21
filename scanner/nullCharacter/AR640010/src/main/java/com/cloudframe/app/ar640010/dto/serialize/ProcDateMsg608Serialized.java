package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ProcDateMsg608Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ProcDateMsg608Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ProcDateMsg608Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PROC_DATE_MSG_608_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginProcDate608;
            protected  int beginProcJulDay608;
	
	/**
	* Constructor for ProcDateMsg608Serialized
	**/
    public ProcDateMsg608Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ProcDateMsg608Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PROC_DATE_MSG_608_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginProcDate608 = getStartOffset() + 16;	// set offset for serialization
  
  
             beginProcJulDay608 = getStartOffset() + 28;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localProcDate608Counter = -1;
     public boolean isProcDate608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcDate608Counter != sharedCounter;
         localProcDate608Counter = sharedCounter; return hasModified;
     }
	protected static final int PROC_DATE_608_LEN = 10;
	/**
	 * 	serialize this ProcDate608
	 */
   protected void serializeProcDate608(char[] procDate608) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(procDate608,0,getStringValue(),beginProcDate608,PROC_DATE_608_LEN);
       localProcDate608Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProcDate608Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshProcDate608 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProcDate608() {	 
   		return (substring(getStringValue(),beginProcDate608,beginProcDate608 + PROC_DATE_608_LEN));
   	}
     int localProcJulDay608Counter = -1;
     public boolean isProcJulDay608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcJulDay608Counter != sharedCounter;
         localProcJulDay608Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of procJulDay608
	 *	@return procJulDay608
	 */
	public char[]  getProcJulDay608String() {
	     return getCharArray(beginProcJulDay608,PROC_JUL_DAY_608_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean procJulDay608IsNumeric() {
	    return isNumeric(beginProcJulDay608
	                    ,beginProcJulDay608 + PROC_JUL_DAY_608_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PROC_JUL_DAY_608_LEN = 3;
  	/**
	 * serializeProcJulDay608
	 */
	protected void serializeProcJulDay608(int procJulDay608) {
		 putNumber(beginProcJulDay608,procJulDay608,PROC_JUL_DAY_608_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localProcJulDay608Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeProcJulDay608
	 */
   	protected  int serializeProcJulDay608(char[] value) {
	    int  procJulDay608;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    procJulDay608 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginProcJulDay608
		       ,3
		      );
		 localProcJulDay608Counter = shareString.getSerializedField().getModifiedCounter();
		return  procJulDay608;
    }

   protected int checkProcJulDay608MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshProcJulDay608 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshProcJulDay608() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginProcJulDay608
			                 ,PROC_JUL_DAY_608_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("procJulDay608", beginProcJulDay608,PROC_JUL_DAY_608_LEN);
    }
   	}




}
  
