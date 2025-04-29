package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Ip98901ClearingDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip98901ClearingDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip98901ClearingDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_98901_CLEARING_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp98901ClrDateYy;
            protected  int beginIp98901ClrDateMm;
            protected  int beginIp98901ClrDateDd;
	
	/**
	* Constructor for Ip98901ClearingDateSerialized
	**/
    public Ip98901ClearingDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip98901ClearingDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98901ClearingDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip98901ClearingDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip98901ClearingDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip98901ClearingDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_98901_CLEARING_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp98901ClrDateYy = getStartOffset() + 0;	// set offset for serialization
  
             beginIp98901ClrDateMm = getStartOffset() + 2;	// set offset for serialization
  
             beginIp98901ClrDateDd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp98901ClrDateYyCounter = -1;
     public boolean isIp98901ClrDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901ClrDateYyCounter != sharedCounter;
         localIp98901ClrDateYyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98901_CLR_DATE_YY_LEN = 2;
	/**
	 * 	serialize this Ip98901ClrDateYy
	 */
   protected void serializeIp98901ClrDateYy(char[] ip98901ClrDateYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98901ClrDateYy,0,getStringValue(),beginIp98901ClrDateYy,IP_98901_CLR_DATE_YY_LEN);
       localIp98901ClrDateYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98901ClrDateYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp98901ClrDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98901ClrDateYy() {	 
   		return (substring(getStringValue(),beginIp98901ClrDateYy,beginIp98901ClrDateYy + IP_98901_CLR_DATE_YY_LEN));
   	}
     int localIp98901ClrDateMmCounter = -1;
     public boolean isIp98901ClrDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901ClrDateMmCounter != sharedCounter;
         localIp98901ClrDateMmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98901_CLR_DATE_MM_LEN = 2;
	/**
	 * 	serialize this Ip98901ClrDateMm
	 */
   protected void serializeIp98901ClrDateMm(char[] ip98901ClrDateMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98901ClrDateMm,0,getStringValue(),beginIp98901ClrDateMm,IP_98901_CLR_DATE_MM_LEN);
       localIp98901ClrDateMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98901ClrDateMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp98901ClrDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98901ClrDateMm() {	 
   		return (substring(getStringValue(),beginIp98901ClrDateMm,beginIp98901ClrDateMm + IP_98901_CLR_DATE_MM_LEN));
   	}
     int localIp98901ClrDateDdCounter = -1;
     public boolean isIp98901ClrDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901ClrDateDdCounter != sharedCounter;
         localIp98901ClrDateDdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98901_CLR_DATE_DD_LEN = 2;
	/**
	 * 	serialize this Ip98901ClrDateDd
	 */
   protected void serializeIp98901ClrDateDd(char[] ip98901ClrDateDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98901ClrDateDd,0,getStringValue(),beginIp98901ClrDateDd,IP_98901_CLR_DATE_DD_LEN);
       localIp98901ClrDateDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98901ClrDateDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp98901ClrDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98901ClrDateDd() {	 
   		return (substring(getStringValue(),beginIp98901ClrDateDd,beginIp98901ClrDateDd + IP_98901_CLR_DATE_DD_LEN));
   	}




}
  
