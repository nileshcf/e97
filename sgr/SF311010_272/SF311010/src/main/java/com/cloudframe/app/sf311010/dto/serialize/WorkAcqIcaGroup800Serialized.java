package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class WorkAcqIcaGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkAcqIcaGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkAcqIcaGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_ACQ_ICA_GROUP_800_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWorkAcqIca800;
	
	/**
	* Constructor for WorkAcqIcaGroup800Serialized
	**/
    public WorkAcqIcaGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkAcqIcaGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_ACQ_ICA_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWorkAcqIca800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWorkAcqIca800Counter = -1;
     public boolean isWorkAcqIca800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWorkAcqIca800Counter != sharedCounter;
         localWorkAcqIca800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of workAcqIca800
	 *	@return workAcqIca800
	 */
	public char[]  getWorkAcqIca800String() {
	     return getCharArray(beginWorkAcqIca800,WORK_ACQ_ICA_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workAcqIca800IsNumeric() {
	    return isNumeric(beginWorkAcqIca800
	                    ,beginWorkAcqIca800 + WORK_ACQ_ICA_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WORK_ACQ_ICA_800_LEN = 6;
  	/**
	 * serializeWorkAcqIca800
	 */
	protected void serializeWorkAcqIca800(long workAcqIca800) {
		 putNumber(beginWorkAcqIca800,workAcqIca800,WORK_ACQ_ICA_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWorkAcqIca800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWorkAcqIca800
	 */
   	protected  long serializeWorkAcqIca800(char[] value) {
	    long  workAcqIca800;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    workAcqIca800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginWorkAcqIca800
		       ,6
		      );
		 localWorkAcqIca800Counter = shareString.getSerializedField().getModifiedCounter();
		return  workAcqIca800;
    }

   protected long checkWorkAcqIca800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWorkAcqIca800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWorkAcqIca800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWorkAcqIca800
			                 ,WORK_ACQ_ICA_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("workAcqIca800", beginWorkAcqIca800,WORK_ACQ_ICA_800_LEN);
    }
   	}




}
  
