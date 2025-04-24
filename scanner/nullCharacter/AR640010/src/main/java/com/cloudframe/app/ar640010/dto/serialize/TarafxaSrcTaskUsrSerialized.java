package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TarafxaSrcTaskUsrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TarafxaSrcTaskUsrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TarafxaSrcTaskUsrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAFXA_SRC_TASK_USR_LENGTH = 66;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTarafxaSrcTaskUsrLen;
            protected  int beginTarafxaSrcTaskUsrTxt;
	
	/**
	* Constructor for TarafxaSrcTaskUsrSerialized
	**/
    public TarafxaSrcTaskUsrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TarafxaSrcTaskUsrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxaSrcTaskUsrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TarafxaSrcTaskUsrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,764); // serialize this field at offset 764 by default 
    }
    
	/**
	* sets parent for this TarafxaSrcTaskUsrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 764 by default
    }    
	/**
	* initializes the field in TarafxaSrcTaskUsrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAFXA_SRC_TASK_USR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTarafxaSrcTaskUsrLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTarafxaSrcTaskUsrTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTarafxaSrcTaskUsrLenCounter = -1;
         public boolean isTarafxaSrcTaskUsrLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaSrcTaskUsrLenCounter != sharedCounter;
            localTarafxaSrcTaskUsrLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_SRC_TASK_USR_LEN_LEN = 2;
  	/**
	 * serializeTarafxaSrcTaskUsrLen
	 */
	protected void serializeTarafxaSrcTaskUsrLen(short tarafxaSrcTaskUsrLen) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaSrcTaskUsrLen,TARAFXA_SRC_TASK_USR_LEN_LEN)
                  ,beginTarafxaSrcTaskUsrLen
                  ,TARAFXA_SRC_TASK_USR_LEN_LEN
                 );
            localTarafxaSrcTaskUsrLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaSrcTaskUsrLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaSrcTaskUsrLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaSrcTaskUsrLen() {	 
			return (getShort(beginTarafxaSrcTaskUsrLen));
   	}
     int localTarafxaSrcTaskUsrTxtCounter = -1;
     public boolean isTarafxaSrcTaskUsrTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaSrcTaskUsrTxtCounter != sharedCounter;
         localTarafxaSrcTaskUsrTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_SRC_TASK_USR_TXT_LEN = 64;
	/**
	 * 	serialize this TarafxaSrcTaskUsrTxt
	 */
   protected void serializeTarafxaSrcTaskUsrTxt(char[] tarafxaSrcTaskUsrTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaSrcTaskUsrTxt,0,getStringValue(),beginTarafxaSrcTaskUsrTxt,TARAFXA_SRC_TASK_USR_TXT_LEN);
       localTarafxaSrcTaskUsrTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaSrcTaskUsrTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
    /**
	 *	refreshTarafxaSrcTaskUsrTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaSrcTaskUsrTxt() {	 
   		return (substring(getStringValue(),beginTarafxaSrcTaskUsrTxt,beginTarafxaSrcTaskUsrTxt + TARAFXA_SRC_TASK_USR_TXT_LEN));
   	}




}
  
