package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class DclscpsectbSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DclscpsectbSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclscpsectbSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLSCPSECTB_LENGTH = 101;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginScpsecAdpSecurityNo;
            protected  int beginScpsecPriceCd;
            protected  int beginScpsecSourceCd;
	
	/**
	* Constructor for DclscpsectbSerialized
	**/
    public DclscpsectbSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclscpsectbSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLSCPSECTB_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginScpsecAdpSecurityNo = getStartOffset() + 0;	// set offset for serialization
  
             beginScpsecPriceCd = getStartOffset() + 50;	// set offset for serialization
  
             beginScpsecSourceCd = getStartOffset() + 53;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localScpsecAdpSecurityNoCounter = -1;
     public boolean isScpsecAdpSecurityNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localScpsecAdpSecurityNoCounter != sharedCounter;
         localScpsecAdpSecurityNoCounter = sharedCounter; return hasModified;
     }
	protected static final int SCPSEC_ADP_SECURITY_NO_LEN = 8;
	/**
	 * 	serialize this ScpsecAdpSecurityNo
	 */
   protected void serializeScpsecAdpSecurityNo(char[] scpsecAdpSecurityNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(scpsecAdpSecurityNo,0,getStringValue(),beginScpsecAdpSecurityNo,SCPSEC_ADP_SECURITY_NO_LEN);
       localScpsecAdpSecurityNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkScpsecAdpSecurityNoConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshScpsecAdpSecurityNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshScpsecAdpSecurityNo() {	 
   		return (substring(getStringValue(),beginScpsecAdpSecurityNo,beginScpsecAdpSecurityNo + SCPSEC_ADP_SECURITY_NO_LEN));
   	}
     int localScpsecPriceCdCounter = -1;
     public boolean isScpsecPriceCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localScpsecPriceCdCounter != sharedCounter;
         localScpsecPriceCdCounter = sharedCounter; return hasModified;
     }
	protected static final int SCPSEC_PRICE_CD_LEN = 3;
	/**
	 * 	serialize this ScpsecPriceCd
	 */
   protected void serializeScpsecPriceCd(char[] scpsecPriceCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(scpsecPriceCd,0,getStringValue(),beginScpsecPriceCd,SCPSEC_PRICE_CD_LEN);
       localScpsecPriceCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkScpsecPriceCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshScpsecPriceCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshScpsecPriceCd() {	 
   		return (substring(getStringValue(),beginScpsecPriceCd,beginScpsecPriceCd + SCPSEC_PRICE_CD_LEN));
   	}
     int localScpsecSourceCdCounter = -1;
     public boolean isScpsecSourceCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localScpsecSourceCdCounter != sharedCounter;
         localScpsecSourceCdCounter = sharedCounter; return hasModified;
     }
	protected static final int SCPSEC_SOURCE_CD_LEN = 3;
	/**
	 * 	serialize this ScpsecSourceCd
	 */
   protected void serializeScpsecSourceCd(char[] scpsecSourceCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(scpsecSourceCd,0,getStringValue(),beginScpsecSourceCd,SCPSEC_SOURCE_CD_LEN);
       localScpsecSourceCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkScpsecSourceCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshScpsecSourceCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshScpsecSourceCd() {	 
   		return (substring(getStringValue(),beginScpsecSourceCd,beginScpsecSourceCd + SCPSEC_SOURCE_CD_LEN));
   	}




}
  
