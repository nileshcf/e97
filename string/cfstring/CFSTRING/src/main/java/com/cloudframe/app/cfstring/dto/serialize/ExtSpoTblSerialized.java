package com.cloudframe.app.cfstring.dto.serialize;

/**
*  The class ExtSpoTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExtSpoTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExtSpoTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXT_SPO_TBL_LENGTH = 46;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExtMfgNm;
            protected  int beginExtPrdNme;
            protected  int beginExtMacid;
            protected  int beginExtActivationDate;
	
	/**
	* Constructor for ExtSpoTblSerialized
	**/
    public ExtSpoTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ExtSpoTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtSpoTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ExtSpoTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1332); // serialize this field at offset 1332 by default 
    }
    
	/**
	* sets parent for this ExtSpoTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1332 by default
    }    
	/**
	* initializes the field in ExtSpoTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXT_SPO_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExtMfgNm = getStartOffset() + 0;	// set offset for serialization
  
             beginExtPrdNme = getStartOffset() + 4;	// set offset for serialization
  
             beginExtMacid = getStartOffset() + 16;	// set offset for serialization
  
             beginExtActivationDate = getStartOffset() + 36;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localExtMfgNmCounter = -1;
     public boolean isExtMfgNmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtMfgNmCounter != sharedCounter;
         localExtMfgNmCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_MFG_NM_LEN = 4;
	/**
	 * 	serialize this ExtMfgNm
	 */
   protected void serializeExtMfgNm(char[] extMfgNm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extMfgNm,0,getStringValue(),beginExtMfgNm,EXT_MFG_NM_LEN);
       localExtMfgNmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtMfgNmConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshExtMfgNm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtMfgNm() {	 
   		return (substring(getStringValue(),beginExtMfgNm,beginExtMfgNm + EXT_MFG_NM_LEN));
   	}
     int localExtPrdNmeCounter = -1;
     public boolean isExtPrdNmeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtPrdNmeCounter != sharedCounter;
         localExtPrdNmeCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_PRD_NME_LEN = 12;
	/**
	 * 	serialize this ExtPrdNme
	 */
   protected void serializeExtPrdNme(char[] extPrdNme) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extPrdNme,0,getStringValue(),beginExtPrdNme,EXT_PRD_NME_LEN);
       localExtPrdNmeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtPrdNmeConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshExtPrdNme is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtPrdNme() {	 
   		return (substring(getStringValue(),beginExtPrdNme,beginExtPrdNme + EXT_PRD_NME_LEN));
   	}
     int localExtMacidCounter = -1;
     public boolean isExtMacidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtMacidCounter != sharedCounter;
         localExtMacidCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_MACID_LEN = 20;
	/**
	 * 	serialize this ExtMacid
	 */
   protected void serializeExtMacid(char[] extMacid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extMacid,0,getStringValue(),beginExtMacid,EXT_MACID_LEN);
       localExtMacidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtMacidConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshExtMacid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtMacid() {	 
   		return (substring(getStringValue(),beginExtMacid,beginExtMacid + EXT_MACID_LEN));
   	}
     int localExtActivationDateCounter = -1;
     public boolean isExtActivationDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtActivationDateCounter != sharedCounter;
         localExtActivationDateCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_ACTIVATION_DATE_LEN = 10;
	/**
	 * 	serialize this ExtActivationDate
	 */
   protected void serializeExtActivationDate(char[] extActivationDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extActivationDate,0,getStringValue(),beginExtActivationDate,EXT_ACTIVATION_DATE_LEN);
       localExtActivationDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtActivationDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshExtActivationDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtActivationDate() {	 
   		return (substring(getStringValue(),beginExtActivationDate,beginExtActivationDate + EXT_ACTIVATION_DATE_LEN));
   	}




}
  
