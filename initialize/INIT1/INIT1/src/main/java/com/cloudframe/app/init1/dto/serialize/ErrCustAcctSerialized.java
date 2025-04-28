package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ErrCustAcctSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrCustAcctSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrCustAcctSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERR_CUST_ACCT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrCustIdNo;
            protected  int beginErrAcctNo;
	
	/**
	* Constructor for ErrCustAcctSerialized
	**/
    public ErrCustAcctSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ErrCustAcctSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrCustAcctSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ErrCustAcctSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,432); // serialize this field at offset 432 by default 
    }
    
	/**
	* sets parent for this ErrCustAcctSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 432 by default
    }    
	/**
	* initializes the field in ErrCustAcctSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERR_CUST_ACCT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginErrCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginErrAcctNo = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localErrCustIdNoCounter = -1;
         public boolean isErrCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localErrCustIdNoCounter != sharedCounter;
            localErrCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int ERR_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeErrCustIdNo
	 */
	protected void serializeErrCustIdNo(int errCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( errCustIdNo,ERR_CUST_ID_NO_LEN)
                  ,beginErrCustIdNo
                  ,ERR_CUST_ID_NO_LEN
                 );
            localErrCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkErrCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshErrCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshErrCustIdNo() {	 
			return (getInt(beginErrCustIdNo));
   	}
         int localErrAcctNoCounter = -1;
         public boolean isErrAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localErrAcctNoCounter != sharedCounter;
            localErrAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int ERR_ACCT_NO_LEN = 4;
  	/**
	 * serializeErrAcctNo
	 */
	protected void serializeErrAcctNo(int errAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( errAcctNo,ERR_ACCT_NO_LEN)
                  ,beginErrAcctNo
                  ,ERR_ACCT_NO_LEN
                 );
            localErrAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkErrAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshErrAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshErrAcctNo() {	 
			return (getInt(beginErrAcctNo));
   	}




}
  
