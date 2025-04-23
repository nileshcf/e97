package com.cloudframe.app.init1.dto.serialize;

/**
*  The class IypCurr9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IypCurr9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IypCurr9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IYP_CURR_9_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWs9iypDatesCurr;
            protected  int beginWs9iypDiscntIdCurr;
	
	/**
	* Constructor for IypCurr9Serialized
	**/
    public IypCurr9Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IypCurr9Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypCurr9Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IypCurr9Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,56); // serialize this field at offset 56 by default 
    }
    
	/**
	* sets parent for this IypCurr9Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 56 by default
    }    
	/**
	* initializes the field in IypCurr9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IYP_CURR_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWs9iypDatesCurr = getStartOffset() + 0;	// set offset for serialization
  
             beginWs9iypDiscntIdCurr = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWs9iypDatesCurrCounter = -1;
     public boolean isWs9iypDatesCurrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWs9iypDatesCurrCounter != sharedCounter;
         localWs9iypDatesCurrCounter = sharedCounter; return hasModified;
     }
	protected static final int WS_9IYP_DATES_CURR_LEN = 20;
	/**
	 * 	serialize this Ws9iypDatesCurr
	 */
   protected void serializeWs9iypDatesCurr(char[] ws9iypDatesCurr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ws9iypDatesCurr,0,getStringValue(),beginWs9iypDatesCurr,WS_9IYP_DATES_CURR_LEN);
       localWs9iypDatesCurrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWs9iypDatesCurrConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWs9iypDatesCurr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWs9iypDatesCurr() {	 
   		return (substring(getStringValue(),beginWs9iypDatesCurr,beginWs9iypDatesCurr + WS_9IYP_DATES_CURR_LEN));
   	}
         int localWs9iypDiscntIdCurrCounter = -1;
         public boolean isWs9iypDiscntIdCurrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWs9iypDiscntIdCurrCounter != sharedCounter;
            localWs9iypDiscntIdCurrCounter = sharedCounter; return hasModified; 
         }
   protected static final int WS_9IYP_DISCNT_ID_CURR_LEN = 4;
  	/**
	 * serializeWs9iypDiscntIdCurr
	 */
	protected void serializeWs9iypDiscntIdCurr(int ws9iypDiscntIdCurr) {
           replaceValue( //  save the value as string
                   getBinaryString( ws9iypDiscntIdCurr,WS_9IYP_DISCNT_ID_CURR_LEN)
                  ,beginWs9iypDiscntIdCurr
                  ,WS_9IYP_DISCNT_ID_CURR_LEN
                 );
            localWs9iypDiscntIdCurrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWs9iypDiscntIdCurrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshWs9iypDiscntIdCurr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWs9iypDiscntIdCurr() {	 
			return (getInt(beginWs9iypDiscntIdCurr));
   	}




}
  
