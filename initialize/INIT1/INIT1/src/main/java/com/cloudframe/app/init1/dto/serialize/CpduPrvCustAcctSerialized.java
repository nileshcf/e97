package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CpduPrvCustAcctSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CpduPrvCustAcctSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CpduPrvCustAcctSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CPDU_PRV_CUST_ACCT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCpduPrvCustIdNo;
            protected  int beginCpduPrvAcctNo;
	
	/**
	* Constructor for CpduPrvCustAcctSerialized
	**/
    public CpduPrvCustAcctSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CpduPrvCustAcctSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CpduPrvCustAcctSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CpduPrvCustAcctSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,51); // serialize this field at offset 51 by default 
    }
    
	/**
	* sets parent for this CpduPrvCustAcctSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 51 by default
    }    
	/**
	* initializes the field in CpduPrvCustAcctSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CPDU_PRV_CUST_ACCT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCpduPrvCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginCpduPrvAcctNo = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localCpduPrvCustIdNoCounter = -1;
         public boolean isCpduPrvCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCpduPrvCustIdNoCounter != sharedCounter;
            localCpduPrvCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int CPDU_PRV_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeCpduPrvCustIdNo
	 */
	protected void serializeCpduPrvCustIdNo(int cpduPrvCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( cpduPrvCustIdNo,CPDU_PRV_CUST_ID_NO_LEN)
                  ,beginCpduPrvCustIdNo
                  ,CPDU_PRV_CUST_ID_NO_LEN
                 );
            localCpduPrvCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCpduPrvCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCpduPrvCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCpduPrvCustIdNo() {	 
			return (getInt(beginCpduPrvCustIdNo));
   	}
         int localCpduPrvAcctNoCounter = -1;
         public boolean isCpduPrvAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCpduPrvAcctNoCounter != sharedCounter;
            localCpduPrvAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int CPDU_PRV_ACCT_NO_LEN = 4;
  	/**
	 * serializeCpduPrvAcctNo
	 */
	protected void serializeCpduPrvAcctNo(int cpduPrvAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( cpduPrvAcctNo,CPDU_PRV_ACCT_NO_LEN)
                  ,beginCpduPrvAcctNo
                  ,CPDU_PRV_ACCT_NO_LEN
                 );
            localCpduPrvAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCpduPrvAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCpduPrvAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCpduPrvAcctNo() {	 
			return (getInt(beginCpduPrvAcctNo));
   	}




}
  
