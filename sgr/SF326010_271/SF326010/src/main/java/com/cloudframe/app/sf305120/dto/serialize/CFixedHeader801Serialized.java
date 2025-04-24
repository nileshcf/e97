package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class CFixedHeader801Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CFixedHeader801Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CFixedHeader801Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int C_FIXED_HEADER_801_LENGTH = 81;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMipCLogLnth801;
            protected  int beginMipCLogClassType801;
            protected  int beginMipCLogRefNum801;
            protected  int beginMipCLogBoxId801;
            protected  int beginMipCLogTime801;
            protected  int beginMipCLogDate801;
            protected  int beginClogHeaderId801;
            protected  int beginClogHeaderVersion801;
            protected  int beginClogHeaderLength801;
            protected  int beginClogRecordLength801;
            protected  int beginClogCorrelationId801;
            protected  int beginClogNumberSvcs801;
            protected  int beginClogSvcIndent801;
            protected  int beginClogSvcRqstId801;
            protected  int beginClogSvcVersion801;
            protected  int beginClogSvcHdrLnth801;
            protected  int beginClogSvcStatus801;
            protected  int beginClogStatusRtnCd801;
            protected  int beginClogSvcDataLnth801;
	
	/**
	* Constructor for CFixedHeader801Serialized
	**/
    public CFixedHeader801Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CFixedHeader801Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CFixedHeader801Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CFixedHeader801Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CFixedHeader801Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CFixedHeader801Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(C_FIXED_HEADER_801_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMipCLogLnth801 = getStartOffset() + 13;	// set offset for serialization
  
             beginMipCLogClassType801 = getStartOffset() + 15;	// set offset for serialization
  
             beginMipCLogRefNum801 = getStartOffset() + 17;	// set offset for serialization
  
             beginMipCLogBoxId801 = getStartOffset() + 23;	// set offset for serialization
  
             beginMipCLogTime801 = getStartOffset() + 26;	// set offset for serialization
  
             beginMipCLogDate801 = getStartOffset() + 29;	// set offset for serialization
  
             beginClogHeaderId801 = getStartOffset() + 38;	// set offset for serialization
  
             beginClogHeaderVersion801 = getStartOffset() + 40;	// set offset for serialization
  
             beginClogHeaderLength801 = getStartOffset() + 41;	// set offset for serialization
  
             beginClogRecordLength801 = getStartOffset() + 42;	// set offset for serialization
  
             beginClogCorrelationId801 = getStartOffset() + 46;	// set offset for serialization
  
             beginClogNumberSvcs801 = getStartOffset() + 64;	// set offset for serialization
  
             beginClogSvcIndent801 = getStartOffset() + 65;	// set offset for serialization
  
             beginClogSvcRqstId801 = getStartOffset() + 69;	// set offset for serialization
  
             beginClogSvcVersion801 = getStartOffset() + 75;	// set offset for serialization
  
             beginClogSvcHdrLnth801 = getStartOffset() + 76;	// set offset for serialization
  
             beginClogSvcStatus801 = getStartOffset() + 77;	// set offset for serialization
  
             beginClogStatusRtnCd801 = getStartOffset() + 78;	// set offset for serialization
  
             beginClogSvcDataLnth801 = getStartOffset() + 79;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localMipCLogLnth801Counter = -1;
         public boolean isMipCLogLnth801Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMipCLogLnth801Counter != sharedCounter;
            localMipCLogLnth801Counter = sharedCounter; return hasModified; 
         }
   protected static final int MIP_CLOG_LNTH_801_LEN = 2;
  	/**
	 * serializeMipCLogLnth801
	 */
	protected void serializeMipCLogLnth801(short mipCLogLnth801) {
           replaceValue( //  save the value as string
                   getBinaryString( mipCLogLnth801,MIP_CLOG_LNTH_801_LEN)
                  ,beginMipCLogLnth801
                  ,MIP_CLOG_LNTH_801_LEN
                 );
            localMipCLogLnth801Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMipCLogLnth801MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMipCLogLnth801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMipCLogLnth801() {	 
			return (getShort(beginMipCLogLnth801));
   	}
     int localMipCLogClassType801Counter = -1;
     public boolean isMipCLogClassType801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipCLogClassType801Counter != sharedCounter;
         localMipCLogClassType801Counter = sharedCounter; return hasModified;
     }
	protected static final int MIP_CLOG_CLASS_TYPE_801_LEN = 2;
	/**
	 * 	serialize this MipCLogClassType801
	 */
   protected void serializeMipCLogClassType801(char[] mipCLogClassType801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mipCLogClassType801,0,getStringValue(),beginMipCLogClassType801,MIP_CLOG_CLASS_TYPE_801_LEN);
       localMipCLogClassType801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMipCLogClassType801Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMipCLogClassType801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMipCLogClassType801() {	 
   		return (substring(getStringValue(),beginMipCLogClassType801,beginMipCLogClassType801 + MIP_CLOG_CLASS_TYPE_801_LEN));
   	}
     int localMipCLogRefNum801Counter = -1;
     public boolean isMipCLogRefNum801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipCLogRefNum801Counter != sharedCounter;
         localMipCLogRefNum801Counter = sharedCounter; return hasModified;
     }
	protected static final int MIP_CLOG_REF_NUM_801_LEN = 6;
	/**
	 * 	serialize this MipCLogRefNum801
	 */
   protected void serializeMipCLogRefNum801(char[] mipCLogRefNum801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mipCLogRefNum801,0,getStringValue(),beginMipCLogRefNum801,MIP_CLOG_REF_NUM_801_LEN);
       localMipCLogRefNum801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMipCLogRefNum801Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshMipCLogRefNum801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMipCLogRefNum801() {	 
   		return (substring(getStringValue(),beginMipCLogRefNum801,beginMipCLogRefNum801 + MIP_CLOG_REF_NUM_801_LEN));
   	}
     int localMipCLogBoxId801Counter = -1;
     public boolean isMipCLogBoxId801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipCLogBoxId801Counter != sharedCounter;
         localMipCLogBoxId801Counter = sharedCounter; return hasModified;
     }
	protected static final int MIP_CLOG_BOX_ID_801_LEN = 3;
	/**
	 * 	serialize this MipCLogBoxId801
	 */
   protected void serializeMipCLogBoxId801(char[] mipCLogBoxId801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mipCLogBoxId801,0,getStringValue(),beginMipCLogBoxId801,MIP_CLOG_BOX_ID_801_LEN);
       localMipCLogBoxId801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMipCLogBoxId801Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMipCLogBoxId801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMipCLogBoxId801() {	 
   		return (substring(getStringValue(),beginMipCLogBoxId801,beginMipCLogBoxId801 + MIP_CLOG_BOX_ID_801_LEN));
   	}
     int localMipCLogTime801Counter = -1;
     public boolean isMipCLogTime801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipCLogTime801Counter != sharedCounter;
         localMipCLogTime801Counter = sharedCounter; return hasModified;
     }
	protected static final int MIP_CLOG_TIME_801_LEN = 3;
	/**
	 * 	serialize this MipCLogTime801
	 */
   protected void serializeMipCLogTime801(char[] mipCLogTime801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mipCLogTime801,0,getStringValue(),beginMipCLogTime801,MIP_CLOG_TIME_801_LEN);
       localMipCLogTime801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMipCLogTime801Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMipCLogTime801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMipCLogTime801() {	 
   		return (substring(getStringValue(),beginMipCLogTime801,beginMipCLogTime801 + MIP_CLOG_TIME_801_LEN));
   	}
     int localMipCLogDate801Counter = -1;
     public boolean isMipCLogDate801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipCLogDate801Counter != sharedCounter;
         localMipCLogDate801Counter = sharedCounter; return hasModified;
     }
	protected static final int MIP_CLOG_DATE_801_LEN = 3;
	/**
	 * 	serialize this MipCLogDate801
	 */
   protected void serializeMipCLogDate801(char[] mipCLogDate801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mipCLogDate801,0,getStringValue(),beginMipCLogDate801,MIP_CLOG_DATE_801_LEN);
       localMipCLogDate801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMipCLogDate801Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMipCLogDate801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMipCLogDate801() {	 
   		return (substring(getStringValue(),beginMipCLogDate801,beginMipCLogDate801 + MIP_CLOG_DATE_801_LEN));
   	}
     int localClogHeaderId801Counter = -1;
     public boolean isClogHeaderId801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClogHeaderId801Counter != sharedCounter;
         localClogHeaderId801Counter = sharedCounter; return hasModified;
     }
	protected static final int CLOG_HEADER_ID_801_LEN = 2;
	/**
	 * 	serialize this ClogHeaderId801
	 */
   protected void serializeClogHeaderId801(char[] clogHeaderId801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clogHeaderId801,0,getStringValue(),beginClogHeaderId801,CLOG_HEADER_ID_801_LEN);
       localClogHeaderId801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClogHeaderId801Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshClogHeaderId801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClogHeaderId801() {	 
   		return (substring(getStringValue(),beginClogHeaderId801,beginClogHeaderId801 + CLOG_HEADER_ID_801_LEN));
   	}
     int localClogHeaderVersion801Counter = -1;
     public boolean isClogHeaderVersion801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClogHeaderVersion801Counter != sharedCounter;
         localClogHeaderVersion801Counter = sharedCounter; return hasModified;
     }
	protected static final int CLOG_HEADER_VERSION_801_LEN = 1;
	/**
	 * 	serialize this ClogHeaderVersion801
	 */
   protected void serializeClogHeaderVersion801(char[] clogHeaderVersion801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clogHeaderVersion801,0,getStringValue(),beginClogHeaderVersion801,CLOG_HEADER_VERSION_801_LEN);
       localClogHeaderVersion801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClogHeaderVersion801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshClogHeaderVersion801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClogHeaderVersion801() {	 
   		return (substring(getStringValue(),beginClogHeaderVersion801,beginClogHeaderVersion801 + CLOG_HEADER_VERSION_801_LEN));
   	}
     int localClogHeaderLength801Counter = -1;
     public boolean isClogHeaderLength801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClogHeaderLength801Counter != sharedCounter;
         localClogHeaderLength801Counter = sharedCounter; return hasModified;
     }
	protected static final int CLOG_HEADER_LENGTH_801_LEN = 1;
	/**
	 * 	serialize this ClogHeaderLength801
	 */
   protected void serializeClogHeaderLength801(char[] clogHeaderLength801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clogHeaderLength801,0,getStringValue(),beginClogHeaderLength801,CLOG_HEADER_LENGTH_801_LEN);
       localClogHeaderLength801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClogHeaderLength801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshClogHeaderLength801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClogHeaderLength801() {	 
   		return (substring(getStringValue(),beginClogHeaderLength801,beginClogHeaderLength801 + CLOG_HEADER_LENGTH_801_LEN));
   	}
         int localClogRecordLength801Counter = -1;
         public boolean isClogRecordLength801Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localClogRecordLength801Counter != sharedCounter;
            localClogRecordLength801Counter = sharedCounter; return hasModified; 
         }
   protected static final int CLOG_RECORD_LENGTH_801_LEN = 4;
  	/**
	 * serializeClogRecordLength801
	 */
	protected void serializeClogRecordLength801(int clogRecordLength801) {
           replaceValue( //  save the value as string
                   getBinaryString( clogRecordLength801,CLOG_RECORD_LENGTH_801_LEN)
                  ,beginClogRecordLength801
                  ,CLOG_RECORD_LENGTH_801_LEN
                 );
            localClogRecordLength801Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkClogRecordLength801MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshClogRecordLength801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshClogRecordLength801() {	 
			return (getInt(beginClogRecordLength801));
   	}
     int localClogCorrelationId801Counter = -1;
     public boolean isClogCorrelationId801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClogCorrelationId801Counter != sharedCounter;
         localClogCorrelationId801Counter = sharedCounter; return hasModified;
     }
	protected static final int CLOG_CORRELATION_ID_801_LEN = 18;
	/**
	 * 	serialize this ClogCorrelationId801
	 */
   protected void serializeClogCorrelationId801(char[] clogCorrelationId801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clogCorrelationId801,0,getStringValue(),beginClogCorrelationId801,CLOG_CORRELATION_ID_801_LEN);
       localClogCorrelationId801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClogCorrelationId801Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshClogCorrelationId801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClogCorrelationId801() {	 
   		return (substring(getStringValue(),beginClogCorrelationId801,beginClogCorrelationId801 + CLOG_CORRELATION_ID_801_LEN));
   	}
     int localClogNumberSvcs801Counter = -1;
     public boolean isClogNumberSvcs801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClogNumberSvcs801Counter != sharedCounter;
         localClogNumberSvcs801Counter = sharedCounter; return hasModified;
     }
	protected static final int CLOG_NUMBER_SVCS_801_LEN = 1;
	/**
	 * 	serialize this ClogNumberSvcs801
	 */
   protected void serializeClogNumberSvcs801(char[] clogNumberSvcs801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clogNumberSvcs801,0,getStringValue(),beginClogNumberSvcs801,CLOG_NUMBER_SVCS_801_LEN);
       localClogNumberSvcs801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClogNumberSvcs801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshClogNumberSvcs801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClogNumberSvcs801() {	 
   		return (substring(getStringValue(),beginClogNumberSvcs801,beginClogNumberSvcs801 + CLOG_NUMBER_SVCS_801_LEN));
   	}
     int localClogSvcIndent801Counter = -1;
     public boolean isClogSvcIndent801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClogSvcIndent801Counter != sharedCounter;
         localClogSvcIndent801Counter = sharedCounter; return hasModified;
     }
	protected static final int CLOG_SVC_INDENT_801_LEN = 4;
	/**
	 * 	serialize this ClogSvcIndent801
	 */
   protected void serializeClogSvcIndent801(char[] clogSvcIndent801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clogSvcIndent801,0,getStringValue(),beginClogSvcIndent801,CLOG_SVC_INDENT_801_LEN);
       localClogSvcIndent801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClogSvcIndent801Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshClogSvcIndent801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClogSvcIndent801() {	 
   		return (substring(getStringValue(),beginClogSvcIndent801,beginClogSvcIndent801 + CLOG_SVC_INDENT_801_LEN));
   	}
     int localClogSvcRqstId801Counter = -1;
     public boolean isClogSvcRqstId801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClogSvcRqstId801Counter != sharedCounter;
         localClogSvcRqstId801Counter = sharedCounter; return hasModified;
     }
	protected static final int CLOG_SVC_RQST_ID_801_LEN = 6;
	/**
	 * 	serialize this ClogSvcRqstId801
	 */
   protected void serializeClogSvcRqstId801(char[] clogSvcRqstId801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clogSvcRqstId801,0,getStringValue(),beginClogSvcRqstId801,CLOG_SVC_RQST_ID_801_LEN);
       localClogSvcRqstId801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClogSvcRqstId801Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshClogSvcRqstId801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClogSvcRqstId801() {	 
   		return (substring(getStringValue(),beginClogSvcRqstId801,beginClogSvcRqstId801 + CLOG_SVC_RQST_ID_801_LEN));
   	}
     int localClogSvcVersion801Counter = -1;
     public boolean isClogSvcVersion801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClogSvcVersion801Counter != sharedCounter;
         localClogSvcVersion801Counter = sharedCounter; return hasModified;
     }
	protected static final int CLOG_SVC_VERSION_801_LEN = 1;
	/**
	 * 	serialize this ClogSvcVersion801
	 */
   protected void serializeClogSvcVersion801(char[] clogSvcVersion801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clogSvcVersion801,0,getStringValue(),beginClogSvcVersion801,CLOG_SVC_VERSION_801_LEN);
       localClogSvcVersion801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClogSvcVersion801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshClogSvcVersion801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClogSvcVersion801() {	 
   		return (substring(getStringValue(),beginClogSvcVersion801,beginClogSvcVersion801 + CLOG_SVC_VERSION_801_LEN));
   	}
     int localClogSvcHdrLnth801Counter = -1;
     public boolean isClogSvcHdrLnth801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClogSvcHdrLnth801Counter != sharedCounter;
         localClogSvcHdrLnth801Counter = sharedCounter; return hasModified;
     }
	protected static final int CLOG_SVC_HDR_LNTH_801_LEN = 1;
	/**
	 * 	serialize this ClogSvcHdrLnth801
	 */
   protected void serializeClogSvcHdrLnth801(char[] clogSvcHdrLnth801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clogSvcHdrLnth801,0,getStringValue(),beginClogSvcHdrLnth801,CLOG_SVC_HDR_LNTH_801_LEN);
       localClogSvcHdrLnth801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClogSvcHdrLnth801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshClogSvcHdrLnth801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClogSvcHdrLnth801() {	 
   		return (substring(getStringValue(),beginClogSvcHdrLnth801,beginClogSvcHdrLnth801 + CLOG_SVC_HDR_LNTH_801_LEN));
   	}
     int localClogSvcStatus801Counter = -1;
     public boolean isClogSvcStatus801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClogSvcStatus801Counter != sharedCounter;
         localClogSvcStatus801Counter = sharedCounter; return hasModified;
     }
	protected static final int CLOG_SVC_STATUS_801_LEN = 1;
	/**
	 * 	serialize this ClogSvcStatus801
	 */
   protected void serializeClogSvcStatus801(char[] clogSvcStatus801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clogSvcStatus801,0,getStringValue(),beginClogSvcStatus801,CLOG_SVC_STATUS_801_LEN);
       localClogSvcStatus801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClogSvcStatus801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshClogSvcStatus801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClogSvcStatus801() {	 
   		return (substring(getStringValue(),beginClogSvcStatus801,beginClogSvcStatus801 + CLOG_SVC_STATUS_801_LEN));
   	}
     int localClogStatusRtnCd801Counter = -1;
     public boolean isClogStatusRtnCd801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClogStatusRtnCd801Counter != sharedCounter;
         localClogStatusRtnCd801Counter = sharedCounter; return hasModified;
     }
	protected static final int CLOG_STATUS_RTN_CD_801_LEN = 1;
	/**
	 * 	serialize this ClogStatusRtnCd801
	 */
   protected void serializeClogStatusRtnCd801(char[] clogStatusRtnCd801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clogStatusRtnCd801,0,getStringValue(),beginClogStatusRtnCd801,CLOG_STATUS_RTN_CD_801_LEN);
       localClogStatusRtnCd801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClogStatusRtnCd801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshClogStatusRtnCd801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClogStatusRtnCd801() {	 
   		return (substring(getStringValue(),beginClogStatusRtnCd801,beginClogStatusRtnCd801 + CLOG_STATUS_RTN_CD_801_LEN));
   	}
         int localClogSvcDataLnth801Counter = -1;
         public boolean isClogSvcDataLnth801Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localClogSvcDataLnth801Counter != sharedCounter;
            localClogSvcDataLnth801Counter = sharedCounter; return hasModified; 
         }
   protected static final int CLOG_SVC_DATA_LNTH_801_LEN = 2;
  	/**
	 * serializeClogSvcDataLnth801
	 */
	protected void serializeClogSvcDataLnth801(short clogSvcDataLnth801) {
           replaceValue( //  save the value as string
                   getBinaryString( clogSvcDataLnth801,CLOG_SVC_DATA_LNTH_801_LEN)
                  ,beginClogSvcDataLnth801
                  ,CLOG_SVC_DATA_LNTH_801_LEN
                 );
            localClogSvcDataLnth801Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkClogSvcDataLnth801MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshClogSvcDataLnth801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshClogSvcDataLnth801() {	 
			return (getShort(beginClogSvcDataLnth801));
   	}




}
  
