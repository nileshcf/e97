package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ParmData1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParmData1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParmData1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARM_DATA_1000_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDisplayMsgTblsSw1000;
            protected  int beginWriteXmlSw1000;
            protected  int beginWritePsipmSw1000;
            protected  int beginWriteIpmSw1000;
	
	/**
	* Constructor for ParmData1000Serialized
	**/
    public ParmData1000Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ParmData1000Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ParmData1000Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ParmData1000Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this ParmData1000Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in ParmData1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARM_DATA_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDisplayMsgTblsSw1000 = getStartOffset() + 0;	// set offset for serialization
  
             beginWriteXmlSw1000 = getStartOffset() + 1;	// set offset for serialization
  
             beginWritePsipmSw1000 = getStartOffset() + 2;	// set offset for serialization
  
             beginWriteIpmSw1000 = getStartOffset() + 3;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDisplayMsgTblsSw1000Counter = -1;
     public boolean isDisplayMsgTblsSw1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayMsgTblsSw1000Counter != sharedCounter;
         localDisplayMsgTblsSw1000Counter = sharedCounter; return hasModified;
     }
	protected static final int DISPLAY_MSG_TBLS_SW_1000_LEN = 1;
	/**
	 * 	serialize this DisplayMsgTblsSw1000
	 */
   protected void serializeDisplayMsgTblsSw1000(char[] displayMsgTblsSw1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(displayMsgTblsSw1000,0,getStringValue(),beginDisplayMsgTblsSw1000,DISPLAY_MSG_TBLS_SW_1000_LEN);
       localDisplayMsgTblsSw1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDisplayMsgTblsSw1000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDisplayMsgTblsSw1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDisplayMsgTblsSw1000() {	 
   		return (substring(getStringValue(),beginDisplayMsgTblsSw1000,beginDisplayMsgTblsSw1000 + DISPLAY_MSG_TBLS_SW_1000_LEN));
   	}
     int localWriteXmlSw1000Counter = -1;
     public boolean isWriteXmlSw1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWriteXmlSw1000Counter != sharedCounter;
         localWriteXmlSw1000Counter = sharedCounter; return hasModified;
     }
	protected static final int WRITE_XML_SW_1000_LEN = 1;
	/**
	 * 	serialize this WriteXmlSw1000
	 */
   protected void serializeWriteXmlSw1000(char[] writeXmlSw1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(writeXmlSw1000,0,getStringValue(),beginWriteXmlSw1000,WRITE_XML_SW_1000_LEN);
       localWriteXmlSw1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWriteXmlSw1000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWriteXmlSw1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWriteXmlSw1000() {	 
   		return (substring(getStringValue(),beginWriteXmlSw1000,beginWriteXmlSw1000 + WRITE_XML_SW_1000_LEN));
   	}
     int localWritePsipmSw1000Counter = -1;
     public boolean isWritePsipmSw1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWritePsipmSw1000Counter != sharedCounter;
         localWritePsipmSw1000Counter = sharedCounter; return hasModified;
     }
	protected static final int WRITE_PSIPM_SW_1000_LEN = 1;
	/**
	 * 	serialize this WritePsipmSw1000
	 */
   protected void serializeWritePsipmSw1000(char[] writePsipmSw1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(writePsipmSw1000,0,getStringValue(),beginWritePsipmSw1000,WRITE_PSIPM_SW_1000_LEN);
       localWritePsipmSw1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWritePsipmSw1000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWritePsipmSw1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWritePsipmSw1000() {	 
   		return (substring(getStringValue(),beginWritePsipmSw1000,beginWritePsipmSw1000 + WRITE_PSIPM_SW_1000_LEN));
   	}
     int localWriteIpmSw1000Counter = -1;
     public boolean isWriteIpmSw1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWriteIpmSw1000Counter != sharedCounter;
         localWriteIpmSw1000Counter = sharedCounter; return hasModified;
     }
	protected static final int WRITE_IPM_SW_1000_LEN = 1;
	/**
	 * 	serialize this WriteIpmSw1000
	 */
   protected void serializeWriteIpmSw1000(char[] writeIpmSw1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(writeIpmSw1000,0,getStringValue(),beginWriteIpmSw1000,WRITE_IPM_SW_1000_LEN);
       localWriteIpmSw1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWriteIpmSw1000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWriteIpmSw1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWriteIpmSw1000() {	 
   		return (substring(getStringValue(),beginWriteIpmSw1000,beginWriteIpmSw1000 + WRITE_IPM_SW_1000_LEN));
   	}




}
  
