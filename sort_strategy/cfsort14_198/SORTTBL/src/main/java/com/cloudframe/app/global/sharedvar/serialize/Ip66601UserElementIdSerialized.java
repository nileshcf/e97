package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip66601UserElementIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66601UserElementIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66601UserElementIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66601_USER_ELEMENT_ID_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp66601UserTagType;
            protected  int beginIp66601UserTagNo;
	
	/**
	* Constructor for Ip66601UserElementIdSerialized
	**/
    public Ip66601UserElementIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip66601UserElementIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66601UserElementIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip66601UserElementIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Ip66601UserElementIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Ip66601UserElementIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66601_USER_ELEMENT_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp66601UserTagType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp66601UserTagNo = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp66601UserTagTypeCounter = -1;
         public boolean isIp66601UserTagTypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601UserTagTypeCounter != sharedCounter;
            localIp66601UserTagTypeCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66601_USER_TAG_TYPE_LEN = 2;
  	/**
	 * serializeIp66601UserTagType
	 */
	protected void serializeIp66601UserTagType(short ip66601UserTagType) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66601UserTagType,IP_66601_USER_TAG_TYPE_LEN)
                  ,beginIp66601UserTagType
                  ,IP_66601_USER_TAG_TYPE_LEN
                 );
            localIp66601UserTagTypeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp66601UserTagTypeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp66601UserTagType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601UserTagType() {	 
			return (getShort(beginIp66601UserTagType));
   	}
         int localIp66601UserTagNoCounter = -1;
         public boolean isIp66601UserTagNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601UserTagNoCounter != sharedCounter;
            localIp66601UserTagNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66601_USER_TAG_NO_LEN = 2;
  	/**
	 * serializeIp66601UserTagNo
	 */
	protected void serializeIp66601UserTagNo(short ip66601UserTagNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66601UserTagNo,IP_66601_USER_TAG_NO_LEN)
                  ,beginIp66601UserTagNo
                  ,IP_66601_USER_TAG_NO_LEN
                 );
            localIp66601UserTagNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp66601UserTagNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp66601UserTagNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601UserTagNo() {	 
			return (getShort(beginIp66601UserTagNo));
   	}




}
  
