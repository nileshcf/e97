package com.cloudframe.app.init1.dto.serialize;

/**
*  The class BiypPriorSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BiypPriorSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BiypPriorSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BIYP_PRIOR_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWsbiypDatesPrior;
            protected  int beginWsbiypDiscntIdPrior;
	
	/**
	* Constructor for BiypPriorSerialized
	**/
    public BiypPriorSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BiypPriorSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiypPriorSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BiypPriorSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this BiypPriorSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in BiypPriorSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BIYP_PRIOR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWsbiypDatesPrior = getStartOffset() + 0;	// set offset for serialization
  
             beginWsbiypDiscntIdPrior = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWsbiypDatesPriorCounter = -1;
     public boolean isWsbiypDatesPriorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsbiypDatesPriorCounter != sharedCounter;
         localWsbiypDatesPriorCounter = sharedCounter; return hasModified;
     }
	protected static final int WSBIYP_DATES_PRIOR_LEN = 20;
	/**
	 * 	serialize this WsbiypDatesPrior
	 */
   protected void serializeWsbiypDatesPrior(char[] wsbiypDatesPrior) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsbiypDatesPrior,0,getStringValue(),beginWsbiypDatesPrior,WSBIYP_DATES_PRIOR_LEN);
       localWsbiypDatesPriorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsbiypDatesPriorConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWsbiypDatesPrior is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsbiypDatesPrior() {	 
   		return (substring(getStringValue(),beginWsbiypDatesPrior,beginWsbiypDatesPrior + WSBIYP_DATES_PRIOR_LEN));
   	}
         int localWsbiypDiscntIdPriorCounter = -1;
         public boolean isWsbiypDiscntIdPriorModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWsbiypDiscntIdPriorCounter != sharedCounter;
            localWsbiypDiscntIdPriorCounter = sharedCounter; return hasModified; 
         }
   protected static final int WSBIYP_DISCNT_ID_PRIOR_LEN = 4;
  	/**
	 * serializeWsbiypDiscntIdPrior
	 */
	protected void serializeWsbiypDiscntIdPrior(int wsbiypDiscntIdPrior) {
           replaceValue( //  save the value as string
                   getBinaryString( wsbiypDiscntIdPrior,WSBIYP_DISCNT_ID_PRIOR_LEN)
                  ,beginWsbiypDiscntIdPrior
                  ,WSBIYP_DISCNT_ID_PRIOR_LEN
                 );
            localWsbiypDiscntIdPriorCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWsbiypDiscntIdPriorMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshWsbiypDiscntIdPrior is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWsbiypDiscntIdPrior() {	 
			return (getInt(beginWsbiypDiscntIdPrior));
   	}




}
  
