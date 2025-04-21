package com.cloudframe.app.init2.dto.serialize;

/**
*  The class L6560InputParmInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class L6560InputParmInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(L6560InputParmInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int L_6560_INPUT_PARM_INFO_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginL6560RqstCd;
            protected  int beginL6560EffDt;
            protected  int beginL6560Cvg;
            protected  int beginL6560SurrAmt;
            protected  int beginL6560SurrChrgTypCd;
            protected  int beginL6560PolAcumValuAmt;
            protected  int beginL6560CvgAcumValuAmt;
            protected  int beginL6560MthvAdjAmt;
            protected  int beginL6560MktvalAdjPct;
            protected  int beginL6560CalcIfTerminatedSw;
            protected  int beginL6560FreeWthAppliedInd;
            protected  int beginL6560SurrChrgOvridInd;
	
	/**
	* Constructor for L6560InputParmInfoSerialized
	**/
    public L6560InputParmInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for L6560InputParmInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public L6560InputParmInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this L6560InputParmInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this L6560InputParmInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in L6560InputParmInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(L_6560_INPUT_PARM_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginL6560RqstCd = getStartOffset() + 0;	// set offset for serialization
  
             beginL6560EffDt = getStartOffset() + 2;	// set offset for serialization
  
             beginL6560Cvg = getStartOffset() + 12;	// set offset for serialization
  
             beginL6560SurrAmt = getStartOffset() + 14;	// set offset for serialization
  
             beginL6560SurrChrgTypCd = getStartOffset() + 22;	// set offset for serialization
  
             beginL6560PolAcumValuAmt = getStartOffset() + 23;	// set offset for serialization
  
             beginL6560CvgAcumValuAmt = getStartOffset() + 31;	// set offset for serialization
  
             beginL6560MthvAdjAmt = getStartOffset() + 39;	// set offset for serialization
  
             beginL6560MktvalAdjPct = getStartOffset() + 47;	// set offset for serialization
  
             beginL6560CalcIfTerminatedSw = getStartOffset() + 54;	// set offset for serialization
  
             beginL6560FreeWthAppliedInd = getStartOffset() + 55;	// set offset for serialization
  
  
             beginL6560SurrChrgOvridInd = getStartOffset() + 106;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localL6560RqstCdCounter = -1;
     public boolean isL6560RqstCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL6560RqstCdCounter != sharedCounter;
         localL6560RqstCdCounter = sharedCounter; return hasModified;
     }
	protected static final int L_6560_RQST_CD_LEN = 2;
	/**
	 * 	serialize this L6560RqstCd
	 */
   protected void serializeL6560RqstCd(char[] l6560RqstCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l6560RqstCd,0,getStringValue(),beginL6560RqstCd,L_6560_RQST_CD_LEN);
       localL6560RqstCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL6560RqstCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshL6560RqstCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL6560RqstCd() {	 
   		return (substring(getStringValue(),beginL6560RqstCd,beginL6560RqstCd + L_6560_RQST_CD_LEN));
   	}
     int localL6560EffDtCounter = -1;
     public boolean isL6560EffDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL6560EffDtCounter != sharedCounter;
         localL6560EffDtCounter = sharedCounter; return hasModified;
     }
	protected static final int L_6560_EFF_DT_LEN = 10;
	/**
	 * 	serialize this L6560EffDt
	 */
   protected void serializeL6560EffDt(char[] l6560EffDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l6560EffDt,0,getStringValue(),beginL6560EffDt,L_6560_EFF_DT_LEN);
       localL6560EffDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL6560EffDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshL6560EffDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL6560EffDt() {	 
   		return (substring(getStringValue(),beginL6560EffDt,beginL6560EffDt + L_6560_EFF_DT_LEN));
   	}
         int localL6560CvgCounter = -1;
         public boolean isL6560CvgModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localL6560CvgCounter != sharedCounter;
            localL6560CvgCounter = sharedCounter; return hasModified; 
         }
   protected static final int L_6560_CVG_LEN = 2;
  	/**
	 * serializeL6560Cvg
	 */
	protected void serializeL6560Cvg(short l6560Cvg) {
           replaceValue( //  save the value as string
                   getBinaryString( l6560Cvg,L_6560_CVG_LEN)
                  ,beginL6560Cvg
                  ,L_6560_CVG_LEN
                 );
            localL6560CvgCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkL6560CvgMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshL6560Cvg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshL6560Cvg() {	 
			return (getShort(beginL6560Cvg));
   	}
        int localL6560SurrAmtCounter = -1;
        public boolean isL6560SurrAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560SurrAmtCounter != sharedCounter;
           localL6560SurrAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560SurrAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560SurrAmt,L_6560_SURR_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560SurrAmtString() {
            return getPackedString(beginL6560SurrAmt,L_6560_SURR_AMT_LEN);
         }
   protected static final int L_6560_SURR_AMT_LEN = 8;
   protected static final int L_6560_SURR_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560SurrAmt
	 */
	protected void serializeL6560SurrAmt(BigDecimal l6560SurrAmt) {
		   putDecimal(beginL6560SurrAmt,l6560SurrAmt,L_6560_SURR_AMT_LEN,L_6560_SURR_AMT_SCALE,true);
		 localL6560SurrAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560SurrAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560SurrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560SurrAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560SurrAmt,L_6560_SURR_AMT_LEN,L_6560_SURR_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560SurrAmt", beginL6560SurrAmt,L_6560_SURR_AMT_LEN);
     }
   	}
     int localL6560SurrChrgTypCdCounter = -1;
     public boolean isL6560SurrChrgTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL6560SurrChrgTypCdCounter != sharedCounter;
         localL6560SurrChrgTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int L_6560_SURR_CHRG_TYP_CD_LEN = 1;
	/**
	 * 	serialize this L6560SurrChrgTypCd
	 */
   protected void serializeL6560SurrChrgTypCd(char[] l6560SurrChrgTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l6560SurrChrgTypCd,0,getStringValue(),beginL6560SurrChrgTypCd,L_6560_SURR_CHRG_TYP_CD_LEN);
       localL6560SurrChrgTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL6560SurrChrgTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshL6560SurrChrgTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL6560SurrChrgTypCd() {	 
   		return (substring(getStringValue(),beginL6560SurrChrgTypCd,beginL6560SurrChrgTypCd + L_6560_SURR_CHRG_TYP_CD_LEN));
   	}
        int localL6560PolAcumValuAmtCounter = -1;
        public boolean isL6560PolAcumValuAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560PolAcumValuAmtCounter != sharedCounter;
           localL6560PolAcumValuAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560PolAcumValuAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560PolAcumValuAmt,L_6560_POL_ACUM_VALU_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560PolAcumValuAmtString() {
            return getPackedString(beginL6560PolAcumValuAmt,L_6560_POL_ACUM_VALU_AMT_LEN);
         }
   protected static final int L_6560_POL_ACUM_VALU_AMT_LEN = 8;
   protected static final int L_6560_POL_ACUM_VALU_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560PolAcumValuAmt
	 */
	protected void serializeL6560PolAcumValuAmt(BigDecimal l6560PolAcumValuAmt) {
		   putDecimal(beginL6560PolAcumValuAmt,l6560PolAcumValuAmt,L_6560_POL_ACUM_VALU_AMT_LEN,L_6560_POL_ACUM_VALU_AMT_SCALE,true);
		 localL6560PolAcumValuAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560PolAcumValuAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560PolAcumValuAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560PolAcumValuAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560PolAcumValuAmt,L_6560_POL_ACUM_VALU_AMT_LEN,L_6560_POL_ACUM_VALU_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560PolAcumValuAmt", beginL6560PolAcumValuAmt,L_6560_POL_ACUM_VALU_AMT_LEN);
     }
   	}
        int localL6560CvgAcumValuAmtCounter = -1;
        public boolean isL6560CvgAcumValuAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560CvgAcumValuAmtCounter != sharedCounter;
           localL6560CvgAcumValuAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560CvgAcumValuAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560CvgAcumValuAmt,L_6560_CVG_ACUM_VALU_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560CvgAcumValuAmtString() {
            return getPackedString(beginL6560CvgAcumValuAmt,L_6560_CVG_ACUM_VALU_AMT_LEN);
         }
   protected static final int L_6560_CVG_ACUM_VALU_AMT_LEN = 8;
   protected static final int L_6560_CVG_ACUM_VALU_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560CvgAcumValuAmt
	 */
	protected void serializeL6560CvgAcumValuAmt(BigDecimal l6560CvgAcumValuAmt) {
		   putDecimal(beginL6560CvgAcumValuAmt,l6560CvgAcumValuAmt,L_6560_CVG_ACUM_VALU_AMT_LEN,L_6560_CVG_ACUM_VALU_AMT_SCALE,true);
		 localL6560CvgAcumValuAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560CvgAcumValuAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560CvgAcumValuAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560CvgAcumValuAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560CvgAcumValuAmt,L_6560_CVG_ACUM_VALU_AMT_LEN,L_6560_CVG_ACUM_VALU_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560CvgAcumValuAmt", beginL6560CvgAcumValuAmt,L_6560_CVG_ACUM_VALU_AMT_LEN);
     }
   	}
        int localL6560MthvAdjAmtCounter = -1;
        public boolean isL6560MthvAdjAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560MthvAdjAmtCounter != sharedCounter;
           localL6560MthvAdjAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560MthvAdjAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560MthvAdjAmt,L_6560_MTHV_ADJ_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560MthvAdjAmtString() {
            return getPackedString(beginL6560MthvAdjAmt,L_6560_MTHV_ADJ_AMT_LEN);
         }
   protected static final int L_6560_MTHV_ADJ_AMT_LEN = 8;
   protected static final int L_6560_MTHV_ADJ_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560MthvAdjAmt
	 */
	protected void serializeL6560MthvAdjAmt(BigDecimal l6560MthvAdjAmt) {
		   putDecimal(beginL6560MthvAdjAmt,l6560MthvAdjAmt,L_6560_MTHV_ADJ_AMT_LEN,L_6560_MTHV_ADJ_AMT_SCALE,true);
		 localL6560MthvAdjAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560MthvAdjAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560MthvAdjAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560MthvAdjAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560MthvAdjAmt,L_6560_MTHV_ADJ_AMT_LEN,L_6560_MTHV_ADJ_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560MthvAdjAmt", beginL6560MthvAdjAmt,L_6560_MTHV_ADJ_AMT_LEN);
     }
   	}
        int localL6560MktvalAdjPctCounter = -1;
        public boolean isL6560MktvalAdjPctModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560MktvalAdjPctCounter != sharedCounter;
           localL6560MktvalAdjPctCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560MktvalAdjPctIsNumeric() {
	      return decimalIsNumeric(beginL6560MktvalAdjPct,L_6560_MKTVAL_ADJ_PCT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560MktvalAdjPctString() {
            return getPackedString(beginL6560MktvalAdjPct,L_6560_MKTVAL_ADJ_PCT_LEN);
         }
   protected static final int L_6560_MKTVAL_ADJ_PCT_LEN = 7;
   protected static final int L_6560_MKTVAL_ADJ_PCT_SCALE = 8;
  	/**
	 * 	serializeL6560MktvalAdjPct
	 */
	protected void serializeL6560MktvalAdjPct(BigDecimal l6560MktvalAdjPct) {
		   putDecimal(beginL6560MktvalAdjPct,l6560MktvalAdjPct,L_6560_MKTVAL_ADJ_PCT_LEN,L_6560_MKTVAL_ADJ_PCT_SCALE,true);
		 localL6560MktvalAdjPctCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560MktvalAdjPctMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,8/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshL6560MktvalAdjPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560MktvalAdjPct() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560MktvalAdjPct,L_6560_MKTVAL_ADJ_PCT_LEN,L_6560_MKTVAL_ADJ_PCT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560MktvalAdjPct", beginL6560MktvalAdjPct,L_6560_MKTVAL_ADJ_PCT_LEN);
     }
   	}
     int localL6560CalcIfTerminatedSwCounter = -1;
     public boolean isL6560CalcIfTerminatedSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL6560CalcIfTerminatedSwCounter != sharedCounter;
         localL6560CalcIfTerminatedSwCounter = sharedCounter; return hasModified;
     }
	protected static final int L_6560_CALC_IF_TERMINATED_SW_LEN = 1;
	/**
	 * 	serialize this L6560CalcIfTerminatedSw
	 */
   protected void serializeL6560CalcIfTerminatedSw(char[] l6560CalcIfTerminatedSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l6560CalcIfTerminatedSw,0,getStringValue(),beginL6560CalcIfTerminatedSw,L_6560_CALC_IF_TERMINATED_SW_LEN);
       localL6560CalcIfTerminatedSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL6560CalcIfTerminatedSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshL6560CalcIfTerminatedSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL6560CalcIfTerminatedSw() {	 
   		return (substring(getStringValue(),beginL6560CalcIfTerminatedSw,beginL6560CalcIfTerminatedSw + L_6560_CALC_IF_TERMINATED_SW_LEN));
   	}
     int localL6560FreeWthAppliedIndCounter = -1;
     public boolean isL6560FreeWthAppliedIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL6560FreeWthAppliedIndCounter != sharedCounter;
         localL6560FreeWthAppliedIndCounter = sharedCounter; return hasModified;
     }
	protected static final int L_6560_FREE_WTH_APPLIED_IND_LEN = 1;
	/**
	 * 	serialize this L6560FreeWthAppliedInd
	 */
   protected void serializeL6560FreeWthAppliedInd(char[] l6560FreeWthAppliedInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l6560FreeWthAppliedInd,0,getStringValue(),beginL6560FreeWthAppliedInd,L_6560_FREE_WTH_APPLIED_IND_LEN);
       localL6560FreeWthAppliedIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL6560FreeWthAppliedIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshL6560FreeWthAppliedInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL6560FreeWthAppliedInd() {	 
   		return (substring(getStringValue(),beginL6560FreeWthAppliedInd,beginL6560FreeWthAppliedInd + L_6560_FREE_WTH_APPLIED_IND_LEN));
   	}
     int localL6560SurrChrgOvridIndCounter = -1;
     public boolean isL6560SurrChrgOvridIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL6560SurrChrgOvridIndCounter != sharedCounter;
         localL6560SurrChrgOvridIndCounter = sharedCounter; return hasModified;
     }
	protected static final int L_6560_SURR_CHRG_OVRID_IND_LEN = 1;
	/**
	 * 	serialize this L6560SurrChrgOvridInd
	 */
   protected void serializeL6560SurrChrgOvridInd(char[] l6560SurrChrgOvridInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l6560SurrChrgOvridInd,0,getStringValue(),beginL6560SurrChrgOvridInd,L_6560_SURR_CHRG_OVRID_IND_LEN);
       localL6560SurrChrgOvridIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL6560SurrChrgOvridIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshL6560SurrChrgOvridInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL6560SurrChrgOvridInd() {	 
   		return (substring(getStringValue(),beginL6560SurrChrgOvridInd,beginL6560SurrChrgOvridInd + L_6560_SURR_CHRG_OVRID_IND_LEN));
   	}




}
  
