package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TarafxaTrgtTaskUsrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TarafxaTrgtTaskUsrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TarafxaTrgtTaskUsrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAFXA_TRGT_TASK_USR_LENGTH = 66;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTarafxaTrgtTaskUsrLen;
            protected  int beginTarafxaTrgtTaskUsrTxt;
	
	/**
	* Constructor for TarafxaTrgtTaskUsrSerialized
	**/
    public TarafxaTrgtTaskUsrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TarafxaTrgtTaskUsrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxaTrgtTaskUsrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TarafxaTrgtTaskUsrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,915); // serialize this field at offset 915 by default 
    }
    
	/**
	* sets parent for this TarafxaTrgtTaskUsrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 915 by default
    }    
	/**
	* initializes the field in TarafxaTrgtTaskUsrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAFXA_TRGT_TASK_USR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTarafxaTrgtTaskUsrLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTarafxaTrgtTaskUsrTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTarafxaTrgtTaskUsrLenCounter = -1;
         public boolean isTarafxaTrgtTaskUsrLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaTrgtTaskUsrLenCounter != sharedCounter;
            localTarafxaTrgtTaskUsrLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_TRGT_TASK_USR_LEN_LEN = 2;
  	/**
	 * serializeTarafxaTrgtTaskUsrLen
	 */
	protected void serializeTarafxaTrgtTaskUsrLen(short tarafxaTrgtTaskUsrLen) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaTrgtTaskUsrLen,TARAFXA_TRGT_TASK_USR_LEN_LEN)
                  ,beginTarafxaTrgtTaskUsrLen
                  ,TARAFXA_TRGT_TASK_USR_LEN_LEN
                 );
            localTarafxaTrgtTaskUsrLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaTrgtTaskUsrLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaTrgtTaskUsrLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaTrgtTaskUsrLen() {	 
			return (getShort(beginTarafxaTrgtTaskUsrLen));
   	}
     int localTarafxaTrgtTaskUsrTxtCounter = -1;
     public boolean isTarafxaTrgtTaskUsrTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaTrgtTaskUsrTxtCounter != sharedCounter;
         localTarafxaTrgtTaskUsrTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_TRGT_TASK_USR_TXT_LEN = 64;
	/**
	 * 	serialize this TarafxaTrgtTaskUsrTxt
	 */
   protected void serializeTarafxaTrgtTaskUsrTxt(char[] tarafxaTrgtTaskUsrTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaTrgtTaskUsrTxt,0,getStringValue(),beginTarafxaTrgtTaskUsrTxt,TARAFXA_TRGT_TASK_USR_TXT_LEN);
       localTarafxaTrgtTaskUsrTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaTrgtTaskUsrTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
    /**
	 *	refreshTarafxaTrgtTaskUsrTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaTrgtTaskUsrTxt() {	 
   		return (substring(getStringValue(),beginTarafxaTrgtTaskUsrTxt,beginTarafxaTrgtTaskUsrTxt + TARAFXA_TRGT_TASK_USR_TXT_LEN));
   	}




}
  
