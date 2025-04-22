package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf31IsoCrncyConvFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Sf31IsoCrncyConvFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf31IsoCrncyConvFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_31_ISO_CRNCY_CONV_FIELDS_LENGTH = 98;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf31IsoDe4TrnAmt;
            protected  int beginSf31IsoDe5SetlAmt;
            protected  int beginSf31IsoDe6CrdhldBillAmt;
            protected  int beginSf31IsoDe9SetlCnvRte;
            protected  int beginSf31IsoDe10CrdhldCnvRte;
            protected  int beginSf31IsoDe49TrnCurCde;
            protected  int beginSf31IsoDe50SetlCurCde;
            protected  int beginSf31IsoDe51CrdhldCurCde;
            protected  int beginSf31IsoDe48Tag42Fld1;
            protected  int beginSf31IsoDe43MrchNmctst;
            protected  int beginSf31IsoDe48Tag84;
	
	/**
	* Constructor for Sf31IsoCrncyConvFieldsSerialized
	**/
    public Sf31IsoCrncyConvFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf31IsoCrncyConvFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoCrncyConvFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf31IsoCrncyConvFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,524); // serialize this field at offset 524 by default 
    }
    
	/**
	* sets parent for this Sf31IsoCrncyConvFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 524 by default
    }    
	/**
	* initializes the field in Sf31IsoCrncyConvFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_31_ISO_CRNCY_CONV_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf31IsoDe4TrnAmt = getStartOffset() + 0;	// set offset for serialization
  
             beginSf31IsoDe5SetlAmt = getStartOffset() + 7;	// set offset for serialization
  
             beginSf31IsoDe6CrdhldBillAmt = getStartOffset() + 14;	// set offset for serialization
  
             beginSf31IsoDe9SetlCnvRte = getStartOffset() + 21;	// set offset for serialization
  
             beginSf31IsoDe10CrdhldCnvRte = getStartOffset() + 29;	// set offset for serialization
  
  
             beginSf31IsoDe49TrnCurCde = getStartOffset() + 45;	// set offset for serialization
  
             beginSf31IsoDe50SetlCurCde = getStartOffset() + 48;	// set offset for serialization
  
             beginSf31IsoDe51CrdhldCurCde = getStartOffset() + 51;	// set offset for serialization
  
             beginSf31IsoDe48Tag42Fld1 = getStartOffset() + 54;	// set offset for serialization
  
             beginSf31IsoDe43MrchNmctst = getStartOffset() + 56;	// set offset for serialization
  
             beginSf31IsoDe48Tag84 = getStartOffset() + 96;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localSf31IsoDe4TrnAmtCounter = -1;
        public boolean isSf31IsoDe4TrnAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSf31IsoDe4TrnAmtCounter != sharedCounter;
           localSf31IsoDe4TrnAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean sf31IsoDe4TrnAmtIsNumeric() {
	      return decimalIsNumeric(beginSf31IsoDe4TrnAmt,SF_31_ISO_DE_4_TRN_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SF_31_ISO_DE_4_TRN_AMT_LEN = 7;
  	/**
	 * 	serializeSf31IsoDe4TrnAmt
	 */
	protected void serializeSf31IsoDe4TrnAmt(long sf31IsoDe4TrnAmt) {
		   putDecimal(beginSf31IsoDe4TrnAmt,sf31IsoDe4TrnAmt,SF_31_ISO_DE_4_TRN_AMT_LEN,false);
   }
   

   protected long checkSf31IsoDe4TrnAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10T /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshSf31IsoDe4TrnAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSf31IsoDe4TrnAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginSf31IsoDe4TrnAmt,SF_31_ISO_DE_4_TRN_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sf31IsoDe4TrnAmt", beginSf31IsoDe4TrnAmt,SF_31_ISO_DE_4_TRN_AMT_LEN);
     }
   	}
        int localSf31IsoDe5SetlAmtCounter = -1;
        public boolean isSf31IsoDe5SetlAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSf31IsoDe5SetlAmtCounter != sharedCounter;
           localSf31IsoDe5SetlAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean sf31IsoDe5SetlAmtIsNumeric() {
	      return decimalIsNumeric(beginSf31IsoDe5SetlAmt,SF_31_ISO_DE_5_SETL_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SF_31_ISO_DE_5_SETL_AMT_LEN = 7;
  	/**
	 * 	serializeSf31IsoDe5SetlAmt
	 */
	protected void serializeSf31IsoDe5SetlAmt(long sf31IsoDe5SetlAmt) {
		   putDecimal(beginSf31IsoDe5SetlAmt,sf31IsoDe5SetlAmt,SF_31_ISO_DE_5_SETL_AMT_LEN,false);
   }
   

   protected long checkSf31IsoDe5SetlAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10T /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshSf31IsoDe5SetlAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSf31IsoDe5SetlAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginSf31IsoDe5SetlAmt,SF_31_ISO_DE_5_SETL_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sf31IsoDe5SetlAmt", beginSf31IsoDe5SetlAmt,SF_31_ISO_DE_5_SETL_AMT_LEN);
     }
   	}
        int localSf31IsoDe6CrdhldBillAmtCounter = -1;
        public boolean isSf31IsoDe6CrdhldBillAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSf31IsoDe6CrdhldBillAmtCounter != sharedCounter;
           localSf31IsoDe6CrdhldBillAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean sf31IsoDe6CrdhldBillAmtIsNumeric() {
	      return decimalIsNumeric(beginSf31IsoDe6CrdhldBillAmt,SF_31_ISO_DE_6_CRDHLD_BILL_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SF_31_ISO_DE_6_CRDHLD_BILL_AMT_LEN = 7;
  	/**
	 * 	serializeSf31IsoDe6CrdhldBillAmt
	 */
	protected void serializeSf31IsoDe6CrdhldBillAmt(long sf31IsoDe6CrdhldBillAmt) {
		   putDecimal(beginSf31IsoDe6CrdhldBillAmt,sf31IsoDe6CrdhldBillAmt,SF_31_ISO_DE_6_CRDHLD_BILL_AMT_LEN,false);
   }
   

   protected long checkSf31IsoDe6CrdhldBillAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10T /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshSf31IsoDe6CrdhldBillAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSf31IsoDe6CrdhldBillAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginSf31IsoDe6CrdhldBillAmt,SF_31_ISO_DE_6_CRDHLD_BILL_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sf31IsoDe6CrdhldBillAmt", beginSf31IsoDe6CrdhldBillAmt,SF_31_ISO_DE_6_CRDHLD_BILL_AMT_LEN);
     }
   	}
     int localSf31IsoDe9SetlCnvRteCounter = -1;
     public boolean isSf31IsoDe9SetlCnvRteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe9SetlCnvRteCounter != sharedCounter;
         localSf31IsoDe9SetlCnvRteCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_9_SETL_CNV_RTE_LEN = 8;
	/**
	 * 	serialize this Sf31IsoDe9SetlCnvRte
	 */
   protected void serializeSf31IsoDe9SetlCnvRte(char[] sf31IsoDe9SetlCnvRte) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe9SetlCnvRte,0,getStringValue(),beginSf31IsoDe9SetlCnvRte,SF_31_ISO_DE_9_SETL_CNV_RTE_LEN);
       localSf31IsoDe9SetlCnvRteCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe9SetlCnvRteConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe9SetlCnvRte is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe9SetlCnvRte() {	 
   		return (substring(getStringValue(),beginSf31IsoDe9SetlCnvRte,beginSf31IsoDe9SetlCnvRte + SF_31_ISO_DE_9_SETL_CNV_RTE_LEN));
   	}
     int localSf31IsoDe10CrdhldCnvRteCounter = -1;
     public boolean isSf31IsoDe10CrdhldCnvRteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe10CrdhldCnvRteCounter != sharedCounter;
         localSf31IsoDe10CrdhldCnvRteCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_10_CRDHLD_CNV_RTE_LEN = 8;
	/**
	 * 	serialize this Sf31IsoDe10CrdhldCnvRte
	 */
   protected void serializeSf31IsoDe10CrdhldCnvRte(char[] sf31IsoDe10CrdhldCnvRte) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe10CrdhldCnvRte,0,getStringValue(),beginSf31IsoDe10CrdhldCnvRte,SF_31_ISO_DE_10_CRDHLD_CNV_RTE_LEN);
       localSf31IsoDe10CrdhldCnvRteCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe10CrdhldCnvRteConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe10CrdhldCnvRte is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe10CrdhldCnvRte() {	 
   		return (substring(getStringValue(),beginSf31IsoDe10CrdhldCnvRte,beginSf31IsoDe10CrdhldCnvRte + SF_31_ISO_DE_10_CRDHLD_CNV_RTE_LEN));
   	}
     int localSf31IsoDe49TrnCurCdeCounter = -1;
     public boolean isSf31IsoDe49TrnCurCdeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe49TrnCurCdeCounter != sharedCounter;
         localSf31IsoDe49TrnCurCdeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_49_TRN_CUR_CDE_LEN = 3;
	/**
	 * 	serialize this Sf31IsoDe49TrnCurCde
	 */
   protected void serializeSf31IsoDe49TrnCurCde(char[] sf31IsoDe49TrnCurCde) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe49TrnCurCde,0,getStringValue(),beginSf31IsoDe49TrnCurCde,SF_31_ISO_DE_49_TRN_CUR_CDE_LEN);
       localSf31IsoDe49TrnCurCdeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe49TrnCurCdeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe49TrnCurCde is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe49TrnCurCde() {	 
   		return (substring(getStringValue(),beginSf31IsoDe49TrnCurCde,beginSf31IsoDe49TrnCurCde + SF_31_ISO_DE_49_TRN_CUR_CDE_LEN));
   	}
     int localSf31IsoDe50SetlCurCdeCounter = -1;
     public boolean isSf31IsoDe50SetlCurCdeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe50SetlCurCdeCounter != sharedCounter;
         localSf31IsoDe50SetlCurCdeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_50_SETL_CUR_CDE_LEN = 3;
	/**
	 * 	serialize this Sf31IsoDe50SetlCurCde
	 */
   protected void serializeSf31IsoDe50SetlCurCde(char[] sf31IsoDe50SetlCurCde) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe50SetlCurCde,0,getStringValue(),beginSf31IsoDe50SetlCurCde,SF_31_ISO_DE_50_SETL_CUR_CDE_LEN);
       localSf31IsoDe50SetlCurCdeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe50SetlCurCdeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe50SetlCurCde is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe50SetlCurCde() {	 
   		return (substring(getStringValue(),beginSf31IsoDe50SetlCurCde,beginSf31IsoDe50SetlCurCde + SF_31_ISO_DE_50_SETL_CUR_CDE_LEN));
   	}
     int localSf31IsoDe51CrdhldCurCdeCounter = -1;
     public boolean isSf31IsoDe51CrdhldCurCdeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe51CrdhldCurCdeCounter != sharedCounter;
         localSf31IsoDe51CrdhldCurCdeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_51_CRDHLD_CUR_CDE_LEN = 3;
	/**
	 * 	serialize this Sf31IsoDe51CrdhldCurCde
	 */
   protected void serializeSf31IsoDe51CrdhldCurCde(char[] sf31IsoDe51CrdhldCurCde) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe51CrdhldCurCde,0,getStringValue(),beginSf31IsoDe51CrdhldCurCde,SF_31_ISO_DE_51_CRDHLD_CUR_CDE_LEN);
       localSf31IsoDe51CrdhldCurCdeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe51CrdhldCurCdeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe51CrdhldCurCde is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe51CrdhldCurCde() {	 
   		return (substring(getStringValue(),beginSf31IsoDe51CrdhldCurCde,beginSf31IsoDe51CrdhldCurCde + SF_31_ISO_DE_51_CRDHLD_CUR_CDE_LEN));
   	}
     int localSf31IsoDe48Tag42Fld1Counter = -1;
     public boolean isSf31IsoDe48Tag42Fld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Tag42Fld1Counter != sharedCounter;
         localSf31IsoDe48Tag42Fld1Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_TAG_42_FLD_1_LEN = 2;
	/**
	 * 	serialize this Sf31IsoDe48Tag42Fld1
	 */
   protected void serializeSf31IsoDe48Tag42Fld1(char[] sf31IsoDe48Tag42Fld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Tag42Fld1,0,getStringValue(),beginSf31IsoDe48Tag42Fld1,SF_31_ISO_DE_48_TAG_42_FLD_1_LEN);
       localSf31IsoDe48Tag42Fld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Tag42Fld1Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Tag42Fld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Tag42Fld1() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Tag42Fld1,beginSf31IsoDe48Tag42Fld1 + SF_31_ISO_DE_48_TAG_42_FLD_1_LEN));
   	}
     int localSf31IsoDe43MrchNmctstCounter = -1;
     public boolean isSf31IsoDe43MrchNmctstModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe43MrchNmctstCounter != sharedCounter;
         localSf31IsoDe43MrchNmctstCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_43_MRCH_NMCTST_LEN = 40;
	/**
	 * 	serialize this Sf31IsoDe43MrchNmctst
	 */
   protected void serializeSf31IsoDe43MrchNmctst(char[] sf31IsoDe43MrchNmctst) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe43MrchNmctst,0,getStringValue(),beginSf31IsoDe43MrchNmctst,SF_31_ISO_DE_43_MRCH_NMCTST_LEN);
       localSf31IsoDe43MrchNmctstCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe43MrchNmctstConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe43MrchNmctst is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe43MrchNmctst() {	 
   		return (substring(getStringValue(),beginSf31IsoDe43MrchNmctst,beginSf31IsoDe43MrchNmctst + SF_31_ISO_DE_43_MRCH_NMCTST_LEN));
   	}
     int localSf31IsoDe48Tag84Counter = -1;
     public boolean isSf31IsoDe48Tag84Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Tag84Counter != sharedCounter;
         localSf31IsoDe48Tag84Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_TAG_84_LEN = 2;
	/**
	 * 	serialize this Sf31IsoDe48Tag84
	 */
   protected void serializeSf31IsoDe48Tag84(char[] sf31IsoDe48Tag84) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Tag84,0,getStringValue(),beginSf31IsoDe48Tag84,SF_31_ISO_DE_48_TAG_84_LEN);
       localSf31IsoDe48Tag84Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Tag84Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Tag84 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Tag84() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Tag84,beginSf31IsoDe48Tag84 + SF_31_ISO_DE_48_TAG_84_LEN));
   	}




}
  
