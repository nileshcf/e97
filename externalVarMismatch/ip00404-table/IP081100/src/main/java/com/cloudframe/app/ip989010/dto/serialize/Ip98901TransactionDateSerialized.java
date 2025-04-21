package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Ip98901TransactionDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip98901TransactionDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip98901TransactionDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_98901_TRANSACTION_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp98901TxnDateYy;
            protected  int beginIp98901TxnDateMm;
            protected  int beginIp98901TxnDateDd;
	
	/**
	* Constructor for Ip98901TransactionDateSerialized
	**/
    public Ip98901TransactionDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip98901TransactionDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98901TransactionDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip98901TransactionDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,18); // serialize this field at offset 18 by default 
    }
    
	/**
	* sets parent for this Ip98901TransactionDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 18 by default
    }    
	/**
	* initializes the field in Ip98901TransactionDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_98901_TRANSACTION_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp98901TxnDateYy = getStartOffset() + 0;	// set offset for serialization
  
             beginIp98901TxnDateMm = getStartOffset() + 2;	// set offset for serialization
  
             beginIp98901TxnDateDd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp98901TxnDateYyCounter = -1;
     public boolean isIp98901TxnDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901TxnDateYyCounter != sharedCounter;
         localIp98901TxnDateYyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98901_TXN_DATE_YY_LEN = 2;
	/**
	 * 	serialize this Ip98901TxnDateYy
	 */
   protected void serializeIp98901TxnDateYy(char[] ip98901TxnDateYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98901TxnDateYy,0,getStringValue(),beginIp98901TxnDateYy,IP_98901_TXN_DATE_YY_LEN);
       localIp98901TxnDateYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98901TxnDateYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp98901TxnDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98901TxnDateYy() {	 
   		return (substring(getStringValue(),beginIp98901TxnDateYy,beginIp98901TxnDateYy + IP_98901_TXN_DATE_YY_LEN));
   	}
     int localIp98901TxnDateMmCounter = -1;
     public boolean isIp98901TxnDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901TxnDateMmCounter != sharedCounter;
         localIp98901TxnDateMmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98901_TXN_DATE_MM_LEN = 2;
	/**
	 * 	serialize this Ip98901TxnDateMm
	 */
   protected void serializeIp98901TxnDateMm(char[] ip98901TxnDateMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98901TxnDateMm,0,getStringValue(),beginIp98901TxnDateMm,IP_98901_TXN_DATE_MM_LEN);
       localIp98901TxnDateMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98901TxnDateMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp98901TxnDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98901TxnDateMm() {	 
   		return (substring(getStringValue(),beginIp98901TxnDateMm,beginIp98901TxnDateMm + IP_98901_TXN_DATE_MM_LEN));
   	}
     int localIp98901TxnDateDdCounter = -1;
     public boolean isIp98901TxnDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901TxnDateDdCounter != sharedCounter;
         localIp98901TxnDateDdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98901_TXN_DATE_DD_LEN = 2;
	/**
	 * 	serialize this Ip98901TxnDateDd
	 */
   protected void serializeIp98901TxnDateDd(char[] ip98901TxnDateDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98901TxnDateDd,0,getStringValue(),beginIp98901TxnDateDd,IP_98901_TXN_DATE_DD_LEN);
       localIp98901TxnDateDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98901TxnDateDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp98901TxnDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98901TxnDateDd() {	 
   		return (substring(getStringValue(),beginIp98901TxnDateDd,beginIp98901TxnDateDd + IP_98901_TXN_DATE_DD_LEN));
   	}




}
  
