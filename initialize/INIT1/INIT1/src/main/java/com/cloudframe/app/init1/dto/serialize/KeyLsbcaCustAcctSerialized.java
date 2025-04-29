package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyLsbcaCustAcctSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyLsbcaCustAcctSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyLsbcaCustAcctSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_LSBCA_CUST_ACCT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsbcaCustIdNo;
            protected  int beginLsbcaAcctNo;
	
	/**
	* Constructor for KeyLsbcaCustAcctSerialized
	**/
    public KeyLsbcaCustAcctSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyLsbcaCustAcctSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyLsbcaCustAcctSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyLsbcaCustAcctSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,16); // serialize this field at offset 16 by default 
    }
    
	/**
	* sets parent for this KeyLsbcaCustAcctSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 16 by default
    }    
	/**
	* initializes the field in KeyLsbcaCustAcctSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_LSBCA_CUST_ACCT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsbcaCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginLsbcaAcctNo = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localLsbcaCustIdNoCounter = -1;
         public boolean isLsbcaCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsbcaCustIdNoCounter != sharedCounter;
            localLsbcaCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int LSBCA_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeLsbcaCustIdNo
	 */
	protected void serializeLsbcaCustIdNo(int lsbcaCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( lsbcaCustIdNo,LSBCA_CUST_ID_NO_LEN)
                  ,beginLsbcaCustIdNo
                  ,LSBCA_CUST_ID_NO_LEN
                 );
            localLsbcaCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLsbcaCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLsbcaCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsbcaCustIdNo() {	 
			return (getInt(beginLsbcaCustIdNo));
   	}
         int localLsbcaAcctNoCounter = -1;
         public boolean isLsbcaAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsbcaAcctNoCounter != sharedCounter;
            localLsbcaAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int LSBCA_ACCT_NO_LEN = 4;
  	/**
	 * serializeLsbcaAcctNo
	 */
	protected void serializeLsbcaAcctNo(int lsbcaAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( lsbcaAcctNo,LSBCA_ACCT_NO_LEN)
                  ,beginLsbcaAcctNo
                  ,LSBCA_ACCT_NO_LEN
                 );
            localLsbcaAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLsbcaAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLsbcaAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsbcaAcctNo() {	 
			return (getInt(beginLsbcaAcctNo));
   	}




}
  
