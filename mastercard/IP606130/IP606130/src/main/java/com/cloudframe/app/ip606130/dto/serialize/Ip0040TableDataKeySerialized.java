package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0040TableDataKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040TableDataKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040TableDataKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040_TABLE_DATA_KEY_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040AccRangeL;
            protected  int beginIp0040ProdId;
	
	/**
	* Constructor for Ip0040TableDataKeySerialized
	**/
    public Ip0040TableDataKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040TableDataKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040TableDataKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040TableDataKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19); // serialize this field at offset 19 by default 
    }
    
	/**
	* sets parent for this Ip0040TableDataKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19 by default
    }    
	/**
	* initializes the field in Ip0040TableDataKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040_TABLE_DATA_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040AccRangeL = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0040ProdId = getStartOffset() + 19;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040AccRangeLCounter = -1;
     public boolean isIp0040AccRangeLModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040AccRangeLCounter != sharedCounter;
         localIp0040AccRangeLCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_ACC_RANGE_L_LEN = 19;
	/**
	 * 	serialize this Ip0040AccRangeL
	 */
   protected void serializeIp0040AccRangeL(char[] ip0040AccRangeL) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040AccRangeL,0,getStringValue(),beginIp0040AccRangeL,IP_0040_ACC_RANGE_L_LEN);
       localIp0040AccRangeLCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040AccRangeLConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp0040AccRangeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040AccRangeL() {	 
   		return (substring(getStringValue(),beginIp0040AccRangeL,beginIp0040AccRangeL + IP_0040_ACC_RANGE_L_LEN));
   	}
     int localIp0040ProdIdCounter = -1;
     public boolean isIp0040ProdIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040ProdIdCounter != sharedCounter;
         localIp0040ProdIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_PROD_ID_LEN = 3;
	/**
	 * 	serialize this Ip0040ProdId
	 */
   protected void serializeIp0040ProdId(char[] ip0040ProdId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040ProdId,0,getStringValue(),beginIp0040ProdId,IP_0040_PROD_ID_LEN);
       localIp0040ProdIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040ProdIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0040ProdId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040ProdId() {	 
   		return (substring(getStringValue(),beginIp0040ProdId,beginIp0040ProdId + IP_0040_PROD_ID_LEN));
   	}




}
  
