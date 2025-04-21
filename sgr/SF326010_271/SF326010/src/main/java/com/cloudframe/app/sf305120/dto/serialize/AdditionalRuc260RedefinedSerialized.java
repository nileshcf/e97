package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class AdditionalRuc260RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AdditionalRuc260RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AdditionalRuc260RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ADDITIONAL_RUC_260_REDEFINED_LENGTH = 81;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRucEsDataLength260;
            protected  int beginRucX9aDataLength260;
            protected  int beginRucEitDataLength260;
	
	/**
	* Constructor for AdditionalRuc260RedefinedSerialized
	**/
    public AdditionalRuc260RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AdditionalRuc260RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AdditionalRuc260RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AdditionalRuc260RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,32); // serialize this field at offset 32 by default 
    }
    
	/**
	* sets parent for this AdditionalRuc260RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 32 by default
    }    
	/**
	* initializes the field in AdditionalRuc260RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ADDITIONAL_RUC_260_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRucEsDataLength260 = getStartOffset() + 0;	// set offset for serialization
  
             beginRucX9aDataLength260 = getStartOffset() + 2;	// set offset for serialization
  
             beginRucEitDataLength260 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localRucEsDataLength260Counter = -1;
         public boolean isRucEsDataLength260Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRucEsDataLength260Counter != sharedCounter;
            localRucEsDataLength260Counter = sharedCounter; return hasModified; 
         }
   protected static final int RUC_ES_DATA_LENGTH_260_LEN = 2;
  	/**
	 * serializeRucEsDataLength260
	 */
	protected void serializeRucEsDataLength260(short rucEsDataLength260) {
           replaceValue( //  save the value as string
                   getBinaryString( rucEsDataLength260,RUC_ES_DATA_LENGTH_260_LEN)
                  ,beginRucEsDataLength260
                  ,RUC_ES_DATA_LENGTH_260_LEN
                 );
            localRucEsDataLength260Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRucEsDataLength260MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRucEsDataLength260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRucEsDataLength260() {	 
			return (getShort(beginRucEsDataLength260));
   	}
         int localRucX9aDataLength260Counter = -1;
         public boolean isRucX9aDataLength260Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRucX9aDataLength260Counter != sharedCounter;
            localRucX9aDataLength260Counter = sharedCounter; return hasModified; 
         }
   protected static final int RUC_X_9A_DATA_LENGTH_260_LEN = 2;
  	/**
	 * serializeRucX9aDataLength260
	 */
	protected void serializeRucX9aDataLength260(short rucX9aDataLength260) {
           replaceValue( //  save the value as string
                   getBinaryString( rucX9aDataLength260,RUC_X_9A_DATA_LENGTH_260_LEN)
                  ,beginRucX9aDataLength260
                  ,RUC_X_9A_DATA_LENGTH_260_LEN
                 );
            localRucX9aDataLength260Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRucX9aDataLength260MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRucX9aDataLength260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRucX9aDataLength260() {	 
			return (getShort(beginRucX9aDataLength260));
   	}
         int localRucEitDataLength260Counter = -1;
         public boolean isRucEitDataLength260Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRucEitDataLength260Counter != sharedCounter;
            localRucEitDataLength260Counter = sharedCounter; return hasModified; 
         }
   protected static final int RUC_EIT_DATA_LENGTH_260_LEN = 2;
  	/**
	 * serializeRucEitDataLength260
	 */
	protected void serializeRucEitDataLength260(short rucEitDataLength260) {
           replaceValue( //  save the value as string
                   getBinaryString( rucEitDataLength260,RUC_EIT_DATA_LENGTH_260_LEN)
                  ,beginRucEitDataLength260
                  ,RUC_EIT_DATA_LENGTH_260_LEN
                 );
            localRucEitDataLength260Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRucEitDataLength260MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRucEitDataLength260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRucEitDataLength260() {	 
			return (getShort(beginRucEitDataLength260));
   	}




}
  
