package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WvAccountsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvAccountsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvAccountsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_ACCOUNTS_LENGTH = 1109;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvAccountMnem;
           protected int beginWvWeightingType;
           protected static final int WV_WEIGHTING_TYPE_SIZE = 10;
	
	/**
	* Constructor for WvAccountsSerialized
	**/
    public WvAccountsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvAccountsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvAccountsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvAccountsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WvAccountsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WvAccountsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_ACCOUNTS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvAccountMnem = getStartOffset() + 0;	// set offset for serialization
  
	        beginWvWeightingType = getStartOffset() + 9; // set offset for serialization
  
	   /*  end of offset */
	}
     int localWvAccountMnemCounter = -1;
     public boolean isWvAccountMnemModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvAccountMnemCounter != sharedCounter;
         localWvAccountMnemCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_ACCOUNT_MNEM_LEN = 9;
	/**
	 * 	serialize this WvAccountMnem
	 */
   protected void serializeWvAccountMnem(char[] wvAccountMnem) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvAccountMnem,0,getStringValue(),beginWvAccountMnem,WV_ACCOUNT_MNEM_LEN);
       localWvAccountMnemCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvAccountMnemConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshWvAccountMnem is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvAccountMnem() {	 
   		return (substring(getStringValue(),beginWvAccountMnem,beginWvAccountMnem + WV_ACCOUNT_MNEM_LEN));
   	}

		public int wvWeightingTypeSize() {
			return WV_WEIGHTING_TYPE_SIZE;
		}



}
  
