package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class Ip00485UserTagIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00485UserTagIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00485UserTagIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00485_USER_TAG_ID_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00485UserTagOccurrence;
            protected  int beginIp00485UserTagSubfldNo;
            protected  int beginIp00485MemberId;
	
	/**
	* Constructor for Ip00485UserTagIdSerialized
	**/
    public Ip00485UserTagIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00485UserTagIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00485UserTagIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00485UserTagIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this Ip00485UserTagIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in Ip00485UserTagIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00485_USER_TAG_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00485UserTagOccurrence = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00485UserTagSubfldNo = getStartOffset() + 2;	// set offset for serialization
  
             beginIp00485MemberId = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp00485UserTagOccurrenceCounter = -1;
         public boolean isIp00485UserTagOccurrenceModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00485UserTagOccurrenceCounter != sharedCounter;
            localIp00485UserTagOccurrenceCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00485_USER_TAG_OCCURRENCE_LEN = 2;
  	/**
	 * serializeIp00485UserTagOccurrence
	 */
	protected void serializeIp00485UserTagOccurrence(short ip00485UserTagOccurrence) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00485UserTagOccurrence,IP_00485_USER_TAG_OCCURRENCE_LEN)
                  ,beginIp00485UserTagOccurrence
                  ,IP_00485_USER_TAG_OCCURRENCE_LEN
                 );
            localIp00485UserTagOccurrenceCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp00485UserTagOccurrenceMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp00485UserTagOccurrence is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp00485UserTagOccurrence() {	 
			return (getShort(beginIp00485UserTagOccurrence));
   	}
         int localIp00485UserTagSubfldNoCounter = -1;
         public boolean isIp00485UserTagSubfldNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00485UserTagSubfldNoCounter != sharedCounter;
            localIp00485UserTagSubfldNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00485_USER_TAG_SUBFLD_NO_LEN = 2;
  	/**
	 * serializeIp00485UserTagSubfldNo
	 */
	protected void serializeIp00485UserTagSubfldNo(short ip00485UserTagSubfldNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00485UserTagSubfldNo,IP_00485_USER_TAG_SUBFLD_NO_LEN)
                  ,beginIp00485UserTagSubfldNo
                  ,IP_00485_USER_TAG_SUBFLD_NO_LEN
                 );
            localIp00485UserTagSubfldNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp00485UserTagSubfldNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp00485UserTagSubfldNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp00485UserTagSubfldNo() {	 
			return (getShort(beginIp00485UserTagSubfldNo));
   	}
         int localIp00485MemberIdCounter = -1;
         public boolean isIp00485MemberIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00485MemberIdCounter != sharedCounter;
            localIp00485MemberIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00485_MEMBER_ID_LEN = 2;
  	/**
	 * serializeIp00485MemberId
	 */
	protected void serializeIp00485MemberId(short ip00485MemberId) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00485MemberId,IP_00485_MEMBER_ID_LEN)
                  ,beginIp00485MemberId
                  ,IP_00485_MEMBER_ID_LEN
                 );
            localIp00485MemberIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp00485MemberIdMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp00485MemberId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp00485MemberId() {	 
			return (getShort(beginIp00485MemberId));
   	}




}
  
