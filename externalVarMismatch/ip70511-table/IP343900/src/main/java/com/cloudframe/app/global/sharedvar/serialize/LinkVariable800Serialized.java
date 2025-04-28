package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class LinkVariable800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LinkVariable800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LinkVariable800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LINK_VARIABLE_800_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLnFacreqJobgrpName800;
            protected  int beginLnFacreqJobgrpNum800;
            protected  int beginLnCloneOwnerId800;
            protected  int beginLnParm911Retry800;
	
	/**
	* Constructor for LinkVariable800Serialized
	**/
    public LinkVariable800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in LinkVariable800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LINK_VARIABLE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLnFacreqJobgrpName800 = getStartOffset() + 0;	// set offset for serialization
  
             beginLnFacreqJobgrpNum800 = getStartOffset() + 6;	// set offset for serialization
  
             beginLnCloneOwnerId800 = getStartOffset() + 8;	// set offset for serialization
  
             beginLnParm911Retry800 = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLnFacreqJobgrpName800Counter = -1;
     public boolean isLnFacreqJobgrpName800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLnFacreqJobgrpName800Counter != sharedCounter;
         localLnFacreqJobgrpName800Counter = sharedCounter; return hasModified;
     }
	protected static final int LN_FACREQ_JOBGRP_NAME_800_LEN = 6;
	/**
	 * 	serialize this LnFacreqJobgrpName800
	 */
   protected void serializeLnFacreqJobgrpName800(char[] lnFacreqJobgrpName800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lnFacreqJobgrpName800,0,getStringValue(),beginLnFacreqJobgrpName800,LN_FACREQ_JOBGRP_NAME_800_LEN);
       localLnFacreqJobgrpName800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLnFacreqJobgrpName800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshLnFacreqJobgrpName800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLnFacreqJobgrpName800() {	 
   		return (substring(getStringValue(),beginLnFacreqJobgrpName800,beginLnFacreqJobgrpName800 + LN_FACREQ_JOBGRP_NAME_800_LEN));
   	}
     int localLnFacreqJobgrpNum800Counter = -1;
     public boolean isLnFacreqJobgrpNum800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLnFacreqJobgrpNum800Counter != sharedCounter;
         localLnFacreqJobgrpNum800Counter = sharedCounter; return hasModified;
     }
	protected static final int LN_FACREQ_JOBGRP_NUM_800_LEN = 2;
	/**
	 * 	serialize this LnFacreqJobgrpNum800
	 */
   protected void serializeLnFacreqJobgrpNum800(char[] lnFacreqJobgrpNum800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lnFacreqJobgrpNum800,0,getStringValue(),beginLnFacreqJobgrpNum800,LN_FACREQ_JOBGRP_NUM_800_LEN);
       localLnFacreqJobgrpNum800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLnFacreqJobgrpNum800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLnFacreqJobgrpNum800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLnFacreqJobgrpNum800() {	 
   		return (substring(getStringValue(),beginLnFacreqJobgrpNum800,beginLnFacreqJobgrpNum800 + LN_FACREQ_JOBGRP_NUM_800_LEN));
   	}
     int localLnCloneOwnerId800Counter = -1;
     public boolean isLnCloneOwnerId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLnCloneOwnerId800Counter != sharedCounter;
         localLnCloneOwnerId800Counter = sharedCounter; return hasModified;
     }
	protected static final int LN_CLONE_OWNER_ID_800_LEN = 3;
	/**
	 * 	serialize this LnCloneOwnerId800
	 */
   protected void serializeLnCloneOwnerId800(char[] lnCloneOwnerId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lnCloneOwnerId800,0,getStringValue(),beginLnCloneOwnerId800,LN_CLONE_OWNER_ID_800_LEN);
       localLnCloneOwnerId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLnCloneOwnerId800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLnCloneOwnerId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLnCloneOwnerId800() {	 
   		return (substring(getStringValue(),beginLnCloneOwnerId800,beginLnCloneOwnerId800 + LN_CLONE_OWNER_ID_800_LEN));
   	}
     int localLnParm911Retry800Counter = -1;
     public boolean isLnParm911Retry800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLnParm911Retry800Counter != sharedCounter;
         localLnParm911Retry800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lnParm911Retry800
	 *	@return lnParm911Retry800
	 */
	public char[]  getLnParm911Retry800String() {
	     return getCharArray(beginLnParm911Retry800,LN_PARM_911_RETRY_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lnParm911Retry800IsNumeric() {
	    return isNumeric(beginLnParm911Retry800
	                    ,beginLnParm911Retry800 + LN_PARM_911_RETRY_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LN_PARM_911_RETRY_800_LEN = 2;
  	/**
	 * serializeLnParm911Retry800
	 */
	protected void serializeLnParm911Retry800(int lnParm911Retry800) {
		 putNumber(beginLnParm911Retry800,lnParm911Retry800,LN_PARM_911_RETRY_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLnParm911Retry800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLnParm911Retry800
	 */
   	protected  int serializeLnParm911Retry800(char[] value) {
	    int  lnParm911Retry800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lnParm911Retry800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginLnParm911Retry800
		       ,2
		      );
		 localLnParm911Retry800Counter = shareString.getSerializedField().getModifiedCounter();
		return  lnParm911Retry800;
    }

   protected int checkLnParm911Retry800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLnParm911Retry800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLnParm911Retry800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginLnParm911Retry800
			                 ,LN_PARM_911_RETRY_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lnParm911Retry800", beginLnParm911Retry800,LN_PARM_911_RETRY_800_LEN);
    }
   	}




}
  
