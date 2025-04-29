package com.cloudframe.app.init1.dto.serialize;

/**
*  The class IypCurr6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IypCurr6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IypCurr6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IYP_CURR_6_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWs6iypDatesCurr;
            protected  int beginWs6iypDiscntIdCurr;
	
	/**
	* Constructor for IypCurr6Serialized
	**/
    public IypCurr6Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IypCurr6Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypCurr6Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IypCurr6Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,72); // serialize this field at offset 72 by default 
    }
    
	/**
	* sets parent for this IypCurr6Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 72 by default
    }    
	/**
	* initializes the field in IypCurr6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IYP_CURR_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWs6iypDatesCurr = getStartOffset() + 0;	// set offset for serialization
  
             beginWs6iypDiscntIdCurr = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWs6iypDatesCurrCounter = -1;
     public boolean isWs6iypDatesCurrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWs6iypDatesCurrCounter != sharedCounter;
         localWs6iypDatesCurrCounter = sharedCounter; return hasModified;
     }
	protected static final int WS_6IYP_DATES_CURR_LEN = 20;
	/**
	 * 	serialize this Ws6iypDatesCurr
	 */
   protected void serializeWs6iypDatesCurr(char[] ws6iypDatesCurr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ws6iypDatesCurr,0,getStringValue(),beginWs6iypDatesCurr,WS_6IYP_DATES_CURR_LEN);
       localWs6iypDatesCurrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWs6iypDatesCurrConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWs6iypDatesCurr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWs6iypDatesCurr() {	 
   		return (substring(getStringValue(),beginWs6iypDatesCurr,beginWs6iypDatesCurr + WS_6IYP_DATES_CURR_LEN));
   	}
         int localWs6iypDiscntIdCurrCounter = -1;
         public boolean isWs6iypDiscntIdCurrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWs6iypDiscntIdCurrCounter != sharedCounter;
            localWs6iypDiscntIdCurrCounter = sharedCounter; return hasModified; 
         }
   protected static final int WS_6IYP_DISCNT_ID_CURR_LEN = 4;
  	/**
	 * serializeWs6iypDiscntIdCurr
	 */
	protected void serializeWs6iypDiscntIdCurr(int ws6iypDiscntIdCurr) {
           replaceValue( //  save the value as string
                   getBinaryString( ws6iypDiscntIdCurr,WS_6IYP_DISCNT_ID_CURR_LEN)
                  ,beginWs6iypDiscntIdCurr
                  ,WS_6IYP_DISCNT_ID_CURR_LEN
                 );
            localWs6iypDiscntIdCurrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWs6iypDiscntIdCurrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshWs6iypDiscntIdCurr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWs6iypDiscntIdCurr() {	 
			return (getInt(beginWs6iypDiscntIdCurr));
   	}




}
  
