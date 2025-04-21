package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class AdditionalRuc260Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AdditionalRuc260Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AdditionalRuc260Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ADDITIONAL_RUC_260_LENGTH = 81;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLogcElapsedTime260;
            protected  int beginLogcSeg1Length260;
            protected  int beginLogcSeg2Length260;
	
	/**
	* Constructor for AdditionalRuc260Serialized
	**/
    public AdditionalRuc260Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AdditionalRuc260Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AdditionalRuc260Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AdditionalRuc260Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,32); // serialize this field at offset 32 by default 
    }
    
	/**
	* sets parent for this AdditionalRuc260Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 32 by default
    }    
	/**
	* initializes the field in AdditionalRuc260Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ADDITIONAL_RUC_260_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLogcElapsedTime260 = getStartOffset() + 0;	// set offset for serialization
  
             beginLogcSeg1Length260 = getStartOffset() + 4;	// set offset for serialization
  
             beginLogcSeg2Length260 = getStartOffset() + 6;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localLogcElapsedTime260Counter = -1;
         public boolean isLogcElapsedTime260Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLogcElapsedTime260Counter != sharedCounter;
            localLogcElapsedTime260Counter = sharedCounter; return hasModified; 
         }
   protected static final int LOGC_ELAPSED_TIME_260_LEN = 4;
  	/**
	 * serializeLogcElapsedTime260
	 */
	protected void serializeLogcElapsedTime260(int logcElapsedTime260) {
           replaceValue( //  save the value as string
                   getBinaryString( logcElapsedTime260,LOGC_ELAPSED_TIME_260_LEN)
                  ,beginLogcElapsedTime260
                  ,LOGC_ELAPSED_TIME_260_LEN
                 );
            localLogcElapsedTime260Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLogcElapsedTime260MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLogcElapsedTime260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLogcElapsedTime260() {	 
			return (getInt(beginLogcElapsedTime260));
   	}
         int localLogcSeg1Length260Counter = -1;
         public boolean isLogcSeg1Length260Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLogcSeg1Length260Counter != sharedCounter;
            localLogcSeg1Length260Counter = sharedCounter; return hasModified; 
         }
   protected static final int LOGC_SEG_1_LENGTH_260_LEN = 2;
  	/**
	 * serializeLogcSeg1Length260
	 */
	protected void serializeLogcSeg1Length260(short logcSeg1Length260) {
           replaceValue( //  save the value as string
                   getBinaryString( logcSeg1Length260,LOGC_SEG_1_LENGTH_260_LEN)
                  ,beginLogcSeg1Length260
                  ,LOGC_SEG_1_LENGTH_260_LEN
                 );
            localLogcSeg1Length260Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLogcSeg1Length260MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLogcSeg1Length260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLogcSeg1Length260() {	 
			return (getShort(beginLogcSeg1Length260));
   	}
         int localLogcSeg2Length260Counter = -1;
         public boolean isLogcSeg2Length260Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLogcSeg2Length260Counter != sharedCounter;
            localLogcSeg2Length260Counter = sharedCounter; return hasModified; 
         }
   protected static final int LOGC_SEG_2_LENGTH_260_LEN = 2;
  	/**
	 * serializeLogcSeg2Length260
	 */
	protected void serializeLogcSeg2Length260(short logcSeg2Length260) {
           replaceValue( //  save the value as string
                   getBinaryString( logcSeg2Length260,LOGC_SEG_2_LENGTH_260_LEN)
                  ,beginLogcSeg2Length260
                  ,LOGC_SEG_2_LENGTH_260_LEN
                 );
            localLogcSeg2Length260Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLogcSeg2Length260MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLogcSeg2Length260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLogcSeg2Length260() {	 
			return (getShort(beginLogcSeg2Length260));
   	}




}
  
