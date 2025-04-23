package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln14Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln14Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln14Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_14_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt314Cc;
            protected  int beginDt314NetvatFicnt;
            protected  int beginDt314NetvatFiamt;
            protected  int beginDt314NetvatFiind;
            protected  int beginDt314NetvatFvamt;
            protected  int beginDt314NetvatFvind;
            protected  int beginDt314NetvatNicnt;
            protected  int beginDt314NetvatNiamt;
            protected  int beginDt314NetvatNiind;
            protected  int beginDt314NetvatNvamt;
            protected  int beginDt314NetvatNvind;
            protected  int beginDt314NetvatTicnt;
            protected  int beginDt314NetvatTiamt;
            protected  int beginDt314NetvatTiind;
            protected  int beginDt314NetvatTvamt;
            protected  int beginDt314NetvatTvind;
	
	/**
	* Constructor for DtPage3Ln14Serialized
	**/
    public DtPage3Ln14Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln14Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_14_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt314Cc = getStartOffset() + 0;	// set offset for serialization
  
             beginDt314NetvatFicnt = getStartOffset() + 1;	// set offset for serialization
  
  
             beginDt314NetvatFiamt = getStartOffset() + 13;	// set offset for serialization
  
             beginDt314NetvatFiind = getStartOffset() + 29;	// set offset for serialization
  
             beginDt314NetvatFvamt = getStartOffset() + 31;	// set offset for serialization
  
             beginDt314NetvatFvind = getStartOffset() + 42;	// set offset for serialization
  
  
             beginDt314NetvatNicnt = getStartOffset() + 46;	// set offset for serialization
  
             beginDt314NetvatNiamt = getStartOffset() + 57;	// set offset for serialization
  
             beginDt314NetvatNiind = getStartOffset() + 73;	// set offset for serialization
  
             beginDt314NetvatNvamt = getStartOffset() + 75;	// set offset for serialization
  
             beginDt314NetvatNvind = getStartOffset() + 86;	// set offset for serialization
  
  
             beginDt314NetvatTicnt = getStartOffset() + 90;	// set offset for serialization
  
             beginDt314NetvatTiamt = getStartOffset() + 101;	// set offset for serialization
  
             beginDt314NetvatTiind = getStartOffset() + 117;	// set offset for serialization
  
             beginDt314NetvatTvamt = getStartOffset() + 119;	// set offset for serialization
  
             beginDt314NetvatTvind = getStartOffset() + 130;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt314CcCounter = -1;
     public boolean isDt314CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314CcCounter != sharedCounter;
         localDt314CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_CC_LEN = 1;
	/**
	 * 	serialize this Dt314Cc
	 */
   protected void serializeDt314Cc(char[] dt314Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314Cc,0,getStringValue(),beginDt314Cc,DT_314_CC_LEN);
       localDt314CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt314Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314Cc() {	 
   		return (substring(getStringValue(),beginDt314Cc,beginDt314Cc + DT_314_CC_LEN));
   	}
     int localDt314NetvatFicntCounter = -1;
     public boolean isDt314NetvatFicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatFicntCounter != sharedCounter;
         localDt314NetvatFicntCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_FICNT_LEN = 11;
	/**
	 * 	serialize this Dt314NetvatFicnt
	 */
   protected void serializeDt314NetvatFicnt(char[] dt314NetvatFicnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatFicnt,0,getStringValue(),beginDt314NetvatFicnt,DT_314_NETVAT_FICNT_LEN);
       localDt314NetvatFicntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatFicntConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt314NetvatFicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatFicnt() {	 
   		return (substring(getStringValue(),beginDt314NetvatFicnt,beginDt314NetvatFicnt + DT_314_NETVAT_FICNT_LEN));
   	}
     int localDt314NetvatFiamtCounter = -1;
     public boolean isDt314NetvatFiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatFiamtCounter != sharedCounter;
         localDt314NetvatFiamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_FIAMT_LEN = 16;
	/**
	 * 	serialize this Dt314NetvatFiamt
	 */
   protected void serializeDt314NetvatFiamt(char[] dt314NetvatFiamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatFiamt,0,getStringValue(),beginDt314NetvatFiamt,DT_314_NETVAT_FIAMT_LEN);
       localDt314NetvatFiamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatFiamtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDt314NetvatFiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatFiamt() {	 
   		return (substring(getStringValue(),beginDt314NetvatFiamt,beginDt314NetvatFiamt + DT_314_NETVAT_FIAMT_LEN));
   	}
     int localDt314NetvatFiindCounter = -1;
     public boolean isDt314NetvatFiindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatFiindCounter != sharedCounter;
         localDt314NetvatFiindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_FIIND_LEN = 2;
	/**
	 * 	serialize this Dt314NetvatFiind
	 */
   protected void serializeDt314NetvatFiind(char[] dt314NetvatFiind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatFiind,0,getStringValue(),beginDt314NetvatFiind,DT_314_NETVAT_FIIND_LEN);
       localDt314NetvatFiindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatFiindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt314NetvatFiind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatFiind() {	 
   		return (substring(getStringValue(),beginDt314NetvatFiind,beginDt314NetvatFiind + DT_314_NETVAT_FIIND_LEN));
   	}
     int localDt314NetvatFvamtCounter = -1;
     public boolean isDt314NetvatFvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatFvamtCounter != sharedCounter;
         localDt314NetvatFvamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_FVAMT_LEN = 11;
	/**
	 * 	serialize this Dt314NetvatFvamt
	 */
   protected void serializeDt314NetvatFvamt(char[] dt314NetvatFvamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatFvamt,0,getStringValue(),beginDt314NetvatFvamt,DT_314_NETVAT_FVAMT_LEN);
       localDt314NetvatFvamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatFvamtConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt314NetvatFvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatFvamt() {	 
   		return (substring(getStringValue(),beginDt314NetvatFvamt,beginDt314NetvatFvamt + DT_314_NETVAT_FVAMT_LEN));
   	}
     int localDt314NetvatFvindCounter = -1;
     public boolean isDt314NetvatFvindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatFvindCounter != sharedCounter;
         localDt314NetvatFvindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_FVIND_LEN = 2;
	/**
	 * 	serialize this Dt314NetvatFvind
	 */
   protected void serializeDt314NetvatFvind(char[] dt314NetvatFvind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatFvind,0,getStringValue(),beginDt314NetvatFvind,DT_314_NETVAT_FVIND_LEN);
       localDt314NetvatFvindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatFvindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt314NetvatFvind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatFvind() {	 
   		return (substring(getStringValue(),beginDt314NetvatFvind,beginDt314NetvatFvind + DT_314_NETVAT_FVIND_LEN));
   	}
     int localDt314NetvatNicntCounter = -1;
     public boolean isDt314NetvatNicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatNicntCounter != sharedCounter;
         localDt314NetvatNicntCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_NICNT_LEN = 11;
	/**
	 * 	serialize this Dt314NetvatNicnt
	 */
   protected void serializeDt314NetvatNicnt(char[] dt314NetvatNicnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatNicnt,0,getStringValue(),beginDt314NetvatNicnt,DT_314_NETVAT_NICNT_LEN);
       localDt314NetvatNicntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatNicntConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt314NetvatNicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatNicnt() {	 
   		return (substring(getStringValue(),beginDt314NetvatNicnt,beginDt314NetvatNicnt + DT_314_NETVAT_NICNT_LEN));
   	}
     int localDt314NetvatNiamtCounter = -1;
     public boolean isDt314NetvatNiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatNiamtCounter != sharedCounter;
         localDt314NetvatNiamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_NIAMT_LEN = 16;
	/**
	 * 	serialize this Dt314NetvatNiamt
	 */
   protected void serializeDt314NetvatNiamt(char[] dt314NetvatNiamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatNiamt,0,getStringValue(),beginDt314NetvatNiamt,DT_314_NETVAT_NIAMT_LEN);
       localDt314NetvatNiamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatNiamtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDt314NetvatNiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatNiamt() {	 
   		return (substring(getStringValue(),beginDt314NetvatNiamt,beginDt314NetvatNiamt + DT_314_NETVAT_NIAMT_LEN));
   	}
     int localDt314NetvatNiindCounter = -1;
     public boolean isDt314NetvatNiindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatNiindCounter != sharedCounter;
         localDt314NetvatNiindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_NIIND_LEN = 2;
	/**
	 * 	serialize this Dt314NetvatNiind
	 */
   protected void serializeDt314NetvatNiind(char[] dt314NetvatNiind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatNiind,0,getStringValue(),beginDt314NetvatNiind,DT_314_NETVAT_NIIND_LEN);
       localDt314NetvatNiindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatNiindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt314NetvatNiind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatNiind() {	 
   		return (substring(getStringValue(),beginDt314NetvatNiind,beginDt314NetvatNiind + DT_314_NETVAT_NIIND_LEN));
   	}
     int localDt314NetvatNvamtCounter = -1;
     public boolean isDt314NetvatNvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatNvamtCounter != sharedCounter;
         localDt314NetvatNvamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_NVAMT_LEN = 11;
	/**
	 * 	serialize this Dt314NetvatNvamt
	 */
   protected void serializeDt314NetvatNvamt(char[] dt314NetvatNvamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatNvamt,0,getStringValue(),beginDt314NetvatNvamt,DT_314_NETVAT_NVAMT_LEN);
       localDt314NetvatNvamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatNvamtConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt314NetvatNvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatNvamt() {	 
   		return (substring(getStringValue(),beginDt314NetvatNvamt,beginDt314NetvatNvamt + DT_314_NETVAT_NVAMT_LEN));
   	}
     int localDt314NetvatNvindCounter = -1;
     public boolean isDt314NetvatNvindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatNvindCounter != sharedCounter;
         localDt314NetvatNvindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_NVIND_LEN = 2;
	/**
	 * 	serialize this Dt314NetvatNvind
	 */
   protected void serializeDt314NetvatNvind(char[] dt314NetvatNvind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatNvind,0,getStringValue(),beginDt314NetvatNvind,DT_314_NETVAT_NVIND_LEN);
       localDt314NetvatNvindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatNvindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt314NetvatNvind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatNvind() {	 
   		return (substring(getStringValue(),beginDt314NetvatNvind,beginDt314NetvatNvind + DT_314_NETVAT_NVIND_LEN));
   	}
     int localDt314NetvatTicntCounter = -1;
     public boolean isDt314NetvatTicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatTicntCounter != sharedCounter;
         localDt314NetvatTicntCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_TICNT_LEN = 11;
	/**
	 * 	serialize this Dt314NetvatTicnt
	 */
   protected void serializeDt314NetvatTicnt(char[] dt314NetvatTicnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatTicnt,0,getStringValue(),beginDt314NetvatTicnt,DT_314_NETVAT_TICNT_LEN);
       localDt314NetvatTicntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatTicntConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt314NetvatTicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatTicnt() {	 
   		return (substring(getStringValue(),beginDt314NetvatTicnt,beginDt314NetvatTicnt + DT_314_NETVAT_TICNT_LEN));
   	}
     int localDt314NetvatTiamtCounter = -1;
     public boolean isDt314NetvatTiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatTiamtCounter != sharedCounter;
         localDt314NetvatTiamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_TIAMT_LEN = 16;
	/**
	 * 	serialize this Dt314NetvatTiamt
	 */
   protected void serializeDt314NetvatTiamt(char[] dt314NetvatTiamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatTiamt,0,getStringValue(),beginDt314NetvatTiamt,DT_314_NETVAT_TIAMT_LEN);
       localDt314NetvatTiamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatTiamtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDt314NetvatTiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatTiamt() {	 
   		return (substring(getStringValue(),beginDt314NetvatTiamt,beginDt314NetvatTiamt + DT_314_NETVAT_TIAMT_LEN));
   	}
     int localDt314NetvatTiindCounter = -1;
     public boolean isDt314NetvatTiindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatTiindCounter != sharedCounter;
         localDt314NetvatTiindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_TIIND_LEN = 2;
	/**
	 * 	serialize this Dt314NetvatTiind
	 */
   protected void serializeDt314NetvatTiind(char[] dt314NetvatTiind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatTiind,0,getStringValue(),beginDt314NetvatTiind,DT_314_NETVAT_TIIND_LEN);
       localDt314NetvatTiindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatTiindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt314NetvatTiind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatTiind() {	 
   		return (substring(getStringValue(),beginDt314NetvatTiind,beginDt314NetvatTiind + DT_314_NETVAT_TIIND_LEN));
   	}
     int localDt314NetvatTvamtCounter = -1;
     public boolean isDt314NetvatTvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatTvamtCounter != sharedCounter;
         localDt314NetvatTvamtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_TVAMT_LEN = 11;
	/**
	 * 	serialize this Dt314NetvatTvamt
	 */
   protected void serializeDt314NetvatTvamt(char[] dt314NetvatTvamt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatTvamt,0,getStringValue(),beginDt314NetvatTvamt,DT_314_NETVAT_TVAMT_LEN);
       localDt314NetvatTvamtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatTvamtConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDt314NetvatTvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatTvamt() {	 
   		return (substring(getStringValue(),beginDt314NetvatTvamt,beginDt314NetvatTvamt + DT_314_NETVAT_TVAMT_LEN));
   	}
     int localDt314NetvatTvindCounter = -1;
     public boolean isDt314NetvatTvindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt314NetvatTvindCounter != sharedCounter;
         localDt314NetvatTvindCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_314_NETVAT_TVIND_LEN = 2;
	/**
	 * 	serialize this Dt314NetvatTvind
	 */
   protected void serializeDt314NetvatTvind(char[] dt314NetvatTvind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt314NetvatTvind,0,getStringValue(),beginDt314NetvatTvind,DT_314_NETVAT_TVIND_LEN);
       localDt314NetvatTvindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt314NetvatTvindConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt314NetvatTvind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt314NetvatTvind() {	 
   		return (substring(getStringValue(),beginDt314NetvatTvind,beginDt314NetvatTvind + DT_314_NETVAT_TVIND_LEN));
   	}




}
  
