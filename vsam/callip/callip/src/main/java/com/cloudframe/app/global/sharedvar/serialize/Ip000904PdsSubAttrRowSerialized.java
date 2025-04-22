package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip000904PdsSubAttrRowSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip000904PdsSubAttrRowSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip000904PdsSubAttrRowSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_000904_PDS_SUB_ATTR_ROW_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp000904PdsNo;
            protected  int beginIp000904PdsSubNo;
            protected  int beginIp000904PdsSubName;
            protected  int beginIp000904PdsSubFormat;
            protected  int beginIp000904PdsSubStart;
            protected  int beginIp000904PdsSubMinLngth;
            protected  int beginIp000904PdsSubMaxLngth;
	
	/**
	* Constructor for Ip000904PdsSubAttrRowSerialized
	**/
    public Ip000904PdsSubAttrRowSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip000904PdsSubAttrRowSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000904PdsSubAttrRowSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip000904PdsSubAttrRowSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip000904PdsSubAttrRowSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip000904PdsSubAttrRowSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_000904_PDS_SUB_ATTR_ROW_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp000904PdsNo = getStartOffset() + 0;	// set offset for serialization
  
             beginIp000904PdsSubNo = getStartOffset() + 2;	// set offset for serialization
  
             beginIp000904PdsSubName = getStartOffset() + 4;	// set offset for serialization
  
             beginIp000904PdsSubFormat = getStartOffset() + 61;	// set offset for serialization
  
             beginIp000904PdsSubStart = getStartOffset() + 64;	// set offset for serialization
  
             beginIp000904PdsSubMinLngth = getStartOffset() + 66;	// set offset for serialization
  
             beginIp000904PdsSubMaxLngth = getStartOffset() + 68;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp000904PdsNoCounter = -1;
         public boolean isIp000904PdsNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000904PdsNoCounter != sharedCounter;
            localIp000904PdsNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000904_PDS_NO_LEN = 2;
  	/**
	 * serializeIp000904PdsNo
	 */
	protected void serializeIp000904PdsNo(short ip000904PdsNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000904PdsNo,IP_000904_PDS_NO_LEN)
                  ,beginIp000904PdsNo
                  ,IP_000904_PDS_NO_LEN
                 );
            localIp000904PdsNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000904PdsNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000904PdsNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000904PdsNo() {	 
			return (getShort(beginIp000904PdsNo));
   	}
         int localIp000904PdsSubNoCounter = -1;
         public boolean isIp000904PdsSubNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000904PdsSubNoCounter != sharedCounter;
            localIp000904PdsSubNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000904_PDS_SUB_NO_LEN = 2;
  	/**
	 * serializeIp000904PdsSubNo
	 */
	protected void serializeIp000904PdsSubNo(short ip000904PdsSubNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000904PdsSubNo,IP_000904_PDS_SUB_NO_LEN)
                  ,beginIp000904PdsSubNo
                  ,IP_000904_PDS_SUB_NO_LEN
                 );
            localIp000904PdsSubNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000904PdsSubNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000904PdsSubNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000904PdsSubNo() {	 
			return (getShort(beginIp000904PdsSubNo));
   	}
     int localIp000904PdsSubNameCounter = -1;
     public boolean isIp000904PdsSubNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000904PdsSubNameCounter != sharedCounter;
         localIp000904PdsSubNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000904_PDS_SUB_NAME_LEN = 57;
	/**
	 * 	serialize this Ip000904PdsSubName
	 */
   protected void serializeIp000904PdsSubName(char[] ip000904PdsSubName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000904PdsSubName,0,getStringValue(),beginIp000904PdsSubName,IP_000904_PDS_SUB_NAME_LEN);
       localIp000904PdsSubNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000904PdsSubNameConstraints(char[] value) {
   			return super.checkConstraints(value , 57 ,false, false);
   }
    /**
	 *	refreshIp000904PdsSubName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000904PdsSubName() {	 
   		return (substring(getStringValue(),beginIp000904PdsSubName,beginIp000904PdsSubName + IP_000904_PDS_SUB_NAME_LEN));
   	}
     int localIp000904PdsSubFormatCounter = -1;
     public boolean isIp000904PdsSubFormatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000904PdsSubFormatCounter != sharedCounter;
         localIp000904PdsSubFormatCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000904_PDS_SUB_FORMAT_LEN = 3;
	/**
	 * 	serialize this Ip000904PdsSubFormat
	 */
   protected void serializeIp000904PdsSubFormat(char[] ip000904PdsSubFormat) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000904PdsSubFormat,0,getStringValue(),beginIp000904PdsSubFormat,IP_000904_PDS_SUB_FORMAT_LEN);
       localIp000904PdsSubFormatCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000904PdsSubFormatConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp000904PdsSubFormat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000904PdsSubFormat() {	 
   		return (substring(getStringValue(),beginIp000904PdsSubFormat,beginIp000904PdsSubFormat + IP_000904_PDS_SUB_FORMAT_LEN));
   	}
         int localIp000904PdsSubStartCounter = -1;
         public boolean isIp000904PdsSubStartModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000904PdsSubStartCounter != sharedCounter;
            localIp000904PdsSubStartCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000904_PDS_SUB_START_LEN = 2;
  	/**
	 * serializeIp000904PdsSubStart
	 */
	protected void serializeIp000904PdsSubStart(short ip000904PdsSubStart) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000904PdsSubStart,IP_000904_PDS_SUB_START_LEN)
                  ,beginIp000904PdsSubStart
                  ,IP_000904_PDS_SUB_START_LEN
                 );
            localIp000904PdsSubStartCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000904PdsSubStartMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000904PdsSubStart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000904PdsSubStart() {	 
			return (getShort(beginIp000904PdsSubStart));
   	}
         int localIp000904PdsSubMinLngthCounter = -1;
         public boolean isIp000904PdsSubMinLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000904PdsSubMinLngthCounter != sharedCounter;
            localIp000904PdsSubMinLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000904_PDS_SUB_MIN_LNGTH_LEN = 2;
  	/**
	 * serializeIp000904PdsSubMinLngth
	 */
	protected void serializeIp000904PdsSubMinLngth(short ip000904PdsSubMinLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000904PdsSubMinLngth,IP_000904_PDS_SUB_MIN_LNGTH_LEN)
                  ,beginIp000904PdsSubMinLngth
                  ,IP_000904_PDS_SUB_MIN_LNGTH_LEN
                 );
            localIp000904PdsSubMinLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000904PdsSubMinLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000904PdsSubMinLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000904PdsSubMinLngth() {	 
			return (getShort(beginIp000904PdsSubMinLngth));
   	}
         int localIp000904PdsSubMaxLngthCounter = -1;
         public boolean isIp000904PdsSubMaxLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000904PdsSubMaxLngthCounter != sharedCounter;
            localIp000904PdsSubMaxLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000904_PDS_SUB_MAX_LNGTH_LEN = 2;
  	/**
	 * serializeIp000904PdsSubMaxLngth
	 */
	protected void serializeIp000904PdsSubMaxLngth(short ip000904PdsSubMaxLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000904PdsSubMaxLngth,IP_000904_PDS_SUB_MAX_LNGTH_LEN)
                  ,beginIp000904PdsSubMaxLngth
                  ,IP_000904_PDS_SUB_MAX_LNGTH_LEN
                 );
            localIp000904PdsSubMaxLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000904PdsSubMaxLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000904PdsSubMaxLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000904PdsSubMaxLngth() {	 
			return (getShort(beginIp000904PdsSubMaxLngth));
   	}




}
  
