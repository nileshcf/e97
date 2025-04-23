package com.cloudframe.app.ip798030.dto.serialize;

/**
*  The class Jobname800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Jobname800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Jobname800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int JOBNAME_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginJobGroup800;
            protected  int beginJobNumber800;
	
	/**
	* Constructor for Jobname800Serialized
	**/
    public Jobname800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Jobname800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(JOBNAME_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginJobGroup800 = getStartOffset() + 0;	// set offset for serialization
  
             beginJobNumber800 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localJobGroup800Counter = -1;
     public boolean isJobGroup800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJobGroup800Counter != sharedCounter;
         localJobGroup800Counter = sharedCounter; return hasModified;
     }
	protected static final int JOB_GROUP_800_LEN = 6;
	/**
	 * 	serialize this JobGroup800
	 */
   protected void serializeJobGroup800(char[] jobGroup800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(jobGroup800,0,getStringValue(),beginJobGroup800,JOB_GROUP_800_LEN);
       localJobGroup800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkJobGroup800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshJobGroup800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshJobGroup800() {	 
   		return (substring(getStringValue(),beginJobGroup800,beginJobGroup800 + JOB_GROUP_800_LEN));
   	}
     int localJobNumber800Counter = -1;
     public boolean isJobNumber800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJobNumber800Counter != sharedCounter;
         localJobNumber800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of jobNumber800
	 *	@return jobNumber800
	 */
	public char[]  getJobNumber800String() {
	     return getCharArray(beginJobNumber800,JOB_NUMBER_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean jobNumber800IsNumeric() {
	    return isNumeric(beginJobNumber800
	                    ,beginJobNumber800 + JOB_NUMBER_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int JOB_NUMBER_800_LEN = 2;
  	/**
	 * serializeJobNumber800
	 */
	protected void serializeJobNumber800(int jobNumber800) {
		 putNumber(beginJobNumber800,jobNumber800,JOB_NUMBER_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localJobNumber800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeJobNumber800
	 */
   	protected  int serializeJobNumber800(char[] value) {
	    int  jobNumber800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    jobNumber800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginJobNumber800
		       ,2
		      );
		 localJobNumber800Counter = shareString.getSerializedField().getModifiedCounter();
		return  jobNumber800;
    }

   protected int checkJobNumber800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshJobNumber800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshJobNumber800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginJobNumber800
			                 ,JOB_NUMBER_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("jobNumber800", beginJobNumber800,JOB_NUMBER_800_LEN);
    }
   	}




}
  
