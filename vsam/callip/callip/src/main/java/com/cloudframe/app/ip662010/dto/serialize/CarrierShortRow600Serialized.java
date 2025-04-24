package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class CarrierShortRow600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CarrierShortRow600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CarrierShortRow600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CARRIER_SHORT_ROW_600_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCarrierTooShortDe600;
            protected  int beginCarrierTooShortCode600;
	
	/**
	* Constructor for CarrierShortRow600Serialized
	**/
    public CarrierShortRow600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CarrierShortRow600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CarrierShortRow600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CarrierShortRow600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CarrierShortRow600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CarrierShortRow600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CARRIER_SHORT_ROW_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCarrierTooShortDe600 = getStartOffset() + 0;	// set offset for serialization
  
             beginCarrierTooShortCode600 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localCarrierTooShortDe600Counter = -1;
         public boolean isCarrierTooShortDe600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCarrierTooShortDe600Counter != sharedCounter;
            localCarrierTooShortDe600Counter = sharedCounter; return hasModified; 
         }
   protected static final int CARRIER_TOO_SHORT_DE_600_LEN = 2;
  	/**
	 * serializeCarrierTooShortDe600
	 */
	protected void serializeCarrierTooShortDe600(short carrierTooShortDe600) {
           replaceValue( //  save the value as string
                   getBinaryString( carrierTooShortDe600,CARRIER_TOO_SHORT_DE_600_LEN)
                  ,beginCarrierTooShortDe600
                  ,CARRIER_TOO_SHORT_DE_600_LEN
                 );
            localCarrierTooShortDe600Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCarrierTooShortDe600MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCarrierTooShortDe600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCarrierTooShortDe600() {	 
			return (getShort(beginCarrierTooShortDe600));
   	}
         int localCarrierTooShortCode600Counter = -1;
         public boolean isCarrierTooShortCode600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCarrierTooShortCode600Counter != sharedCounter;
            localCarrierTooShortCode600Counter = sharedCounter; return hasModified; 
         }
   protected static final int CARRIER_TOO_SHORT_CODE_600_LEN = 2;
  	/**
	 * serializeCarrierTooShortCode600
	 */
	protected void serializeCarrierTooShortCode600(short carrierTooShortCode600) {
           replaceValue( //  save the value as string
                   getBinaryString( carrierTooShortCode600,CARRIER_TOO_SHORT_CODE_600_LEN)
                  ,beginCarrierTooShortCode600
                  ,CARRIER_TOO_SHORT_CODE_600_LEN
                 );
            localCarrierTooShortCode600Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCarrierTooShortCode600MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCarrierTooShortCode600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCarrierTooShortCode600() {	 
			return (getShort(beginCarrierTooShortCode600));
   	}




}
  
