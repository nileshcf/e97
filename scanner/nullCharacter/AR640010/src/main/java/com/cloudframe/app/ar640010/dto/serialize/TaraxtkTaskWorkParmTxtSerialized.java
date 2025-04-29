package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TaraxtkTaskWorkParmTxtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TaraxtkTaskWorkParmTxtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TaraxtkTaskWorkParmTxtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAXTK_TASK_WORK_PARM_TXT_LENGTH = 1026;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaraxtkTaskWorkParmTxtLen;
            protected  int beginTaraxtkTaskWorkParmTxtTxt;
	
	/**
	* Constructor for TaraxtkTaskWorkParmTxtSerialized
	**/
    public TaraxtkTaskWorkParmTxtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TaraxtkTaskWorkParmTxtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraxtkTaskWorkParmTxtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TaraxtkTaskWorkParmTxtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,991); // serialize this field at offset 991 by default 
    }
    
	/**
	* sets parent for this TaraxtkTaskWorkParmTxtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 991 by default
    }    
	/**
	* initializes the field in TaraxtkTaskWorkParmTxtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAXTK_TASK_WORK_PARM_TXT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaraxtkTaskWorkParmTxtLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTaraxtkTaskWorkParmTxtTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTaraxtkTaskWorkParmTxtLenCounter = -1;
         public boolean isTaraxtkTaskWorkParmTxtLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkTaskWorkParmTxtLenCounter != sharedCounter;
            localTaraxtkTaskWorkParmTxtLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_TASK_WORK_PARM_TXT_LEN_LEN = 2;
  	/**
	 * serializeTaraxtkTaskWorkParmTxtLen
	 */
	protected void serializeTaraxtkTaskWorkParmTxtLen(short taraxtkTaskWorkParmTxtLen) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkTaskWorkParmTxtLen,TARAXTK_TASK_WORK_PARM_TXT_LEN_LEN)
                  ,beginTaraxtkTaskWorkParmTxtLen
                  ,TARAXTK_TASK_WORK_PARM_TXT_LEN_LEN
                 );
            localTaraxtkTaskWorkParmTxtLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkTaskWorkParmTxtLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkTaskWorkParmTxtLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkTaskWorkParmTxtLen() {	 
			return (getShort(beginTaraxtkTaskWorkParmTxtLen));
   	}
     int localTaraxtkTaskWorkParmTxtTxtCounter = -1;
     public boolean isTaraxtkTaskWorkParmTxtTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkTaskWorkParmTxtTxtCounter != sharedCounter;
         localTaraxtkTaskWorkParmTxtTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_TASK_WORK_PARM_TXT_TXT_LEN = 1024;
	/**
	 * 	serialize this TaraxtkTaskWorkParmTxtTxt
	 */
   protected void serializeTaraxtkTaskWorkParmTxtTxt(char[] taraxtkTaskWorkParmTxtTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkTaskWorkParmTxtTxt,0,getStringValue(),beginTaraxtkTaskWorkParmTxtTxt,TARAXTK_TASK_WORK_PARM_TXT_TXT_LEN);
       localTaraxtkTaskWorkParmTxtTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkTaskWorkParmTxtTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 1024 ,false, false);
   }
    /**
	 *	refreshTaraxtkTaskWorkParmTxtTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkTaskWorkParmTxtTxt() {	 
   		return (substring(getStringValue(),beginTaraxtkTaskWorkParmTxtTxt,beginTaraxtkTaskWorkParmTxtTxt + TARAXTK_TASK_WORK_PARM_TXT_TXT_LEN));
   	}




}
  
