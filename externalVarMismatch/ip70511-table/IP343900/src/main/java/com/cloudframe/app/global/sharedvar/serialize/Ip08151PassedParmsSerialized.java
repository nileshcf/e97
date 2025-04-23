package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip08151PassedParmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip08151PassedParmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip08151PassedParmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_08151_PASSED_PARMS_LENGTH = 19;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp08151PassedAcctNbr;
	
	/**
	* Constructor for Ip08151PassedParmsSerialized
	**/
    public Ip08151PassedParmsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip08151PassedParmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_08151_PASSED_PARMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp08151PassedAcctNbr = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp08151PassedAcctNbrCounter = -1;
     public boolean isIp08151PassedAcctNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08151PassedAcctNbrCounter != sharedCounter;
         localIp08151PassedAcctNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08151_PASSED_ACCT_NBR_LEN = 19;
	/**
	 * 	serialize this Ip08151PassedAcctNbr
	 */
   protected void serializeIp08151PassedAcctNbr(char[] ip08151PassedAcctNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08151PassedAcctNbr,0,getStringValue(),beginIp08151PassedAcctNbr,IP_08151_PASSED_ACCT_NBR_LEN);
       localIp08151PassedAcctNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08151PassedAcctNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp08151PassedAcctNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08151PassedAcctNbr() {	 
   		return (substring(getStringValue(),beginIp08151PassedAcctNbr,beginIp08151PassedAcctNbr + IP_08151_PASSED_ACCT_NBR_LEN));
   	}




}
  
