package com.cloudframe.app.init1.dto.serialize;

/**
*  The class AiypCurrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AiypCurrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AiypCurrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AIYP_CURR_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWsaiypDatesCurr;
            protected  int beginWsaiypDiscntIdCurr;
	
	/**
	* Constructor for AiypCurrSerialized
	**/
    public AiypCurrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AiypCurrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AiypCurrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AiypCurrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,64); // serialize this field at offset 64 by default 
    }
    
	/**
	* sets parent for this AiypCurrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 64 by default
    }    
	/**
	* initializes the field in AiypCurrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AIYP_CURR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWsaiypDatesCurr = getStartOffset() + 0;	// set offset for serialization
  
             beginWsaiypDiscntIdCurr = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWsaiypDatesCurrCounter = -1;
     public boolean isWsaiypDatesCurrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaiypDatesCurrCounter != sharedCounter;
         localWsaiypDatesCurrCounter = sharedCounter; return hasModified;
     }
	protected static final int WSAIYP_DATES_CURR_LEN = 20;
	/**
	 * 	serialize this WsaiypDatesCurr
	 */
   protected void serializeWsaiypDatesCurr(char[] wsaiypDatesCurr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsaiypDatesCurr,0,getStringValue(),beginWsaiypDatesCurr,WSAIYP_DATES_CURR_LEN);
       localWsaiypDatesCurrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsaiypDatesCurrConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWsaiypDatesCurr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsaiypDatesCurr() {	 
   		return (substring(getStringValue(),beginWsaiypDatesCurr,beginWsaiypDatesCurr + WSAIYP_DATES_CURR_LEN));
   	}
         int localWsaiypDiscntIdCurrCounter = -1;
         public boolean isWsaiypDiscntIdCurrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWsaiypDiscntIdCurrCounter != sharedCounter;
            localWsaiypDiscntIdCurrCounter = sharedCounter; return hasModified; 
         }
   protected static final int WSAIYP_DISCNT_ID_CURR_LEN = 4;
  	/**
	 * serializeWsaiypDiscntIdCurr
	 */
	protected void serializeWsaiypDiscntIdCurr(int wsaiypDiscntIdCurr) {
           replaceValue( //  save the value as string
                   getBinaryString( wsaiypDiscntIdCurr,WSAIYP_DISCNT_ID_CURR_LEN)
                  ,beginWsaiypDiscntIdCurr
                  ,WSAIYP_DISCNT_ID_CURR_LEN
                 );
            localWsaiypDiscntIdCurrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWsaiypDiscntIdCurrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshWsaiypDiscntIdCurr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWsaiypDiscntIdCurr() {	 
			return (getInt(beginWsaiypDiscntIdCurr));
   	}




}
  
