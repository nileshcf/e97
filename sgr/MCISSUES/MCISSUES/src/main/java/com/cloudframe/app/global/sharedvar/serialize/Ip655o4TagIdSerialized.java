package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip655o4TagIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip655o4TagIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip655o4TagIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_655O_4_TAG_ID_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp655o4TagType;
            protected  int beginIp655o4TagNo;
	
	/**
	* Constructor for Ip655o4TagIdSerialized
	**/
    public Ip655o4TagIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip655o4TagIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip655o4TagIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip655o4TagIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip655o4TagIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip655o4TagIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_655O_4_TAG_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp655o4TagType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp655o4TagNo = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp655o4TagTypeCounter = -1;
         public boolean isIp655o4TagTypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp655o4TagTypeCounter != sharedCounter;
            localIp655o4TagTypeCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_655O_4_TAG_TYPE_LEN = 2;
  	/**
	 * serializeIp655o4TagType
	 */
	protected void serializeIp655o4TagType(short ip655o4TagType) {
           replaceValue( //  save the value as string
                   getBinaryString( ip655o4TagType,IP_655O_4_TAG_TYPE_LEN)
                  ,beginIp655o4TagType
                  ,IP_655O_4_TAG_TYPE_LEN
                 );
            localIp655o4TagTypeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp655o4TagTypeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp655o4TagType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp655o4TagType() {	 
			return (getShort(beginIp655o4TagType));
   	}
         int localIp655o4TagNoCounter = -1;
         public boolean isIp655o4TagNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp655o4TagNoCounter != sharedCounter;
            localIp655o4TagNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_655O_4_TAG_NO_LEN = 2;
  	/**
	 * serializeIp655o4TagNo
	 */
	protected void serializeIp655o4TagNo(short ip655o4TagNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip655o4TagNo,IP_655O_4_TAG_NO_LEN)
                  ,beginIp655o4TagNo
                  ,IP_655O_4_TAG_NO_LEN
                 );
            localIp655o4TagNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp655o4TagNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp655o4TagNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp655o4TagNo() {	 
			return (getShort(beginIp655o4TagNo));
   	}




}
  
