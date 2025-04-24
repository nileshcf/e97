package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyMtnCustAcctSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyMtnCustAcctSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyMtnCustAcctSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_MTN_CUST_ACCT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginKeyMtnCustIdNo;
            protected  int beginKeyMtnAcctNo;
	
	/**
	* Constructor for KeyMtnCustAcctSerialized
	**/
    public KeyMtnCustAcctSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyMtnCustAcctSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyMtnCustAcctSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyMtnCustAcctSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,387); // serialize this field at offset 387 by default 
    }
    
	/**
	* sets parent for this KeyMtnCustAcctSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 387 by default
    }    
	/**
	* initializes the field in KeyMtnCustAcctSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_MTN_CUST_ACCT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginKeyMtnCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginKeyMtnAcctNo = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localKeyMtnCustIdNoCounter = -1;
         public boolean isKeyMtnCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localKeyMtnCustIdNoCounter != sharedCounter;
            localKeyMtnCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int KEY_MTN_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeKeyMtnCustIdNo
	 */
	protected void serializeKeyMtnCustIdNo(int keyMtnCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( keyMtnCustIdNo,KEY_MTN_CUST_ID_NO_LEN)
                  ,beginKeyMtnCustIdNo
                  ,KEY_MTN_CUST_ID_NO_LEN
                 );
            localKeyMtnCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkKeyMtnCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshKeyMtnCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshKeyMtnCustIdNo() {	 
			return (getInt(beginKeyMtnCustIdNo));
   	}
         int localKeyMtnAcctNoCounter = -1;
         public boolean isKeyMtnAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localKeyMtnAcctNoCounter != sharedCounter;
            localKeyMtnAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int KEY_MTN_ACCT_NO_LEN = 4;
  	/**
	 * serializeKeyMtnAcctNo
	 */
	protected void serializeKeyMtnAcctNo(int keyMtnAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( keyMtnAcctNo,KEY_MTN_ACCT_NO_LEN)
                  ,beginKeyMtnAcctNo
                  ,KEY_MTN_ACCT_NO_LEN
                 );
            localKeyMtnAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkKeyMtnAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshKeyMtnAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshKeyMtnAcctNo() {	 
			return (getInt(beginKeyMtnAcctNo));
   	}




}
  
