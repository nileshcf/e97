package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar642FunctionFailureCodesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar642FunctionFailureCodesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar642FunctionFailureCodesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_642_FUNCTION_FAILURE_CODES_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr642FunctionReturnCd;
            protected  int beginAr642FunctionReasonCd;
            protected  int beginAr642FunctionAbendCd;
	
	/**
	* Constructor for Ar642FunctionFailureCodesSerialized
	**/
    public Ar642FunctionFailureCodesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ar642FunctionFailureCodesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar642FunctionFailureCodesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ar642FunctionFailureCodesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,132); // serialize this field at offset 132 by default 
    }
    
	/**
	* sets parent for this Ar642FunctionFailureCodesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 132 by default
    }    
	/**
	* initializes the field in Ar642FunctionFailureCodesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_642_FUNCTION_FAILURE_CODES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAr642FunctionReturnCd = getStartOffset() + 0;	// set offset for serialization
  
             beginAr642FunctionReasonCd = getStartOffset() + 4;	// set offset for serialization
  
             beginAr642FunctionAbendCd = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localAr642FunctionReturnCdCounter = -1;
         public boolean isAr642FunctionReturnCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr642FunctionReturnCdCounter != sharedCounter;
            localAr642FunctionReturnCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_642_FUNCTION_RETURN_CD_LEN = 4;
  	/**
	 * serializeAr642FunctionReturnCd
	 */
	protected void serializeAr642FunctionReturnCd(int ar642FunctionReturnCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ar642FunctionReturnCd,AR_642_FUNCTION_RETURN_CD_LEN)
                  ,beginAr642FunctionReturnCd
                  ,AR_642_FUNCTION_RETURN_CD_LEN
                 );
            localAr642FunctionReturnCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAr642FunctionReturnCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAr642FunctionReturnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAr642FunctionReturnCd() {	 
			return (getInt(beginAr642FunctionReturnCd));
   	}
         int localAr642FunctionReasonCdCounter = -1;
         public boolean isAr642FunctionReasonCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr642FunctionReasonCdCounter != sharedCounter;
            localAr642FunctionReasonCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_642_FUNCTION_REASON_CD_LEN = 4;
  	/**
	 * serializeAr642FunctionReasonCd
	 */
	protected void serializeAr642FunctionReasonCd(int ar642FunctionReasonCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ar642FunctionReasonCd,AR_642_FUNCTION_REASON_CD_LEN)
                  ,beginAr642FunctionReasonCd
                  ,AR_642_FUNCTION_REASON_CD_LEN
                 );
            localAr642FunctionReasonCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAr642FunctionReasonCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAr642FunctionReasonCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAr642FunctionReasonCd() {	 
			return (getInt(beginAr642FunctionReasonCd));
   	}
         int localAr642FunctionAbendCdCounter = -1;
         public boolean isAr642FunctionAbendCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr642FunctionAbendCdCounter != sharedCounter;
            localAr642FunctionAbendCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_642_FUNCTION_ABEND_CD_LEN = 4;
  	/**
	 * serializeAr642FunctionAbendCd
	 */
	protected void serializeAr642FunctionAbendCd(int ar642FunctionAbendCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ar642FunctionAbendCd,AR_642_FUNCTION_ABEND_CD_LEN)
                  ,beginAr642FunctionAbendCd
                  ,AR_642_FUNCTION_ABEND_CD_LEN
                 );
            localAr642FunctionAbendCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAr642FunctionAbendCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAr642FunctionAbendCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAr642FunctionAbendCd() {	 
			return (getInt(beginAr642FunctionAbendCd));
   	}




}
  
