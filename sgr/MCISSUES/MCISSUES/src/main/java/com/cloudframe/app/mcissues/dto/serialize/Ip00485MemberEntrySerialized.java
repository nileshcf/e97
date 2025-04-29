package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip00485MemberEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00485MemberEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00485MemberEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00485_MEMBER_ENTRY_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00485UserTagStart;
            protected  int beginIp00485UserTagLngth;
            protected  int beginIp00485UserTagStatus;
	
	/**
	* Constructor for Ip00485MemberEntrySerialized
	**/
    public Ip00485MemberEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00485MemberEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00485MemberEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00485MemberEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this Ip00485MemberEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in Ip00485MemberEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00485_MEMBER_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp00485UserTagStart = getStartOffset() + 6;	// set offset for serialization
  
             beginIp00485UserTagLngth = getStartOffset() + 8;	// set offset for serialization
  
             beginIp00485UserTagStatus = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp00485UserTagStartCounter = -1;
         public boolean isIp00485UserTagStartModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00485UserTagStartCounter != sharedCounter;
            localIp00485UserTagStartCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00485_USER_TAG_START_LEN = 2;
  	/**
	 * serializeIp00485UserTagStart
	 */
	protected void serializeIp00485UserTagStart(short ip00485UserTagStart) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00485UserTagStart,IP_00485_USER_TAG_START_LEN)
                  ,beginIp00485UserTagStart
                  ,IP_00485_USER_TAG_START_LEN
                 );
            localIp00485UserTagStartCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp00485UserTagStartMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp00485UserTagStart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp00485UserTagStart() {	 
			return (getShort(beginIp00485UserTagStart));
   	}
         int localIp00485UserTagLngthCounter = -1;
         public boolean isIp00485UserTagLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00485UserTagLngthCounter != sharedCounter;
            localIp00485UserTagLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00485_USER_TAG_LNGTH_LEN = 2;
  	/**
	 * serializeIp00485UserTagLngth
	 */
	protected void serializeIp00485UserTagLngth(short ip00485UserTagLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00485UserTagLngth,IP_00485_USER_TAG_LNGTH_LEN)
                  ,beginIp00485UserTagLngth
                  ,IP_00485_USER_TAG_LNGTH_LEN
                 );
            localIp00485UserTagLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp00485UserTagLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp00485UserTagLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp00485UserTagLngth() {	 
			return (getShort(beginIp00485UserTagLngth));
   	}
     int localIp00485UserTagStatusCounter = -1;
     public boolean isIp00485UserTagStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00485UserTagStatusCounter != sharedCounter;
         localIp00485UserTagStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00485_USER_TAG_STATUS_LEN = 1;
	/**
	 * 	serialize this Ip00485UserTagStatus
	 */
   protected void serializeIp00485UserTagStatus(char[] ip00485UserTagStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00485UserTagStatus,0,getStringValue(),beginIp00485UserTagStatus,IP_00485_USER_TAG_STATUS_LEN);
       localIp00485UserTagStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00485UserTagStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00485UserTagStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00485UserTagStatus() {	 
   		return (substring(getStringValue(),beginIp00485UserTagStatus,beginIp00485UserTagStatus + IP_00485_USER_TAG_STATUS_LEN));
   	}




}
  
