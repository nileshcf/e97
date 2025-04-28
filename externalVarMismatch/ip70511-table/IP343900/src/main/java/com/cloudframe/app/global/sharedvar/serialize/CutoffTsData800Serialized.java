package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class CutoffTsData800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CutoffTsData800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CutoffTsData800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CUTOFF_TS_DATA_800_LENGTH = 182;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCutoffPmtBegin800;
            protected  int beginCutoffPmaBegin800;
            protected  int beginCutoffPalBegin800;
            protected  int beginCutoffTmtBegin800;
            protected  int beginCutoffPmiBegin800;
            protected  int beginCutoffPmapBegin800;
            protected  int beginCutoffPimBegin800;
	
	/**
	* Constructor for CutoffTsData800Serialized
	**/
    public CutoffTsData800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in CutoffTsData800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CUTOFF_TS_DATA_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCutoffPmtBegin800 = getStartOffset() + 0;	// set offset for serialization
  
             beginCutoffPmaBegin800 = getStartOffset() + 26;	// set offset for serialization
  
             beginCutoffPalBegin800 = getStartOffset() + 52;	// set offset for serialization
  
             beginCutoffTmtBegin800 = getStartOffset() + 78;	// set offset for serialization
  
             beginCutoffPmiBegin800 = getStartOffset() + 104;	// set offset for serialization
  
             beginCutoffPmapBegin800 = getStartOffset() + 130;	// set offset for serialization
  
             beginCutoffPimBegin800 = getStartOffset() + 156;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCutoffPmtBegin800Counter = -1;
     public boolean isCutoffPmtBegin800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPmtBegin800Counter != sharedCounter;
         localCutoffPmtBegin800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_PMT_BEGIN_800_LEN = 26;
	/**
	 * 	serialize this CutoffPmtBegin800
	 */
   protected void serializeCutoffPmtBegin800(char[] cutoffPmtBegin800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffPmtBegin800,0,getStringValue(),beginCutoffPmtBegin800,CUTOFF_PMT_BEGIN_800_LEN);
       localCutoffPmtBegin800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffPmtBegin800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffPmtBegin800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffPmtBegin800() {	 
   		return (substring(getStringValue(),beginCutoffPmtBegin800,beginCutoffPmtBegin800 + CUTOFF_PMT_BEGIN_800_LEN));
   	}
     int localCutoffPmaBegin800Counter = -1;
     public boolean isCutoffPmaBegin800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPmaBegin800Counter != sharedCounter;
         localCutoffPmaBegin800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_PMA_BEGIN_800_LEN = 26;
	/**
	 * 	serialize this CutoffPmaBegin800
	 */
   protected void serializeCutoffPmaBegin800(char[] cutoffPmaBegin800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffPmaBegin800,0,getStringValue(),beginCutoffPmaBegin800,CUTOFF_PMA_BEGIN_800_LEN);
       localCutoffPmaBegin800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffPmaBegin800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffPmaBegin800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffPmaBegin800() {	 
   		return (substring(getStringValue(),beginCutoffPmaBegin800,beginCutoffPmaBegin800 + CUTOFF_PMA_BEGIN_800_LEN));
   	}
     int localCutoffPalBegin800Counter = -1;
     public boolean isCutoffPalBegin800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPalBegin800Counter != sharedCounter;
         localCutoffPalBegin800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_PAL_BEGIN_800_LEN = 26;
	/**
	 * 	serialize this CutoffPalBegin800
	 */
   protected void serializeCutoffPalBegin800(char[] cutoffPalBegin800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffPalBegin800,0,getStringValue(),beginCutoffPalBegin800,CUTOFF_PAL_BEGIN_800_LEN);
       localCutoffPalBegin800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffPalBegin800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffPalBegin800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffPalBegin800() {	 
   		return (substring(getStringValue(),beginCutoffPalBegin800,beginCutoffPalBegin800 + CUTOFF_PAL_BEGIN_800_LEN));
   	}
     int localCutoffTmtBegin800Counter = -1;
     public boolean isCutoffTmtBegin800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffTmtBegin800Counter != sharedCounter;
         localCutoffTmtBegin800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_TMT_BEGIN_800_LEN = 26;
	/**
	 * 	serialize this CutoffTmtBegin800
	 */
   protected void serializeCutoffTmtBegin800(char[] cutoffTmtBegin800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffTmtBegin800,0,getStringValue(),beginCutoffTmtBegin800,CUTOFF_TMT_BEGIN_800_LEN);
       localCutoffTmtBegin800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffTmtBegin800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffTmtBegin800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffTmtBegin800() {	 
   		return (substring(getStringValue(),beginCutoffTmtBegin800,beginCutoffTmtBegin800 + CUTOFF_TMT_BEGIN_800_LEN));
   	}
     int localCutoffPmiBegin800Counter = -1;
     public boolean isCutoffPmiBegin800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPmiBegin800Counter != sharedCounter;
         localCutoffPmiBegin800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_PMI_BEGIN_800_LEN = 26;
	/**
	 * 	serialize this CutoffPmiBegin800
	 */
   protected void serializeCutoffPmiBegin800(char[] cutoffPmiBegin800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffPmiBegin800,0,getStringValue(),beginCutoffPmiBegin800,CUTOFF_PMI_BEGIN_800_LEN);
       localCutoffPmiBegin800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffPmiBegin800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffPmiBegin800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffPmiBegin800() {	 
   		return (substring(getStringValue(),beginCutoffPmiBegin800,beginCutoffPmiBegin800 + CUTOFF_PMI_BEGIN_800_LEN));
   	}
     int localCutoffPmapBegin800Counter = -1;
     public boolean isCutoffPmapBegin800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPmapBegin800Counter != sharedCounter;
         localCutoffPmapBegin800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_PMAP_BEGIN_800_LEN = 26;
	/**
	 * 	serialize this CutoffPmapBegin800
	 */
   protected void serializeCutoffPmapBegin800(char[] cutoffPmapBegin800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffPmapBegin800,0,getStringValue(),beginCutoffPmapBegin800,CUTOFF_PMAP_BEGIN_800_LEN);
       localCutoffPmapBegin800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffPmapBegin800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffPmapBegin800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffPmapBegin800() {	 
   		return (substring(getStringValue(),beginCutoffPmapBegin800,beginCutoffPmapBegin800 + CUTOFF_PMAP_BEGIN_800_LEN));
   	}
     int localCutoffPimBegin800Counter = -1;
     public boolean isCutoffPimBegin800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPimBegin800Counter != sharedCounter;
         localCutoffPimBegin800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUTOFF_PIM_BEGIN_800_LEN = 26;
	/**
	 * 	serialize this CutoffPimBegin800
	 */
   protected void serializeCutoffPimBegin800(char[] cutoffPimBegin800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cutoffPimBegin800,0,getStringValue(),beginCutoffPimBegin800,CUTOFF_PIM_BEGIN_800_LEN);
       localCutoffPimBegin800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCutoffPimBegin800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCutoffPimBegin800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCutoffPimBegin800() {	 
   		return (substring(getStringValue(),beginCutoffPimBegin800,beginCutoffPimBegin800 + CUTOFF_PIM_BEGIN_800_LEN));
   	}




}
  
