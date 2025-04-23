package com.cloudframe.app.init1.dto.serialize;

/**
*  The class IypPrior6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IypPrior6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IypPrior6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IYP_PRIOR_6_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWs6iypDatesPrior;
            protected  int beginWs6iypDiscntIdPrior;
	
	/**
	* Constructor for IypPrior6Serialized
	**/
    public IypPrior6Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IypPrior6Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPrior6Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IypPrior6Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this IypPrior6Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in IypPrior6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IYP_PRIOR_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWs6iypDatesPrior = getStartOffset() + 0;	// set offset for serialization
  
             beginWs6iypDiscntIdPrior = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWs6iypDatesPriorCounter = -1;
     public boolean isWs6iypDatesPriorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWs6iypDatesPriorCounter != sharedCounter;
         localWs6iypDatesPriorCounter = sharedCounter; return hasModified;
     }
	protected static final int WS_6IYP_DATES_PRIOR_LEN = 20;
	/**
	 * 	serialize this Ws6iypDatesPrior
	 */
   protected void serializeWs6iypDatesPrior(char[] ws6iypDatesPrior) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ws6iypDatesPrior,0,getStringValue(),beginWs6iypDatesPrior,WS_6IYP_DATES_PRIOR_LEN);
       localWs6iypDatesPriorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWs6iypDatesPriorConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWs6iypDatesPrior is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWs6iypDatesPrior() {	 
   		return (substring(getStringValue(),beginWs6iypDatesPrior,beginWs6iypDatesPrior + WS_6IYP_DATES_PRIOR_LEN));
   	}
         int localWs6iypDiscntIdPriorCounter = -1;
         public boolean isWs6iypDiscntIdPriorModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWs6iypDiscntIdPriorCounter != sharedCounter;
            localWs6iypDiscntIdPriorCounter = sharedCounter; return hasModified; 
         }
   protected static final int WS_6IYP_DISCNT_ID_PRIOR_LEN = 4;
  	/**
	 * serializeWs6iypDiscntIdPrior
	 */
	protected void serializeWs6iypDiscntIdPrior(int ws6iypDiscntIdPrior) {
           replaceValue( //  save the value as string
                   getBinaryString( ws6iypDiscntIdPrior,WS_6IYP_DISCNT_ID_PRIOR_LEN)
                  ,beginWs6iypDiscntIdPrior
                  ,WS_6IYP_DISCNT_ID_PRIOR_LEN
                 );
            localWs6iypDiscntIdPriorCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWs6iypDiscntIdPriorMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshWs6iypDiscntIdPrior is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWs6iypDiscntIdPrior() {	 
			return (getInt(beginWs6iypDiscntIdPrior));
   	}




}
  
