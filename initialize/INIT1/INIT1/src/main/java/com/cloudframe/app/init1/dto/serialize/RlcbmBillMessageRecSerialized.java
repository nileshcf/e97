package com.cloudframe.app.init1.dto.serialize;

/**
*  The class RlcbmBillMessageRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlcbmBillMessageRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlcbmBillMessageRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLCBM_BILL_MESSAGE_REC_LENGTH = 161;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlcbmInvoiceNo;
            protected  int beginRlcbmCustTypCd;
            protected  int beginRlcbmEcpdProfileId;
            protected  int beginRlcbmActiveMtnsQty;
	
	/**
	* Constructor for RlcbmBillMessageRecSerialized
	**/
    public RlcbmBillMessageRecSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlcbmBillMessageRecSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlcbmBillMessageRecSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlcbmBillMessageRecSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this RlcbmBillMessageRecSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in RlcbmBillMessageRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLCBM_BILL_MESSAGE_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlcbmInvoiceNo = getStartOffset() + 24;	// set offset for serialization
  
             beginRlcbmCustTypCd = getStartOffset() + 32;	// set offset for serialization
  
             beginRlcbmEcpdProfileId = getStartOffset() + 34;	// set offset for serialization
  
             beginRlcbmActiveMtnsQty = getStartOffset() + 38;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localRlcbmInvoiceNoCounter = -1;
         public boolean isRlcbmInvoiceNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRlcbmInvoiceNoCounter != sharedCounter;
            localRlcbmInvoiceNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int RLCBM_INVOICE_NO_LEN = 8;
  	/**
	 * serializeRlcbmInvoiceNo
	 */
	protected void serializeRlcbmInvoiceNo(long rlcbmInvoiceNo) {
           replaceValue( //  save the value as string
                   getBinaryString( rlcbmInvoiceNo,RLCBM_INVOICE_NO_LEN)
                  ,beginRlcbmInvoiceNo
                  ,RLCBM_INVOICE_NO_LEN
                 );
            localRlcbmInvoiceNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkRlcbmInvoiceNoMaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshRlcbmInvoiceNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRlcbmInvoiceNo() {	 
			return (getLong(beginRlcbmInvoiceNo));
   	}
     int localRlcbmCustTypCdCounter = -1;
     public boolean isRlcbmCustTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlcbmCustTypCdCounter != sharedCounter;
         localRlcbmCustTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLCBM_CUST_TYP_CD_LEN = 2;
	/**
	 * 	serialize this RlcbmCustTypCd
	 */
   protected void serializeRlcbmCustTypCd(char[] rlcbmCustTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlcbmCustTypCd,0,getStringValue(),beginRlcbmCustTypCd,RLCBM_CUST_TYP_CD_LEN);
       localRlcbmCustTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlcbmCustTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlcbmCustTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlcbmCustTypCd() {	 
   		return (substring(getStringValue(),beginRlcbmCustTypCd,beginRlcbmCustTypCd + RLCBM_CUST_TYP_CD_LEN));
   	}
         int localRlcbmEcpdProfileIdCounter = -1;
         public boolean isRlcbmEcpdProfileIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRlcbmEcpdProfileIdCounter != sharedCounter;
            localRlcbmEcpdProfileIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int RLCBM_ECPD_PROFILE_ID_LEN = 4;
  	/**
	 * serializeRlcbmEcpdProfileId
	 */
	protected void serializeRlcbmEcpdProfileId(int rlcbmEcpdProfileId) {
           replaceValue( //  save the value as string
                   getBinaryString( rlcbmEcpdProfileId,RLCBM_ECPD_PROFILE_ID_LEN)
                  ,beginRlcbmEcpdProfileId
                  ,RLCBM_ECPD_PROFILE_ID_LEN
                 );
            localRlcbmEcpdProfileIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRlcbmEcpdProfileIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRlcbmEcpdProfileId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlcbmEcpdProfileId() {	 
			return (getInt(beginRlcbmEcpdProfileId));
   	}
         int localRlcbmActiveMtnsQtyCounter = -1;
         public boolean isRlcbmActiveMtnsQtyModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRlcbmActiveMtnsQtyCounter != sharedCounter;
            localRlcbmActiveMtnsQtyCounter = sharedCounter; return hasModified; 
         }
   protected static final int RLCBM_ACTIVE_MTNS_QTY_LEN = 4;
  	/**
	 * serializeRlcbmActiveMtnsQty
	 */
	protected void serializeRlcbmActiveMtnsQty(int rlcbmActiveMtnsQty) {
           replaceValue( //  save the value as string
                   getBinaryString( rlcbmActiveMtnsQty,RLCBM_ACTIVE_MTNS_QTY_LEN)
                  ,beginRlcbmActiveMtnsQty
                  ,RLCBM_ACTIVE_MTNS_QTY_LEN
                 );
            localRlcbmActiveMtnsQtyCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRlcbmActiveMtnsQtyMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRlcbmActiveMtnsQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlcbmActiveMtnsQty() {	 
			return (getInt(beginRlcbmActiveMtnsQty));
   	}




}
  
