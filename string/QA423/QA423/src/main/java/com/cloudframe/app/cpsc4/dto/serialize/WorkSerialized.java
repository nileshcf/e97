package com.cloudframe.app.cpsc4.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDriftDataCnt;
	
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
  
  
             beginDriftDataCnt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localS0v3DtlRecCounter = -1;
     public boolean isS0v3DtlRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localS0v3DtlRecCounter != sharedCounter;
         localS0v3DtlRecCounter = sharedCounter; return hasModified;
     }

   protected char[] checkS0v3DtlRecConstraints(char[] value) {
   			return super.checkConstraints(value , 2000 ,false, false);
   }
     int localDriftFlagCounter = -1;
     public boolean isDriftFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDriftFlagCounter != sharedCounter;
         localDriftFlagCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDriftFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localDriftDataCntCounter = -1;
     public boolean isDriftDataCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDriftDataCntCounter != sharedCounter;
         localDriftDataCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of driftDataCnt
	 *	@return driftDataCnt
	 */
	public char[]  getDriftDataCntString() {
	     return getCharArray(beginDriftDataCnt,DRIFT_DATA_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean driftDataCntIsNumeric() {
	    return isNumeric(beginDriftDataCnt
	                    ,beginDriftDataCnt + DRIFT_DATA_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DRIFT_DATA_CNT_LEN = 2;
  	/**
	 * serializeDriftDataCnt
	 */
	protected void serializeDriftDataCnt(int driftDataCnt) {
		 putNumber(beginDriftDataCnt,driftDataCnt,DRIFT_DATA_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDriftDataCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDriftDataCnt
	 */
   	protected  int serializeDriftDataCnt(char[] value) {
	    int  driftDataCnt;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    driftDataCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDriftDataCnt
		       ,2
		      );
		 localDriftDataCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  driftDataCnt;
    }

   protected int checkDriftDataCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDriftDataCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDriftDataCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDriftDataCnt
			                 ,DRIFT_DATA_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("driftDataCnt", beginDriftDataCnt,DRIFT_DATA_CNT_LEN);
    }
   	}




}
  
