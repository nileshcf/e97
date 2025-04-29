package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyInvCustAcctSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyInvCustAcctSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyInvCustAcctSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_INV_CUST_ACCT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInvCustIdNo;
            protected  int beginInvAcctNo;
	
	/**
	* Constructor for KeyInvCustAcctSerialized
	**/
    public KeyInvCustAcctSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyInvCustAcctSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyInvCustAcctSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyInvCustAcctSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this KeyInvCustAcctSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in KeyInvCustAcctSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_INV_CUST_ACCT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInvCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginInvAcctNo = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localInvCustIdNoCounter = -1;
         public boolean isInvCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInvCustIdNoCounter != sharedCounter;
            localInvCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int INV_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeInvCustIdNo
	 */
	protected void serializeInvCustIdNo(int invCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( invCustIdNo,INV_CUST_ID_NO_LEN)
                  ,beginInvCustIdNo
                  ,INV_CUST_ID_NO_LEN
                 );
            localInvCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkInvCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshInvCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInvCustIdNo() {	 
			return (getInt(beginInvCustIdNo));
   	}
         int localInvAcctNoCounter = -1;
         public boolean isInvAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInvAcctNoCounter != sharedCounter;
            localInvAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int INV_ACCT_NO_LEN = 4;
  	/**
	 * serializeInvAcctNo
	 */
	protected void serializeInvAcctNo(int invAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( invAcctNo,INV_ACCT_NO_LEN)
                  ,beginInvAcctNo
                  ,INV_ACCT_NO_LEN
                 );
            localInvAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkInvAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshInvAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInvAcctNo() {	 
			return (getInt(beginInvAcctNo));
   	}




}
  
