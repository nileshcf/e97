package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SpecEntry530Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SpecEntry530Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SpecEntry530Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SPEC_ENTRY_530_LENGTH = 171;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSpecDd530;
            protected  int beginSpecUseCode530;
            protected  int beginSpecStatStatus530;
            protected  int beginSpecIdCode530;
            protected  int beginSpecAtype530;
            protected  int beginSpecUnits530;
            protected  int beginSpecPspace530;
            protected  int beginSpecSspace530;
            protected  int beginSpecLrecl530;
            protected  int beginSpecBlksz530;
            protected  int beginSpecSeqio530;
	
	/**
	* Constructor for SpecEntry530Serialized
	**/
    public SpecEntry530Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SpecEntry530Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SpecEntry530Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SpecEntry530Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SpecEntry530Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SpecEntry530Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SPEC_ENTRY_530_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSpecDd530 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginSpecUseCode530 = getStartOffset() + 60;	// set offset for serialization
  
             beginSpecStatStatus530 = getStartOffset() + 61;	// set offset for serialization
  
             beginSpecIdCode530 = getStartOffset() + 62;	// set offset for serialization
  
             beginSpecAtype530 = getStartOffset() + 63;	// set offset for serialization
  
  
             beginSpecUnits530 = getStartOffset() + 67;	// set offset for serialization
  
             beginSpecPspace530 = getStartOffset() + 71;	// set offset for serialization
  
             beginSpecSspace530 = getStartOffset() + 75;	// set offset for serialization
  
             beginSpecLrecl530 = getStartOffset() + 79;	// set offset for serialization
  
             beginSpecBlksz530 = getStartOffset() + 83;	// set offset for serialization
  
             beginSpecSeqio530 = getStartOffset() + 87;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSpecDd530Counter = -1;
     public boolean isSpecDd530Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpecDd530Counter != sharedCounter;
         localSpecDd530Counter = sharedCounter; return hasModified;
     }
	protected static final int SPEC_DD_530_LEN = 8;
	/**
	 * 	serialize this SpecDd530
	 */
   protected void serializeSpecDd530(char[] specDd530) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(specDd530,0,getStringValue(),beginSpecDd530,SPEC_DD_530_LEN);
       localSpecDd530Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSpecDd530Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSpecDd530 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSpecDd530() {	 
   		return (substring(getStringValue(),beginSpecDd530,beginSpecDd530 + SPEC_DD_530_LEN));
   	}
     int localSpecUseCode530Counter = -1;
     public boolean isSpecUseCode530Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpecUseCode530Counter != sharedCounter;
         localSpecUseCode530Counter = sharedCounter; return hasModified;
     }
	protected static final int SPEC_USE_CODE_530_LEN = 1;
	/**
	 * 	serialize this SpecUseCode530
	 */
   protected void serializeSpecUseCode530(char[] specUseCode530) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(specUseCode530,0,getStringValue(),beginSpecUseCode530,SPEC_USE_CODE_530_LEN);
       localSpecUseCode530Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSpecUseCode530Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSpecUseCode530 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSpecUseCode530() {	 
   		return (substring(getStringValue(),beginSpecUseCode530,beginSpecUseCode530 + SPEC_USE_CODE_530_LEN));
   	}
     int localSpecStatStatus530Counter = -1;
     public boolean isSpecStatStatus530Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpecStatStatus530Counter != sharedCounter;
         localSpecStatStatus530Counter = sharedCounter; return hasModified;
     }
	protected static final int SPEC_STAT_STATUS_530_LEN = 1;
	/**
	 * 	serialize this SpecStatStatus530
	 */
   protected void serializeSpecStatStatus530(char[] specStatStatus530) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(specStatStatus530,0,getStringValue(),beginSpecStatStatus530,SPEC_STAT_STATUS_530_LEN);
       localSpecStatStatus530Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSpecStatStatus530Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSpecStatStatus530 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSpecStatStatus530() {	 
   		return (substring(getStringValue(),beginSpecStatStatus530,beginSpecStatStatus530 + SPEC_STAT_STATUS_530_LEN));
   	}
     int localSpecIdCode530Counter = -1;
     public boolean isSpecIdCode530Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpecIdCode530Counter != sharedCounter;
         localSpecIdCode530Counter = sharedCounter; return hasModified;
     }
	protected static final int SPEC_ID_CODE_530_LEN = 1;
	/**
	 * 	serialize this SpecIdCode530
	 */
   protected void serializeSpecIdCode530(char[] specIdCode530) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(specIdCode530,0,getStringValue(),beginSpecIdCode530,SPEC_ID_CODE_530_LEN);
       localSpecIdCode530Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSpecIdCode530Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSpecIdCode530 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSpecIdCode530() {	 
   		return (substring(getStringValue(),beginSpecIdCode530,beginSpecIdCode530 + SPEC_ID_CODE_530_LEN));
   	}
     int localSpecAtype530Counter = -1;
     public boolean isSpecAtype530Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpecAtype530Counter != sharedCounter;
         localSpecAtype530Counter = sharedCounter; return hasModified;
     }
	protected static final int SPEC_ATYPE_530_LEN = 1;
	/**
	 * 	serialize this SpecAtype530
	 */
   protected void serializeSpecAtype530(char[] specAtype530) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(specAtype530,0,getStringValue(),beginSpecAtype530,SPEC_ATYPE_530_LEN);
       localSpecAtype530Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSpecAtype530Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSpecAtype530 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSpecAtype530() {	 
   		return (substring(getStringValue(),beginSpecAtype530,beginSpecAtype530 + SPEC_ATYPE_530_LEN));
   	}
         int localSpecUnits530Counter = -1;
         public boolean isSpecUnits530Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSpecUnits530Counter != sharedCounter;
            localSpecUnits530Counter = sharedCounter; return hasModified; 
         }
   protected static final int SPEC_UNITS_530_LEN = 4;
  	/**
	 * serializeSpecUnits530
	 */
	protected void serializeSpecUnits530(int specUnits530) {
           replaceValue( //  save the value as string
                   getBinaryString( specUnits530,SPEC_UNITS_530_LEN)
                  ,beginSpecUnits530
                  ,SPEC_UNITS_530_LEN
                 );
            localSpecUnits530Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSpecUnits530MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSpecUnits530 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSpecUnits530() {	 
			return (getInt(beginSpecUnits530));
   	}
         int localSpecPspace530Counter = -1;
         public boolean isSpecPspace530Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSpecPspace530Counter != sharedCounter;
            localSpecPspace530Counter = sharedCounter; return hasModified; 
         }
   protected static final int SPEC_PSPACE_530_LEN = 4;
  	/**
	 * serializeSpecPspace530
	 */
	protected void serializeSpecPspace530(int specPspace530) {
           replaceValue( //  save the value as string
                   getBinaryString( specPspace530,SPEC_PSPACE_530_LEN)
                  ,beginSpecPspace530
                  ,SPEC_PSPACE_530_LEN
                 );
            localSpecPspace530Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSpecPspace530MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSpecPspace530 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSpecPspace530() {	 
			return (getInt(beginSpecPspace530));
   	}
         int localSpecSspace530Counter = -1;
         public boolean isSpecSspace530Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSpecSspace530Counter != sharedCounter;
            localSpecSspace530Counter = sharedCounter; return hasModified; 
         }
   protected static final int SPEC_SSPACE_530_LEN = 4;
  	/**
	 * serializeSpecSspace530
	 */
	protected void serializeSpecSspace530(int specSspace530) {
           replaceValue( //  save the value as string
                   getBinaryString( specSspace530,SPEC_SSPACE_530_LEN)
                  ,beginSpecSspace530
                  ,SPEC_SSPACE_530_LEN
                 );
            localSpecSspace530Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSpecSspace530MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSpecSspace530 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSpecSspace530() {	 
			return (getInt(beginSpecSspace530));
   	}
         int localSpecLrecl530Counter = -1;
         public boolean isSpecLrecl530Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSpecLrecl530Counter != sharedCounter;
            localSpecLrecl530Counter = sharedCounter; return hasModified; 
         }
   protected static final int SPEC_LRECL_530_LEN = 4;
  	/**
	 * serializeSpecLrecl530
	 */
	protected void serializeSpecLrecl530(int specLrecl530) {
           replaceValue( //  save the value as string
                   getBinaryString( specLrecl530,SPEC_LRECL_530_LEN)
                  ,beginSpecLrecl530
                  ,SPEC_LRECL_530_LEN
                 );
            localSpecLrecl530Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSpecLrecl530MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSpecLrecl530 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSpecLrecl530() {	 
			return (getInt(beginSpecLrecl530));
   	}
         int localSpecBlksz530Counter = -1;
         public boolean isSpecBlksz530Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSpecBlksz530Counter != sharedCounter;
            localSpecBlksz530Counter = sharedCounter; return hasModified; 
         }
   protected static final int SPEC_BLKSZ_530_LEN = 4;
  	/**
	 * serializeSpecBlksz530
	 */
	protected void serializeSpecBlksz530(int specBlksz530) {
           replaceValue( //  save the value as string
                   getBinaryString( specBlksz530,SPEC_BLKSZ_530_LEN)
                  ,beginSpecBlksz530
                  ,SPEC_BLKSZ_530_LEN
                 );
            localSpecBlksz530Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSpecBlksz530MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSpecBlksz530 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSpecBlksz530() {	 
			return (getInt(beginSpecBlksz530));
   	}
     int localSpecSeqio530Counter = -1;
     public boolean isSpecSeqio530Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpecSeqio530Counter != sharedCounter;
         localSpecSeqio530Counter = sharedCounter; return hasModified;
     }
	protected static final int SPEC_SEQIO_530_LEN = 84;
	/**
	 * 	serialize this SpecSeqio530
	 */
   protected void serializeSpecSeqio530(char[] specSeqio530) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(specSeqio530,0,getStringValue(),beginSpecSeqio530,SPEC_SEQIO_530_LEN);
       localSpecSeqio530Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSpecSeqio530Constraints(char[] value) {
   			return super.checkConstraints(value , 84 ,false, false);
   }
    /**
	 *	refreshSpecSeqio530 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSpecSeqio530() {	 
   		return (substring(getStringValue(),beginSpecSeqio530,beginSpecSeqio530 + SPEC_SEQIO_530_LEN));
   	}




}
  
