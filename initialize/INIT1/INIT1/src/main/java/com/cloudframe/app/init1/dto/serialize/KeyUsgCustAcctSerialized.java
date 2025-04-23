package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyUsgCustAcctSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyUsgCustAcctSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyUsgCustAcctSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_USG_CUST_ACCT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginUsgCustIdNo;
            protected  int beginUsgAcctNo;
	
	/**
	* Constructor for KeyUsgCustAcctSerialized
	**/
    public KeyUsgCustAcctSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyUsgCustAcctSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyUsgCustAcctSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyUsgCustAcctSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,220); // serialize this field at offset 220 by default 
    }
    
	/**
	* sets parent for this KeyUsgCustAcctSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 220 by default
    }    
	/**
	* initializes the field in KeyUsgCustAcctSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_USG_CUST_ACCT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginUsgCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginUsgAcctNo = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localUsgCustIdNoCounter = -1;
         public boolean isUsgCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUsgCustIdNoCounter != sharedCounter;
            localUsgCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int USG_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeUsgCustIdNo
	 */
	protected void serializeUsgCustIdNo(int usgCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( usgCustIdNo,USG_CUST_ID_NO_LEN)
                  ,beginUsgCustIdNo
                  ,USG_CUST_ID_NO_LEN
                 );
            localUsgCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkUsgCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshUsgCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUsgCustIdNo() {	 
			return (getInt(beginUsgCustIdNo));
   	}
         int localUsgAcctNoCounter = -1;
         public boolean isUsgAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUsgAcctNoCounter != sharedCounter;
            localUsgAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int USG_ACCT_NO_LEN = 4;
  	/**
	 * serializeUsgAcctNo
	 */
	protected void serializeUsgAcctNo(int usgAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( usgAcctNo,USG_ACCT_NO_LEN)
                  ,beginUsgAcctNo
                  ,USG_ACCT_NO_LEN
                 );
            localUsgAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkUsgAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshUsgAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUsgAcctNo() {	 
			return (getInt(beginUsgAcctNo));
   	}




}
  
