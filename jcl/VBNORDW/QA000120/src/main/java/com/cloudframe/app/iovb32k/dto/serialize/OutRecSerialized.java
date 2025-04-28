package com.cloudframe.app.iovb32k.dto.serialize;

/**
*  The class OutRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OutRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OutRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OUT_REC_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOutRecDataLen;
	
	/**
	* Constructor for OutRecSerialized
	**/
    public OutRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in OutRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OUT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOutRecDataLen = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localOutRecDataLenCounter = -1;
         public boolean isOutRecDataLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOutRecDataLenCounter != sharedCounter;
            localOutRecDataLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int OUT_REC_DATA_LEN_LEN = 2;
  	/**
	 * serializeOutRecDataLen
	 */
	protected void serializeOutRecDataLen(int outRecDataLen) {
           replaceValue( //  save the value as string
                   getBinaryString( outRecDataLen,OUT_REC_DATA_LEN_LEN)
                  ,beginOutRecDataLen
                  ,OUT_REC_DATA_LEN_LEN
                 );
            localOutRecDataLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkOutRecDataLenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshOutRecDataLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOutRecDataLen() {	 
			return (getUnsignedShort(beginOutRecDataLen));
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
  
