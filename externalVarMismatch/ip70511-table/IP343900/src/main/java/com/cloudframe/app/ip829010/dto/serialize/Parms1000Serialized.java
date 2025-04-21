package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class Parms1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Parms1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Parms1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARMS_1000_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLnFacreqJobgrpName1000;
            protected  int beginLnFacreqJobgrpNum1000;
            protected  int beginLnCloneOwnerId1000;
            protected  int beginLnParm911Retry1000;
            protected  int beginLnMqDebugSw1000;
	
	/**
	* Constructor for Parms1000Serialized
	**/
    public Parms1000Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Parms1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARMS_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginLnFacreqJobgrpName1000 = getStartOffset() + 2;	// set offset for serialization
  
             beginLnFacreqJobgrpNum1000 = getStartOffset() + 8;	// set offset for serialization
  
  
             beginLnCloneOwnerId1000 = getStartOffset() + 11;	// set offset for serialization
  
  
             beginLnParm911Retry1000 = getStartOffset() + 15;	// set offset for serialization
  
  
             beginLnMqDebugSw1000 = getStartOffset() + 18;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localLnFacreqJobgrpName1000Counter = -1;
     public boolean isLnFacreqJobgrpName1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLnFacreqJobgrpName1000Counter != sharedCounter;
         localLnFacreqJobgrpName1000Counter = sharedCounter; return hasModified;
     }
	protected static final int LN_FACREQ_JOBGRP_NAME_1000_LEN = 6;
	/**
	 * 	serialize this LnFacreqJobgrpName1000
	 */
   protected void serializeLnFacreqJobgrpName1000(char[] lnFacreqJobgrpName1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lnFacreqJobgrpName1000,0,getStringValue(),beginLnFacreqJobgrpName1000,LN_FACREQ_JOBGRP_NAME_1000_LEN);
       localLnFacreqJobgrpName1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLnFacreqJobgrpName1000Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshLnFacreqJobgrpName1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLnFacreqJobgrpName1000() {	 
   		return (substring(getStringValue(),beginLnFacreqJobgrpName1000,beginLnFacreqJobgrpName1000 + LN_FACREQ_JOBGRP_NAME_1000_LEN));
   	}
     int localLnFacreqJobgrpNum1000Counter = -1;
     public boolean isLnFacreqJobgrpNum1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLnFacreqJobgrpNum1000Counter != sharedCounter;
         localLnFacreqJobgrpNum1000Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lnFacreqJobgrpNum1000
	 *	@return lnFacreqJobgrpNum1000
	 */
	public char[]  getLnFacreqJobgrpNum1000String() {
	     return getCharArray(beginLnFacreqJobgrpNum1000,LN_FACREQ_JOBGRP_NUM_1000_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lnFacreqJobgrpNum1000IsNumeric() {
	    return isNumeric(beginLnFacreqJobgrpNum1000
	                    ,beginLnFacreqJobgrpNum1000 + LN_FACREQ_JOBGRP_NUM_1000_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LN_FACREQ_JOBGRP_NUM_1000_LEN = 2;
  	/**
	 * serializeLnFacreqJobgrpNum1000
	 */
	protected void serializeLnFacreqJobgrpNum1000(int lnFacreqJobgrpNum1000) {
		 putNumber(beginLnFacreqJobgrpNum1000,lnFacreqJobgrpNum1000,LN_FACREQ_JOBGRP_NUM_1000_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLnFacreqJobgrpNum1000Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLnFacreqJobgrpNum1000
	 */
   	protected  int serializeLnFacreqJobgrpNum1000(char[] value) {
	    int  lnFacreqJobgrpNum1000;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lnFacreqJobgrpNum1000 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginLnFacreqJobgrpNum1000
		       ,2
		      );
		 localLnFacreqJobgrpNum1000Counter = shareString.getSerializedField().getModifiedCounter();
		return  lnFacreqJobgrpNum1000;
    }

   protected int checkLnFacreqJobgrpNum1000MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLnFacreqJobgrpNum1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLnFacreqJobgrpNum1000() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginLnFacreqJobgrpNum1000
			                 ,LN_FACREQ_JOBGRP_NUM_1000_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lnFacreqJobgrpNum1000", beginLnFacreqJobgrpNum1000,LN_FACREQ_JOBGRP_NUM_1000_LEN);
    }
   	}
     int localLnCloneOwnerId1000Counter = -1;
     public boolean isLnCloneOwnerId1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLnCloneOwnerId1000Counter != sharedCounter;
         localLnCloneOwnerId1000Counter = sharedCounter; return hasModified;
     }
	protected static final int LN_CLONE_OWNER_ID_1000_LEN = 3;
	/**
	 * 	serialize this LnCloneOwnerId1000
	 */
   protected void serializeLnCloneOwnerId1000(char[] lnCloneOwnerId1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lnCloneOwnerId1000,0,getStringValue(),beginLnCloneOwnerId1000,LN_CLONE_OWNER_ID_1000_LEN);
       localLnCloneOwnerId1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLnCloneOwnerId1000Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLnCloneOwnerId1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLnCloneOwnerId1000() {	 
   		return (substring(getStringValue(),beginLnCloneOwnerId1000,beginLnCloneOwnerId1000 + LN_CLONE_OWNER_ID_1000_LEN));
   	}
     int localLnParm911Retry1000Counter = -1;
     public boolean isLnParm911Retry1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLnParm911Retry1000Counter != sharedCounter;
         localLnParm911Retry1000Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lnParm911Retry1000
	 *	@return lnParm911Retry1000
	 */
	public char[]  getLnParm911Retry1000String() {
	     return getCharArray(beginLnParm911Retry1000,LN_PARM_911_RETRY_1000_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lnParm911Retry1000IsNumeric() {
	    return isNumeric(beginLnParm911Retry1000
	                    ,beginLnParm911Retry1000 + LN_PARM_911_RETRY_1000_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LN_PARM_911_RETRY_1000_LEN = 2;
  	/**
	 * serializeLnParm911Retry1000
	 */
	protected void serializeLnParm911Retry1000(int lnParm911Retry1000) {
		 putNumber(beginLnParm911Retry1000,lnParm911Retry1000,LN_PARM_911_RETRY_1000_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLnParm911Retry1000Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLnParm911Retry1000
	 */
   	protected  int serializeLnParm911Retry1000(char[] value) {
	    int  lnParm911Retry1000;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lnParm911Retry1000 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginLnParm911Retry1000
		       ,2
		      );
		 localLnParm911Retry1000Counter = shareString.getSerializedField().getModifiedCounter();
		return  lnParm911Retry1000;
    }

   protected int checkLnParm911Retry1000MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLnParm911Retry1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLnParm911Retry1000() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginLnParm911Retry1000
			                 ,LN_PARM_911_RETRY_1000_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lnParm911Retry1000", beginLnParm911Retry1000,LN_PARM_911_RETRY_1000_LEN);
    }
   	}
     int localLnMqDebugSw1000Counter = -1;
     public boolean isLnMqDebugSw1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLnMqDebugSw1000Counter != sharedCounter;
         localLnMqDebugSw1000Counter = sharedCounter; return hasModified;
     }
	protected static final int LN_MQ_DEBUG_SW_1000_LEN = 1;
	/**
	 * 	serialize this LnMqDebugSw1000
	 */
   protected void serializeLnMqDebugSw1000(char[] lnMqDebugSw1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lnMqDebugSw1000,0,getStringValue(),beginLnMqDebugSw1000,LN_MQ_DEBUG_SW_1000_LEN);
       localLnMqDebugSw1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLnMqDebugSw1000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLnMqDebugSw1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLnMqDebugSw1000() {	 
   		return (substring(getStringValue(),beginLnMqDebugSw1000,beginLnMqDebugSw1000 + LN_MQ_DEBUG_SW_1000_LEN));
   	}




}
  
