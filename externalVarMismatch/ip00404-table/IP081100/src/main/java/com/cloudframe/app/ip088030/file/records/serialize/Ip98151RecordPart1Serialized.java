package com.cloudframe.app.ip088030.file.records.serialize;

/**
*  The class Ip98151RecordPart1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip98151RecordPart1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip98151RecordPart1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_98151_RECORD_PART_1_LENGTH = 255;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp98151TjfMrchAddr;
            protected  int beginIp98151TjfDe48se32;
            protected  int beginIp98151TjfTlrMrchId;
            protected  int beginIp98151TjfTlrP176Id;
	
	/**
	* Constructor for Ip98151RecordPart1Serialized
	**/
    public Ip98151RecordPart1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip98151RecordPart1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98151RecordPart1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip98151RecordPart1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip98151RecordPart1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip98151RecordPart1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_98151_RECORD_PART_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp98151TjfMrchAddr = getStartOffset() + 95;	// set offset for serialization
  
             beginIp98151TjfDe48se32 = getStartOffset() + 145;	// set offset for serialization
  
             beginIp98151TjfTlrMrchId = getStartOffset() + 151;	// set offset for serialization
  
             beginIp98151TjfTlrP176Id = getStartOffset() + 157;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp98151TjfMrchAddrCounter = -1;
     public boolean isIp98151TjfMrchAddrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98151TjfMrchAddrCounter != sharedCounter;
         localIp98151TjfMrchAddrCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98151_TJF_MRCH_ADDR_LEN = 25;
	/**
	 * 	serialize this Ip98151TjfMrchAddr
	 */
   protected void serializeIp98151TjfMrchAddr(char[] ip98151TjfMrchAddr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98151TjfMrchAddr,0,getStringValue(),beginIp98151TjfMrchAddr,IP_98151_TJF_MRCH_ADDR_LEN);
       localIp98151TjfMrchAddrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98151TjfMrchAddrConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshIp98151TjfMrchAddr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98151TjfMrchAddr() {	 
   		return (substring(getStringValue(),beginIp98151TjfMrchAddr,beginIp98151TjfMrchAddr + IP_98151_TJF_MRCH_ADDR_LEN));
   	}
     int localIp98151TjfDe48se32Counter = -1;
     public boolean isIp98151TjfDe48se32Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98151TjfDe48se32Counter != sharedCounter;
         localIp98151TjfDe48se32Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_98151_TJF_DE_48SE_32_LEN = 6;
	/**
	 * 	serialize this Ip98151TjfDe48se32
	 */
   protected void serializeIp98151TjfDe48se32(char[] ip98151TjfDe48se32) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98151TjfDe48se32,0,getStringValue(),beginIp98151TjfDe48se32,IP_98151_TJF_DE_48SE_32_LEN);
       localIp98151TjfDe48se32Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98151TjfDe48se32Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp98151TjfDe48se32 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98151TjfDe48se32() {	 
   		return (substring(getStringValue(),beginIp98151TjfDe48se32,beginIp98151TjfDe48se32 + IP_98151_TJF_DE_48SE_32_LEN));
   	}
     int localIp98151TjfTlrMrchIdCounter = -1;
     public boolean isIp98151TjfTlrMrchIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98151TjfTlrMrchIdCounter != sharedCounter;
         localIp98151TjfTlrMrchIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98151_TJF_TLR_MRCH_ID_LEN = 6;
	/**
	 * 	serialize this Ip98151TjfTlrMrchId
	 */
   protected void serializeIp98151TjfTlrMrchId(char[] ip98151TjfTlrMrchId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98151TjfTlrMrchId,0,getStringValue(),beginIp98151TjfTlrMrchId,IP_98151_TJF_TLR_MRCH_ID_LEN);
       localIp98151TjfTlrMrchIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98151TjfTlrMrchIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp98151TjfTlrMrchId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98151TjfTlrMrchId() {	 
   		return (substring(getStringValue(),beginIp98151TjfTlrMrchId,beginIp98151TjfTlrMrchId + IP_98151_TJF_TLR_MRCH_ID_LEN));
   	}
     int localIp98151TjfTlrP176IdCounter = -1;
     public boolean isIp98151TjfTlrP176IdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98151TjfTlrP176IdCounter != sharedCounter;
         localIp98151TjfTlrP176IdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98151_TJF_TLR_P_176_ID_LEN = 6;
	/**
	 * 	serialize this Ip98151TjfTlrP176Id
	 */
   protected void serializeIp98151TjfTlrP176Id(char[] ip98151TjfTlrP176Id) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98151TjfTlrP176Id,0,getStringValue(),beginIp98151TjfTlrP176Id,IP_98151_TJF_TLR_P_176_ID_LEN);
       localIp98151TjfTlrP176IdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98151TjfTlrP176IdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp98151TjfTlrP176Id is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98151TjfTlrP176Id() {	 
   		return (substring(getStringValue(),beginIp98151TjfTlrP176Id,beginIp98151TjfTlrP176Id + IP_98151_TJF_TLR_P_176_ID_LEN));
   	}




}
  
