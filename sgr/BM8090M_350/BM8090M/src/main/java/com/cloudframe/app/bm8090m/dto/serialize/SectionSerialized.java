package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class SectionSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SectionSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SectionSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SECTION_LENGTH = 3168;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWIndxTitular;
            protected  int beginWTotTit;
            protected  int beginWPriTitu;
            protected  int beginWLonPriTitu;
            protected  int beginWSegTitu;
            protected  int beginWLonSegTitu;
            protected  int beginWTitCtaPe8090m;
            protected  int beginWPriTroPe8090m;
            protected  int beginWSegTroPe8090m;
            protected  int beginWTitCtaAux;
            protected  int beginWPriTroAux;
            protected  int beginWSegTroAux;
            protected  int beginWImpPe8090m;
            protected  int beginWTitulPe8090m;
            protected  int beginWNumPerFisPe8090m;
	
	/**
	* Constructor for SectionSerialized
	**/
    public SectionSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SectionSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SECTION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWIndxTitular = getStartOffset() + 0;	// set offset for serialization
  
             beginWTotTit = getStartOffset() + 2;	// set offset for serialization
  
             beginWPriTitu = getStartOffset() + 4;	// set offset for serialization
  
             beginWLonPriTitu = getStartOffset() + 64;	// set offset for serialization
  
             beginWSegTitu = getStartOffset() + 66;	// set offset for serialization
  
             beginWLonSegTitu = getStartOffset() + 126;	// set offset for serialization
  
             beginWTitCtaPe8090m = getStartOffset() + 128;	// set offset for serialization
  
             beginWPriTroPe8090m = getStartOffset() + 228;	// set offset for serialization
  
             beginWSegTroPe8090m = getStartOffset() + 278;	// set offset for serialization
  
             beginWTitCtaAux = getStartOffset() + 328;	// set offset for serialization
  
             beginWPriTroAux = getStartOffset() + 428;	// set offset for serialization
  
             beginWSegTroAux = getStartOffset() + 478;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
             beginWImpPe8090m = getStartOffset() + 2770;	// set offset for serialization
  
             beginWTitulPe8090m = getStartOffset() + 2772;	// set offset for serialization
  
  
             beginWNumPerFisPe8090m = getStartOffset() + 2932;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
         int localWIndxTitularCounter = -1;
         public boolean isWIndxTitularModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWIndxTitularCounter != sharedCounter;
            localWIndxTitularCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_INDX_TITULAR_LEN = 2;
  	/**
	 * serializeWIndxTitular
	 */
	protected void serializeWIndxTitular(int wIndxTitular) {
           replaceValue( //  save the value as string
                   getBinaryString( wIndxTitular,W_INDX_TITULAR_LEN)
                  ,beginWIndxTitular
                  ,W_INDX_TITULAR_LEN
                 );
            localWIndxTitularCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWIndxTitularMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWIndxTitular is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWIndxTitular() {	 
			return (getUnsignedShort(beginWIndxTitular));
   	}
         int localWTotTitCounter = -1;
         public boolean isWTotTitModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWTotTitCounter != sharedCounter;
            localWTotTitCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_TOT_TIT_LEN = 2;
  	/**
	 * serializeWTotTit
	 */
	protected void serializeWTotTit(int wTotTit) {
           replaceValue( //  save the value as string
                   getBinaryString( wTotTit,W_TOT_TIT_LEN)
                  ,beginWTotTit
                  ,W_TOT_TIT_LEN
                 );
            localWTotTitCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWTotTitMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWTotTit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWTotTit() {	 
			return (getUnsignedShort(beginWTotTit));
   	}
     int localWPriTituCounter = -1;
     public boolean isWPriTituModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWPriTituCounter != sharedCounter;
         localWPriTituCounter = sharedCounter; return hasModified;
     }
	protected static final int W_PRI_TITU_LEN = 60;
	/**
	 * 	serialize this WPriTitu
	 */
   protected void serializeWPriTitu(char[] wPriTitu) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wPriTitu,0,getStringValue(),beginWPriTitu,W_PRI_TITU_LEN);
       localWPriTituCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWPriTituConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWPriTitu is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWPriTitu() {	 
   		return (substring(getStringValue(),beginWPriTitu,beginWPriTitu + W_PRI_TITU_LEN));
   	}
         int localWLonPriTituCounter = -1;
         public boolean isWLonPriTituModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWLonPriTituCounter != sharedCounter;
            localWLonPriTituCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_LON_PRI_TITU_LEN = 2;
  	/**
	 * serializeWLonPriTitu
	 */
	protected void serializeWLonPriTitu(int wLonPriTitu) {
           replaceValue( //  save the value as string
                   getBinaryString( wLonPriTitu,W_LON_PRI_TITU_LEN)
                  ,beginWLonPriTitu
                  ,W_LON_PRI_TITU_LEN
                 );
            localWLonPriTituCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWLonPriTituMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWLonPriTitu is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWLonPriTitu() {	 
			return (getUnsignedShort(beginWLonPriTitu));
   	}
     int localWSegTituCounter = -1;
     public boolean isWSegTituModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWSegTituCounter != sharedCounter;
         localWSegTituCounter = sharedCounter; return hasModified;
     }
	protected static final int W_SEG_TITU_LEN = 60;
	/**
	 * 	serialize this WSegTitu
	 */
   protected void serializeWSegTitu(char[] wSegTitu) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wSegTitu,0,getStringValue(),beginWSegTitu,W_SEG_TITU_LEN);
       localWSegTituCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWSegTituConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWSegTitu is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWSegTitu() {	 
   		return (substring(getStringValue(),beginWSegTitu,beginWSegTitu + W_SEG_TITU_LEN));
   	}
         int localWLonSegTituCounter = -1;
         public boolean isWLonSegTituModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWLonSegTituCounter != sharedCounter;
            localWLonSegTituCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_LON_SEG_TITU_LEN = 2;
  	/**
	 * serializeWLonSegTitu
	 */
	protected void serializeWLonSegTitu(int wLonSegTitu) {
           replaceValue( //  save the value as string
                   getBinaryString( wLonSegTitu,W_LON_SEG_TITU_LEN)
                  ,beginWLonSegTitu
                  ,W_LON_SEG_TITU_LEN
                 );
            localWLonSegTituCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWLonSegTituMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWLonSegTitu is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWLonSegTitu() {	 
			return (getUnsignedShort(beginWLonSegTitu));
   	}
     int localWTitCtaPe8090mCounter = -1;
     public boolean isWTitCtaPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWTitCtaPe8090mCounter != sharedCounter;
         localWTitCtaPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_TIT_CTA_PE_8090M_LEN = 100;
	/**
	 * 	serialize this WTitCtaPe8090m
	 */
   protected void serializeWTitCtaPe8090m(char[] wTitCtaPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wTitCtaPe8090m,0,getStringValue(),beginWTitCtaPe8090m,W_TIT_CTA_PE_8090M_LEN);
       localWTitCtaPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWTitCtaPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshWTitCtaPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWTitCtaPe8090m() {	 
   		return (substring(getStringValue(),beginWTitCtaPe8090m,beginWTitCtaPe8090m + W_TIT_CTA_PE_8090M_LEN));
   	}
     int localWPriTroPe8090mCounter = -1;
     public boolean isWPriTroPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWPriTroPe8090mCounter != sharedCounter;
         localWPriTroPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_PRI_TRO_PE_8090M_LEN = 50;
	/**
	 * 	serialize this WPriTroPe8090m
	 */
   protected void serializeWPriTroPe8090m(char[] wPriTroPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wPriTroPe8090m,0,getStringValue(),beginWPriTroPe8090m,W_PRI_TRO_PE_8090M_LEN);
       localWPriTroPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWPriTroPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshWPriTroPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWPriTroPe8090m() {	 
   		return (substring(getStringValue(),beginWPriTroPe8090m,beginWPriTroPe8090m + W_PRI_TRO_PE_8090M_LEN));
   	}
     int localWSegTroPe8090mCounter = -1;
     public boolean isWSegTroPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWSegTroPe8090mCounter != sharedCounter;
         localWSegTroPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_SEG_TRO_PE_8090M_LEN = 50;
	/**
	 * 	serialize this WSegTroPe8090m
	 */
   protected void serializeWSegTroPe8090m(char[] wSegTroPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wSegTroPe8090m,0,getStringValue(),beginWSegTroPe8090m,W_SEG_TRO_PE_8090M_LEN);
       localWSegTroPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWSegTroPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshWSegTroPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWSegTroPe8090m() {	 
   		return (substring(getStringValue(),beginWSegTroPe8090m,beginWSegTroPe8090m + W_SEG_TRO_PE_8090M_LEN));
   	}
     int localWTitCtaAuxCounter = -1;
     public boolean isWTitCtaAuxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWTitCtaAuxCounter != sharedCounter;
         localWTitCtaAuxCounter = sharedCounter; return hasModified;
     }
	protected static final int W_TIT_CTA_AUX_LEN = 100;
	/**
	 * 	serialize this WTitCtaAux
	 */
   protected void serializeWTitCtaAux(char[] wTitCtaAux) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wTitCtaAux,0,getStringValue(),beginWTitCtaAux,W_TIT_CTA_AUX_LEN);
       localWTitCtaAuxCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWTitCtaAuxConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshWTitCtaAux is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWTitCtaAux() {	 
   		return (substring(getStringValue(),beginWTitCtaAux,beginWTitCtaAux + W_TIT_CTA_AUX_LEN));
   	}
     int localWPriTroAuxCounter = -1;
     public boolean isWPriTroAuxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWPriTroAuxCounter != sharedCounter;
         localWPriTroAuxCounter = sharedCounter; return hasModified;
     }
	protected static final int W_PRI_TRO_AUX_LEN = 50;
	/**
	 * 	serialize this WPriTroAux
	 */
   protected void serializeWPriTroAux(char[] wPriTroAux) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wPriTroAux,0,getStringValue(),beginWPriTroAux,W_PRI_TRO_AUX_LEN);
       localWPriTroAuxCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWPriTroAuxConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshWPriTroAux is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWPriTroAux() {	 
   		return (substring(getStringValue(),beginWPriTroAux,beginWPriTroAux + W_PRI_TRO_AUX_LEN));
   	}
     int localWSegTroAuxCounter = -1;
     public boolean isWSegTroAuxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWSegTroAuxCounter != sharedCounter;
         localWSegTroAuxCounter = sharedCounter; return hasModified;
     }
	protected static final int W_SEG_TRO_AUX_LEN = 50;
	/**
	 * 	serialize this WSegTroAux
	 */
   protected void serializeWSegTroAux(char[] wSegTroAux) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wSegTroAux,0,getStringValue(),beginWSegTroAux,W_SEG_TRO_AUX_LEN);
       localWSegTroAuxCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWSegTroAuxConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshWSegTroAux is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWSegTroAux() {	 
   		return (substring(getStringValue(),beginWSegTroAux,beginWSegTroAux + W_SEG_TRO_AUX_LEN));
   	}
         int localWImpPe8090mCounter = -1;
         public boolean isWImpPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWImpPe8090mCounter != sharedCounter;
            localWImpPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_IMP_PE_8090M_LEN = 2;
  	/**
	 * serializeWImpPe8090m
	 */
	protected void serializeWImpPe8090m(int wImpPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wImpPe8090m,W_IMP_PE_8090M_LEN)
                  ,beginWImpPe8090m
                  ,W_IMP_PE_8090M_LEN
                 );
            localWImpPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWImpPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWImpPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWImpPe8090m() {	 
			return (getUnsignedShort(beginWImpPe8090m));
   	}
     int localWTitulPe8090mCounter = -1;
     public boolean isWTitulPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWTitulPe8090mCounter != sharedCounter;
         localWTitulPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_TITUL_PE_8090M_LEN = 140;
	/**
	 * 	serialize this WTitulPe8090m
	 */
   protected void serializeWTitulPe8090m(char[] wTitulPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wTitulPe8090m,0,getStringValue(),beginWTitulPe8090m,W_TITUL_PE_8090M_LEN);
       localWTitulPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWTitulPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 140 ,false, false);
   }
    /**
	 *	refreshWTitulPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWTitulPe8090m() {	 
   		return (substring(getStringValue(),beginWTitulPe8090m,beginWTitulPe8090m + W_TITUL_PE_8090M_LEN));
   	}
         int localWNumPerFisPe8090mCounter = -1;
         public boolean isWNumPerFisPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWNumPerFisPe8090mCounter != sharedCounter;
            localWNumPerFisPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_NUM_PER_FIS_PE_8090M_LEN = 2;
  	/**
	 * serializeWNumPerFisPe8090m
	 */
	protected void serializeWNumPerFisPe8090m(int wNumPerFisPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wNumPerFisPe8090m,W_NUM_PER_FIS_PE_8090M_LEN)
                  ,beginWNumPerFisPe8090m
                  ,W_NUM_PER_FIS_PE_8090M_LEN
                 );
            localWNumPerFisPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWNumPerFisPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWNumPerFisPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWNumPerFisPe8090m() {	 
			return (getUnsignedShort(beginWNumPerFisPe8090m));
   	}




}
  
