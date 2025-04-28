package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyLsgremCustAcctSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyLsgremCustAcctSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyLsgremCustAcctSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_LSGREM_CUST_ACCT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsgremCustIdNo;
            protected  int beginLsgremAcctNo;
	
	/**
	* Constructor for KeyLsgremCustAcctSerialized
	**/
    public KeyLsgremCustAcctSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyLsgremCustAcctSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyLsgremCustAcctSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyLsgremCustAcctSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this KeyLsgremCustAcctSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in KeyLsgremCustAcctSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_LSGREM_CUST_ACCT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsgremCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginLsgremAcctNo = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localLsgremCustIdNoCounter = -1;
         public boolean isLsgremCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsgremCustIdNoCounter != sharedCounter;
            localLsgremCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int LSGREM_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeLsgremCustIdNo
	 */
	protected void serializeLsgremCustIdNo(int lsgremCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( lsgremCustIdNo,LSGREM_CUST_ID_NO_LEN)
                  ,beginLsgremCustIdNo
                  ,LSGREM_CUST_ID_NO_LEN
                 );
            localLsgremCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLsgremCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLsgremCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsgremCustIdNo() {	 
			return (getInt(beginLsgremCustIdNo));
   	}
         int localLsgremAcctNoCounter = -1;
         public boolean isLsgremAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsgremAcctNoCounter != sharedCounter;
            localLsgremAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int LSGREM_ACCT_NO_LEN = 4;
  	/**
	 * serializeLsgremAcctNo
	 */
	protected void serializeLsgremAcctNo(int lsgremAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( lsgremAcctNo,LSGREM_ACCT_NO_LEN)
                  ,beginLsgremAcctNo
                  ,LSGREM_ACCT_NO_LEN
                 );
            localLsgremAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLsgremAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLsgremAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsgremAcctNo() {	 
			return (getInt(beginLsgremAcctNo));
   	}




}
  
