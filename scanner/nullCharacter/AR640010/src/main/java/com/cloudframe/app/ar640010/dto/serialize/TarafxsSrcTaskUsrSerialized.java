package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TarafxsSrcTaskUsrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TarafxsSrcTaskUsrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TarafxsSrcTaskUsrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAFXS_SRC_TASK_USR_LENGTH = 66;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTarafxsSrcTaskUsrLen;
            protected  int beginTarafxsSrcTaskUsrTxt;
	
	/**
	* Constructor for TarafxsSrcTaskUsrSerialized
	**/
    public TarafxsSrcTaskUsrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TarafxsSrcTaskUsrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxsSrcTaskUsrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TarafxsSrcTaskUsrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,764); // serialize this field at offset 764 by default 
    }
    
	/**
	* sets parent for this TarafxsSrcTaskUsrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 764 by default
    }    
	/**
	* initializes the field in TarafxsSrcTaskUsrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAFXS_SRC_TASK_USR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTarafxsSrcTaskUsrLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTarafxsSrcTaskUsrTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTarafxsSrcTaskUsrLenCounter = -1;
         public boolean isTarafxsSrcTaskUsrLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsSrcTaskUsrLenCounter != sharedCounter;
            localTarafxsSrcTaskUsrLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_SRC_TASK_USR_LEN_LEN = 2;
  	/**
	 * serializeTarafxsSrcTaskUsrLen
	 */
	protected void serializeTarafxsSrcTaskUsrLen(short tarafxsSrcTaskUsrLen) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsSrcTaskUsrLen,TARAFXS_SRC_TASK_USR_LEN_LEN)
                  ,beginTarafxsSrcTaskUsrLen
                  ,TARAFXS_SRC_TASK_USR_LEN_LEN
                 );
            localTarafxsSrcTaskUsrLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsSrcTaskUsrLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsSrcTaskUsrLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsSrcTaskUsrLen() {	 
			return (getShort(beginTarafxsSrcTaskUsrLen));
   	}
     int localTarafxsSrcTaskUsrTxtCounter = -1;
     public boolean isTarafxsSrcTaskUsrTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsSrcTaskUsrTxtCounter != sharedCounter;
         localTarafxsSrcTaskUsrTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_SRC_TASK_USR_TXT_LEN = 64;
	/**
	 * 	serialize this TarafxsSrcTaskUsrTxt
	 */
   protected void serializeTarafxsSrcTaskUsrTxt(char[] tarafxsSrcTaskUsrTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsSrcTaskUsrTxt,0,getStringValue(),beginTarafxsSrcTaskUsrTxt,TARAFXS_SRC_TASK_USR_TXT_LEN);
       localTarafxsSrcTaskUsrTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsSrcTaskUsrTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
    /**
	 *	refreshTarafxsSrcTaskUsrTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsSrcTaskUsrTxt() {	 
   		return (substring(getStringValue(),beginTarafxsSrcTaskUsrTxt,beginTarafxsSrcTaskUsrTxt + TARAFXS_SRC_TASK_USR_TXT_LEN));
   	}




}
  
