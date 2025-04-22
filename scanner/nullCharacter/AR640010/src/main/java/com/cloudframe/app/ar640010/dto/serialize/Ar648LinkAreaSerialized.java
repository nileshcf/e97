package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar648LinkAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar648LinkAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar648LinkAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_648_LINK_AREA_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr648RequestCode;
            protected  int beginAr648ReturnCode;
	
	/**
	* Constructor for Ar648LinkAreaSerialized
	**/
    public Ar648LinkAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ar648LinkAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_648_LINK_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAr648RequestCode = getStartOffset() + 0;	// set offset for serialization
  
             beginAr648ReturnCode = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localAr648RequestCodeCounter = -1;
         public boolean isAr648RequestCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr648RequestCodeCounter != sharedCounter;
            localAr648RequestCodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_648_REQUEST_CODE_LEN = 2;
  	/**
	 * serializeAr648RequestCode
	 */
	protected void serializeAr648RequestCode(short ar648RequestCode) {
           replaceValue( //  save the value as string
                   getBinaryString( ar648RequestCode,AR_648_REQUEST_CODE_LEN)
                  ,beginAr648RequestCode
                  ,AR_648_REQUEST_CODE_LEN
                 );
            localAr648RequestCodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkAr648RequestCodeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshAr648RequestCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshAr648RequestCode() {	 
			return (getShort(beginAr648RequestCode));
   	}
         int localAr648ReturnCodeCounter = -1;
         public boolean isAr648ReturnCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr648ReturnCodeCounter != sharedCounter;
            localAr648ReturnCodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_648_RETURN_CODE_LEN = 2;
  	/**
	 * serializeAr648ReturnCode
	 */
	protected void serializeAr648ReturnCode(short ar648ReturnCode) {
           replaceValue( //  save the value as string
                   getBinaryString( ar648ReturnCode,AR_648_RETURN_CODE_LEN)
                  ,beginAr648ReturnCode
                  ,AR_648_RETURN_CODE_LEN
                 );
            localAr648ReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkAr648ReturnCodeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshAr648ReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshAr648ReturnCode() {	 
			return (getShort(beginAr648ReturnCode));
   	}




}
  
