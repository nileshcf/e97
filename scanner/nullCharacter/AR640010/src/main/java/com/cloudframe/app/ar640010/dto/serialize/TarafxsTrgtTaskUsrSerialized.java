package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TarafxsTrgtTaskUsrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TarafxsTrgtTaskUsrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TarafxsTrgtTaskUsrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAFXS_TRGT_TASK_USR_LENGTH = 66;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTarafxsTrgtTaskUsrLen;
            protected  int beginTarafxsTrgtTaskUsrTxt;
	
	/**
	* Constructor for TarafxsTrgtTaskUsrSerialized
	**/
    public TarafxsTrgtTaskUsrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TarafxsTrgtTaskUsrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxsTrgtTaskUsrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TarafxsTrgtTaskUsrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,915); // serialize this field at offset 915 by default 
    }
    
	/**
	* sets parent for this TarafxsTrgtTaskUsrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 915 by default
    }    
	/**
	* initializes the field in TarafxsTrgtTaskUsrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAFXS_TRGT_TASK_USR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTarafxsTrgtTaskUsrLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTarafxsTrgtTaskUsrTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTarafxsTrgtTaskUsrLenCounter = -1;
         public boolean isTarafxsTrgtTaskUsrLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsTrgtTaskUsrLenCounter != sharedCounter;
            localTarafxsTrgtTaskUsrLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_TRGT_TASK_USR_LEN_LEN = 2;
  	/**
	 * serializeTarafxsTrgtTaskUsrLen
	 */
	protected void serializeTarafxsTrgtTaskUsrLen(short tarafxsTrgtTaskUsrLen) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsTrgtTaskUsrLen,TARAFXS_TRGT_TASK_USR_LEN_LEN)
                  ,beginTarafxsTrgtTaskUsrLen
                  ,TARAFXS_TRGT_TASK_USR_LEN_LEN
                 );
            localTarafxsTrgtTaskUsrLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsTrgtTaskUsrLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsTrgtTaskUsrLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsTrgtTaskUsrLen() {	 
			return (getShort(beginTarafxsTrgtTaskUsrLen));
   	}
     int localTarafxsTrgtTaskUsrTxtCounter = -1;
     public boolean isTarafxsTrgtTaskUsrTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsTrgtTaskUsrTxtCounter != sharedCounter;
         localTarafxsTrgtTaskUsrTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_TRGT_TASK_USR_TXT_LEN = 64;
	/**
	 * 	serialize this TarafxsTrgtTaskUsrTxt
	 */
   protected void serializeTarafxsTrgtTaskUsrTxt(char[] tarafxsTrgtTaskUsrTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsTrgtTaskUsrTxt,0,getStringValue(),beginTarafxsTrgtTaskUsrTxt,TARAFXS_TRGT_TASK_USR_TXT_LEN);
       localTarafxsTrgtTaskUsrTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsTrgtTaskUsrTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
    /**
	 *	refreshTarafxsTrgtTaskUsrTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsTrgtTaskUsrTxt() {	 
   		return (substring(getStringValue(),beginTarafxsTrgtTaskUsrTxt,beginTarafxsTrgtTaskUsrTxt + TARAFXS_TRGT_TASK_USR_TXT_LEN));
   	}




}
  
