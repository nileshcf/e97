package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class SiServiceStruct820Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SiServiceStruct820Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SiServiceStruct820Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SI_SERVICE_STRUCT_820_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSiServiceId820;
            protected  int beginSiSrvReqId820;
            protected  int beginSiServiceStatus820;
            protected  int beginSiReturnCode820;
            protected  int beginSiServiceRc820;
            protected  int beginSiDataLen820;
	
	/**
	* Constructor for SiServiceStruct820Serialized
	**/
    public SiServiceStruct820Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SiServiceStruct820Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SiServiceStruct820Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SiServiceStruct820Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SiServiceStruct820Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SiServiceStruct820Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SI_SERVICE_STRUCT_820_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSiServiceId820 = getStartOffset() + 0;	// set offset for serialization
  
             beginSiSrvReqId820 = getStartOffset() + 4;	// set offset for serialization
  
             beginSiServiceStatus820 = getStartOffset() + 10;	// set offset for serialization
  
             beginSiReturnCode820 = getStartOffset() + 11;	// set offset for serialization
  
             beginSiServiceRc820 = getStartOffset() + 12;	// set offset for serialization
  
             beginSiDataLen820 = getStartOffset() + 13;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSiServiceId820Counter = -1;
     public boolean isSiServiceId820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSiServiceId820Counter != sharedCounter;
         localSiServiceId820Counter = sharedCounter; return hasModified;
     }
	protected static final int SI_SERVICE_ID_820_LEN = 4;
	/**
	 * 	serialize this SiServiceId820
	 */
   protected void serializeSiServiceId820(char[] siServiceId820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(siServiceId820,0,getStringValue(),beginSiServiceId820,SI_SERVICE_ID_820_LEN);
       localSiServiceId820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSiServiceId820Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSiServiceId820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSiServiceId820() {	 
   		return (substring(getStringValue(),beginSiServiceId820,beginSiServiceId820 + SI_SERVICE_ID_820_LEN));
   	}
     int localSiSrvReqId820Counter = -1;
     public boolean isSiSrvReqId820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSiSrvReqId820Counter != sharedCounter;
         localSiSrvReqId820Counter = sharedCounter; return hasModified;
     }
	protected static final int SI_SRV_REQ_ID_820_LEN = 6;
	/**
	 * 	serialize this SiSrvReqId820
	 */
   protected void serializeSiSrvReqId820(char[] siSrvReqId820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(siSrvReqId820,0,getStringValue(),beginSiSrvReqId820,SI_SRV_REQ_ID_820_LEN);
       localSiSrvReqId820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSiSrvReqId820Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSiSrvReqId820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSiSrvReqId820() {	 
   		return (substring(getStringValue(),beginSiSrvReqId820,beginSiSrvReqId820 + SI_SRV_REQ_ID_820_LEN));
   	}
     int localSiServiceStatus820Counter = -1;
     public boolean isSiServiceStatus820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSiServiceStatus820Counter != sharedCounter;
         localSiServiceStatus820Counter = sharedCounter; return hasModified;
     }
	protected static final int SI_SERVICE_STATUS_820_LEN = 1;
	/**
	 * 	serialize this SiServiceStatus820
	 */
   protected void serializeSiServiceStatus820(char[] siServiceStatus820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(siServiceStatus820,0,getStringValue(),beginSiServiceStatus820,SI_SERVICE_STATUS_820_LEN);
       localSiServiceStatus820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSiServiceStatus820Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSiServiceStatus820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSiServiceStatus820() {	 
   		return (substring(getStringValue(),beginSiServiceStatus820,beginSiServiceStatus820 + SI_SERVICE_STATUS_820_LEN));
   	}
     int localSiReturnCode820Counter = -1;
     public boolean isSiReturnCode820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSiReturnCode820Counter != sharedCounter;
         localSiReturnCode820Counter = sharedCounter; return hasModified;
     }
	protected static final int SI_RETURN_CODE_820_LEN = 1;
	/**
	 * 	serialize this SiReturnCode820
	 */
   protected void serializeSiReturnCode820(char[] siReturnCode820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(siReturnCode820,0,getStringValue(),beginSiReturnCode820,SI_RETURN_CODE_820_LEN);
       localSiReturnCode820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSiReturnCode820Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSiReturnCode820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSiReturnCode820() {	 
   		return (substring(getStringValue(),beginSiReturnCode820,beginSiReturnCode820 + SI_RETURN_CODE_820_LEN));
   	}
     int localSiServiceRc820Counter = -1;
     public boolean isSiServiceRc820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSiServiceRc820Counter != sharedCounter;
         localSiServiceRc820Counter = sharedCounter; return hasModified;
     }
	protected static final int SI_SERVICE_RC_820_LEN = 1;
	/**
	 * 	serialize this SiServiceRc820
	 */
   protected void serializeSiServiceRc820(char[] siServiceRc820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(siServiceRc820,0,getStringValue(),beginSiServiceRc820,SI_SERVICE_RC_820_LEN);
       localSiServiceRc820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSiServiceRc820Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSiServiceRc820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSiServiceRc820() {	 
   		return (substring(getStringValue(),beginSiServiceRc820,beginSiServiceRc820 + SI_SERVICE_RC_820_LEN));
   	}
         int localSiDataLen820Counter = -1;
         public boolean isSiDataLen820Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSiDataLen820Counter != sharedCounter;
            localSiDataLen820Counter = sharedCounter; return hasModified; 
         }
   protected static final int SI_DATA_LEN_820_LEN = 2;
  	/**
	 * serializeSiDataLen820
	 */
	protected void serializeSiDataLen820(short siDataLen820) {
           replaceValue( //  save the value as string
                   getBinaryString( siDataLen820,SI_DATA_LEN_820_LEN)
                  ,beginSiDataLen820
                  ,SI_DATA_LEN_820_LEN
                 );
            localSiDataLen820Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSiDataLen820MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSiDataLen820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSiDataLen820() {	 
			return (getShort(beginSiDataLen820));
   	}




}
  
