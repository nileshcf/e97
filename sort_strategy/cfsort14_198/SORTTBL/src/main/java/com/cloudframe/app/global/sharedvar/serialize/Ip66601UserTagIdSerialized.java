package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip66601UserTagIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:56. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66601UserTagIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66601UserTagIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66601_USER_TAG_ID_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp66601UserTagOccurrence;
            protected  int beginIp66601UserTagSubfldNo;
	
	/**
	* Constructor for Ip66601UserTagIdSerialized
	**/
    public Ip66601UserTagIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip66601UserTagIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66601UserTagIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip66601UserTagIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Ip66601UserTagIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Ip66601UserTagIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66601_USER_TAG_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp66601UserTagOccurrence = getStartOffset() + 4;	// set offset for serialization
  
             beginIp66601UserTagSubfldNo = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp66601UserTagOccurrenceCounter = -1;
         public boolean isIp66601UserTagOccurrenceModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601UserTagOccurrenceCounter != sharedCounter;
            localIp66601UserTagOccurrenceCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66601_USER_TAG_OCCURRENCE_LEN = 2;
  	/**
	 * serializeIp66601UserTagOccurrence
	 */
	protected void serializeIp66601UserTagOccurrence(short ip66601UserTagOccurrence) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66601UserTagOccurrence,IP_66601_USER_TAG_OCCURRENCE_LEN)
                  ,beginIp66601UserTagOccurrence
                  ,IP_66601_USER_TAG_OCCURRENCE_LEN
                 );
            localIp66601UserTagOccurrenceCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp66601UserTagOccurrenceMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp66601UserTagOccurrence is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601UserTagOccurrence() {	 
			return (getShort(beginIp66601UserTagOccurrence));
   	}
         int localIp66601UserTagSubfldNoCounter = -1;
         public boolean isIp66601UserTagSubfldNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601UserTagSubfldNoCounter != sharedCounter;
            localIp66601UserTagSubfldNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66601_USER_TAG_SUBFLD_NO_LEN = 2;
  	/**
	 * serializeIp66601UserTagSubfldNo
	 */
	protected void serializeIp66601UserTagSubfldNo(short ip66601UserTagSubfldNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66601UserTagSubfldNo,IP_66601_USER_TAG_SUBFLD_NO_LEN)
                  ,beginIp66601UserTagSubfldNo
                  ,IP_66601_USER_TAG_SUBFLD_NO_LEN
                 );
            localIp66601UserTagSubfldNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp66601UserTagSubfldNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp66601UserTagSubfldNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601UserTagSubfldNo() {	 
			return (getShort(beginIp66601UserTagSubfldNo));
   	}




}
  
