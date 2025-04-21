package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class MciseqioRecfmCodesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciseqioRecfmCodesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciseqioRecfmCodesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCISEQIO_RECFM_CODES_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciseqioRecfmOnDd;
            protected  int beginMciseqioRecfmU;
            protected  int beginMciseqioRecfmF;
            protected  int beginMciseqioRecfmFb;
            protected  int beginMciseqioRecfmFs;
            protected  int beginMciseqioRecfmV;
            protected  int beginMciseqioRecfmVb;
            protected  int beginMciseqioRecfmVs;
	
	/**
	* Constructor for MciseqioRecfmCodesSerialized
	**/
    public MciseqioRecfmCodesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MciseqioRecfmCodesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioRecfmCodesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MciseqioRecfmCodesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,147); // serialize this field at offset 147 by default 
    }
    
	/**
	* sets parent for this MciseqioRecfmCodesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 147 by default
    }    
	/**
	* initializes the field in MciseqioRecfmCodesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCISEQIO_RECFM_CODES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciseqioRecfmOnDd = getStartOffset() + 0;	// set offset for serialization
  
             beginMciseqioRecfmU = getStartOffset() + 2;	// set offset for serialization
  
             beginMciseqioRecfmF = getStartOffset() + 4;	// set offset for serialization
  
             beginMciseqioRecfmFb = getStartOffset() + 6;	// set offset for serialization
  
             beginMciseqioRecfmFs = getStartOffset() + 8;	// set offset for serialization
  
             beginMciseqioRecfmV = getStartOffset() + 10;	// set offset for serialization
  
             beginMciseqioRecfmVb = getStartOffset() + 12;	// set offset for serialization
  
             beginMciseqioRecfmVs = getStartOffset() + 14;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMciseqioRecfmOnDdCounter = -1;
     public boolean isMciseqioRecfmOnDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioRecfmOnDdCounter != sharedCounter;
         localMciseqioRecfmOnDdCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_RECFM_ON_DD_LEN = 2;
	/**
	 * 	serialize this MciseqioRecfmOnDd
	 */
   protected void serializeMciseqioRecfmOnDd(char[] mciseqioRecfmOnDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioRecfmOnDd,0,getStringValue(),beginMciseqioRecfmOnDd,MCISEQIO_RECFM_ON_DD_LEN);
       localMciseqioRecfmOnDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioRecfmOnDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioRecfmOnDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioRecfmOnDd() {	 
   		return (substring(getStringValue(),beginMciseqioRecfmOnDd,beginMciseqioRecfmOnDd + MCISEQIO_RECFM_ON_DD_LEN));
   	}
     int localMciseqioRecfmUCounter = -1;
     public boolean isMciseqioRecfmUModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioRecfmUCounter != sharedCounter;
         localMciseqioRecfmUCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_RECFM_U_LEN = 2;
	/**
	 * 	serialize this MciseqioRecfmU
	 */
   protected void serializeMciseqioRecfmU(char[] mciseqioRecfmU) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioRecfmU,0,getStringValue(),beginMciseqioRecfmU,MCISEQIO_RECFM_U_LEN);
       localMciseqioRecfmUCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioRecfmUConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioRecfmU is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioRecfmU() {	 
   		return (substring(getStringValue(),beginMciseqioRecfmU,beginMciseqioRecfmU + MCISEQIO_RECFM_U_LEN));
   	}
     int localMciseqioRecfmFCounter = -1;
     public boolean isMciseqioRecfmFModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioRecfmFCounter != sharedCounter;
         localMciseqioRecfmFCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_RECFM_F_LEN = 2;
	/**
	 * 	serialize this MciseqioRecfmF
	 */
   protected void serializeMciseqioRecfmF(char[] mciseqioRecfmF) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioRecfmF,0,getStringValue(),beginMciseqioRecfmF,MCISEQIO_RECFM_F_LEN);
       localMciseqioRecfmFCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioRecfmFConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioRecfmF is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioRecfmF() {	 
   		return (substring(getStringValue(),beginMciseqioRecfmF,beginMciseqioRecfmF + MCISEQIO_RECFM_F_LEN));
   	}
     int localMciseqioRecfmFbCounter = -1;
     public boolean isMciseqioRecfmFbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioRecfmFbCounter != sharedCounter;
         localMciseqioRecfmFbCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_RECFM_FB_LEN = 2;
	/**
	 * 	serialize this MciseqioRecfmFb
	 */
   protected void serializeMciseqioRecfmFb(char[] mciseqioRecfmFb) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioRecfmFb,0,getStringValue(),beginMciseqioRecfmFb,MCISEQIO_RECFM_FB_LEN);
       localMciseqioRecfmFbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioRecfmFbConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioRecfmFb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioRecfmFb() {	 
   		return (substring(getStringValue(),beginMciseqioRecfmFb,beginMciseqioRecfmFb + MCISEQIO_RECFM_FB_LEN));
   	}
     int localMciseqioRecfmFsCounter = -1;
     public boolean isMciseqioRecfmFsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioRecfmFsCounter != sharedCounter;
         localMciseqioRecfmFsCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_RECFM_FS_LEN = 2;
	/**
	 * 	serialize this MciseqioRecfmFs
	 */
   protected void serializeMciseqioRecfmFs(char[] mciseqioRecfmFs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioRecfmFs,0,getStringValue(),beginMciseqioRecfmFs,MCISEQIO_RECFM_FS_LEN);
       localMciseqioRecfmFsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioRecfmFsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioRecfmFs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioRecfmFs() {	 
   		return (substring(getStringValue(),beginMciseqioRecfmFs,beginMciseqioRecfmFs + MCISEQIO_RECFM_FS_LEN));
   	}
     int localMciseqioRecfmVCounter = -1;
     public boolean isMciseqioRecfmVModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioRecfmVCounter != sharedCounter;
         localMciseqioRecfmVCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_RECFM_V_LEN = 2;
	/**
	 * 	serialize this MciseqioRecfmV
	 */
   protected void serializeMciseqioRecfmV(char[] mciseqioRecfmV) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioRecfmV,0,getStringValue(),beginMciseqioRecfmV,MCISEQIO_RECFM_V_LEN);
       localMciseqioRecfmVCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioRecfmVConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioRecfmV is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioRecfmV() {	 
   		return (substring(getStringValue(),beginMciseqioRecfmV,beginMciseqioRecfmV + MCISEQIO_RECFM_V_LEN));
   	}
     int localMciseqioRecfmVbCounter = -1;
     public boolean isMciseqioRecfmVbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioRecfmVbCounter != sharedCounter;
         localMciseqioRecfmVbCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_RECFM_VB_LEN = 2;
	/**
	 * 	serialize this MciseqioRecfmVb
	 */
   protected void serializeMciseqioRecfmVb(char[] mciseqioRecfmVb) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioRecfmVb,0,getStringValue(),beginMciseqioRecfmVb,MCISEQIO_RECFM_VB_LEN);
       localMciseqioRecfmVbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioRecfmVbConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioRecfmVb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioRecfmVb() {	 
   		return (substring(getStringValue(),beginMciseqioRecfmVb,beginMciseqioRecfmVb + MCISEQIO_RECFM_VB_LEN));
   	}
     int localMciseqioRecfmVsCounter = -1;
     public boolean isMciseqioRecfmVsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioRecfmVsCounter != sharedCounter;
         localMciseqioRecfmVsCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_RECFM_VS_LEN = 2;
	/**
	 * 	serialize this MciseqioRecfmVs
	 */
   protected void serializeMciseqioRecfmVs(char[] mciseqioRecfmVs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioRecfmVs,0,getStringValue(),beginMciseqioRecfmVs,MCISEQIO_RECFM_VS_LEN);
       localMciseqioRecfmVsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioRecfmVsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioRecfmVs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioRecfmVs() {	 
   		return (substring(getStringValue(),beginMciseqioRecfmVs,beginMciseqioRecfmVs + MCISEQIO_RECFM_VS_LEN));
   	}




}
  
