package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip002102OldElementIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip002102OldElementIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip002102OldElementIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_002102_OLD_ELEMENT_ID_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp002102OldElementType;
            protected  int beginIp002102OldElementNo;
	
	/**
	* Constructor for Ip002102OldElementIdSerialized
	**/
    public Ip002102OldElementIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip002102OldElementIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip002102OldElementIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip002102OldElementIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this Ip002102OldElementIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in Ip002102OldElementIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_002102_OLD_ELEMENT_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp002102OldElementType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp002102OldElementNo = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp002102OldElementTypeCounter = -1;
         public boolean isIp002102OldElementTypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp002102OldElementTypeCounter != sharedCounter;
            localIp002102OldElementTypeCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_002102_OLD_ELEMENT_TYPE_LEN = 2;
  	/**
	 * serializeIp002102OldElementType
	 */
	protected void serializeIp002102OldElementType(short ip002102OldElementType) {
           replaceValue( //  save the value as string
                   getBinaryString( ip002102OldElementType,IP_002102_OLD_ELEMENT_TYPE_LEN)
                  ,beginIp002102OldElementType
                  ,IP_002102_OLD_ELEMENT_TYPE_LEN
                 );
            localIp002102OldElementTypeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp002102OldElementTypeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp002102OldElementType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp002102OldElementType() {	 
			return (getShort(beginIp002102OldElementType));
   	}
         int localIp002102OldElementNoCounter = -1;
         public boolean isIp002102OldElementNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp002102OldElementNoCounter != sharedCounter;
            localIp002102OldElementNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_002102_OLD_ELEMENT_NO_LEN = 2;
  	/**
	 * serializeIp002102OldElementNo
	 */
	protected void serializeIp002102OldElementNo(short ip002102OldElementNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip002102OldElementNo,IP_002102_OLD_ELEMENT_NO_LEN)
                  ,beginIp002102OldElementNo
                  ,IP_002102_OLD_ELEMENT_NO_LEN
                 );
            localIp002102OldElementNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp002102OldElementNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp002102OldElementNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp002102OldElementNo() {	 
			return (getShort(beginIp002102OldElementNo));
   	}




}
  
