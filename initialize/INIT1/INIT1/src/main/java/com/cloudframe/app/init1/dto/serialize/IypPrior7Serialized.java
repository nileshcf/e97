package com.cloudframe.app.init1.dto.serialize;

/**
*  The class IypPrior7Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IypPrior7Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IypPrior7Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IYP_PRIOR_7_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWs7iypDatesPrior;
            protected  int beginWs7iypDiscntIdPrior;
	
	/**
	* Constructor for IypPrior7Serialized
	**/
    public IypPrior7Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IypPrior7Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPrior7Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IypPrior7Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this IypPrior7Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in IypPrior7Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IYP_PRIOR_7_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWs7iypDatesPrior = getStartOffset() + 0;	// set offset for serialization
  
             beginWs7iypDiscntIdPrior = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWs7iypDatesPriorCounter = -1;
     public boolean isWs7iypDatesPriorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWs7iypDatesPriorCounter != sharedCounter;
         localWs7iypDatesPriorCounter = sharedCounter; return hasModified;
     }
	protected static final int WS_7IYP_DATES_PRIOR_LEN = 20;
	/**
	 * 	serialize this Ws7iypDatesPrior
	 */
   protected void serializeWs7iypDatesPrior(char[] ws7iypDatesPrior) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ws7iypDatesPrior,0,getStringValue(),beginWs7iypDatesPrior,WS_7IYP_DATES_PRIOR_LEN);
       localWs7iypDatesPriorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWs7iypDatesPriorConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWs7iypDatesPrior is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWs7iypDatesPrior() {	 
   		return (substring(getStringValue(),beginWs7iypDatesPrior,beginWs7iypDatesPrior + WS_7IYP_DATES_PRIOR_LEN));
   	}
         int localWs7iypDiscntIdPriorCounter = -1;
         public boolean isWs7iypDiscntIdPriorModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWs7iypDiscntIdPriorCounter != sharedCounter;
            localWs7iypDiscntIdPriorCounter = sharedCounter; return hasModified; 
         }
   protected static final int WS_7IYP_DISCNT_ID_PRIOR_LEN = 4;
  	/**
	 * serializeWs7iypDiscntIdPrior
	 */
	protected void serializeWs7iypDiscntIdPrior(int ws7iypDiscntIdPrior) {
           replaceValue( //  save the value as string
                   getBinaryString( ws7iypDiscntIdPrior,WS_7IYP_DISCNT_ID_PRIOR_LEN)
                  ,beginWs7iypDiscntIdPrior
                  ,WS_7IYP_DISCNT_ID_PRIOR_LEN
                 );
            localWs7iypDiscntIdPriorCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWs7iypDiscntIdPriorMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshWs7iypDiscntIdPrior is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWs7iypDiscntIdPrior() {	 
			return (getInt(beginWs7iypDiscntIdPrior));
   	}




}
  
