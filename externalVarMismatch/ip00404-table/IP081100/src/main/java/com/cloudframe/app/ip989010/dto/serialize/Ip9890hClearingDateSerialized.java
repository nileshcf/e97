package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Ip9890hClearingDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip9890hClearingDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip9890hClearingDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_9890H_CLEARING_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp9890hClrDateYy;
            protected  int beginIp9890hClrDateMm;
            protected  int beginIp9890hClrDateDd;
	
	/**
	* Constructor for Ip9890hClearingDateSerialized
	**/
    public Ip9890hClearingDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip9890hClearingDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip9890hClearingDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip9890hClearingDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip9890hClearingDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip9890hClearingDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_9890H_CLEARING_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp9890hClrDateYy = getStartOffset() + 0;	// set offset for serialization
  
             beginIp9890hClrDateMm = getStartOffset() + 2;	// set offset for serialization
  
             beginIp9890hClrDateDd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp9890hClrDateYyCounter = -1;
     public boolean isIp9890hClrDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hClrDateYyCounter != sharedCounter;
         localIp9890hClrDateYyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_9890H_CLR_DATE_YY_LEN = 2;
	/**
	 * 	serialize this Ip9890hClrDateYy
	 */
   protected void serializeIp9890hClrDateYy(char[] ip9890hClrDateYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip9890hClrDateYy,0,getStringValue(),beginIp9890hClrDateYy,IP_9890H_CLR_DATE_YY_LEN);
       localIp9890hClrDateYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp9890hClrDateYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp9890hClrDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp9890hClrDateYy() {	 
   		return (substring(getStringValue(),beginIp9890hClrDateYy,beginIp9890hClrDateYy + IP_9890H_CLR_DATE_YY_LEN));
   	}
     int localIp9890hClrDateMmCounter = -1;
     public boolean isIp9890hClrDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hClrDateMmCounter != sharedCounter;
         localIp9890hClrDateMmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_9890H_CLR_DATE_MM_LEN = 2;
	/**
	 * 	serialize this Ip9890hClrDateMm
	 */
   protected void serializeIp9890hClrDateMm(char[] ip9890hClrDateMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip9890hClrDateMm,0,getStringValue(),beginIp9890hClrDateMm,IP_9890H_CLR_DATE_MM_LEN);
       localIp9890hClrDateMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp9890hClrDateMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp9890hClrDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp9890hClrDateMm() {	 
   		return (substring(getStringValue(),beginIp9890hClrDateMm,beginIp9890hClrDateMm + IP_9890H_CLR_DATE_MM_LEN));
   	}
     int localIp9890hClrDateDdCounter = -1;
     public boolean isIp9890hClrDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hClrDateDdCounter != sharedCounter;
         localIp9890hClrDateDdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_9890H_CLR_DATE_DD_LEN = 2;
	/**
	 * 	serialize this Ip9890hClrDateDd
	 */
   protected void serializeIp9890hClrDateDd(char[] ip9890hClrDateDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip9890hClrDateDd,0,getStringValue(),beginIp9890hClrDateDd,IP_9890H_CLR_DATE_DD_LEN);
       localIp9890hClrDateDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp9890hClrDateDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp9890hClrDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp9890hClrDateDd() {	 
   		return (substring(getStringValue(),beginIp9890hClrDateDd,beginIp9890hClrDateDd + IP_9890H_CLR_DATE_DD_LEN));
   	}




}
  
