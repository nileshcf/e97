package com.cloudframe.app.search3.dto.serialize;

/**
*  The class AccFinTbl500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AccFinTbl500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AccFinTbl500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACC_FIN_TBL_500_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAccFinNfInd500;
            protected  int beginAccFinNfAmt500;
	
	/**
	* Constructor for AccFinTbl500Serialized
	**/
    public AccFinTbl500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AccFinTbl500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AccFinTbl500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AccFinTbl500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AccFinTbl500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AccFinTbl500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACC_FIN_TBL_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAccFinNfInd500 = getStartOffset() + 0;	// set offset for serialization
  
             beginAccFinNfAmt500 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAccFinNfInd500Counter = -1;
     public boolean isAccFinNfInd500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAccFinNfInd500Counter != sharedCounter;
         localAccFinNfInd500Counter = sharedCounter; return hasModified;
     }
	protected static final int ACC_FIN_NF_IND_500_LEN = 2;
	/**
	 * 	serialize this AccFinNfInd500
	 */
   protected void serializeAccFinNfInd500(char[] accFinNfInd500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(accFinNfInd500,0,getStringValue(),beginAccFinNfInd500,ACC_FIN_NF_IND_500_LEN);
       localAccFinNfInd500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAccFinNfInd500Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshAccFinNfInd500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAccFinNfInd500() {	 
   		return (substring(getStringValue(),beginAccFinNfInd500,beginAccFinNfInd500 + ACC_FIN_NF_IND_500_LEN));
   	}
         int localAccFinNfAmt500Counter = -1;
         public boolean isAccFinNfAmt500Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAccFinNfAmt500Counter != sharedCounter;
            localAccFinNfAmt500Counter = sharedCounter; return hasModified; 
         }
   protected static final int ACC_FIN_NF_AMT_500_LEN = 4;
  	/**
	 * serializeAccFinNfAmt500
	 */
	protected void serializeAccFinNfAmt500(int accFinNfAmt500) {
           replaceValue( //  save the value as string
                   getBinaryString( accFinNfAmt500,ACC_FIN_NF_AMT_500_LEN)
                  ,beginAccFinNfAmt500
                  ,ACC_FIN_NF_AMT_500_LEN
                 );
            localAccFinNfAmt500Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAccFinNfAmt500MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAccFinNfAmt500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAccFinNfAmt500() {	 
			return (getInt(beginAccFinNfAmt500));
   	}




}
  
