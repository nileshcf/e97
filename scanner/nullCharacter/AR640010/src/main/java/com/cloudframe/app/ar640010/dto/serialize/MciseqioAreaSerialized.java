package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class MciseqioAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciseqioAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciseqioAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCISEQIO_AREA_LENGTH = 198;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciseqioModule;
            protected  int beginMcseqioModule;
            protected  int beginMciseqioReturnCode;
	
	/**
	* Constructor for MciseqioAreaSerialized
	**/
    public MciseqioAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MciseqioAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCISEQIO_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciseqioModule = getStartOffset() + 0;	// set offset for serialization
  
             beginMcseqioModule = getStartOffset() + 8;	// set offset for serialization
  
  
  
  
             beginMciseqioReturnCode = getStartOffset() + 163;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localMciseqioModuleCounter = -1;
     public boolean isMciseqioModuleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioModuleCounter != sharedCounter;
         localMciseqioModuleCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_MODULE_LEN = 8;
	/**
	 * 	serialize this MciseqioModule
	 */
   protected void serializeMciseqioModule(char[] mciseqioModule) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioModule,0,getStringValue(),beginMciseqioModule,MCISEQIO_MODULE_LEN);
       localMciseqioModuleCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioModuleConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMciseqioModule is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioModule() {	 
   		return (substring(getStringValue(),beginMciseqioModule,beginMciseqioModule + MCISEQIO_MODULE_LEN));
   	}
     int localMcseqioModuleCounter = -1;
     public boolean isMcseqioModuleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcseqioModuleCounter != sharedCounter;
         localMcseqioModuleCounter = sharedCounter; return hasModified;
     }
	protected static final int MCSEQIO_MODULE_LEN = 8;
	/**
	 * 	serialize this McseqioModule
	 */
   protected void serializeMcseqioModule(char[] mcseqioModule) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcseqioModule,0,getStringValue(),beginMcseqioModule,MCSEQIO_MODULE_LEN);
       localMcseqioModuleCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcseqioModuleConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMcseqioModule is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcseqioModule() {	 
   		return (substring(getStringValue(),beginMcseqioModule,beginMcseqioModule + MCSEQIO_MODULE_LEN));
   	}
         int localMciseqioReturnCodeCounter = -1;
         public boolean isMciseqioReturnCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciseqioReturnCodeCounter != sharedCounter;
            localMciseqioReturnCodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCISEQIO_RETURN_CODE_LEN = 2;
  	/**
	 * serializeMciseqioReturnCode
	 */
	protected void serializeMciseqioReturnCode(short mciseqioReturnCode) {
           replaceValue( //  save the value as string
                   getBinaryString( mciseqioReturnCode,MCISEQIO_RETURN_CODE_LEN)
                  ,beginMciseqioReturnCode
                  ,MCISEQIO_RETURN_CODE_LEN
                 );
            localMciseqioReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMciseqioReturnCodeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMciseqioReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMciseqioReturnCode() {	 
			return (getShort(beginMciseqioReturnCode));
   	}




}
  
