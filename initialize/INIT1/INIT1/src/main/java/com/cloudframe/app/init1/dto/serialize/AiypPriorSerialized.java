package com.cloudframe.app.init1.dto.serialize;

/**
*  The class AiypPriorSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AiypPriorSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AiypPriorSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AIYP_PRIOR_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWsaiypDatesPrior;
            protected  int beginWsaiypDiscntIdPrior;
	
	/**
	* Constructor for AiypPriorSerialized
	**/
    public AiypPriorSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AiypPriorSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AiypPriorSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AiypPriorSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this AiypPriorSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in AiypPriorSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AIYP_PRIOR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWsaiypDatesPrior = getStartOffset() + 0;	// set offset for serialization
  
             beginWsaiypDiscntIdPrior = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWsaiypDatesPriorCounter = -1;
     public boolean isWsaiypDatesPriorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaiypDatesPriorCounter != sharedCounter;
         localWsaiypDatesPriorCounter = sharedCounter; return hasModified;
     }
	protected static final int WSAIYP_DATES_PRIOR_LEN = 20;
	/**
	 * 	serialize this WsaiypDatesPrior
	 */
   protected void serializeWsaiypDatesPrior(char[] wsaiypDatesPrior) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsaiypDatesPrior,0,getStringValue(),beginWsaiypDatesPrior,WSAIYP_DATES_PRIOR_LEN);
       localWsaiypDatesPriorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsaiypDatesPriorConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWsaiypDatesPrior is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsaiypDatesPrior() {	 
   		return (substring(getStringValue(),beginWsaiypDatesPrior,beginWsaiypDatesPrior + WSAIYP_DATES_PRIOR_LEN));
   	}
         int localWsaiypDiscntIdPriorCounter = -1;
         public boolean isWsaiypDiscntIdPriorModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWsaiypDiscntIdPriorCounter != sharedCounter;
            localWsaiypDiscntIdPriorCounter = sharedCounter; return hasModified; 
         }
   protected static final int WSAIYP_DISCNT_ID_PRIOR_LEN = 4;
  	/**
	 * serializeWsaiypDiscntIdPrior
	 */
	protected void serializeWsaiypDiscntIdPrior(int wsaiypDiscntIdPrior) {
           replaceValue( //  save the value as string
                   getBinaryString( wsaiypDiscntIdPrior,WSAIYP_DISCNT_ID_PRIOR_LEN)
                  ,beginWsaiypDiscntIdPrior
                  ,WSAIYP_DISCNT_ID_PRIOR_LEN
                 );
            localWsaiypDiscntIdPriorCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWsaiypDiscntIdPriorMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshWsaiypDiscntIdPrior is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWsaiypDiscntIdPrior() {	 
			return (getInt(beginWsaiypDiscntIdPrior));
   	}




}
  
