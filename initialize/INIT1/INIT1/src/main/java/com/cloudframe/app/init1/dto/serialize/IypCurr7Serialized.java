package com.cloudframe.app.init1.dto.serialize;

/**
*  The class IypCurr7Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IypCurr7Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IypCurr7Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IYP_CURR_7_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWs7iypDatesCurr;
            protected  int beginWs7iypDiscntIdCurr;
	
	/**
	* Constructor for IypCurr7Serialized
	**/
    public IypCurr7Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IypCurr7Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypCurr7Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IypCurr7Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,72); // serialize this field at offset 72 by default 
    }
    
	/**
	* sets parent for this IypCurr7Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 72 by default
    }    
	/**
	* initializes the field in IypCurr7Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IYP_CURR_7_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWs7iypDatesCurr = getStartOffset() + 0;	// set offset for serialization
  
             beginWs7iypDiscntIdCurr = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWs7iypDatesCurrCounter = -1;
     public boolean isWs7iypDatesCurrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWs7iypDatesCurrCounter != sharedCounter;
         localWs7iypDatesCurrCounter = sharedCounter; return hasModified;
     }
	protected static final int WS_7IYP_DATES_CURR_LEN = 20;
	/**
	 * 	serialize this Ws7iypDatesCurr
	 */
   protected void serializeWs7iypDatesCurr(char[] ws7iypDatesCurr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ws7iypDatesCurr,0,getStringValue(),beginWs7iypDatesCurr,WS_7IYP_DATES_CURR_LEN);
       localWs7iypDatesCurrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWs7iypDatesCurrConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWs7iypDatesCurr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWs7iypDatesCurr() {	 
   		return (substring(getStringValue(),beginWs7iypDatesCurr,beginWs7iypDatesCurr + WS_7IYP_DATES_CURR_LEN));
   	}
         int localWs7iypDiscntIdCurrCounter = -1;
         public boolean isWs7iypDiscntIdCurrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWs7iypDiscntIdCurrCounter != sharedCounter;
            localWs7iypDiscntIdCurrCounter = sharedCounter; return hasModified; 
         }
   protected static final int WS_7IYP_DISCNT_ID_CURR_LEN = 4;
  	/**
	 * serializeWs7iypDiscntIdCurr
	 */
	protected void serializeWs7iypDiscntIdCurr(int ws7iypDiscntIdCurr) {
           replaceValue( //  save the value as string
                   getBinaryString( ws7iypDiscntIdCurr,WS_7IYP_DISCNT_ID_CURR_LEN)
                  ,beginWs7iypDiscntIdCurr
                  ,WS_7IYP_DISCNT_ID_CURR_LEN
                 );
            localWs7iypDiscntIdCurrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWs7iypDiscntIdCurrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshWs7iypDiscntIdCurr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWs7iypDiscntIdCurr() {	 
			return (getInt(beginWs7iypDiscntIdCurr));
   	}




}
  
