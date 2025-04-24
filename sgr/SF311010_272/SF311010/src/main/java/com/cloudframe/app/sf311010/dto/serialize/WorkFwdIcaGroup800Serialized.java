package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class WorkFwdIcaGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkFwdIcaGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkFwdIcaGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_FWD_ICA_GROUP_800_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWorkFwdIca800;
	
	/**
	* Constructor for WorkFwdIcaGroup800Serialized
	**/
    public WorkFwdIcaGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkFwdIcaGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_FWD_ICA_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWorkFwdIca800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWorkFwdIca800Counter = -1;
     public boolean isWorkFwdIca800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWorkFwdIca800Counter != sharedCounter;
         localWorkFwdIca800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of workFwdIca800
	 *	@return workFwdIca800
	 */
	public char[]  getWorkFwdIca800String() {
	     return getCharArray(beginWorkFwdIca800,WORK_FWD_ICA_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workFwdIca800IsNumeric() {
	    return isNumeric(beginWorkFwdIca800
	                    ,beginWorkFwdIca800 + WORK_FWD_ICA_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WORK_FWD_ICA_800_LEN = 6;
  	/**
	 * serializeWorkFwdIca800
	 */
	protected void serializeWorkFwdIca800(long workFwdIca800) {
		 putNumber(beginWorkFwdIca800,workFwdIca800,WORK_FWD_ICA_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWorkFwdIca800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWorkFwdIca800
	 */
   	protected  long serializeWorkFwdIca800(char[] value) {
	    long  workFwdIca800;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    workFwdIca800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginWorkFwdIca800
		       ,6
		      );
		 localWorkFwdIca800Counter = shareString.getSerializedField().getModifiedCounter();
		return  workFwdIca800;
    }

   protected long checkWorkFwdIca800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWorkFwdIca800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWorkFwdIca800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWorkFwdIca800
			                 ,WORK_FWD_ICA_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("workFwdIca800", beginWorkFwdIca800,WORK_FWD_ICA_800_LEN);
    }
   	}




}
  
