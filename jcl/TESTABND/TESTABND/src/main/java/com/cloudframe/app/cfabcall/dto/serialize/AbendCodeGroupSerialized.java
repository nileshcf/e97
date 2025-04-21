package com.cloudframe.app.cfabcall.dto.serialize;

/**
*  The class AbendCodeGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AbendCodeGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AbendCodeGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ABEND_CODE_GROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAbendCode;
            protected  int beginAbendX;
	
	/**
	* Constructor for AbendCodeGroupSerialized
	**/
    public AbendCodeGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AbendCodeGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ABEND_CODE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAbendCode = getStartOffset() + 0;	// set offset for serialization
  
             beginAbendX = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localAbendCodeCounter = -1;
         public boolean isAbendCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAbendCodeCounter != sharedCounter;
            localAbendCodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int ABEND_CODE_LEN = 2;
  	/**
	 * serializeAbendCode
	 */
	protected void serializeAbendCode(int abendCode) {
           replaceValue( //  save the value as string
                   getBinaryString( abendCode,ABEND_CODE_LEN)
                  ,beginAbendCode
                  ,ABEND_CODE_LEN
                 );
            localAbendCodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAbendCodeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshAbendCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode() {	 
			return (getUnsignedShort(beginAbendCode));
   	}
     int localAbendXCounter = -1;
     public boolean isAbendXModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendXCounter != sharedCounter;
         localAbendXCounter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_X_LEN = 4;
	/**
	 * 	serialize this AbendX
	 */
   protected void serializeAbendX(char[] abendX) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendX,0,getStringValue(),beginAbendX,ABEND_X_LEN);
       localAbendXCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendXConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshAbendX is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendX() {	 
   		return (substring(getStringValue(),beginAbendX,beginAbendX + ABEND_X_LEN));
   	}




}
  
