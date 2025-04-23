package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip002102NewElementIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:09. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip002102NewElementIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip002102NewElementIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_002102_NEW_ELEMENT_ID_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp002102NewElementType;
            protected  int beginIp002102NewElementNo;
	
	/**
	* Constructor for Ip002102NewElementIdSerialized
	**/
    public Ip002102NewElementIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip002102NewElementIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip002102NewElementIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip002102NewElementIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10); // serialize this field at offset 10 by default 
    }
    
	/**
	* sets parent for this Ip002102NewElementIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10 by default
    }    
	/**
	* initializes the field in Ip002102NewElementIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_002102_NEW_ELEMENT_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp002102NewElementType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp002102NewElementNo = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp002102NewElementTypeCounter = -1;
         public boolean isIp002102NewElementTypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp002102NewElementTypeCounter != sharedCounter;
            localIp002102NewElementTypeCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_002102_NEW_ELEMENT_TYPE_LEN = 2;
  	/**
	 * serializeIp002102NewElementType
	 */
	protected void serializeIp002102NewElementType(short ip002102NewElementType) {
           replaceValue( //  save the value as string
                   getBinaryString( ip002102NewElementType,IP_002102_NEW_ELEMENT_TYPE_LEN)
                  ,beginIp002102NewElementType
                  ,IP_002102_NEW_ELEMENT_TYPE_LEN
                 );
            localIp002102NewElementTypeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp002102NewElementTypeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp002102NewElementType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp002102NewElementType() {	 
			return (getShort(beginIp002102NewElementType));
   	}
         int localIp002102NewElementNoCounter = -1;
         public boolean isIp002102NewElementNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp002102NewElementNoCounter != sharedCounter;
            localIp002102NewElementNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_002102_NEW_ELEMENT_NO_LEN = 2;
  	/**
	 * serializeIp002102NewElementNo
	 */
	protected void serializeIp002102NewElementNo(short ip002102NewElementNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip002102NewElementNo,IP_002102_NEW_ELEMENT_NO_LEN)
                  ,beginIp002102NewElementNo
                  ,IP_002102_NEW_ELEMENT_NO_LEN
                 );
            localIp002102NewElementNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp002102NewElementNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp002102NewElementNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp002102NewElementNo() {	 
			return (getShort(beginIp002102NewElementNo));
   	}




}
  
