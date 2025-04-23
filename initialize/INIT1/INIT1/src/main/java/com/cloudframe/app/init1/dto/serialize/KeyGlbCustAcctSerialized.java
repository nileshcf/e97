package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyGlbCustAcctSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyGlbCustAcctSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyGlbCustAcctSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_GLB_CUST_ACCT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGlbCustIdNo;
            protected  int beginGlbAcctNo;
	
	/**
	* Constructor for KeyGlbCustAcctSerialized
	**/
    public KeyGlbCustAcctSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyGlbCustAcctSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyGlbCustAcctSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyGlbCustAcctSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,406); // serialize this field at offset 406 by default 
    }
    
	/**
	* sets parent for this KeyGlbCustAcctSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 406 by default
    }    
	/**
	* initializes the field in KeyGlbCustAcctSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_GLB_CUST_ACCT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginGlbCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginGlbAcctNo = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localGlbCustIdNoCounter = -1;
         public boolean isGlbCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localGlbCustIdNoCounter != sharedCounter;
            localGlbCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int GLB_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeGlbCustIdNo
	 */
	protected void serializeGlbCustIdNo(int glbCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( glbCustIdNo,GLB_CUST_ID_NO_LEN)
                  ,beginGlbCustIdNo
                  ,GLB_CUST_ID_NO_LEN
                 );
            localGlbCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkGlbCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshGlbCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGlbCustIdNo() {	 
			return (getInt(beginGlbCustIdNo));
   	}
         int localGlbAcctNoCounter = -1;
         public boolean isGlbAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localGlbAcctNoCounter != sharedCounter;
            localGlbAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int GLB_ACCT_NO_LEN = 4;
  	/**
	 * serializeGlbAcctNo
	 */
	protected void serializeGlbAcctNo(int glbAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( glbAcctNo,GLB_ACCT_NO_LEN)
                  ,beginGlbAcctNo
                  ,GLB_ACCT_NO_LEN
                 );
            localGlbAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkGlbAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshGlbAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGlbAcctNo() {	 
			return (getInt(beginGlbAcctNo));
   	}




}
  
