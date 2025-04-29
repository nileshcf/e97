package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdOptExpMmddccyySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdOptExpMmddccyySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdOptExpMmddccyySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_OPT_EXP_MMDDCCYY_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdOptExpMm;
            protected  int beginMsdOptExpDd;
            protected  int beginMsdOptExpCc;
            protected  int beginMsdOptExpYy;
	
	/**
	* Constructor for MsdOptExpMmddccyySerialized
	**/
    public MsdOptExpMmddccyySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdOptExpMmddccyySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdOptExpMmddccyySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdOptExpMmddccyySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2393); // serialize this field at offset 2393 by default 
    }
    
	/**
	* sets parent for this MsdOptExpMmddccyySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2393 by default
    }    
	/**
	* initializes the field in MsdOptExpMmddccyySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_OPT_EXP_MMDDCCYY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdOptExpMm = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdOptExpDd = getStartOffset() + 2;	// set offset for serialization
  
             beginMsdOptExpCc = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdOptExpYy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdOptExpMmCounter = -1;
     public boolean isMsdOptExpMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOptExpMmCounter != sharedCounter;
         localMsdOptExpMmCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_OPT_EXP_MM_LEN = 2;
	/**
	 * 	serialize this MsdOptExpMm
	 */
   protected void serializeMsdOptExpMm(char[] msdOptExpMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdOptExpMm,0,getStringValue(),beginMsdOptExpMm,MSD_OPT_EXP_MM_LEN);
       localMsdOptExpMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdOptExpMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMsdOptExpMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdOptExpMm() {	 
   		return (substring(getStringValue(),beginMsdOptExpMm,beginMsdOptExpMm + MSD_OPT_EXP_MM_LEN));
   	}
     int localMsdOptExpDdCounter = -1;
     public boolean isMsdOptExpDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOptExpDdCounter != sharedCounter;
         localMsdOptExpDdCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_OPT_EXP_DD_LEN = 2;
	/**
	 * 	serialize this MsdOptExpDd
	 */
   protected void serializeMsdOptExpDd(char[] msdOptExpDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdOptExpDd,0,getStringValue(),beginMsdOptExpDd,MSD_OPT_EXP_DD_LEN);
       localMsdOptExpDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdOptExpDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMsdOptExpDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdOptExpDd() {	 
   		return (substring(getStringValue(),beginMsdOptExpDd,beginMsdOptExpDd + MSD_OPT_EXP_DD_LEN));
   	}
     int localMsdOptExpCcCounter = -1;
     public boolean isMsdOptExpCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOptExpCcCounter != sharedCounter;
         localMsdOptExpCcCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_OPT_EXP_CC_LEN = 2;
	/**
	 * 	serialize this MsdOptExpCc
	 */
   protected void serializeMsdOptExpCc(char[] msdOptExpCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdOptExpCc,0,getStringValue(),beginMsdOptExpCc,MSD_OPT_EXP_CC_LEN);
       localMsdOptExpCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdOptExpCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMsdOptExpCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdOptExpCc() {	 
   		return (substring(getStringValue(),beginMsdOptExpCc,beginMsdOptExpCc + MSD_OPT_EXP_CC_LEN));
   	}
     int localMsdOptExpYyCounter = -1;
     public boolean isMsdOptExpYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOptExpYyCounter != sharedCounter;
         localMsdOptExpYyCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_OPT_EXP_YY_LEN = 2;
	/**
	 * 	serialize this MsdOptExpYy
	 */
   protected void serializeMsdOptExpYy(char[] msdOptExpYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdOptExpYy,0,getStringValue(),beginMsdOptExpYy,MSD_OPT_EXP_YY_LEN);
       localMsdOptExpYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdOptExpYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMsdOptExpYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdOptExpYy() {	 
   		return (substring(getStringValue(),beginMsdOptExpYy,beginMsdOptExpYy + MSD_OPT_EXP_YY_LEN));
   	}




}
  
