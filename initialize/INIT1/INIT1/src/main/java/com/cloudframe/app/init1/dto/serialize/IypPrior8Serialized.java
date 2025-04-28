package com.cloudframe.app.init1.dto.serialize;

/**
*  The class IypPrior8Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IypPrior8Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IypPrior8Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IYP_PRIOR_8_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWs8iypDatesPrior;
            protected  int beginWs8iypDiscntIdPrior;
	
	/**
	* Constructor for IypPrior8Serialized
	**/
    public IypPrior8Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IypPrior8Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPrior8Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IypPrior8Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this IypPrior8Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in IypPrior8Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IYP_PRIOR_8_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWs8iypDatesPrior = getStartOffset() + 0;	// set offset for serialization
  
             beginWs8iypDiscntIdPrior = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWs8iypDatesPriorCounter = -1;
     public boolean isWs8iypDatesPriorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWs8iypDatesPriorCounter != sharedCounter;
         localWs8iypDatesPriorCounter = sharedCounter; return hasModified;
     }
	protected static final int WS_8IYP_DATES_PRIOR_LEN = 20;
	/**
	 * 	serialize this Ws8iypDatesPrior
	 */
   protected void serializeWs8iypDatesPrior(char[] ws8iypDatesPrior) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ws8iypDatesPrior,0,getStringValue(),beginWs8iypDatesPrior,WS_8IYP_DATES_PRIOR_LEN);
       localWs8iypDatesPriorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWs8iypDatesPriorConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWs8iypDatesPrior is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWs8iypDatesPrior() {	 
   		return (substring(getStringValue(),beginWs8iypDatesPrior,beginWs8iypDatesPrior + WS_8IYP_DATES_PRIOR_LEN));
   	}
         int localWs8iypDiscntIdPriorCounter = -1;
         public boolean isWs8iypDiscntIdPriorModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWs8iypDiscntIdPriorCounter != sharedCounter;
            localWs8iypDiscntIdPriorCounter = sharedCounter; return hasModified; 
         }
   protected static final int WS_8IYP_DISCNT_ID_PRIOR_LEN = 4;
  	/**
	 * serializeWs8iypDiscntIdPrior
	 */
	protected void serializeWs8iypDiscntIdPrior(int ws8iypDiscntIdPrior) {
           replaceValue( //  save the value as string
                   getBinaryString( ws8iypDiscntIdPrior,WS_8IYP_DISCNT_ID_PRIOR_LEN)
                  ,beginWs8iypDiscntIdPrior
                  ,WS_8IYP_DISCNT_ID_PRIOR_LEN
                 );
            localWs8iypDiscntIdPriorCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWs8iypDiscntIdPriorMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshWs8iypDiscntIdPrior is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWs8iypDiscntIdPrior() {	 
			return (getInt(beginWs8iypDiscntIdPrior));
   	}




}
  
