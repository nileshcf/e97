package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class CutoffCkpData800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CutoffCkpData800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CutoffCkpData800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CUTOFF_CKP_DATA_800_LENGTH = 182;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCutoffPmtCkp800;
            protected  int beginCutoffPmaCkp800;
            protected  int beginCutoffPalCkp800;
            protected  int beginCutoffTmtCkp800;
            protected  int beginCutoffPmiCkp800;
            protected  int beginCutoffPmapCkp800;
            protected  int beginCutoffPimCkp800;
	
	/**
	* Constructor for CutoffCkpData800Serialized
	**/
    public CutoffCkpData800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CutoffCkpData800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CUTOFF_CKP_DATA_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCutoffPmtCkp800 = getStartOffset() + 0;	// set offset for serialization
  
             beginCutoffPmaCkp800 = getStartOffset() + 26;	// set offset for serialization
  
             beginCutoffPalCkp800 = getStartOffset() + 52;	// set offset for serialization
  
             beginCutoffTmtCkp800 = getStartOffset() + 78;	// set offset for serialization
  
             beginCutoffPmiCkp800 = getStartOffset() + 104;	// set offset for serialization
  
             beginCutoffPmapCkp800 = getStartOffset() + 130;	// set offset for serialization
  
             beginCutoffPimCkp800 = getStartOffset() + 156;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCutoffPmtCkp800Counter = -1;
     public boolean isCutoffPmtCkp800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPmtCkp800Counter != sharedCounter;
         localCutoffPmtCkp800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_PMT_CKP_800_LEN = 26;
	/**
	 * 	serialize this CutoffPmtCkp800
	 */
   protected void serializeCutoffPmtCkp800(char[] cutoffPmtCkp800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffPmtCkp800,0,getStringValue(),beginCutoffPmtCkp800,CUTOFF_PMT_CKP_800_LEN);
       localCutoffPmtCkp800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffPmtCkp800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffPmtCkp800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffPmtCkp800() {	 
   		return (substring(getStringValue(),beginCutoffPmtCkp800,beginCutoffPmtCkp800 + CUTOFF_PMT_CKP_800_LEN));
   	}
     int localCutoffPmaCkp800Counter = -1;
     public boolean isCutoffPmaCkp800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPmaCkp800Counter != sharedCounter;
         localCutoffPmaCkp800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_PMA_CKP_800_LEN = 26;
	/**
	 * 	serialize this CutoffPmaCkp800
	 */
   protected void serializeCutoffPmaCkp800(char[] cutoffPmaCkp800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffPmaCkp800,0,getStringValue(),beginCutoffPmaCkp800,CUTOFF_PMA_CKP_800_LEN);
       localCutoffPmaCkp800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffPmaCkp800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffPmaCkp800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffPmaCkp800() {	 
   		return (substring(getStringValue(),beginCutoffPmaCkp800,beginCutoffPmaCkp800 + CUTOFF_PMA_CKP_800_LEN));
   	}
     int localCutoffPalCkp800Counter = -1;
     public boolean isCutoffPalCkp800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPalCkp800Counter != sharedCounter;
         localCutoffPalCkp800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_PAL_CKP_800_LEN = 26;
	/**
	 * 	serialize this CutoffPalCkp800
	 */
   protected void serializeCutoffPalCkp800(char[] cutoffPalCkp800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffPalCkp800,0,getStringValue(),beginCutoffPalCkp800,CUTOFF_PAL_CKP_800_LEN);
       localCutoffPalCkp800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffPalCkp800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffPalCkp800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffPalCkp800() {	 
   		return (substring(getStringValue(),beginCutoffPalCkp800,beginCutoffPalCkp800 + CUTOFF_PAL_CKP_800_LEN));
   	}
     int localCutoffTmtCkp800Counter = -1;
     public boolean isCutoffTmtCkp800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffTmtCkp800Counter != sharedCounter;
         localCutoffTmtCkp800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_TMT_CKP_800_LEN = 26;
	/**
	 * 	serialize this CutoffTmtCkp800
	 */
   protected void serializeCutoffTmtCkp800(char[] cutoffTmtCkp800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffTmtCkp800,0,getStringValue(),beginCutoffTmtCkp800,CUTOFF_TMT_CKP_800_LEN);
       localCutoffTmtCkp800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffTmtCkp800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffTmtCkp800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffTmtCkp800() {	 
   		return (substring(getStringValue(),beginCutoffTmtCkp800,beginCutoffTmtCkp800 + CUTOFF_TMT_CKP_800_LEN));
   	}
     int localCutoffPmiCkp800Counter = -1;
     public boolean isCutoffPmiCkp800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPmiCkp800Counter != sharedCounter;
         localCutoffPmiCkp800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_PMI_CKP_800_LEN = 26;
	/**
	 * 	serialize this CutoffPmiCkp800
	 */
   protected void serializeCutoffPmiCkp800(char[] cutoffPmiCkp800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffPmiCkp800,0,getStringValue(),beginCutoffPmiCkp800,CUTOFF_PMI_CKP_800_LEN);
       localCutoffPmiCkp800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffPmiCkp800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffPmiCkp800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffPmiCkp800() {	 
   		return (substring(getStringValue(),beginCutoffPmiCkp800,beginCutoffPmiCkp800 + CUTOFF_PMI_CKP_800_LEN));
   	}
     int localCutoffPmapCkp800Counter = -1;
     public boolean isCutoffPmapCkp800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPmapCkp800Counter != sharedCounter;
         localCutoffPmapCkp800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_PMAP_CKP_800_LEN = 26;
	/**
	 * 	serialize this CutoffPmapCkp800
	 */
   protected void serializeCutoffPmapCkp800(char[] cutoffPmapCkp800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffPmapCkp800,0,getStringValue(),beginCutoffPmapCkp800,CUTOFF_PMAP_CKP_800_LEN);
       localCutoffPmapCkp800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffPmapCkp800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffPmapCkp800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffPmapCkp800() {	 
   		return (substring(getStringValue(),beginCutoffPmapCkp800,beginCutoffPmapCkp800 + CUTOFF_PMAP_CKP_800_LEN));
   	}
     int localCutoffPimCkp800Counter = -1;
     public boolean isCutoffPimCkp800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPimCkp800Counter != sharedCounter;
         localCutoffPimCkp800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_PIM_CKP_800_LEN = 26;
	/**
	 * 	serialize this CutoffPimCkp800
	 */
   protected void serializeCutoffPimCkp800(char[] cutoffPimCkp800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffPimCkp800,0,getStringValue(),beginCutoffPimCkp800,CUTOFF_PIM_CKP_800_LEN);
       localCutoffPimCkp800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffPimCkp800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffPimCkp800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffPimCkp800() {	 
   		return (substring(getStringValue(),beginCutoffPimCkp800,beginCutoffPimCkp800 + CUTOFF_PIM_CKP_800_LEN));
   	}




}
  
