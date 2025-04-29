package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class EsVersion3270Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EsVersion3270Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EsVersion3270Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ES_VERSION_3270_LENGTH = 7941;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEsV3CorrelId270;
            protected  int beginEsV3SrvId270;
            protected  int beginEsV3SiHdrLnth270;
            protected  int beginEsV3SrvStatus270;
            protected  int beginEsV3StatusRc270;
            protected  int beginEsV3SrvDataLnth270;
            protected  int beginEsV3SrvData270;
	
	/**
	* Constructor for EsVersion3270Serialized
	**/
    public EsVersion3270Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for EsVersion3270Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EsVersion3270Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this EsVersion3270Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this EsVersion3270Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in EsVersion3270Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ES_VERSION_3270_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEsV3CorrelId270 = getStartOffset() + 8;	// set offset for serialization
  
             beginEsV3SrvId270 = getStartOffset() + 25;	// set offset for serialization
  
             beginEsV3SiHdrLnth270 = getStartOffset() + 36;	// set offset for serialization
  
             beginEsV3SrvStatus270 = getStartOffset() + 37;	// set offset for serialization
  
             beginEsV3StatusRc270 = getStartOffset() + 38;	// set offset for serialization
  
             beginEsV3SrvDataLnth270 = getStartOffset() + 39;	// set offset for serialization
  
             beginEsV3SrvData270 = getStartOffset() + 41;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEsV3CorrelId270Counter = -1;
     public boolean isEsV3CorrelId270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3CorrelId270Counter != sharedCounter;
         localEsV3CorrelId270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_CORREL_ID_270_LEN = 12;
	/**
	 * 	serialize this EsV3CorrelId270
	 */
   protected void serializeEsV3CorrelId270(char[] esV3CorrelId270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3CorrelId270,0,getStringValue(),beginEsV3CorrelId270,ES_V_3_CORREL_ID_270_LEN);
       localEsV3CorrelId270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3CorrelId270Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshEsV3CorrelId270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3CorrelId270() {	 
   		return (substring(getStringValue(),beginEsV3CorrelId270,beginEsV3CorrelId270 + ES_V_3_CORREL_ID_270_LEN));
   	}
     int localEsV3SrvId270Counter = -1;
     public boolean isEsV3SrvId270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3SrvId270Counter != sharedCounter;
         localEsV3SrvId270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_SRV_ID_270_LEN = 4;
	/**
	 * 	serialize this EsV3SrvId270
	 */
   protected void serializeEsV3SrvId270(char[] esV3SrvId270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3SrvId270,0,getStringValue(),beginEsV3SrvId270,ES_V_3_SRV_ID_270_LEN);
       localEsV3SrvId270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3SrvId270Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshEsV3SrvId270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3SrvId270() {	 
   		return (substring(getStringValue(),beginEsV3SrvId270,beginEsV3SrvId270 + ES_V_3_SRV_ID_270_LEN));
   	}
     int localEsV3SiHdrLnth270Counter = -1;
     public boolean isEsV3SiHdrLnth270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3SiHdrLnth270Counter != sharedCounter;
         localEsV3SiHdrLnth270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_SI_HDR_LNTH_270_LEN = 1;
	/**
	 * 	serialize this EsV3SiHdrLnth270
	 */
   protected void serializeEsV3SiHdrLnth270(char[] esV3SiHdrLnth270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3SiHdrLnth270,0,getStringValue(),beginEsV3SiHdrLnth270,ES_V_3_SI_HDR_LNTH_270_LEN);
       localEsV3SiHdrLnth270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3SiHdrLnth270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV3SiHdrLnth270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3SiHdrLnth270() {	 
   		return (substring(getStringValue(),beginEsV3SiHdrLnth270,beginEsV3SiHdrLnth270 + ES_V_3_SI_HDR_LNTH_270_LEN));
   	}
     int localEsV3SrvStatus270Counter = -1;
     public boolean isEsV3SrvStatus270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3SrvStatus270Counter != sharedCounter;
         localEsV3SrvStatus270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_SRV_STATUS_270_LEN = 1;
	/**
	 * 	serialize this EsV3SrvStatus270
	 */
   protected void serializeEsV3SrvStatus270(char[] esV3SrvStatus270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3SrvStatus270,0,getStringValue(),beginEsV3SrvStatus270,ES_V_3_SRV_STATUS_270_LEN);
       localEsV3SrvStatus270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3SrvStatus270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV3SrvStatus270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3SrvStatus270() {	 
   		return (substring(getStringValue(),beginEsV3SrvStatus270,beginEsV3SrvStatus270 + ES_V_3_SRV_STATUS_270_LEN));
   	}
     int localEsV3StatusRc270Counter = -1;
     public boolean isEsV3StatusRc270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3StatusRc270Counter != sharedCounter;
         localEsV3StatusRc270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_STATUS_RC_270_LEN = 1;
	/**
	 * 	serialize this EsV3StatusRc270
	 */
   protected void serializeEsV3StatusRc270(char[] esV3StatusRc270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3StatusRc270,0,getStringValue(),beginEsV3StatusRc270,ES_V_3_STATUS_RC_270_LEN);
       localEsV3StatusRc270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3StatusRc270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEsV3StatusRc270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3StatusRc270() {	 
   		return (substring(getStringValue(),beginEsV3StatusRc270,beginEsV3StatusRc270 + ES_V_3_STATUS_RC_270_LEN));
   	}
         int localEsV3SrvDataLnth270Counter = -1;
         public boolean isEsV3SrvDataLnth270Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEsV3SrvDataLnth270Counter != sharedCounter;
            localEsV3SrvDataLnth270Counter = sharedCounter; return hasModified; 
         }
   protected static final int ES_V_3_SRV_DATA_LNTH_270_LEN = 2;
  	/**
	 * serializeEsV3SrvDataLnth270
	 */
	protected void serializeEsV3SrvDataLnth270(short esV3SrvDataLnth270) {
           replaceValue( //  save the value as string
                   getBinaryString( esV3SrvDataLnth270,ES_V_3_SRV_DATA_LNTH_270_LEN)
                  ,beginEsV3SrvDataLnth270
                  ,ES_V_3_SRV_DATA_LNTH_270_LEN
                 );
            localEsV3SrvDataLnth270Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkEsV3SrvDataLnth270MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshEsV3SrvDataLnth270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEsV3SrvDataLnth270() {	 
			return (getShort(beginEsV3SrvDataLnth270));
   	}
     int localEsV3SrvData270Counter = -1;
     public boolean isEsV3SrvData270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsV3SrvData270Counter != sharedCounter;
         localEsV3SrvData270Counter = sharedCounter; return hasModified;
     }
	protected static final int ES_V_3_SRV_DATA_270_LEN = 7900;
	/**
	 * 	serialize this EsV3SrvData270
	 */
   protected void serializeEsV3SrvData270(char[] esV3SrvData270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(esV3SrvData270,0,getStringValue(),beginEsV3SrvData270,ES_V_3_SRV_DATA_270_LEN);
       localEsV3SrvData270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEsV3SrvData270Constraints(char[] value) {
   			return super.checkConstraints(value , 7900 ,false, false);
   }
    /**
	 *	refreshEsV3SrvData270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEsV3SrvData270() {	 
   		return (substring(getStringValue(),beginEsV3SrvData270,beginEsV3SrvData270 + ES_V_3_SRV_DATA_270_LEN));
   	}




}
  
