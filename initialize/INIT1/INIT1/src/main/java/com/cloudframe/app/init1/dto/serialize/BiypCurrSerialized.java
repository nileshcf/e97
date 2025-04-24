package com.cloudframe.app.init1.dto.serialize;

/**
*  The class BiypCurrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BiypCurrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BiypCurrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BIYP_CURR_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWsbiypDatesCurr;
            protected  int beginWsbiypDiscntIdCurr;
	
	/**
	* Constructor for BiypCurrSerialized
	**/
    public BiypCurrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BiypCurrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiypCurrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BiypCurrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,59); // serialize this field at offset 59 by default 
    }
    
	/**
	* sets parent for this BiypCurrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 59 by default
    }    
	/**
	* initializes the field in BiypCurrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BIYP_CURR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWsbiypDatesCurr = getStartOffset() + 0;	// set offset for serialization
  
             beginWsbiypDiscntIdCurr = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWsbiypDatesCurrCounter = -1;
     public boolean isWsbiypDatesCurrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsbiypDatesCurrCounter != sharedCounter;
         localWsbiypDatesCurrCounter = sharedCounter; return hasModified;
     }
	protected static final int WSBIYP_DATES_CURR_LEN = 20;
	/**
	 * 	serialize this WsbiypDatesCurr
	 */
   protected void serializeWsbiypDatesCurr(char[] wsbiypDatesCurr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsbiypDatesCurr,0,getStringValue(),beginWsbiypDatesCurr,WSBIYP_DATES_CURR_LEN);
       localWsbiypDatesCurrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsbiypDatesCurrConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWsbiypDatesCurr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsbiypDatesCurr() {	 
   		return (substring(getStringValue(),beginWsbiypDatesCurr,beginWsbiypDatesCurr + WSBIYP_DATES_CURR_LEN));
   	}
         int localWsbiypDiscntIdCurrCounter = -1;
         public boolean isWsbiypDiscntIdCurrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWsbiypDiscntIdCurrCounter != sharedCounter;
            localWsbiypDiscntIdCurrCounter = sharedCounter; return hasModified; 
         }
   protected static final int WSBIYP_DISCNT_ID_CURR_LEN = 4;
  	/**
	 * serializeWsbiypDiscntIdCurr
	 */
	protected void serializeWsbiypDiscntIdCurr(int wsbiypDiscntIdCurr) {
           replaceValue( //  save the value as string
                   getBinaryString( wsbiypDiscntIdCurr,WSBIYP_DISCNT_ID_CURR_LEN)
                  ,beginWsbiypDiscntIdCurr
                  ,WSBIYP_DISCNT_ID_CURR_LEN
                 );
            localWsbiypDiscntIdCurrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWsbiypDiscntIdCurrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshWsbiypDiscntIdCurr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWsbiypDiscntIdCurr() {	 
			return (getInt(beginWsbiypDiscntIdCurr));
   	}




}
  
