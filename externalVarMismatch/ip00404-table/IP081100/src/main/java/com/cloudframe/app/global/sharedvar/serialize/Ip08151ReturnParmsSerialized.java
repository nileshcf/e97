package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip08151ReturnParmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip08151ReturnParmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip08151ReturnParmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_08151_RETURN_PARMS_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp08151ReturnPrtnNbr;
            protected  int beginIp08151ReturnAcctNbrL;
	
	/**
	* Constructor for Ip08151ReturnParmsSerialized
	**/
    public Ip08151ReturnParmsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip08151ReturnParmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_08151_RETURN_PARMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp08151ReturnPrtnNbr = getStartOffset() + 0;	// set offset for serialization
  
             beginIp08151ReturnAcctNbrL = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp08151ReturnPrtnNbrCounter = -1;
     public boolean isIp08151ReturnPrtnNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08151ReturnPrtnNbrCounter != sharedCounter;
         localIp08151ReturnPrtnNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08151_RETURN_PRTN_NBR_LEN = 3;
	/**
	 * 	serialize this Ip08151ReturnPrtnNbr
	 */
   protected void serializeIp08151ReturnPrtnNbr(char[] ip08151ReturnPrtnNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08151ReturnPrtnNbr,0,getStringValue(),beginIp08151ReturnPrtnNbr,IP_08151_RETURN_PRTN_NBR_LEN);
       localIp08151ReturnPrtnNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08151ReturnPrtnNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp08151ReturnPrtnNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08151ReturnPrtnNbr() {	 
   		return (substring(getStringValue(),beginIp08151ReturnPrtnNbr,beginIp08151ReturnPrtnNbr + IP_08151_RETURN_PRTN_NBR_LEN));
   	}
         int localIp08151ReturnAcctNbrLCounter = -1;
         public boolean isIp08151ReturnAcctNbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp08151ReturnAcctNbrLCounter != sharedCounter;
            localIp08151ReturnAcctNbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_08151_RETURN_ACCT_NBR_L_LEN = 2;
  	/**
	 * serializeIp08151ReturnAcctNbrL
	 */
	protected void serializeIp08151ReturnAcctNbrL(short ip08151ReturnAcctNbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip08151ReturnAcctNbrL,IP_08151_RETURN_ACCT_NBR_L_LEN)
                  ,beginIp08151ReturnAcctNbrL
                  ,IP_08151_RETURN_ACCT_NBR_L_LEN
                 );
            localIp08151ReturnAcctNbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp08151ReturnAcctNbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp08151ReturnAcctNbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp08151ReturnAcctNbrL() {	 
			return (getShort(beginIp08151ReturnAcctNbrL));
   	}




}
  
