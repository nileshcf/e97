package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504TagIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504TagIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504TagIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_TAG_ID_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504TagType;
            protected  int beginIp65504TagNo;
	
	/**
	* Constructor for Ip65504TagIdSerialized
	**/
    public Ip65504TagIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504TagIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504TagIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504TagIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip65504TagIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip65504TagIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_TAG_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504TagType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp65504TagNo = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp65504TagTypeCounter = -1;
         public boolean isIp65504TagTypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504TagTypeCounter != sharedCounter;
            localIp65504TagTypeCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_TAG_TYPE_LEN = 2;
  	/**
	 * serializeIp65504TagType
	 */
	protected void serializeIp65504TagType(short ip65504TagType) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504TagType,IP_65504_TAG_TYPE_LEN)
                  ,beginIp65504TagType
                  ,IP_65504_TAG_TYPE_LEN
                 );
            localIp65504TagTypeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504TagTypeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504TagType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504TagType() {	 
			return (getShort(beginIp65504TagType));
   	}
         int localIp65504TagNoCounter = -1;
         public boolean isIp65504TagNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504TagNoCounter != sharedCounter;
            localIp65504TagNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_TAG_NO_LEN = 2;
  	/**
	 * serializeIp65504TagNo
	 */
	protected void serializeIp65504TagNo(short ip65504TagNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504TagNo,IP_65504_TAG_NO_LEN)
                  ,beginIp65504TagNo
                  ,IP_65504_TAG_NO_LEN
                 );
            localIp65504TagNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504TagNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504TagNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504TagNo() {	 
			return (getShort(beginIp65504TagNo));
   	}




}
  
