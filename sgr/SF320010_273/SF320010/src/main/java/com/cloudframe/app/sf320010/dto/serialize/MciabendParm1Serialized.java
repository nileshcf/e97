package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class MciabendParm1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciabendParm1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciabendParm1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIABEND_PARM_1_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciabendDumpOpt;
            protected  int beginMciabendAbendCode;
	
	/**
	* Constructor for MciabendParm1Serialized
	**/
    public MciabendParm1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MciabendParm1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciabendParm1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MciabendParm1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,16); // serialize this field at offset 16 by default 
    }
    
	/**
	* sets parent for this MciabendParm1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 16 by default
    }    
	/**
	* initializes the field in MciabendParm1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIABEND_PARM_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciabendDumpOpt = getStartOffset() + 0;	// set offset for serialization
  
  
             beginMciabendAbendCode = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMciabendDumpOptCounter = -1;
     public boolean isMciabendDumpOptModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciabendDumpOptCounter != sharedCounter;
         localMciabendDumpOptCounter = sharedCounter; return hasModified;
     }
	protected static final int MCIABEND_DUMP_OPT_LEN = 1;
	/**
	 * 	serialize this MciabendDumpOpt
	 */
   protected void serializeMciabendDumpOpt(char[] mciabendDumpOpt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciabendDumpOpt,0,getStringValue(),beginMciabendDumpOpt,MCIABEND_DUMP_OPT_LEN);
       localMciabendDumpOptCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciabendDumpOptConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMciabendDumpOpt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciabendDumpOpt() {	 
   		return (substring(getStringValue(),beginMciabendDumpOpt,beginMciabendDumpOpt + MCIABEND_DUMP_OPT_LEN));
   	}
         int localMciabendAbendCodeCounter = -1;
         public boolean isMciabendAbendCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciabendAbendCodeCounter != sharedCounter;
            localMciabendAbendCodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCIABEND_ABEND_CODE_LEN = 2;
  	/**
	 * serializeMciabendAbendCode
	 */
	protected void serializeMciabendAbendCode(int mciabendAbendCode) {
           replaceValue( //  save the value as string
                   getBinaryString( mciabendAbendCode,MCIABEND_ABEND_CODE_LEN)
                  ,beginMciabendAbendCode
                  ,MCIABEND_ABEND_CODE_LEN
                 );
            localMciabendAbendCodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMciabendAbendCodeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMciabendAbendCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMciabendAbendCode() {	 
			return (getUnsignedShort(beginMciabendAbendCode));
   	}




}
  
