package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class EsVersion1270Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EsVersion1270Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EsVersion1270Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ES_VERSION_1270_LENGTH = 8024;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEsHeaderId270;
            protected  int beginEsVersion270;
            protected  int beginEsV1HdrLength270;
            protected  int beginEsV1SrvreqLnth270;
            protected  int beginEsV1SrvVersion270;
            protected  int beginEsV1SiHdrLnth270;
            protected  int beginEsV1SrvStatus270;
            protected  int beginEsV1StatusRc270;
            protected  int beginEsV1SrvDataLnth270;
            protected  int beginEsV1SrvData270;
	
	/**
	* Constructor for EsVersion1270Serialized
	**/
    public EsVersion1270Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for EsVersion1270Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EsVersion1270Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this EsVersion1270Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this EsVersion1270Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in EsVersion1270Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ES_VERSION_1270_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEsHeaderId270 = getStartOffset() + 0;	// set offset for serialization
  
             beginEsVersion270 = getStartOffset() + 2;	// set offset for serialization
  
             beginEsV1HdrLength270 = getStartOffset() + 3;	// set offset for serialization
  
             beginEsV1SrvreqLnth270 = getStartOffset() + 4;	// set offset for serialization
  
  
             beginEsV1SrvVersion270 = getStartOffset() + 18;	// set offset for serialization
  
             beginEsV1SiHdrLnth270 = getStartOffset() + 19;	// set offset for serialization
  
             beginEsV1SrvStatus270 = getStartOffset() + 20;	// set offset for serialization
  
             beginEsV1StatusRc270 = getStartOffset() + 21;	// set offset for serialization
  
             beginEsV1SrvDataLnth270 = getStartOffset() + 22;	// set offset for serialization
  
             beginEsV1SrvData270 = getStartOffset() + 24;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEsHeaderId270Counter = -1;
     public boolean isEsHeaderId270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsHeaderId270Counter != sharedCounter;
         localEsHeaderId270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_HEADER_ID_270_LEN = 2;
	/**
	 * 	serialize this EsHeaderId270
	 */
   protected void serializeEsHeaderId270(char[] esHeaderId270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esHeaderId270,0,getStringValue(),beginEsHeaderId270,ES_HEADER_ID_270_LEN);
       localEsHeaderId270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsHeaderId270Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshEsHeaderId270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsHeaderId270() {	 
   		return (substring(getStringValue(),beginEsHeaderId270,beginEsHeaderId270 + ES_HEADER_ID_270_LEN));
   	}
     int localEsVersion270Counter = -1;
     public boolean isEsVersion270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsVersion270Counter != sharedCounter;
         localEsVersion270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_VERSION_270_LEN = 1;
	/**
	 * 	serialize this EsVersion270
	 */
   protected void serializeEsVersion270(char[] esVersion270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esVersion270,0,getStringValue(),beginEsVersion270,ES_VERSION_270_LEN);
       localEsVersion270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsVersion270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsVersion270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsVersion270() {	 
   		return (substring(getStringValue(),beginEsVersion270,beginEsVersion270 + ES_VERSION_270_LEN));
   	}
     int localEsV1HdrLength270Counter = -1;
     public boolean isEsV1HdrLength270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV1HdrLength270Counter != sharedCounter;
         localEsV1HdrLength270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_1_HDR_LENGTH_270_LEN = 1;
	/**
	 * 	serialize this EsV1HdrLength270
	 */
   protected void serializeEsV1HdrLength270(char[] esV1HdrLength270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV1HdrLength270,0,getStringValue(),beginEsV1HdrLength270,ES_V_1_HDR_LENGTH_270_LEN);
       localEsV1HdrLength270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV1HdrLength270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV1HdrLength270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV1HdrLength270() {	 
   		return (substring(getStringValue(),beginEsV1HdrLength270,beginEsV1HdrLength270 + ES_V_1_HDR_LENGTH_270_LEN));
   	}
         int localEsV1SrvreqLnth270Counter = -1;
         public boolean isEsV1SrvreqLnth270Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEsV1SrvreqLnth270Counter != sharedCounter;
            localEsV1SrvreqLnth270Counter = sharedCounter; return hasModified; 
         }
   protected static final int ES_V_1_SRVREQ_LNTH_270_LEN = 4;
  	/**
	 * serializeEsV1SrvreqLnth270
	 */
	protected void serializeEsV1SrvreqLnth270(int esV1SrvreqLnth270) {
           replaceValue( //  save the value as string
                   getBinaryString( esV1SrvreqLnth270,ES_V_1_SRVREQ_LNTH_270_LEN)
                  ,beginEsV1SrvreqLnth270
                  ,ES_V_1_SRVREQ_LNTH_270_LEN
                 );
            localEsV1SrvreqLnth270Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkEsV1SrvreqLnth270MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshEsV1SrvreqLnth270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEsV1SrvreqLnth270() {	 
			return (getInt(beginEsV1SrvreqLnth270));
   	}
     int localEsV1SrvVersion270Counter = -1;
     public boolean isEsV1SrvVersion270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV1SrvVersion270Counter != sharedCounter;
         localEsV1SrvVersion270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_1_SRV_VERSION_270_LEN = 1;
	/**
	 * 	serialize this EsV1SrvVersion270
	 */
   protected void serializeEsV1SrvVersion270(char[] esV1SrvVersion270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV1SrvVersion270,0,getStringValue(),beginEsV1SrvVersion270,ES_V_1_SRV_VERSION_270_LEN);
       localEsV1SrvVersion270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV1SrvVersion270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV1SrvVersion270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV1SrvVersion270() {	 
   		return (substring(getStringValue(),beginEsV1SrvVersion270,beginEsV1SrvVersion270 + ES_V_1_SRV_VERSION_270_LEN));
   	}
     int localEsV1SiHdrLnth270Counter = -1;
     public boolean isEsV1SiHdrLnth270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV1SiHdrLnth270Counter != sharedCounter;
         localEsV1SiHdrLnth270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_1_SI_HDR_LNTH_270_LEN = 1;
	/**
	 * 	serialize this EsV1SiHdrLnth270
	 */
   protected void serializeEsV1SiHdrLnth270(char[] esV1SiHdrLnth270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV1SiHdrLnth270,0,getStringValue(),beginEsV1SiHdrLnth270,ES_V_1_SI_HDR_LNTH_270_LEN);
       localEsV1SiHdrLnth270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV1SiHdrLnth270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV1SiHdrLnth270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV1SiHdrLnth270() {	 
   		return (substring(getStringValue(),beginEsV1SiHdrLnth270,beginEsV1SiHdrLnth270 + ES_V_1_SI_HDR_LNTH_270_LEN));
   	}
     int localEsV1SrvStatus270Counter = -1;
     public boolean isEsV1SrvStatus270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV1SrvStatus270Counter != sharedCounter;
         localEsV1SrvStatus270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_1_SRV_STATUS_270_LEN = 1;
	/**
	 * 	serialize this EsV1SrvStatus270
	 */
   protected void serializeEsV1SrvStatus270(char[] esV1SrvStatus270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV1SrvStatus270,0,getStringValue(),beginEsV1SrvStatus270,ES_V_1_SRV_STATUS_270_LEN);
       localEsV1SrvStatus270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV1SrvStatus270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV1SrvStatus270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV1SrvStatus270() {	 
   		return (substring(getStringValue(),beginEsV1SrvStatus270,beginEsV1SrvStatus270 + ES_V_1_SRV_STATUS_270_LEN));
   	}
     int localEsV1StatusRc270Counter = -1;
     public boolean isEsV1StatusRc270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV1StatusRc270Counter != sharedCounter;
         localEsV1StatusRc270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_1_STATUS_RC_270_LEN = 1;
	/**
	 * 	serialize this EsV1StatusRc270
	 */
   protected void serializeEsV1StatusRc270(char[] esV1StatusRc270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV1StatusRc270,0,getStringValue(),beginEsV1StatusRc270,ES_V_1_STATUS_RC_270_LEN);
       localEsV1StatusRc270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV1StatusRc270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV1StatusRc270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV1StatusRc270() {	 
   		return (substring(getStringValue(),beginEsV1StatusRc270,beginEsV1StatusRc270 + ES_V_1_STATUS_RC_270_LEN));
   	}
         int localEsV1SrvDataLnth270Counter = -1;
         public boolean isEsV1SrvDataLnth270Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEsV1SrvDataLnth270Counter != sharedCounter;
            localEsV1SrvDataLnth270Counter = sharedCounter; return hasModified; 
         }
   protected static final int ES_V_1_SRV_DATA_LNTH_270_LEN = 2;
  	/**
	 * serializeEsV1SrvDataLnth270
	 */
	protected void serializeEsV1SrvDataLnth270(short esV1SrvDataLnth270) {
           replaceValue( //  save the value as string
                   getBinaryString( esV1SrvDataLnth270,ES_V_1_SRV_DATA_LNTH_270_LEN)
                  ,beginEsV1SrvDataLnth270
                  ,ES_V_1_SRV_DATA_LNTH_270_LEN
                 );
            localEsV1SrvDataLnth270Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkEsV1SrvDataLnth270MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshEsV1SrvDataLnth270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEsV1SrvDataLnth270() {	 
			return (getShort(beginEsV1SrvDataLnth270));
   	}
     int localEsV1SrvData270Counter = -1;
     public boolean isEsV1SrvData270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV1SrvData270Counter != sharedCounter;
         localEsV1SrvData270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_1_SRV_DATA_270_LEN = 8000;
	/**
	 * 	serialize this EsV1SrvData270
	 */
   protected void serializeEsV1SrvData270(char[] esV1SrvData270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV1SrvData270,0,getStringValue(),beginEsV1SrvData270,ES_V_1_SRV_DATA_270_LEN);
       localEsV1SrvData270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV1SrvData270Constraints(char[] value) {
   			return super.checkConstraints(value , 8000 ,false, false);
   }
    /**
	 *	refreshEsV1SrvData270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV1SrvData270() {	 
   		return (substring(getStringValue(),beginEsV1SrvData270,beginEsV1SrvData270 + ES_V_1_SRV_DATA_270_LEN));
   	}




}
  
