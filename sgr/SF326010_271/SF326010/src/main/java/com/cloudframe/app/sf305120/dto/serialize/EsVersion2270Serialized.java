package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class EsVersion2270Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EsVersion2270Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EsVersion2270Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ES_VERSION_2270_LENGTH = 7937;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEsV2CorrelId270;
            protected  int beginEsV2SrvId270;
            protected  int beginEsV2SiHdrLnth270;
            protected  int beginEsV2SrvStatus270;
            protected  int beginEsV2StatusRc270;
            protected  int beginEsV2SrvDataLnth270;
            protected  int beginEsV2SrvData270;
	
	/**
	* Constructor for EsVersion2270Serialized
	**/
    public EsVersion2270Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for EsVersion2270Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EsVersion2270Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this EsVersion2270Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this EsVersion2270Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in EsVersion2270Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ES_VERSION_2270_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEsV2CorrelId270 = getStartOffset() + 8;	// set offset for serialization
  
             beginEsV2SrvId270 = getStartOffset() + 21;	// set offset for serialization
  
             beginEsV2SiHdrLnth270 = getStartOffset() + 32;	// set offset for serialization
  
             beginEsV2SrvStatus270 = getStartOffset() + 33;	// set offset for serialization
  
             beginEsV2StatusRc270 = getStartOffset() + 34;	// set offset for serialization
  
             beginEsV2SrvDataLnth270 = getStartOffset() + 35;	// set offset for serialization
  
             beginEsV2SrvData270 = getStartOffset() + 37;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEsV2CorrelId270Counter = -1;
     public boolean isEsV2CorrelId270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV2CorrelId270Counter != sharedCounter;
         localEsV2CorrelId270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_2_CORREL_ID_270_LEN = 12;
	/**
	 * 	serialize this EsV2CorrelId270
	 */
   protected void serializeEsV2CorrelId270(char[] esV2CorrelId270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV2CorrelId270,0,getStringValue(),beginEsV2CorrelId270,ES_V_2_CORREL_ID_270_LEN);
       localEsV2CorrelId270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV2CorrelId270Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshEsV2CorrelId270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV2CorrelId270() {	 
   		return (substring(getStringValue(),beginEsV2CorrelId270,beginEsV2CorrelId270 + ES_V_2_CORREL_ID_270_LEN));
   	}
     int localEsV2SrvId270Counter = -1;
     public boolean isEsV2SrvId270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV2SrvId270Counter != sharedCounter;
         localEsV2SrvId270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_2_SRV_ID_270_LEN = 4;
	/**
	 * 	serialize this EsV2SrvId270
	 */
   protected void serializeEsV2SrvId270(char[] esV2SrvId270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV2SrvId270,0,getStringValue(),beginEsV2SrvId270,ES_V_2_SRV_ID_270_LEN);
       localEsV2SrvId270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV2SrvId270Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshEsV2SrvId270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV2SrvId270() {	 
   		return (substring(getStringValue(),beginEsV2SrvId270,beginEsV2SrvId270 + ES_V_2_SRV_ID_270_LEN));
   	}
     int localEsV2SiHdrLnth270Counter = -1;
     public boolean isEsV2SiHdrLnth270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV2SiHdrLnth270Counter != sharedCounter;
         localEsV2SiHdrLnth270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_2_SI_HDR_LNTH_270_LEN = 1;
	/**
	 * 	serialize this EsV2SiHdrLnth270
	 */
   protected void serializeEsV2SiHdrLnth270(char[] esV2SiHdrLnth270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV2SiHdrLnth270,0,getStringValue(),beginEsV2SiHdrLnth270,ES_V_2_SI_HDR_LNTH_270_LEN);
       localEsV2SiHdrLnth270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV2SiHdrLnth270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV2SiHdrLnth270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV2SiHdrLnth270() {	 
   		return (substring(getStringValue(),beginEsV2SiHdrLnth270,beginEsV2SiHdrLnth270 + ES_V_2_SI_HDR_LNTH_270_LEN));
   	}
     int localEsV2SrvStatus270Counter = -1;
     public boolean isEsV2SrvStatus270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV2SrvStatus270Counter != sharedCounter;
         localEsV2SrvStatus270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_2_SRV_STATUS_270_LEN = 1;
	/**
	 * 	serialize this EsV2SrvStatus270
	 */
   protected void serializeEsV2SrvStatus270(char[] esV2SrvStatus270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV2SrvStatus270,0,getStringValue(),beginEsV2SrvStatus270,ES_V_2_SRV_STATUS_270_LEN);
       localEsV2SrvStatus270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV2SrvStatus270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV2SrvStatus270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV2SrvStatus270() {	 
   		return (substring(getStringValue(),beginEsV2SrvStatus270,beginEsV2SrvStatus270 + ES_V_2_SRV_STATUS_270_LEN));
   	}
     int localEsV2StatusRc270Counter = -1;
     public boolean isEsV2StatusRc270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV2StatusRc270Counter != sharedCounter;
         localEsV2StatusRc270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_2_STATUS_RC_270_LEN = 1;
	/**
	 * 	serialize this EsV2StatusRc270
	 */
   protected void serializeEsV2StatusRc270(char[] esV2StatusRc270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV2StatusRc270,0,getStringValue(),beginEsV2StatusRc270,ES_V_2_STATUS_RC_270_LEN);
       localEsV2StatusRc270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV2StatusRc270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV2StatusRc270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV2StatusRc270() {	 
   		return (substring(getStringValue(),beginEsV2StatusRc270,beginEsV2StatusRc270 + ES_V_2_STATUS_RC_270_LEN));
   	}
         int localEsV2SrvDataLnth270Counter = -1;
         public boolean isEsV2SrvDataLnth270Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEsV2SrvDataLnth270Counter != sharedCounter;
            localEsV2SrvDataLnth270Counter = sharedCounter; return hasModified; 
         }
   protected static final int ES_V_2_SRV_DATA_LNTH_270_LEN = 2;
  	/**
	 * serializeEsV2SrvDataLnth270
	 */
	protected void serializeEsV2SrvDataLnth270(short esV2SrvDataLnth270) {
           replaceValue( //  save the value as string
                   getBinaryString( esV2SrvDataLnth270,ES_V_2_SRV_DATA_LNTH_270_LEN)
                  ,beginEsV2SrvDataLnth270
                  ,ES_V_2_SRV_DATA_LNTH_270_LEN
                 );
            localEsV2SrvDataLnth270Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkEsV2SrvDataLnth270MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshEsV2SrvDataLnth270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEsV2SrvDataLnth270() {	 
			return (getShort(beginEsV2SrvDataLnth270));
   	}
     int localEsV2SrvData270Counter = -1;
     public boolean isEsV2SrvData270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV2SrvData270Counter != sharedCounter;
         localEsV2SrvData270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_2_SRV_DATA_270_LEN = 7900;
	/**
	 * 	serialize this EsV2SrvData270
	 */
   protected void serializeEsV2SrvData270(char[] esV2SrvData270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV2SrvData270,0,getStringValue(),beginEsV2SrvData270,ES_V_2_SRV_DATA_270_LEN);
       localEsV2SrvData270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV2SrvData270Constraints(char[] value) {
   			return super.checkConstraints(value , 7900 ,false, false);
   }
    /**
	 *	refreshEsV2SrvData270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV2SrvData270() {	 
   		return (substring(getStringValue(),beginEsV2SrvData270,beginEsV2SrvData270 + ES_V_2_SRV_DATA_270_LEN));
   	}




}
  
