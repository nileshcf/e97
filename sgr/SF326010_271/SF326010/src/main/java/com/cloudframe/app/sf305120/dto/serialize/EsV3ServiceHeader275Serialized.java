package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class EsV3ServiceHeader275Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EsV3ServiceHeader275Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EsV3ServiceHeader275Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ES_V_3_SERVICE_HEADER_275_LENGTH = 1019;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEsV3SrvId275;
            protected  int beginEsV3SrvreqId275;
            protected  int beginEsV3SrvVersion275;
            protected  int beginEsV3SiHdrLnth275;
            protected  int beginEsV3SrvStatus275;
            protected  int beginEsV3StatusRc275;
            protected  int beginEsV3SrvDataLnth275;
            protected  int beginEsV3PayloadSpec275;
            protected  int beginEsV3PayloadLnth275;
            protected  int beginEsV3PayloadData275;
	
	/**
	* Constructor for EsV3ServiceHeader275Serialized
	**/
    public EsV3ServiceHeader275Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EsV3ServiceHeader275Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ES_V_3_SERVICE_HEADER_275_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEsV3SrvId275 = getStartOffset() + 0;	// set offset for serialization
  
             beginEsV3SrvreqId275 = getStartOffset() + 4;	// set offset for serialization
  
             beginEsV3SrvVersion275 = getStartOffset() + 10;	// set offset for serialization
  
             beginEsV3SiHdrLnth275 = getStartOffset() + 11;	// set offset for serialization
  
             beginEsV3SrvStatus275 = getStartOffset() + 12;	// set offset for serialization
  
             beginEsV3StatusRc275 = getStartOffset() + 13;	// set offset for serialization
  
             beginEsV3SrvDataLnth275 = getStartOffset() + 14;	// set offset for serialization
  
             beginEsV3PayloadSpec275 = getStartOffset() + 16;	// set offset for serialization
  
             beginEsV3PayloadLnth275 = getStartOffset() + 17;	// set offset for serialization
  
             beginEsV3PayloadData275 = getStartOffset() + 19;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEsV3SrvId275Counter = -1;
     public boolean isEsV3SrvId275Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3SrvId275Counter != sharedCounter;
         localEsV3SrvId275Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_SRV_ID_275_LEN = 4;
	/**
	 * 	serialize this EsV3SrvId275
	 */
   protected void serializeEsV3SrvId275(char[] esV3SrvId275) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3SrvId275,0,getStringValue(),beginEsV3SrvId275,ES_V_3_SRV_ID_275_LEN);
       localEsV3SrvId275Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3SrvId275Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshEsV3SrvId275 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3SrvId275() {	 
   		return (substring(getStringValue(),beginEsV3SrvId275,beginEsV3SrvId275 + ES_V_3_SRV_ID_275_LEN));
   	}
     int localEsV3SrvreqId275Counter = -1;
     public boolean isEsV3SrvreqId275Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3SrvreqId275Counter != sharedCounter;
         localEsV3SrvreqId275Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_SRVREQ_ID_275_LEN = 6;
	/**
	 * 	serialize this EsV3SrvreqId275
	 */
   protected void serializeEsV3SrvreqId275(char[] esV3SrvreqId275) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3SrvreqId275,0,getStringValue(),beginEsV3SrvreqId275,ES_V_3_SRVREQ_ID_275_LEN);
       localEsV3SrvreqId275Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3SrvreqId275Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshEsV3SrvreqId275 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3SrvreqId275() {	 
   		return (substring(getStringValue(),beginEsV3SrvreqId275,beginEsV3SrvreqId275 + ES_V_3_SRVREQ_ID_275_LEN));
   	}
     int localEsV3SrvVersion275Counter = -1;
     public boolean isEsV3SrvVersion275Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3SrvVersion275Counter != sharedCounter;
         localEsV3SrvVersion275Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_SRV_VERSION_275_LEN = 1;
	/**
	 * 	serialize this EsV3SrvVersion275
	 */
   protected void serializeEsV3SrvVersion275(char[] esV3SrvVersion275) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3SrvVersion275,0,getStringValue(),beginEsV3SrvVersion275,ES_V_3_SRV_VERSION_275_LEN);
       localEsV3SrvVersion275Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3SrvVersion275Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV3SrvVersion275 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3SrvVersion275() {	 
   		return (substring(getStringValue(),beginEsV3SrvVersion275,beginEsV3SrvVersion275 + ES_V_3_SRV_VERSION_275_LEN));
   	}
     int localEsV3SiHdrLnth275Counter = -1;
     public boolean isEsV3SiHdrLnth275Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3SiHdrLnth275Counter != sharedCounter;
         localEsV3SiHdrLnth275Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_SI_HDR_LNTH_275_LEN = 1;
	/**
	 * 	serialize this EsV3SiHdrLnth275
	 */
   protected void serializeEsV3SiHdrLnth275(char[] esV3SiHdrLnth275) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3SiHdrLnth275,0,getStringValue(),beginEsV3SiHdrLnth275,ES_V_3_SI_HDR_LNTH_275_LEN);
       localEsV3SiHdrLnth275Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3SiHdrLnth275Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV3SiHdrLnth275 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3SiHdrLnth275() {	 
   		return (substring(getStringValue(),beginEsV3SiHdrLnth275,beginEsV3SiHdrLnth275 + ES_V_3_SI_HDR_LNTH_275_LEN));
   	}
     int localEsV3SrvStatus275Counter = -1;
     public boolean isEsV3SrvStatus275Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3SrvStatus275Counter != sharedCounter;
         localEsV3SrvStatus275Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_SRV_STATUS_275_LEN = 1;
	/**
	 * 	serialize this EsV3SrvStatus275
	 */
   protected void serializeEsV3SrvStatus275(char[] esV3SrvStatus275) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3SrvStatus275,0,getStringValue(),beginEsV3SrvStatus275,ES_V_3_SRV_STATUS_275_LEN);
       localEsV3SrvStatus275Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3SrvStatus275Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV3SrvStatus275 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3SrvStatus275() {	 
   		return (substring(getStringValue(),beginEsV3SrvStatus275,beginEsV3SrvStatus275 + ES_V_3_SRV_STATUS_275_LEN));
   	}
     int localEsV3StatusRc275Counter = -1;
     public boolean isEsV3StatusRc275Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3StatusRc275Counter != sharedCounter;
         localEsV3StatusRc275Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_STATUS_RC_275_LEN = 1;
	/**
	 * 	serialize this EsV3StatusRc275
	 */
   protected void serializeEsV3StatusRc275(char[] esV3StatusRc275) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3StatusRc275,0,getStringValue(),beginEsV3StatusRc275,ES_V_3_STATUS_RC_275_LEN);
       localEsV3StatusRc275Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3StatusRc275Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV3StatusRc275 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3StatusRc275() {	 
   		return (substring(getStringValue(),beginEsV3StatusRc275,beginEsV3StatusRc275 + ES_V_3_STATUS_RC_275_LEN));
   	}
         int localEsV3SrvDataLnth275Counter = -1;
         public boolean isEsV3SrvDataLnth275Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEsV3SrvDataLnth275Counter != sharedCounter;
            localEsV3SrvDataLnth275Counter = sharedCounter; return hasModified; 
         }
   protected static final int ES_V_3_SRV_DATA_LNTH_275_LEN = 2;
  	/**
	 * serializeEsV3SrvDataLnth275
	 */
	protected void serializeEsV3SrvDataLnth275(short esV3SrvDataLnth275) {
           replaceValue( //  save the value as string
                   getBinaryString( esV3SrvDataLnth275,ES_V_3_SRV_DATA_LNTH_275_LEN)
                  ,beginEsV3SrvDataLnth275
                  ,ES_V_3_SRV_DATA_LNTH_275_LEN
                 );
            localEsV3SrvDataLnth275Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkEsV3SrvDataLnth275MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshEsV3SrvDataLnth275 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEsV3SrvDataLnth275() {	 
			return (getShort(beginEsV3SrvDataLnth275));
   	}
     int localEsV3PayloadSpec275Counter = -1;
     public boolean isEsV3PayloadSpec275Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3PayloadSpec275Counter != sharedCounter;
         localEsV3PayloadSpec275Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_PAYLOAD_SPEC_275_LEN = 1;
	/**
	 * 	serialize this EsV3PayloadSpec275
	 */
   protected void serializeEsV3PayloadSpec275(char[] esV3PayloadSpec275) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3PayloadSpec275,0,getStringValue(),beginEsV3PayloadSpec275,ES_V_3_PAYLOAD_SPEC_275_LEN);
       localEsV3PayloadSpec275Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3PayloadSpec275Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV3PayloadSpec275 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3PayloadSpec275() {	 
   		return (substring(getStringValue(),beginEsV3PayloadSpec275,beginEsV3PayloadSpec275 + ES_V_3_PAYLOAD_SPEC_275_LEN));
   	}
         int localEsV3PayloadLnth275Counter = -1;
         public boolean isEsV3PayloadLnth275Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEsV3PayloadLnth275Counter != sharedCounter;
            localEsV3PayloadLnth275Counter = sharedCounter; return hasModified; 
         }
   protected static final int ES_V_3_PAYLOAD_LNTH_275_LEN = 2;
  	/**
	 * serializeEsV3PayloadLnth275
	 */
	protected void serializeEsV3PayloadLnth275(short esV3PayloadLnth275) {
           replaceValue( //  save the value as string
                   getBinaryString( esV3PayloadLnth275,ES_V_3_PAYLOAD_LNTH_275_LEN)
                  ,beginEsV3PayloadLnth275
                  ,ES_V_3_PAYLOAD_LNTH_275_LEN
                 );
            localEsV3PayloadLnth275Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkEsV3PayloadLnth275MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshEsV3PayloadLnth275 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEsV3PayloadLnth275() {	 
			return (getShort(beginEsV3PayloadLnth275));
   	}
     int localEsV3PayloadData275Counter = -1;
     public boolean isEsV3PayloadData275Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3PayloadData275Counter != sharedCounter;
         localEsV3PayloadData275Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_PAYLOAD_DATA_275_LEN = 1000;
	/**
	 * 	serialize this EsV3PayloadData275
	 */
   protected void serializeEsV3PayloadData275(char[] esV3PayloadData275) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3PayloadData275,0,getStringValue(),beginEsV3PayloadData275,ES_V_3_PAYLOAD_DATA_275_LEN);
       localEsV3PayloadData275Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3PayloadData275Constraints(char[] value) {
   			return super.checkConstraints(value , 1000 ,false, false);
   }
    /**
	 *	refreshEsV3PayloadData275 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3PayloadData275() {	 
   		return (substring(getStringValue(),beginEsV3PayloadData275,beginEsV3PayloadData275 + ES_V_3_PAYLOAD_DATA_275_LEN));
   	}




}
  
