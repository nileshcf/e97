package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln12Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln12Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln12Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_12_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt312Cc;
            protected  int beginDt312AcqvatFicnt;
            protected  int beginDt312AcqvatFiamt;
            protected  int beginDt312AcqvatFiind;
            protected  int beginDt312AcqvatFvamt;
            protected  int beginDt312AcqvatFvind;
            protected  int beginDt312AcqvatNicnt;
            protected  int beginDt312AcqvatNiamt;
            protected  int beginDt312AcqvatNiind;
            protected  int beginDt312AcqvatNvamt;
            protected  int beginDt312AcqvatNvind;
            protected  int beginDt312AcqvatTicnt;
            protected  int beginDt312AcqvatTiamt;
            protected  int beginDt312AcqvatTiind;
            protected  int beginDt312AcqvatTvamt;
            protected  int beginDt312AcqvatTvind;
	
	/**
	* Constructor for DtPage3Ln12Serialized
	**/
    public DtPage3Ln12Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln12Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_12_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt312Cc = getStartOffset() + 0;	// set offset for serialization
  
             beginDt312AcqvatFicnt = getStartOffset() + 1;	// set offset for serialization
  
  
             beginDt312AcqvatFiamt = getStartOffset() + 13;	// set offset for serialization
  
             beginDt312AcqvatFiind = getStartOffset() + 29;	// set offset for serialization
  
             beginDt312AcqvatFvamt = getStartOffset() + 31;	// set offset for serialization
  
             beginDt312AcqvatFvind = getStartOffset() + 42;	// set offset for serialization
  
  
             beginDt312AcqvatNicnt = getStartOffset() + 46;	// set offset for serialization
  
             beginDt312AcqvatNiamt = getStartOffset() + 57;	// set offset for serialization
  
             beginDt312AcqvatNiind = getStartOffset() + 73;	// set offset for serialization
  
             beginDt312AcqvatNvamt = getStartOffset() + 75;	// set offset for serialization
  
             beginDt312AcqvatNvind = getStartOffset() + 86;	// set offset for serialization
  
  
             beginDt312AcqvatTicnt = getStartOffset() + 90;	// set offset for serialization
  
             beginDt312AcqvatTiamt = getStartOffset() + 101;	// set offset for serialization
  
             beginDt312AcqvatTiind = getStartOffset() + 117;	// set offset for serialization
  
             beginDt312AcqvatTvamt = getStartOffset() + 119;	// set offset for serialization
  
             beginDt312AcqvatTvind = getStartOffset() + 130;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt312CcCounter = -1;
     public boolean isDt312CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312CcCounter != sharedCounter;
         localDt312CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_CC_LEN = 1;
	/**
	 * 	serialize this Dt312Cc
	 */
   protected void serializeDt312Cc(char[] dt312Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312Cc,0,getStringValue(),beginDt312Cc,DT_312_CC_LEN);
       localDt312CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt312Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312Cc() {	 
   		return (substring(getStringValue(),beginDt312Cc,beginDt312Cc + DT_312_CC_LEN));
   	}
     int localDt312AcqvatFicntCounter = -1;
     public boolean isDt312AcqvatFicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatFicntCounter != sharedCounter;
         localDt312AcqvatFicntCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_FICNT_LEN = 11;
	/**
	 * 	serialize this Dt312AcqvatFicnt
	 */
   protected void serializeDt312AcqvatFicnt(char[] dt312AcqvatFicnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatFicnt,0,getStringValue(),beginDt312AcqvatFicnt,DT_312_ACQVAT_FICNT_LEN);
       localDt312AcqvatFicntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatFicntConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatFicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatFicnt() {	 
   		return (substring(getStringValue(),beginDt312AcqvatFicnt,beginDt312AcqvatFicnt + DT_312_ACQVAT_FICNT_LEN));
   	}
     int localDt312AcqvatFiamtCounter = -1;
     public boolean isDt312AcqvatFiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatFiamtCounter != sharedCounter;
         localDt312AcqvatFiamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_FIAMT_LEN = 16;
	/**
	 * 	serialize this Dt312AcqvatFiamt
	 */
   protected void serializeDt312AcqvatFiamt(char[] dt312AcqvatFiamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatFiamt,0,getStringValue(),beginDt312AcqvatFiamt,DT_312_ACQVAT_FIAMT_LEN);
       localDt312AcqvatFiamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatFiamtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatFiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatFiamt() {	 
   		return (substring(getStringValue(),beginDt312AcqvatFiamt,beginDt312AcqvatFiamt + DT_312_ACQVAT_FIAMT_LEN));
   	}
     int localDt312AcqvatFiindCounter = -1;
     public boolean isDt312AcqvatFiindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatFiindCounter != sharedCounter;
         localDt312AcqvatFiindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_FIIND_LEN = 2;
	/**
	 * 	serialize this Dt312AcqvatFiind
	 */
   protected void serializeDt312AcqvatFiind(char[] dt312AcqvatFiind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatFiind,0,getStringValue(),beginDt312AcqvatFiind,DT_312_ACQVAT_FIIND_LEN);
       localDt312AcqvatFiindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatFiindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatFiind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatFiind() {	 
   		return (substring(getStringValue(),beginDt312AcqvatFiind,beginDt312AcqvatFiind + DT_312_ACQVAT_FIIND_LEN));
   	}
     int localDt312AcqvatFvamtCounter = -1;
     public boolean isDt312AcqvatFvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatFvamtCounter != sharedCounter;
         localDt312AcqvatFvamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_FVAMT_LEN = 11;
	/**
	 * 	serialize this Dt312AcqvatFvamt
	 */
   protected void serializeDt312AcqvatFvamt(char[] dt312AcqvatFvamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatFvamt,0,getStringValue(),beginDt312AcqvatFvamt,DT_312_ACQVAT_FVAMT_LEN);
       localDt312AcqvatFvamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatFvamtConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatFvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatFvamt() {	 
   		return (substring(getStringValue(),beginDt312AcqvatFvamt,beginDt312AcqvatFvamt + DT_312_ACQVAT_FVAMT_LEN));
   	}
     int localDt312AcqvatFvindCounter = -1;
     public boolean isDt312AcqvatFvindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatFvindCounter != sharedCounter;
         localDt312AcqvatFvindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_FVIND_LEN = 2;
	/**
	 * 	serialize this Dt312AcqvatFvind
	 */
   protected void serializeDt312AcqvatFvind(char[] dt312AcqvatFvind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatFvind,0,getStringValue(),beginDt312AcqvatFvind,DT_312_ACQVAT_FVIND_LEN);
       localDt312AcqvatFvindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatFvindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatFvind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatFvind() {	 
   		return (substring(getStringValue(),beginDt312AcqvatFvind,beginDt312AcqvatFvind + DT_312_ACQVAT_FVIND_LEN));
   	}
     int localDt312AcqvatNicntCounter = -1;
     public boolean isDt312AcqvatNicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatNicntCounter != sharedCounter;
         localDt312AcqvatNicntCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_NICNT_LEN = 11;
	/**
	 * 	serialize this Dt312AcqvatNicnt
	 */
   protected void serializeDt312AcqvatNicnt(char[] dt312AcqvatNicnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatNicnt,0,getStringValue(),beginDt312AcqvatNicnt,DT_312_ACQVAT_NICNT_LEN);
       localDt312AcqvatNicntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatNicntConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatNicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatNicnt() {	 
   		return (substring(getStringValue(),beginDt312AcqvatNicnt,beginDt312AcqvatNicnt + DT_312_ACQVAT_NICNT_LEN));
   	}
     int localDt312AcqvatNiamtCounter = -1;
     public boolean isDt312AcqvatNiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatNiamtCounter != sharedCounter;
         localDt312AcqvatNiamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_NIAMT_LEN = 16;
	/**
	 * 	serialize this Dt312AcqvatNiamt
	 */
   protected void serializeDt312AcqvatNiamt(char[] dt312AcqvatNiamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatNiamt,0,getStringValue(),beginDt312AcqvatNiamt,DT_312_ACQVAT_NIAMT_LEN);
       localDt312AcqvatNiamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatNiamtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatNiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatNiamt() {	 
   		return (substring(getStringValue(),beginDt312AcqvatNiamt,beginDt312AcqvatNiamt + DT_312_ACQVAT_NIAMT_LEN));
   	}
     int localDt312AcqvatNiindCounter = -1;
     public boolean isDt312AcqvatNiindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatNiindCounter != sharedCounter;
         localDt312AcqvatNiindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_NIIND_LEN = 2;
	/**
	 * 	serialize this Dt312AcqvatNiind
	 */
   protected void serializeDt312AcqvatNiind(char[] dt312AcqvatNiind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatNiind,0,getStringValue(),beginDt312AcqvatNiind,DT_312_ACQVAT_NIIND_LEN);
       localDt312AcqvatNiindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatNiindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatNiind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatNiind() {	 
   		return (substring(getStringValue(),beginDt312AcqvatNiind,beginDt312AcqvatNiind + DT_312_ACQVAT_NIIND_LEN));
   	}
     int localDt312AcqvatNvamtCounter = -1;
     public boolean isDt312AcqvatNvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatNvamtCounter != sharedCounter;
         localDt312AcqvatNvamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_NVAMT_LEN = 11;
	/**
	 * 	serialize this Dt312AcqvatNvamt
	 */
   protected void serializeDt312AcqvatNvamt(char[] dt312AcqvatNvamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatNvamt,0,getStringValue(),beginDt312AcqvatNvamt,DT_312_ACQVAT_NVAMT_LEN);
       localDt312AcqvatNvamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatNvamtConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatNvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatNvamt() {	 
   		return (substring(getStringValue(),beginDt312AcqvatNvamt,beginDt312AcqvatNvamt + DT_312_ACQVAT_NVAMT_LEN));
   	}
     int localDt312AcqvatNvindCounter = -1;
     public boolean isDt312AcqvatNvindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatNvindCounter != sharedCounter;
         localDt312AcqvatNvindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_NVIND_LEN = 2;
	/**
	 * 	serialize this Dt312AcqvatNvind
	 */
   protected void serializeDt312AcqvatNvind(char[] dt312AcqvatNvind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatNvind,0,getStringValue(),beginDt312AcqvatNvind,DT_312_ACQVAT_NVIND_LEN);
       localDt312AcqvatNvindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatNvindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatNvind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatNvind() {	 
   		return (substring(getStringValue(),beginDt312AcqvatNvind,beginDt312AcqvatNvind + DT_312_ACQVAT_NVIND_LEN));
   	}
     int localDt312AcqvatTicntCounter = -1;
     public boolean isDt312AcqvatTicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatTicntCounter != sharedCounter;
         localDt312AcqvatTicntCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_TICNT_LEN = 11;
	/**
	 * 	serialize this Dt312AcqvatTicnt
	 */
   protected void serializeDt312AcqvatTicnt(char[] dt312AcqvatTicnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatTicnt,0,getStringValue(),beginDt312AcqvatTicnt,DT_312_ACQVAT_TICNT_LEN);
       localDt312AcqvatTicntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatTicntConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatTicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatTicnt() {	 
   		return (substring(getStringValue(),beginDt312AcqvatTicnt,beginDt312AcqvatTicnt + DT_312_ACQVAT_TICNT_LEN));
   	}
     int localDt312AcqvatTiamtCounter = -1;
     public boolean isDt312AcqvatTiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatTiamtCounter != sharedCounter;
         localDt312AcqvatTiamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_TIAMT_LEN = 16;
	/**
	 * 	serialize this Dt312AcqvatTiamt
	 */
   protected void serializeDt312AcqvatTiamt(char[] dt312AcqvatTiamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatTiamt,0,getStringValue(),beginDt312AcqvatTiamt,DT_312_ACQVAT_TIAMT_LEN);
       localDt312AcqvatTiamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatTiamtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatTiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatTiamt() {	 
   		return (substring(getStringValue(),beginDt312AcqvatTiamt,beginDt312AcqvatTiamt + DT_312_ACQVAT_TIAMT_LEN));
   	}
     int localDt312AcqvatTiindCounter = -1;
     public boolean isDt312AcqvatTiindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatTiindCounter != sharedCounter;
         localDt312AcqvatTiindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_TIIND_LEN = 2;
	/**
	 * 	serialize this Dt312AcqvatTiind
	 */
   protected void serializeDt312AcqvatTiind(char[] dt312AcqvatTiind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatTiind,0,getStringValue(),beginDt312AcqvatTiind,DT_312_ACQVAT_TIIND_LEN);
       localDt312AcqvatTiindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatTiindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatTiind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatTiind() {	 
   		return (substring(getStringValue(),beginDt312AcqvatTiind,beginDt312AcqvatTiind + DT_312_ACQVAT_TIIND_LEN));
   	}
     int localDt312AcqvatTvamtCounter = -1;
     public boolean isDt312AcqvatTvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatTvamtCounter != sharedCounter;
         localDt312AcqvatTvamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_TVAMT_LEN = 11;
	/**
	 * 	serialize this Dt312AcqvatTvamt
	 */
   protected void serializeDt312AcqvatTvamt(char[] dt312AcqvatTvamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatTvamt,0,getStringValue(),beginDt312AcqvatTvamt,DT_312_ACQVAT_TVAMT_LEN);
       localDt312AcqvatTvamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatTvamtConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatTvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatTvamt() {	 
   		return (substring(getStringValue(),beginDt312AcqvatTvamt,beginDt312AcqvatTvamt + DT_312_ACQVAT_TVAMT_LEN));
   	}
     int localDt312AcqvatTvindCounter = -1;
     public boolean isDt312AcqvatTvindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt312AcqvatTvindCounter != sharedCounter;
         localDt312AcqvatTvindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_312_ACQVAT_TVIND_LEN = 2;
	/**
	 * 	serialize this Dt312AcqvatTvind
	 */
   protected void serializeDt312AcqvatTvind(char[] dt312AcqvatTvind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt312AcqvatTvind,0,getStringValue(),beginDt312AcqvatTvind,DT_312_ACQVAT_TVIND_LEN);
       localDt312AcqvatTvindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt312AcqvatTvindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt312AcqvatTvind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt312AcqvatTvind() {	 
   		return (substring(getStringValue(),beginDt312AcqvatTvind,beginDt312AcqvatTvind + DT_312_ACQVAT_TVIND_LEN));
   	}




}
  
