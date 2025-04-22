package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln13Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln13Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln13Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_13_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt313Cc;
            protected  int beginDt313IssvatFicnt;
            protected  int beginDt313IssvatFiamt;
            protected  int beginDt313IssvatFiind;
            protected  int beginDt313IssvatFvamt;
            protected  int beginDt313IssvatFvind;
            protected  int beginDt313IssvatNicnt;
            protected  int beginDt313IssvatNiamt;
            protected  int beginDt313IssvatNiind;
            protected  int beginDt313IssvatNvamt;
            protected  int beginDt313IssvatNvind;
            protected  int beginDt313IssvatTicnt;
            protected  int beginDt313IssvatTiamt;
            protected  int beginDt313IssvatTiind;
            protected  int beginDt313IssvatTvamt;
            protected  int beginDt313IssvatTvind;
	
	/**
	* Constructor for DtPage3Ln13Serialized
	**/
    public DtPage3Ln13Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln13Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_13_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt313Cc = getStartOffset() + 0;	// set offset for serialization
  
             beginDt313IssvatFicnt = getStartOffset() + 1;	// set offset for serialization
  
  
             beginDt313IssvatFiamt = getStartOffset() + 13;	// set offset for serialization
  
             beginDt313IssvatFiind = getStartOffset() + 29;	// set offset for serialization
  
             beginDt313IssvatFvamt = getStartOffset() + 31;	// set offset for serialization
  
             beginDt313IssvatFvind = getStartOffset() + 42;	// set offset for serialization
  
  
             beginDt313IssvatNicnt = getStartOffset() + 46;	// set offset for serialization
  
             beginDt313IssvatNiamt = getStartOffset() + 57;	// set offset for serialization
  
             beginDt313IssvatNiind = getStartOffset() + 73;	// set offset for serialization
  
             beginDt313IssvatNvamt = getStartOffset() + 75;	// set offset for serialization
  
             beginDt313IssvatNvind = getStartOffset() + 86;	// set offset for serialization
  
  
             beginDt313IssvatTicnt = getStartOffset() + 90;	// set offset for serialization
  
             beginDt313IssvatTiamt = getStartOffset() + 101;	// set offset for serialization
  
             beginDt313IssvatTiind = getStartOffset() + 117;	// set offset for serialization
  
             beginDt313IssvatTvamt = getStartOffset() + 119;	// set offset for serialization
  
             beginDt313IssvatTvind = getStartOffset() + 130;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt313CcCounter = -1;
     public boolean isDt313CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313CcCounter != sharedCounter;
         localDt313CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_CC_LEN = 1;
	/**
	 * 	serialize this Dt313Cc
	 */
   protected void serializeDt313Cc(char[] dt313Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313Cc,0,getStringValue(),beginDt313Cc,DT_313_CC_LEN);
       localDt313CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt313Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313Cc() {	 
   		return (substring(getStringValue(),beginDt313Cc,beginDt313Cc + DT_313_CC_LEN));
   	}
     int localDt313IssvatFicntCounter = -1;
     public boolean isDt313IssvatFicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatFicntCounter != sharedCounter;
         localDt313IssvatFicntCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_FICNT_LEN = 11;
	/**
	 * 	serialize this Dt313IssvatFicnt
	 */
   protected void serializeDt313IssvatFicnt(char[] dt313IssvatFicnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatFicnt,0,getStringValue(),beginDt313IssvatFicnt,DT_313_ISSVAT_FICNT_LEN);
       localDt313IssvatFicntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatFicntConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt313IssvatFicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatFicnt() {	 
   		return (substring(getStringValue(),beginDt313IssvatFicnt,beginDt313IssvatFicnt + DT_313_ISSVAT_FICNT_LEN));
   	}
     int localDt313IssvatFiamtCounter = -1;
     public boolean isDt313IssvatFiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatFiamtCounter != sharedCounter;
         localDt313IssvatFiamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_FIAMT_LEN = 16;
	/**
	 * 	serialize this Dt313IssvatFiamt
	 */
   protected void serializeDt313IssvatFiamt(char[] dt313IssvatFiamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatFiamt,0,getStringValue(),beginDt313IssvatFiamt,DT_313_ISSVAT_FIAMT_LEN);
       localDt313IssvatFiamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatFiamtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDt313IssvatFiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatFiamt() {	 
   		return (substring(getStringValue(),beginDt313IssvatFiamt,beginDt313IssvatFiamt + DT_313_ISSVAT_FIAMT_LEN));
   	}
     int localDt313IssvatFiindCounter = -1;
     public boolean isDt313IssvatFiindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatFiindCounter != sharedCounter;
         localDt313IssvatFiindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_FIIND_LEN = 2;
	/**
	 * 	serialize this Dt313IssvatFiind
	 */
   protected void serializeDt313IssvatFiind(char[] dt313IssvatFiind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatFiind,0,getStringValue(),beginDt313IssvatFiind,DT_313_ISSVAT_FIIND_LEN);
       localDt313IssvatFiindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatFiindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt313IssvatFiind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatFiind() {	 
   		return (substring(getStringValue(),beginDt313IssvatFiind,beginDt313IssvatFiind + DT_313_ISSVAT_FIIND_LEN));
   	}
     int localDt313IssvatFvamtCounter = -1;
     public boolean isDt313IssvatFvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatFvamtCounter != sharedCounter;
         localDt313IssvatFvamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_FVAMT_LEN = 11;
	/**
	 * 	serialize this Dt313IssvatFvamt
	 */
   protected void serializeDt313IssvatFvamt(char[] dt313IssvatFvamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatFvamt,0,getStringValue(),beginDt313IssvatFvamt,DT_313_ISSVAT_FVAMT_LEN);
       localDt313IssvatFvamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatFvamtConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt313IssvatFvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatFvamt() {	 
   		return (substring(getStringValue(),beginDt313IssvatFvamt,beginDt313IssvatFvamt + DT_313_ISSVAT_FVAMT_LEN));
   	}
     int localDt313IssvatFvindCounter = -1;
     public boolean isDt313IssvatFvindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatFvindCounter != sharedCounter;
         localDt313IssvatFvindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_FVIND_LEN = 2;
	/**
	 * 	serialize this Dt313IssvatFvind
	 */
   protected void serializeDt313IssvatFvind(char[] dt313IssvatFvind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatFvind,0,getStringValue(),beginDt313IssvatFvind,DT_313_ISSVAT_FVIND_LEN);
       localDt313IssvatFvindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatFvindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt313IssvatFvind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatFvind() {	 
   		return (substring(getStringValue(),beginDt313IssvatFvind,beginDt313IssvatFvind + DT_313_ISSVAT_FVIND_LEN));
   	}
     int localDt313IssvatNicntCounter = -1;
     public boolean isDt313IssvatNicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatNicntCounter != sharedCounter;
         localDt313IssvatNicntCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_NICNT_LEN = 11;
	/**
	 * 	serialize this Dt313IssvatNicnt
	 */
   protected void serializeDt313IssvatNicnt(char[] dt313IssvatNicnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatNicnt,0,getStringValue(),beginDt313IssvatNicnt,DT_313_ISSVAT_NICNT_LEN);
       localDt313IssvatNicntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatNicntConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt313IssvatNicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatNicnt() {	 
   		return (substring(getStringValue(),beginDt313IssvatNicnt,beginDt313IssvatNicnt + DT_313_ISSVAT_NICNT_LEN));
   	}
     int localDt313IssvatNiamtCounter = -1;
     public boolean isDt313IssvatNiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatNiamtCounter != sharedCounter;
         localDt313IssvatNiamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_NIAMT_LEN = 16;
	/**
	 * 	serialize this Dt313IssvatNiamt
	 */
   protected void serializeDt313IssvatNiamt(char[] dt313IssvatNiamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatNiamt,0,getStringValue(),beginDt313IssvatNiamt,DT_313_ISSVAT_NIAMT_LEN);
       localDt313IssvatNiamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatNiamtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDt313IssvatNiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatNiamt() {	 
   		return (substring(getStringValue(),beginDt313IssvatNiamt,beginDt313IssvatNiamt + DT_313_ISSVAT_NIAMT_LEN));
   	}
     int localDt313IssvatNiindCounter = -1;
     public boolean isDt313IssvatNiindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatNiindCounter != sharedCounter;
         localDt313IssvatNiindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_NIIND_LEN = 2;
	/**
	 * 	serialize this Dt313IssvatNiind
	 */
   protected void serializeDt313IssvatNiind(char[] dt313IssvatNiind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatNiind,0,getStringValue(),beginDt313IssvatNiind,DT_313_ISSVAT_NIIND_LEN);
       localDt313IssvatNiindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatNiindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt313IssvatNiind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatNiind() {	 
   		return (substring(getStringValue(),beginDt313IssvatNiind,beginDt313IssvatNiind + DT_313_ISSVAT_NIIND_LEN));
   	}
     int localDt313IssvatNvamtCounter = -1;
     public boolean isDt313IssvatNvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatNvamtCounter != sharedCounter;
         localDt313IssvatNvamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_NVAMT_LEN = 11;
	/**
	 * 	serialize this Dt313IssvatNvamt
	 */
   protected void serializeDt313IssvatNvamt(char[] dt313IssvatNvamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatNvamt,0,getStringValue(),beginDt313IssvatNvamt,DT_313_ISSVAT_NVAMT_LEN);
       localDt313IssvatNvamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatNvamtConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt313IssvatNvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatNvamt() {	 
   		return (substring(getStringValue(),beginDt313IssvatNvamt,beginDt313IssvatNvamt + DT_313_ISSVAT_NVAMT_LEN));
   	}
     int localDt313IssvatNvindCounter = -1;
     public boolean isDt313IssvatNvindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatNvindCounter != sharedCounter;
         localDt313IssvatNvindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_NVIND_LEN = 2;
	/**
	 * 	serialize this Dt313IssvatNvind
	 */
   protected void serializeDt313IssvatNvind(char[] dt313IssvatNvind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatNvind,0,getStringValue(),beginDt313IssvatNvind,DT_313_ISSVAT_NVIND_LEN);
       localDt313IssvatNvindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatNvindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt313IssvatNvind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatNvind() {	 
   		return (substring(getStringValue(),beginDt313IssvatNvind,beginDt313IssvatNvind + DT_313_ISSVAT_NVIND_LEN));
   	}
     int localDt313IssvatTicntCounter = -1;
     public boolean isDt313IssvatTicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatTicntCounter != sharedCounter;
         localDt313IssvatTicntCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_TICNT_LEN = 11;
	/**
	 * 	serialize this Dt313IssvatTicnt
	 */
   protected void serializeDt313IssvatTicnt(char[] dt313IssvatTicnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatTicnt,0,getStringValue(),beginDt313IssvatTicnt,DT_313_ISSVAT_TICNT_LEN);
       localDt313IssvatTicntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatTicntConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt313IssvatTicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatTicnt() {	 
   		return (substring(getStringValue(),beginDt313IssvatTicnt,beginDt313IssvatTicnt + DT_313_ISSVAT_TICNT_LEN));
   	}
     int localDt313IssvatTiamtCounter = -1;
     public boolean isDt313IssvatTiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatTiamtCounter != sharedCounter;
         localDt313IssvatTiamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_TIAMT_LEN = 16;
	/**
	 * 	serialize this Dt313IssvatTiamt
	 */
   protected void serializeDt313IssvatTiamt(char[] dt313IssvatTiamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatTiamt,0,getStringValue(),beginDt313IssvatTiamt,DT_313_ISSVAT_TIAMT_LEN);
       localDt313IssvatTiamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatTiamtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDt313IssvatTiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatTiamt() {	 
   		return (substring(getStringValue(),beginDt313IssvatTiamt,beginDt313IssvatTiamt + DT_313_ISSVAT_TIAMT_LEN));
   	}
     int localDt313IssvatTiindCounter = -1;
     public boolean isDt313IssvatTiindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatTiindCounter != sharedCounter;
         localDt313IssvatTiindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_TIIND_LEN = 2;
	/**
	 * 	serialize this Dt313IssvatTiind
	 */
   protected void serializeDt313IssvatTiind(char[] dt313IssvatTiind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatTiind,0,getStringValue(),beginDt313IssvatTiind,DT_313_ISSVAT_TIIND_LEN);
       localDt313IssvatTiindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatTiindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt313IssvatTiind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatTiind() {	 
   		return (substring(getStringValue(),beginDt313IssvatTiind,beginDt313IssvatTiind + DT_313_ISSVAT_TIIND_LEN));
   	}
     int localDt313IssvatTvamtCounter = -1;
     public boolean isDt313IssvatTvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatTvamtCounter != sharedCounter;
         localDt313IssvatTvamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_TVAMT_LEN = 11;
	/**
	 * 	serialize this Dt313IssvatTvamt
	 */
   protected void serializeDt313IssvatTvamt(char[] dt313IssvatTvamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatTvamt,0,getStringValue(),beginDt313IssvatTvamt,DT_313_ISSVAT_TVAMT_LEN);
       localDt313IssvatTvamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatTvamtConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt313IssvatTvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatTvamt() {	 
   		return (substring(getStringValue(),beginDt313IssvatTvamt,beginDt313IssvatTvamt + DT_313_ISSVAT_TVAMT_LEN));
   	}
     int localDt313IssvatTvindCounter = -1;
     public boolean isDt313IssvatTvindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt313IssvatTvindCounter != sharedCounter;
         localDt313IssvatTvindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_313_ISSVAT_TVIND_LEN = 2;
	/**
	 * 	serialize this Dt313IssvatTvind
	 */
   protected void serializeDt313IssvatTvind(char[] dt313IssvatTvind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt313IssvatTvind,0,getStringValue(),beginDt313IssvatTvind,DT_313_ISSVAT_TVIND_LEN);
       localDt313IssvatTvindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt313IssvatTvindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt313IssvatTvind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt313IssvatTvind() {	 
   		return (substring(getStringValue(),beginDt313IssvatTvind,beginDt313IssvatTvind + DT_313_ISSVAT_TVIND_LEN));
   	}




}
  
