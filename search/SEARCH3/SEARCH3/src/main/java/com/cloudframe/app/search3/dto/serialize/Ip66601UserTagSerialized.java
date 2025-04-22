package com.cloudframe.app.search3.dto.serialize;

/**
*  The class Ip66601UserTagSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66601UserTagSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66601UserTagSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66601_USER_TAG_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp66601UserTagStart;
            protected  int beginIp66601UserTagLngth;
            protected  int beginIp66601UserTagStatus;
	
	/**
	* Constructor for Ip66601UserTagSerialized
	**/
    public Ip66601UserTagSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip66601UserTagSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66601UserTagSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip66601UserTagSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Ip66601UserTagSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Ip66601UserTagSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66601_USER_TAG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp66601UserTagStart = getStartOffset() + 8;	// set offset for serialization
  
             beginIp66601UserTagLngth = getStartOffset() + 10;	// set offset for serialization
  
             beginIp66601UserTagStatus = getStartOffset() + 12;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp66601UserTagStartCounter = -1;
         public boolean isIp66601UserTagStartModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601UserTagStartCounter != sharedCounter;
            localIp66601UserTagStartCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66601_USER_TAG_START_LEN = 2;
  	/**
	 * serializeIp66601UserTagStart
	 */
	protected void serializeIp66601UserTagStart(short ip66601UserTagStart) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66601UserTagStart,IP_66601_USER_TAG_START_LEN)
                  ,beginIp66601UserTagStart
                  ,IP_66601_USER_TAG_START_LEN
                 );
            localIp66601UserTagStartCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp66601UserTagStartMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp66601UserTagStart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601UserTagStart() {	 
			return (getShort(beginIp66601UserTagStart));
   	}
         int localIp66601UserTagLngthCounter = -1;
         public boolean isIp66601UserTagLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601UserTagLngthCounter != sharedCounter;
            localIp66601UserTagLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66601_USER_TAG_LNGTH_LEN = 2;
  	/**
	 * serializeIp66601UserTagLngth
	 */
	protected void serializeIp66601UserTagLngth(short ip66601UserTagLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66601UserTagLngth,IP_66601_USER_TAG_LNGTH_LEN)
                  ,beginIp66601UserTagLngth
                  ,IP_66601_USER_TAG_LNGTH_LEN
                 );
            localIp66601UserTagLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp66601UserTagLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp66601UserTagLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601UserTagLngth() {	 
			return (getShort(beginIp66601UserTagLngth));
   	}
     int localIp66601UserTagStatusCounter = -1;
     public boolean isIp66601UserTagStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66601UserTagStatusCounter != sharedCounter;
         localIp66601UserTagStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66601_USER_TAG_STATUS_LEN = 1;
	/**
	 * 	serialize this Ip66601UserTagStatus
	 */
   protected void serializeIp66601UserTagStatus(char[] ip66601UserTagStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66601UserTagStatus,0,getStringValue(),beginIp66601UserTagStatus,IP_66601_USER_TAG_STATUS_LEN);
       localIp66601UserTagStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66601UserTagStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66601UserTagStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66601UserTagStatus() {	 
   		return (substring(getStringValue(),beginIp66601UserTagStatus,beginIp66601UserTagStatus + IP_66601_USER_TAG_STATUS_LEN));
   	}




}
  
