package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyM2mPromoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyM2mPromoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyM2mPromoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_M_2M_PROMO_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginM2mCustIdNo;
            protected  int beginM2mAcctNo;
	
	/**
	* Constructor for KeyM2mPromoSerialized
	**/
    public KeyM2mPromoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyM2mPromoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyM2mPromoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyM2mPromoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,414); // serialize this field at offset 414 by default 
    }
    
	/**
	* sets parent for this KeyM2mPromoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 414 by default
    }    
	/**
	* initializes the field in KeyM2mPromoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_M_2M_PROMO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginM2mCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginM2mAcctNo = getStartOffset() + 4;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localM2mCustIdNoCounter = -1;
         public boolean isM2mCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localM2mCustIdNoCounter != sharedCounter;
            localM2mCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int M_2M_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeM2mCustIdNo
	 */
	protected void serializeM2mCustIdNo(int m2mCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( m2mCustIdNo,M_2M_CUST_ID_NO_LEN)
                  ,beginM2mCustIdNo
                  ,M_2M_CUST_ID_NO_LEN
                 );
            localM2mCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkM2mCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshM2mCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshM2mCustIdNo() {	 
			return (getInt(beginM2mCustIdNo));
   	}
         int localM2mAcctNoCounter = -1;
         public boolean isM2mAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localM2mAcctNoCounter != sharedCounter;
            localM2mAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int M_2M_ACCT_NO_LEN = 4;
  	/**
	 * serializeM2mAcctNo
	 */
	protected void serializeM2mAcctNo(int m2mAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( m2mAcctNo,M_2M_ACCT_NO_LEN)
                  ,beginM2mAcctNo
                  ,M_2M_ACCT_NO_LEN
                 );
            localM2mAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkM2mAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshM2mAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshM2mAcctNo() {	 
			return (getInt(beginM2mAcctNo));
   	}




}
  
