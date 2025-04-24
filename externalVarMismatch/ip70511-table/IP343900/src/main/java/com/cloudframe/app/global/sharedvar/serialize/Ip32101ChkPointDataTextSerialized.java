package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip32101ChkPointDataTextSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip32101ChkPointDataTextSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip32101ChkPointDataTextSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_32101_CHK_POINT_DATA_TEXT_LENGTH = 256;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp32101ChkPointDataTxtLen;
            protected  int beginIp32101ChkPointDataTxtTxt;
	
	/**
	* Constructor for Ip32101ChkPointDataTextSerialized
	**/
    public Ip32101ChkPointDataTextSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip32101ChkPointDataTextSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPointDataTextSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip32101ChkPointDataTextSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,17); // serialize this field at offset 17 by default 
    }
    
	/**
	* sets parent for this Ip32101ChkPointDataTextSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 17 by default
    }    
	/**
	* initializes the field in Ip32101ChkPointDataTextSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_32101_CHK_POINT_DATA_TEXT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp32101ChkPointDataTxtLen = getStartOffset() + 0;	// set offset for serialization
  
             beginIp32101ChkPointDataTxtTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp32101ChkPointDataTxtLenCounter = -1;
         public boolean isIp32101ChkPointDataTxtLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp32101ChkPointDataTxtLenCounter != sharedCounter;
            localIp32101ChkPointDataTxtLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_32101_CHK_POINT_DATA_TXT_LEN_LEN = 2;
  	/**
	 * serializeIp32101ChkPointDataTxtLen
	 */
	protected void serializeIp32101ChkPointDataTxtLen(short ip32101ChkPointDataTxtLen) {
           replaceValue( //  save the value as string
                   getBinaryString( ip32101ChkPointDataTxtLen,IP_32101_CHK_POINT_DATA_TXT_LEN_LEN)
                  ,beginIp32101ChkPointDataTxtLen
                  ,IP_32101_CHK_POINT_DATA_TXT_LEN_LEN
                 );
            localIp32101ChkPointDataTxtLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp32101ChkPointDataTxtLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp32101ChkPointDataTxtLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp32101ChkPointDataTxtLen() {	 
			return (getShort(beginIp32101ChkPointDataTxtLen));
   	}
     int localIp32101ChkPointDataTxtTxtCounter = -1;
     public boolean isIp32101ChkPointDataTxtTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101ChkPointDataTxtTxtCounter != sharedCounter;
         localIp32101ChkPointDataTxtTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_32101_CHK_POINT_DATA_TXT_TXT_LEN = 254;
	/**
	 * 	serialize this Ip32101ChkPointDataTxtTxt
	 */
   protected void serializeIp32101ChkPointDataTxtTxt(char[] ip32101ChkPointDataTxtTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip32101ChkPointDataTxtTxt,0,getStringValue(),beginIp32101ChkPointDataTxtTxt,IP_32101_CHK_POINT_DATA_TXT_TXT_LEN);
       localIp32101ChkPointDataTxtTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp32101ChkPointDataTxtTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 254 ,false, false);
   }
    /**
	 *	refreshIp32101ChkPointDataTxtTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp32101ChkPointDataTxtTxt() {	 
   		return (substring(getStringValue(),beginIp32101ChkPointDataTxtTxt,beginIp32101ChkPointDataTxtTxt + IP_32101_CHK_POINT_DATA_TXT_TXT_LEN));
   	}




}
  
