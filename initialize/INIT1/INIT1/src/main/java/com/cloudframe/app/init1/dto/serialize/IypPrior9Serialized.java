package com.cloudframe.app.init1.dto.serialize;

/**
*  The class IypPrior9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IypPrior9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IypPrior9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IYP_PRIOR_9_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWs9iypDatesPrior;
            protected  int beginWs9iypDiscntIdPrior;
	
	/**
	* Constructor for IypPrior9Serialized
	**/
    public IypPrior9Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IypPrior9Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPrior9Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IypPrior9Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this IypPrior9Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in IypPrior9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IYP_PRIOR_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWs9iypDatesPrior = getStartOffset() + 0;	// set offset for serialization
  
             beginWs9iypDiscntIdPrior = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWs9iypDatesPriorCounter = -1;
     public boolean isWs9iypDatesPriorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWs9iypDatesPriorCounter != sharedCounter;
         localWs9iypDatesPriorCounter = sharedCounter; return hasModified;
     }
	protected static final int WS_9IYP_DATES_PRIOR_LEN = 20;
	/**
	 * 	serialize this Ws9iypDatesPrior
	 */
   protected void serializeWs9iypDatesPrior(char[] ws9iypDatesPrior) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ws9iypDatesPrior,0,getStringValue(),beginWs9iypDatesPrior,WS_9IYP_DATES_PRIOR_LEN);
       localWs9iypDatesPriorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWs9iypDatesPriorConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWs9iypDatesPrior is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWs9iypDatesPrior() {	 
   		return (substring(getStringValue(),beginWs9iypDatesPrior,beginWs9iypDatesPrior + WS_9IYP_DATES_PRIOR_LEN));
   	}
         int localWs9iypDiscntIdPriorCounter = -1;
         public boolean isWs9iypDiscntIdPriorModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWs9iypDiscntIdPriorCounter != sharedCounter;
            localWs9iypDiscntIdPriorCounter = sharedCounter; return hasModified; 
         }
   protected static final int WS_9IYP_DISCNT_ID_PRIOR_LEN = 4;
  	/**
	 * serializeWs9iypDiscntIdPrior
	 */
	protected void serializeWs9iypDiscntIdPrior(int ws9iypDiscntIdPrior) {
           replaceValue( //  save the value as string
                   getBinaryString( ws9iypDiscntIdPrior,WS_9IYP_DISCNT_ID_PRIOR_LEN)
                  ,beginWs9iypDiscntIdPrior
                  ,WS_9IYP_DISCNT_ID_PRIOR_LEN
                 );
            localWs9iypDiscntIdPriorCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWs9iypDiscntIdPriorMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshWs9iypDiscntIdPrior is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWs9iypDiscntIdPrior() {	 
			return (getInt(beginWs9iypDiscntIdPrior));
   	}




}
  
