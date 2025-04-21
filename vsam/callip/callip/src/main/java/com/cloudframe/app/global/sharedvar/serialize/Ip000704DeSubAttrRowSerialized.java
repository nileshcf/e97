package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip000704DeSubAttrRowSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip000704DeSubAttrRowSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip000704DeSubAttrRowSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_000704_DE_SUB_ATTR_ROW_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp000704DeNo;
            protected  int beginIp000704DeSubNo;
            protected  int beginIp000704DeSubName;
            protected  int beginIp000704DeSubFormat;
            protected  int beginIp000704DeSubStart;
            protected  int beginIp000704DeSubMinLngth;
            protected  int beginIp000704DeSubMaxLngth;
	
	/**
	* Constructor for Ip000704DeSubAttrRowSerialized
	**/
    public Ip000704DeSubAttrRowSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip000704DeSubAttrRowSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000704DeSubAttrRowSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip000704DeSubAttrRowSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip000704DeSubAttrRowSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip000704DeSubAttrRowSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_000704_DE_SUB_ATTR_ROW_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp000704DeNo = getStartOffset() + 0;	// set offset for serialization
  
             beginIp000704DeSubNo = getStartOffset() + 2;	// set offset for serialization
  
             beginIp000704DeSubName = getStartOffset() + 4;	// set offset for serialization
  
             beginIp000704DeSubFormat = getStartOffset() + 61;	// set offset for serialization
  
             beginIp000704DeSubStart = getStartOffset() + 64;	// set offset for serialization
  
             beginIp000704DeSubMinLngth = getStartOffset() + 66;	// set offset for serialization
  
             beginIp000704DeSubMaxLngth = getStartOffset() + 68;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp000704DeNoCounter = -1;
         public boolean isIp000704DeNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000704DeNoCounter != sharedCounter;
            localIp000704DeNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000704_DE_NO_LEN = 2;
  	/**
	 * serializeIp000704DeNo
	 */
	protected void serializeIp000704DeNo(short ip000704DeNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000704DeNo,IP_000704_DE_NO_LEN)
                  ,beginIp000704DeNo
                  ,IP_000704_DE_NO_LEN
                 );
            localIp000704DeNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000704DeNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000704DeNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000704DeNo() {	 
			return (getShort(beginIp000704DeNo));
   	}
         int localIp000704DeSubNoCounter = -1;
         public boolean isIp000704DeSubNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000704DeSubNoCounter != sharedCounter;
            localIp000704DeSubNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000704_DE_SUB_NO_LEN = 2;
  	/**
	 * serializeIp000704DeSubNo
	 */
	protected void serializeIp000704DeSubNo(short ip000704DeSubNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000704DeSubNo,IP_000704_DE_SUB_NO_LEN)
                  ,beginIp000704DeSubNo
                  ,IP_000704_DE_SUB_NO_LEN
                 );
            localIp000704DeSubNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000704DeSubNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000704DeSubNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000704DeSubNo() {	 
			return (getShort(beginIp000704DeSubNo));
   	}
     int localIp000704DeSubNameCounter = -1;
     public boolean isIp000704DeSubNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000704DeSubNameCounter != sharedCounter;
         localIp000704DeSubNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000704_DE_SUB_NAME_LEN = 57;
	/**
	 * 	serialize this Ip000704DeSubName
	 */
   protected void serializeIp000704DeSubName(char[] ip000704DeSubName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000704DeSubName,0,getStringValue(),beginIp000704DeSubName,IP_000704_DE_SUB_NAME_LEN);
       localIp000704DeSubNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000704DeSubNameConstraints(char[] value) {
   			return super.checkConstraints(value , 57 ,false, false);
   }
    /**
	 *	refreshIp000704DeSubName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000704DeSubName() {	 
   		return (substring(getStringValue(),beginIp000704DeSubName,beginIp000704DeSubName + IP_000704_DE_SUB_NAME_LEN));
   	}
     int localIp000704DeSubFormatCounter = -1;
     public boolean isIp000704DeSubFormatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000704DeSubFormatCounter != sharedCounter;
         localIp000704DeSubFormatCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000704_DE_SUB_FORMAT_LEN = 3;
	/**
	 * 	serialize this Ip000704DeSubFormat
	 */
   protected void serializeIp000704DeSubFormat(char[] ip000704DeSubFormat) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000704DeSubFormat,0,getStringValue(),beginIp000704DeSubFormat,IP_000704_DE_SUB_FORMAT_LEN);
       localIp000704DeSubFormatCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000704DeSubFormatConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp000704DeSubFormat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000704DeSubFormat() {	 
   		return (substring(getStringValue(),beginIp000704DeSubFormat,beginIp000704DeSubFormat + IP_000704_DE_SUB_FORMAT_LEN));
   	}
         int localIp000704DeSubStartCounter = -1;
         public boolean isIp000704DeSubStartModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000704DeSubStartCounter != sharedCounter;
            localIp000704DeSubStartCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000704_DE_SUB_START_LEN = 2;
  	/**
	 * serializeIp000704DeSubStart
	 */
	protected void serializeIp000704DeSubStart(short ip000704DeSubStart) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000704DeSubStart,IP_000704_DE_SUB_START_LEN)
                  ,beginIp000704DeSubStart
                  ,IP_000704_DE_SUB_START_LEN
                 );
            localIp000704DeSubStartCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000704DeSubStartMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000704DeSubStart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000704DeSubStart() {	 
			return (getShort(beginIp000704DeSubStart));
   	}
         int localIp000704DeSubMinLngthCounter = -1;
         public boolean isIp000704DeSubMinLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000704DeSubMinLngthCounter != sharedCounter;
            localIp000704DeSubMinLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000704_DE_SUB_MIN_LNGTH_LEN = 2;
  	/**
	 * serializeIp000704DeSubMinLngth
	 */
	protected void serializeIp000704DeSubMinLngth(short ip000704DeSubMinLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000704DeSubMinLngth,IP_000704_DE_SUB_MIN_LNGTH_LEN)
                  ,beginIp000704DeSubMinLngth
                  ,IP_000704_DE_SUB_MIN_LNGTH_LEN
                 );
            localIp000704DeSubMinLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000704DeSubMinLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000704DeSubMinLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000704DeSubMinLngth() {	 
			return (getShort(beginIp000704DeSubMinLngth));
   	}
         int localIp000704DeSubMaxLngthCounter = -1;
         public boolean isIp000704DeSubMaxLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000704DeSubMaxLngthCounter != sharedCounter;
            localIp000704DeSubMaxLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000704_DE_SUB_MAX_LNGTH_LEN = 2;
  	/**
	 * serializeIp000704DeSubMaxLngth
	 */
	protected void serializeIp000704DeSubMaxLngth(short ip000704DeSubMaxLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000704DeSubMaxLngth,IP_000704_DE_SUB_MAX_LNGTH_LEN)
                  ,beginIp000704DeSubMaxLngth
                  ,IP_000704_DE_SUB_MAX_LNGTH_LEN
                 );
            localIp000704DeSubMaxLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000704DeSubMaxLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000704DeSubMaxLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000704DeSubMaxLngth() {	 
			return (getShort(beginIp000704DeSubMaxLngth));
   	}




}
  
