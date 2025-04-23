package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Ip9890hTransactionDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip9890hTransactionDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip9890hTransactionDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_9890H_TRANSACTION_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp9890hTxnDateYy;
            protected  int beginIp9890hTxnDateMm;
            protected  int beginIp9890hTxnDateDd;
	
	/**
	* Constructor for Ip9890hTransactionDateSerialized
	**/
    public Ip9890hTransactionDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip9890hTransactionDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip9890hTransactionDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip9890hTransactionDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,18); // serialize this field at offset 18 by default 
    }
    
	/**
	* sets parent for this Ip9890hTransactionDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 18 by default
    }    
	/**
	* initializes the field in Ip9890hTransactionDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_9890H_TRANSACTION_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp9890hTxnDateYy = getStartOffset() + 0;	// set offset for serialization
  
             beginIp9890hTxnDateMm = getStartOffset() + 2;	// set offset for serialization
  
             beginIp9890hTxnDateDd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp9890hTxnDateYyCounter = -1;
     public boolean isIp9890hTxnDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hTxnDateYyCounter != sharedCounter;
         localIp9890hTxnDateYyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_9890H_TXN_DATE_YY_LEN = 2;
	/**
	 * 	serialize this Ip9890hTxnDateYy
	 */
   protected void serializeIp9890hTxnDateYy(char[] ip9890hTxnDateYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip9890hTxnDateYy,0,getStringValue(),beginIp9890hTxnDateYy,IP_9890H_TXN_DATE_YY_LEN);
       localIp9890hTxnDateYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp9890hTxnDateYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp9890hTxnDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp9890hTxnDateYy() {	 
   		return (substring(getStringValue(),beginIp9890hTxnDateYy,beginIp9890hTxnDateYy + IP_9890H_TXN_DATE_YY_LEN));
   	}
     int localIp9890hTxnDateMmCounter = -1;
     public boolean isIp9890hTxnDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hTxnDateMmCounter != sharedCounter;
         localIp9890hTxnDateMmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_9890H_TXN_DATE_MM_LEN = 2;
	/**
	 * 	serialize this Ip9890hTxnDateMm
	 */
   protected void serializeIp9890hTxnDateMm(char[] ip9890hTxnDateMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip9890hTxnDateMm,0,getStringValue(),beginIp9890hTxnDateMm,IP_9890H_TXN_DATE_MM_LEN);
       localIp9890hTxnDateMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp9890hTxnDateMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp9890hTxnDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp9890hTxnDateMm() {	 
   		return (substring(getStringValue(),beginIp9890hTxnDateMm,beginIp9890hTxnDateMm + IP_9890H_TXN_DATE_MM_LEN));
   	}
     int localIp9890hTxnDateDdCounter = -1;
     public boolean isIp9890hTxnDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hTxnDateDdCounter != sharedCounter;
         localIp9890hTxnDateDdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_9890H_TXN_DATE_DD_LEN = 2;
	/**
	 * 	serialize this Ip9890hTxnDateDd
	 */
   protected void serializeIp9890hTxnDateDd(char[] ip9890hTxnDateDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip9890hTxnDateDd,0,getStringValue(),beginIp9890hTxnDateDd,IP_9890H_TXN_DATE_DD_LEN);
       localIp9890hTxnDateDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp9890hTxnDateDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp9890hTxnDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp9890hTxnDateDd() {	 
   		return (substring(getStringValue(),beginIp9890hTxnDateDd,beginIp9890hTxnDateDd + IP_9890H_TXN_DATE_DD_LEN));
   	}




}
  
