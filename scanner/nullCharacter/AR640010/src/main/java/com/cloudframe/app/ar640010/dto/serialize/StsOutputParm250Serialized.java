package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class StsOutputParm250Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StsOutputParm250Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StsOutputParm250Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STS_OUTPUT_PARM_250_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGftStatCd250;
            protected  int beginHubStatCd250;
            protected  int beginE2eStatCd250;
            protected  int beginStatRefAbbrTxt250;
            protected  int beginStatRefDesc250;
            protected  int beginStsLstUpdtUid250;
            protected  int beginStsLstUpdtTs250;
	
	/**
	* Constructor for StsOutputParm250Serialized
	**/
    public StsOutputParm250Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for StsOutputParm250Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsOutputParm250Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this StsOutputParm250Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this StsOutputParm250Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in StsOutputParm250Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STS_OUTPUT_PARM_250_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginGftStatCd250 = getStartOffset() + 0;	// set offset for serialization
  
             beginHubStatCd250 = getStartOffset() + 1;	// set offset for serialization
  
             beginE2eStatCd250 = getStartOffset() + 3;	// set offset for serialization
  
             beginStatRefAbbrTxt250 = getStartOffset() + 5;	// set offset for serialization
  
             beginStatRefDesc250 = getStartOffset() + 19;	// set offset for serialization
  
             beginStsLstUpdtUid250 = getStartOffset() + 99;	// set offset for serialization
  
             beginStsLstUpdtTs250 = getStartOffset() + 108;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localGftStatCd250Counter = -1;
     public boolean isGftStatCd250Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftStatCd250Counter != sharedCounter;
         localGftStatCd250Counter = sharedCounter; return hasModified;
     }
	protected static final int GFT_STAT_CD_250_LEN = 1;
	/**
	 * 	serialize this GftStatCd250
	 */
   protected void serializeGftStatCd250(char[] gftStatCd250) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftStatCd250,0,getStringValue(),beginGftStatCd250,GFT_STAT_CD_250_LEN);
       localGftStatCd250Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftStatCd250Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshGftStatCd250 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftStatCd250() {	 
   		return (substring(getStringValue(),beginGftStatCd250,beginGftStatCd250 + GFT_STAT_CD_250_LEN));
   	}
     int localHubStatCd250Counter = -1;
     public boolean isHubStatCd250Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHubStatCd250Counter != sharedCounter;
         localHubStatCd250Counter = sharedCounter; return hasModified;
     }
	protected static final int HUB_STAT_CD_250_LEN = 2;
	/**
	 * 	serialize this HubStatCd250
	 */
   protected void serializeHubStatCd250(char[] hubStatCd250) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hubStatCd250,0,getStringValue(),beginHubStatCd250,HUB_STAT_CD_250_LEN);
       localHubStatCd250Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHubStatCd250Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHubStatCd250 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHubStatCd250() {	 
   		return (substring(getStringValue(),beginHubStatCd250,beginHubStatCd250 + HUB_STAT_CD_250_LEN));
   	}
     int localE2eStatCd250Counter = -1;
     public boolean isE2eStatCd250Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localE2eStatCd250Counter != sharedCounter;
         localE2eStatCd250Counter = sharedCounter; return hasModified;
     }
	protected static final int E_2E_STAT_CD_250_LEN = 2;
	/**
	 * 	serialize this E2eStatCd250
	 */
   protected void serializeE2eStatCd250(char[] e2eStatCd250) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(e2eStatCd250,0,getStringValue(),beginE2eStatCd250,E_2E_STAT_CD_250_LEN);
       localE2eStatCd250Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkE2eStatCd250Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshE2eStatCd250 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshE2eStatCd250() {	 
   		return (substring(getStringValue(),beginE2eStatCd250,beginE2eStatCd250 + E_2E_STAT_CD_250_LEN));
   	}
     int localStatRefAbbrTxt250Counter = -1;
     public boolean isStatRefAbbrTxt250Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStatRefAbbrTxt250Counter != sharedCounter;
         localStatRefAbbrTxt250Counter = sharedCounter; return hasModified;
     }
	protected static final int STAT_REF_ABBR_TXT_250_LEN = 14;
	/**
	 * 	serialize this StatRefAbbrTxt250
	 */
   protected void serializeStatRefAbbrTxt250(char[] statRefAbbrTxt250) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(statRefAbbrTxt250,0,getStringValue(),beginStatRefAbbrTxt250,STAT_REF_ABBR_TXT_250_LEN);
       localStatRefAbbrTxt250Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStatRefAbbrTxt250Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshStatRefAbbrTxt250 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStatRefAbbrTxt250() {	 
   		return (substring(getStringValue(),beginStatRefAbbrTxt250,beginStatRefAbbrTxt250 + STAT_REF_ABBR_TXT_250_LEN));
   	}
     int localStatRefDesc250Counter = -1;
     public boolean isStatRefDesc250Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStatRefDesc250Counter != sharedCounter;
         localStatRefDesc250Counter = sharedCounter; return hasModified;
     }
	protected static final int STAT_REF_DESC_250_LEN = 80;
	/**
	 * 	serialize this StatRefDesc250
	 */
   protected void serializeStatRefDesc250(char[] statRefDesc250) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(statRefDesc250,0,getStringValue(),beginStatRefDesc250,STAT_REF_DESC_250_LEN);
       localStatRefDesc250Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStatRefDesc250Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshStatRefDesc250 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStatRefDesc250() {	 
   		return (substring(getStringValue(),beginStatRefDesc250,beginStatRefDesc250 + STAT_REF_DESC_250_LEN));
   	}
     int localStsLstUpdtUid250Counter = -1;
     public boolean isStsLstUpdtUid250Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsLstUpdtUid250Counter != sharedCounter;
         localStsLstUpdtUid250Counter = sharedCounter; return hasModified;
     }
	protected static final int STS_LST_UPDT_UID_250_LEN = 9;
	/**
	 * 	serialize this StsLstUpdtUid250
	 */
   protected void serializeStsLstUpdtUid250(char[] stsLstUpdtUid250) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsLstUpdtUid250,0,getStringValue(),beginStsLstUpdtUid250,STS_LST_UPDT_UID_250_LEN);
       localStsLstUpdtUid250Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsLstUpdtUid250Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshStsLstUpdtUid250 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsLstUpdtUid250() {	 
   		return (substring(getStringValue(),beginStsLstUpdtUid250,beginStsLstUpdtUid250 + STS_LST_UPDT_UID_250_LEN));
   	}
     int localStsLstUpdtTs250Counter = -1;
     public boolean isStsLstUpdtTs250Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsLstUpdtTs250Counter != sharedCounter;
         localStsLstUpdtTs250Counter = sharedCounter; return hasModified;
     }
	protected static final int STS_LST_UPDT_TS_250_LEN = 26;
	/**
	 * 	serialize this StsLstUpdtTs250
	 */
   protected void serializeStsLstUpdtTs250(char[] stsLstUpdtTs250) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsLstUpdtTs250,0,getStringValue(),beginStsLstUpdtTs250,STS_LST_UPDT_TS_250_LEN);
       localStsLstUpdtTs250Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsLstUpdtTs250Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshStsLstUpdtTs250 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsLstUpdtTs250() {	 
   		return (substring(getStringValue(),beginStsLstUpdtTs250,beginStsLstUpdtTs250 + STS_LST_UPDT_TS_250_LEN));
   	}




}
  
