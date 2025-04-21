package com.cloudframe.app.iovb32k.dto.serialize;

/**
*  The class InRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IN_REC_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInRecDataLen;
	
	/**
	* Constructor for InRecSerialized
	**/
    public InRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IN_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInRecDataLen = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localInRecDataLenCounter = -1;
         public boolean isInRecDataLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInRecDataLenCounter != sharedCounter;
            localInRecDataLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IN_REC_DATA_LEN_LEN = 2;
  	/**
	 * serializeInRecDataLen
	 */
	protected void serializeInRecDataLen(int inRecDataLen) {
           replaceValue( //  save the value as string
                   getBinaryString( inRecDataLen,IN_REC_DATA_LEN_LEN)
                  ,beginInRecDataLen
                  ,IN_REC_DATA_LEN_LEN
                 );
            localInRecDataLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkInRecDataLenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshInRecDataLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInRecDataLen() {	 
			return (getUnsignedShort(beginInRecDataLen));
   	}




     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 2 + (dependValue *  1);
     }
     
     public int getVariableLength(int idx) {
     	return 2 + (idx *  1);
     }
}
  
