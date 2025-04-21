package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class FnsPldRdFacDataKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FnsPldRdFacDataKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPldRdFacDataKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PLD_RD_FAC_DATA_KEY_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFnsPldRdPrimaryAcctNbr;
	
	/**
	* Constructor for FnsPldRdFacDataKeySerialized
	**/
    public FnsPldRdFacDataKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FnsPldRdFacDataKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdFacDataKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FnsPldRdFacDataKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,68); // serialize this field at offset 68 by default 
    }
    
	/**
	* sets parent for this FnsPldRdFacDataKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 68 by default
    }    
	/**
	* initializes the field in FnsPldRdFacDataKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PLD_RD_FAC_DATA_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFnsPldRdPrimaryAcctNbr = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFnsPldRdPrimaryAcctNbrCounter = -1;
     public boolean isFnsPldRdPrimaryAcctNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdPrimaryAcctNbrCounter != sharedCounter;
         localFnsPldRdPrimaryAcctNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_PRIMARY_ACCT_NBR_LEN = 19;
	/**
	 * 	serialize this FnsPldRdPrimaryAcctNbr
	 */
   protected void serializeFnsPldRdPrimaryAcctNbr(char[] fnsPldRdPrimaryAcctNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdPrimaryAcctNbr,0,getStringValue(),beginFnsPldRdPrimaryAcctNbr,FNS_PLD_RD_PRIMARY_ACCT_NBR_LEN);
       localFnsPldRdPrimaryAcctNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdPrimaryAcctNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshFnsPldRdPrimaryAcctNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdPrimaryAcctNbr() {	 
   		return (substring(getStringValue(),beginFnsPldRdPrimaryAcctNbr,beginFnsPldRdPrimaryAcctNbr + FNS_PLD_RD_PRIMARY_ACCT_NBR_LEN));
   	}




}
  
