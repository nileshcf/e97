package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar647FunctionFailureCodesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar647FunctionFailureCodesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar647FunctionFailureCodesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_647_FUNCTION_FAILURE_CODES_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr647FunctionReturnCd;
            protected  int beginAr647FunctionReasonCd;
            protected  int beginAr647FunctionAbendCd;
	
	/**
	* Constructor for Ar647FunctionFailureCodesSerialized
	**/
    public Ar647FunctionFailureCodesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ar647FunctionFailureCodesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar647FunctionFailureCodesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ar647FunctionFailureCodesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,98); // serialize this field at offset 98 by default 
    }
    
	/**
	* sets parent for this Ar647FunctionFailureCodesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 98 by default
    }    
	/**
	* initializes the field in Ar647FunctionFailureCodesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_647_FUNCTION_FAILURE_CODES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAr647FunctionReturnCd = getStartOffset() + 0;	// set offset for serialization
  
             beginAr647FunctionReasonCd = getStartOffset() + 4;	// set offset for serialization
  
             beginAr647FunctionAbendCd = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localAr647FunctionReturnCdCounter = -1;
         public boolean isAr647FunctionReturnCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr647FunctionReturnCdCounter != sharedCounter;
            localAr647FunctionReturnCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_647_FUNCTION_RETURN_CD_LEN = 4;
  	/**
	 * serializeAr647FunctionReturnCd
	 */
	protected void serializeAr647FunctionReturnCd(int ar647FunctionReturnCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ar647FunctionReturnCd,AR_647_FUNCTION_RETURN_CD_LEN)
                  ,beginAr647FunctionReturnCd
                  ,AR_647_FUNCTION_RETURN_CD_LEN
                 );
            localAr647FunctionReturnCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAr647FunctionReturnCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAr647FunctionReturnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAr647FunctionReturnCd() {	 
			return (getInt(beginAr647FunctionReturnCd));
   	}
         int localAr647FunctionReasonCdCounter = -1;
         public boolean isAr647FunctionReasonCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr647FunctionReasonCdCounter != sharedCounter;
            localAr647FunctionReasonCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_647_FUNCTION_REASON_CD_LEN = 4;
  	/**
	 * serializeAr647FunctionReasonCd
	 */
	protected void serializeAr647FunctionReasonCd(int ar647FunctionReasonCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ar647FunctionReasonCd,AR_647_FUNCTION_REASON_CD_LEN)
                  ,beginAr647FunctionReasonCd
                  ,AR_647_FUNCTION_REASON_CD_LEN
                 );
            localAr647FunctionReasonCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAr647FunctionReasonCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAr647FunctionReasonCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAr647FunctionReasonCd() {	 
			return (getInt(beginAr647FunctionReasonCd));
   	}
         int localAr647FunctionAbendCdCounter = -1;
         public boolean isAr647FunctionAbendCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr647FunctionAbendCdCounter != sharedCounter;
            localAr647FunctionAbendCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_647_FUNCTION_ABEND_CD_LEN = 4;
  	/**
	 * serializeAr647FunctionAbendCd
	 */
	protected void serializeAr647FunctionAbendCd(int ar647FunctionAbendCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ar647FunctionAbendCd,AR_647_FUNCTION_ABEND_CD_LEN)
                  ,beginAr647FunctionAbendCd
                  ,AR_647_FUNCTION_ABEND_CD_LEN
                 );
            localAr647FunctionAbendCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAr647FunctionAbendCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAr647FunctionAbendCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAr647FunctionAbendCd() {	 
			return (getInt(beginAr647FunctionAbendCd));
   	}




}
  
