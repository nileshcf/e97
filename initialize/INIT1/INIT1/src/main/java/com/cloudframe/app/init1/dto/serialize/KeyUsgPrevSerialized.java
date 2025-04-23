package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyUsgPrevSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyUsgPrevSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyUsgPrevSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_USG_PREV_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginUsgPrvCustIdNo;
            protected  int beginUsgPrvAcctNo;
            protected  int beginUsgPrvInvoiceNo;
            protected  int beginUsgPrvItuMobCountryCd;
            protected  int beginUsgPrvItuMobNetworkCd;
            protected  int beginUsgPrvBeginDt;
            protected  int beginUsgPrvBeginTm;
            protected  int beginUsgPrvGri;
	
	/**
	* Constructor for KeyUsgPrevSerialized
	**/
    public KeyUsgPrevSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyUsgPrevSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyUsgPrevSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyUsgPrevSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,238); // serialize this field at offset 238 by default 
    }
    
	/**
	* sets parent for this KeyUsgPrevSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 238 by default
    }    
	/**
	* initializes the field in KeyUsgPrevSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_USG_PREV_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginUsgPrvCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginUsgPrvAcctNo = getStartOffset() + 4;	// set offset for serialization
  
  
             beginUsgPrvInvoiceNo = getStartOffset() + 18;	// set offset for serialization
  
             beginUsgPrvItuMobCountryCd = getStartOffset() + 26;	// set offset for serialization
  
             beginUsgPrvItuMobNetworkCd = getStartOffset() + 29;	// set offset for serialization
  
             beginUsgPrvBeginDt = getStartOffset() + 32;	// set offset for serialization
  
             beginUsgPrvBeginTm = getStartOffset() + 42;	// set offset for serialization
  
             beginUsgPrvGri = getStartOffset() + 50;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localUsgPrvCustIdNoCounter = -1;
         public boolean isUsgPrvCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUsgPrvCustIdNoCounter != sharedCounter;
            localUsgPrvCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int USG_PRV_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeUsgPrvCustIdNo
	 */
	protected void serializeUsgPrvCustIdNo(int usgPrvCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( usgPrvCustIdNo,USG_PRV_CUST_ID_NO_LEN)
                  ,beginUsgPrvCustIdNo
                  ,USG_PRV_CUST_ID_NO_LEN
                 );
            localUsgPrvCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkUsgPrvCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshUsgPrvCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUsgPrvCustIdNo() {	 
			return (getInt(beginUsgPrvCustIdNo));
   	}
         int localUsgPrvAcctNoCounter = -1;
         public boolean isUsgPrvAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUsgPrvAcctNoCounter != sharedCounter;
            localUsgPrvAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int USG_PRV_ACCT_NO_LEN = 4;
  	/**
	 * serializeUsgPrvAcctNo
	 */
	protected void serializeUsgPrvAcctNo(int usgPrvAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( usgPrvAcctNo,USG_PRV_ACCT_NO_LEN)
                  ,beginUsgPrvAcctNo
                  ,USG_PRV_ACCT_NO_LEN
                 );
            localUsgPrvAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkUsgPrvAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshUsgPrvAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUsgPrvAcctNo() {	 
			return (getInt(beginUsgPrvAcctNo));
   	}
         int localUsgPrvInvoiceNoCounter = -1;
         public boolean isUsgPrvInvoiceNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUsgPrvInvoiceNoCounter != sharedCounter;
            localUsgPrvInvoiceNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int USG_PRV_INVOICE_NO_LEN = 8;
  	/**
	 * serializeUsgPrvInvoiceNo
	 */
	protected void serializeUsgPrvInvoiceNo(long usgPrvInvoiceNo) {
           replaceValue( //  save the value as string
                   getBinaryString( usgPrvInvoiceNo,USG_PRV_INVOICE_NO_LEN)
                  ,beginUsgPrvInvoiceNo
                  ,USG_PRV_INVOICE_NO_LEN
                 );
            localUsgPrvInvoiceNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkUsgPrvInvoiceNoMaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshUsgPrvInvoiceNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshUsgPrvInvoiceNo() {	 
			return (getLong(beginUsgPrvInvoiceNo));
   	}
     int localUsgPrvItuMobCountryCdCounter = -1;
     public boolean isUsgPrvItuMobCountryCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsgPrvItuMobCountryCdCounter != sharedCounter;
         localUsgPrvItuMobCountryCdCounter = sharedCounter; return hasModified;
     }
	protected static final int USG_PRV_ITU_MOB_COUNTRY_CD_LEN = 3;
	/**
	 * 	serialize this UsgPrvItuMobCountryCd
	 */
   protected void serializeUsgPrvItuMobCountryCd(char[] usgPrvItuMobCountryCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usgPrvItuMobCountryCd,0,getStringValue(),beginUsgPrvItuMobCountryCd,USG_PRV_ITU_MOB_COUNTRY_CD_LEN);
       localUsgPrvItuMobCountryCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsgPrvItuMobCountryCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshUsgPrvItuMobCountryCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsgPrvItuMobCountryCd() {	 
   		return (substring(getStringValue(),beginUsgPrvItuMobCountryCd,beginUsgPrvItuMobCountryCd + USG_PRV_ITU_MOB_COUNTRY_CD_LEN));
   	}
     int localUsgPrvItuMobNetworkCdCounter = -1;
     public boolean isUsgPrvItuMobNetworkCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsgPrvItuMobNetworkCdCounter != sharedCounter;
         localUsgPrvItuMobNetworkCdCounter = sharedCounter; return hasModified;
     }
	protected static final int USG_PRV_ITU_MOB_NETWORK_CD_LEN = 3;
	/**
	 * 	serialize this UsgPrvItuMobNetworkCd
	 */
   protected void serializeUsgPrvItuMobNetworkCd(char[] usgPrvItuMobNetworkCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usgPrvItuMobNetworkCd,0,getStringValue(),beginUsgPrvItuMobNetworkCd,USG_PRV_ITU_MOB_NETWORK_CD_LEN);
       localUsgPrvItuMobNetworkCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsgPrvItuMobNetworkCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshUsgPrvItuMobNetworkCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsgPrvItuMobNetworkCd() {	 
   		return (substring(getStringValue(),beginUsgPrvItuMobNetworkCd,beginUsgPrvItuMobNetworkCd + USG_PRV_ITU_MOB_NETWORK_CD_LEN));
   	}
     int localUsgPrvBeginDtCounter = -1;
     public boolean isUsgPrvBeginDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsgPrvBeginDtCounter != sharedCounter;
         localUsgPrvBeginDtCounter = sharedCounter; return hasModified;
     }
	protected static final int USG_PRV_BEGIN_DT_LEN = 10;
	/**
	 * 	serialize this UsgPrvBeginDt
	 */
   protected void serializeUsgPrvBeginDt(char[] usgPrvBeginDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usgPrvBeginDt,0,getStringValue(),beginUsgPrvBeginDt,USG_PRV_BEGIN_DT_LEN);
       localUsgPrvBeginDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsgPrvBeginDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshUsgPrvBeginDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsgPrvBeginDt() {	 
   		return (substring(getStringValue(),beginUsgPrvBeginDt,beginUsgPrvBeginDt + USG_PRV_BEGIN_DT_LEN));
   	}
     int localUsgPrvBeginTmCounter = -1;
     public boolean isUsgPrvBeginTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsgPrvBeginTmCounter != sharedCounter;
         localUsgPrvBeginTmCounter = sharedCounter; return hasModified;
     }
	protected static final int USG_PRV_BEGIN_TM_LEN = 8;
	/**
	 * 	serialize this UsgPrvBeginTm
	 */
   protected void serializeUsgPrvBeginTm(char[] usgPrvBeginTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usgPrvBeginTm,0,getStringValue(),beginUsgPrvBeginTm,USG_PRV_BEGIN_TM_LEN);
       localUsgPrvBeginTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsgPrvBeginTmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshUsgPrvBeginTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsgPrvBeginTm() {	 
   		return (substring(getStringValue(),beginUsgPrvBeginTm,beginUsgPrvBeginTm + USG_PRV_BEGIN_TM_LEN));
   	}
     int localUsgPrvGriCounter = -1;
     public boolean isUsgPrvGriModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsgPrvGriCounter != sharedCounter;
         localUsgPrvGriCounter = sharedCounter; return hasModified;
     }
	protected static final int USG_PRV_GRI_LEN = 40;
	/**
	 * 	serialize this UsgPrvGri
	 */
   protected void serializeUsgPrvGri(char[] usgPrvGri) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usgPrvGri,0,getStringValue(),beginUsgPrvGri,USG_PRV_GRI_LEN);
       localUsgPrvGriCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsgPrvGriConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshUsgPrvGri is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsgPrvGri() {	 
   		return (substring(getStringValue(),beginUsgPrvGri,beginUsgPrvGri + USG_PRV_GRI_LEN));
   	}




}
  
