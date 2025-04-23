package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip0007o4DeSubAttrRowSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0007o4DeSubAttrRowSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0007o4DeSubAttrRowSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0007O_4_DE_SUB_ATTR_ROW_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0007o4DeNo;
            protected  int beginIp0007o4DeSubNo;
            protected  int beginIp0007o4DeSubName;
            protected  int beginIp0007o4DeSubFormat;
            protected  int beginIp0007o4DeSubStart;
            protected  int beginIp0007o4DeSubMinLngth;
            protected  int beginIp0007o4DeSubMaxLngth;
	
	/**
	* Constructor for Ip0007o4DeSubAttrRowSerialized
	**/
    public Ip0007o4DeSubAttrRowSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0007o4DeSubAttrRowSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0007o4DeSubAttrRowSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0007o4DeSubAttrRowSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip0007o4DeSubAttrRowSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip0007o4DeSubAttrRowSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0007O_4_DE_SUB_ATTR_ROW_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0007o4DeNo = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0007o4DeSubNo = getStartOffset() + 2;	// set offset for serialization
  
             beginIp0007o4DeSubName = getStartOffset() + 4;	// set offset for serialization
  
             beginIp0007o4DeSubFormat = getStartOffset() + 61;	// set offset for serialization
  
             beginIp0007o4DeSubStart = getStartOffset() + 64;	// set offset for serialization
  
             beginIp0007o4DeSubMinLngth = getStartOffset() + 66;	// set offset for serialization
  
             beginIp0007o4DeSubMaxLngth = getStartOffset() + 68;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp0007o4DeNoCounter = -1;
         public boolean isIp0007o4DeNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp0007o4DeNoCounter != sharedCounter;
            localIp0007o4DeNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_0007O_4_DE_NO_LEN = 2;
  	/**
	 * serializeIp0007o4DeNo
	 */
	protected void serializeIp0007o4DeNo(short ip0007o4DeNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip0007o4DeNo,IP_0007O_4_DE_NO_LEN)
                  ,beginIp0007o4DeNo
                  ,IP_0007O_4_DE_NO_LEN
                 );
            localIp0007o4DeNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp0007o4DeNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp0007o4DeNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp0007o4DeNo() {	 
			return (getShort(beginIp0007o4DeNo));
   	}
         int localIp0007o4DeSubNoCounter = -1;
         public boolean isIp0007o4DeSubNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp0007o4DeSubNoCounter != sharedCounter;
            localIp0007o4DeSubNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_0007O_4_DE_SUB_NO_LEN = 2;
  	/**
	 * serializeIp0007o4DeSubNo
	 */
	protected void serializeIp0007o4DeSubNo(short ip0007o4DeSubNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip0007o4DeSubNo,IP_0007O_4_DE_SUB_NO_LEN)
                  ,beginIp0007o4DeSubNo
                  ,IP_0007O_4_DE_SUB_NO_LEN
                 );
            localIp0007o4DeSubNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp0007o4DeSubNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp0007o4DeSubNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp0007o4DeSubNo() {	 
			return (getShort(beginIp0007o4DeSubNo));
   	}
     int localIp0007o4DeSubNameCounter = -1;
     public boolean isIp0007o4DeSubNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0007o4DeSubNameCounter != sharedCounter;
         localIp0007o4DeSubNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0007O_4_DE_SUB_NAME_LEN = 57;
	/**
	 * 	serialize this Ip0007o4DeSubName
	 */
   protected void serializeIp0007o4DeSubName(char[] ip0007o4DeSubName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0007o4DeSubName,0,getStringValue(),beginIp0007o4DeSubName,IP_0007O_4_DE_SUB_NAME_LEN);
       localIp0007o4DeSubNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0007o4DeSubNameConstraints(char[] value) {
   			return super.checkConstraints(value , 57 ,false, false);
   }
    /**
	 *	refreshIp0007o4DeSubName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0007o4DeSubName() {	 
   		return (substring(getStringValue(),beginIp0007o4DeSubName,beginIp0007o4DeSubName + IP_0007O_4_DE_SUB_NAME_LEN));
   	}
     int localIp0007o4DeSubFormatCounter = -1;
     public boolean isIp0007o4DeSubFormatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0007o4DeSubFormatCounter != sharedCounter;
         localIp0007o4DeSubFormatCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0007O_4_DE_SUB_FORMAT_LEN = 3;
	/**
	 * 	serialize this Ip0007o4DeSubFormat
	 */
   protected void serializeIp0007o4DeSubFormat(char[] ip0007o4DeSubFormat) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0007o4DeSubFormat,0,getStringValue(),beginIp0007o4DeSubFormat,IP_0007O_4_DE_SUB_FORMAT_LEN);
       localIp0007o4DeSubFormatCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0007o4DeSubFormatConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0007o4DeSubFormat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0007o4DeSubFormat() {	 
   		return (substring(getStringValue(),beginIp0007o4DeSubFormat,beginIp0007o4DeSubFormat + IP_0007O_4_DE_SUB_FORMAT_LEN));
   	}
         int localIp0007o4DeSubStartCounter = -1;
         public boolean isIp0007o4DeSubStartModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp0007o4DeSubStartCounter != sharedCounter;
            localIp0007o4DeSubStartCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_0007O_4_DE_SUB_START_LEN = 2;
  	/**
	 * serializeIp0007o4DeSubStart
	 */
	protected void serializeIp0007o4DeSubStart(short ip0007o4DeSubStart) {
           replaceValue( //  save the value as string
                   getBinaryString( ip0007o4DeSubStart,IP_0007O_4_DE_SUB_START_LEN)
                  ,beginIp0007o4DeSubStart
                  ,IP_0007O_4_DE_SUB_START_LEN
                 );
            localIp0007o4DeSubStartCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp0007o4DeSubStartMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp0007o4DeSubStart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp0007o4DeSubStart() {	 
			return (getShort(beginIp0007o4DeSubStart));
   	}
         int localIp0007o4DeSubMinLngthCounter = -1;
         public boolean isIp0007o4DeSubMinLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp0007o4DeSubMinLngthCounter != sharedCounter;
            localIp0007o4DeSubMinLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_0007O_4_DE_SUB_MIN_LNGTH_LEN = 2;
  	/**
	 * serializeIp0007o4DeSubMinLngth
	 */
	protected void serializeIp0007o4DeSubMinLngth(short ip0007o4DeSubMinLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip0007o4DeSubMinLngth,IP_0007O_4_DE_SUB_MIN_LNGTH_LEN)
                  ,beginIp0007o4DeSubMinLngth
                  ,IP_0007O_4_DE_SUB_MIN_LNGTH_LEN
                 );
            localIp0007o4DeSubMinLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp0007o4DeSubMinLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp0007o4DeSubMinLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp0007o4DeSubMinLngth() {	 
			return (getShort(beginIp0007o4DeSubMinLngth));
   	}
         int localIp0007o4DeSubMaxLngthCounter = -1;
         public boolean isIp0007o4DeSubMaxLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp0007o4DeSubMaxLngthCounter != sharedCounter;
            localIp0007o4DeSubMaxLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_0007O_4_DE_SUB_MAX_LNGTH_LEN = 2;
  	/**
	 * serializeIp0007o4DeSubMaxLngth
	 */
	protected void serializeIp0007o4DeSubMaxLngth(short ip0007o4DeSubMaxLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip0007o4DeSubMaxLngth,IP_0007O_4_DE_SUB_MAX_LNGTH_LEN)
                  ,beginIp0007o4DeSubMaxLngth
                  ,IP_0007O_4_DE_SUB_MAX_LNGTH_LEN
                 );
            localIp0007o4DeSubMaxLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp0007o4DeSubMaxLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp0007o4DeSubMaxLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp0007o4DeSubMaxLngth() {	 
			return (getShort(beginIp0007o4DeSubMaxLngth));
   	}




}
  
