package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyAtdsumCustAcctSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyAtdsumCustAcctSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyAtdsumCustAcctSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_ATDSUM_CUST_ACCT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAtdsumCustIdNo;
            protected  int beginAtdsumAcctNo;
	
	/**
	* Constructor for KeyAtdsumCustAcctSerialized
	**/
    public KeyAtdsumCustAcctSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyAtdsumCustAcctSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyAtdsumCustAcctSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyAtdsumCustAcctSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,32); // serialize this field at offset 32 by default 
    }
    
	/**
	* sets parent for this KeyAtdsumCustAcctSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 32 by default
    }    
	/**
	* initializes the field in KeyAtdsumCustAcctSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_ATDSUM_CUST_ACCT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAtdsumCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginAtdsumAcctNo = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localAtdsumCustIdNoCounter = -1;
         public boolean isAtdsumCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAtdsumCustIdNoCounter != sharedCounter;
            localAtdsumCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int ATDSUM_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeAtdsumCustIdNo
	 */
	protected void serializeAtdsumCustIdNo(int atdsumCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( atdsumCustIdNo,ATDSUM_CUST_ID_NO_LEN)
                  ,beginAtdsumCustIdNo
                  ,ATDSUM_CUST_ID_NO_LEN
                 );
            localAtdsumCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAtdsumCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAtdsumCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAtdsumCustIdNo() {	 
			return (getInt(beginAtdsumCustIdNo));
   	}
         int localAtdsumAcctNoCounter = -1;
         public boolean isAtdsumAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAtdsumAcctNoCounter != sharedCounter;
            localAtdsumAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int ATDSUM_ACCT_NO_LEN = 4;
  	/**
	 * serializeAtdsumAcctNo
	 */
	protected void serializeAtdsumAcctNo(int atdsumAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( atdsumAcctNo,ATDSUM_ACCT_NO_LEN)
                  ,beginAtdsumAcctNo
                  ,ATDSUM_ACCT_NO_LEN
                 );
            localAtdsumAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAtdsumAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAtdsumAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAtdsumAcctNo() {	 
			return (getInt(beginAtdsumAcctNo));
   	}




}
  
