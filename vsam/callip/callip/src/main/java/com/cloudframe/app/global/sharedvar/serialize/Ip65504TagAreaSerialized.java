package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504TagAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504TagAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504TagAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_TAG_AREA_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504TagSubFldNo;
            protected  int beginIp65504TagStarts;
            protected  int beginIp65504TagLngth;
            protected  int beginIp65504TagStatus;
	
	/**
	* Constructor for Ip65504TagAreaSerialized
	**/
    public Ip65504TagAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504TagAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504TagAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504TagAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip65504TagAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip65504TagAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_TAG_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp65504TagSubFldNo = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504TagStarts = getStartOffset() + 6;	// set offset for serialization
  
             beginIp65504TagLngth = getStartOffset() + 8;	// set offset for serialization
  
             beginIp65504TagStatus = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp65504TagSubFldNoCounter = -1;
         public boolean isIp65504TagSubFldNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504TagSubFldNoCounter != sharedCounter;
            localIp65504TagSubFldNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_TAG_SUB_FLD_NO_LEN = 2;
  	/**
	 * serializeIp65504TagSubFldNo
	 */
	protected void serializeIp65504TagSubFldNo(short ip65504TagSubFldNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504TagSubFldNo,IP_65504_TAG_SUB_FLD_NO_LEN)
                  ,beginIp65504TagSubFldNo
                  ,IP_65504_TAG_SUB_FLD_NO_LEN
                 );
            localIp65504TagSubFldNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504TagSubFldNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504TagSubFldNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504TagSubFldNo() {	 
			return (getShort(beginIp65504TagSubFldNo));
   	}
         int localIp65504TagStartsCounter = -1;
         public boolean isIp65504TagStartsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504TagStartsCounter != sharedCounter;
            localIp65504TagStartsCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_TAG_STARTS_LEN = 2;
  	/**
	 * serializeIp65504TagStarts
	 */
	protected void serializeIp65504TagStarts(short ip65504TagStarts) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504TagStarts,IP_65504_TAG_STARTS_LEN)
                  ,beginIp65504TagStarts
                  ,IP_65504_TAG_STARTS_LEN
                 );
            localIp65504TagStartsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504TagStartsMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504TagStarts is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504TagStarts() {	 
			return (getShort(beginIp65504TagStarts));
   	}
         int localIp65504TagLngthCounter = -1;
         public boolean isIp65504TagLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504TagLngthCounter != sharedCounter;
            localIp65504TagLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_TAG_LNGTH_LEN = 2;
  	/**
	 * serializeIp65504TagLngth
	 */
	protected void serializeIp65504TagLngth(short ip65504TagLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504TagLngth,IP_65504_TAG_LNGTH_LEN)
                  ,beginIp65504TagLngth
                  ,IP_65504_TAG_LNGTH_LEN
                 );
            localIp65504TagLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504TagLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504TagLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504TagLngth() {	 
			return (getShort(beginIp65504TagLngth));
   	}
     int localIp65504TagStatusCounter = -1;
     public boolean isIp65504TagStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp65504TagStatusCounter != sharedCounter;
         localIp65504TagStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_65504_TAG_STATUS_LEN = 1;
	/**
	 * 	serialize this Ip65504TagStatus
	 */
   protected void serializeIp65504TagStatus(char[] ip65504TagStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip65504TagStatus,0,getStringValue(),beginIp65504TagStatus,IP_65504_TAG_STATUS_LEN);
       localIp65504TagStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp65504TagStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp65504TagStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp65504TagStatus() {	 
   		return (substring(getStringValue(),beginIp65504TagStatus,beginIp65504TagStatus + IP_65504_TAG_STATUS_LEN));
   	}




}
  
