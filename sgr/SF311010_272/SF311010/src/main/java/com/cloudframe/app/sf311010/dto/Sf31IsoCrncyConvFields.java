package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoCrncyConvFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf31IsoCrncyConvFields extends Sf31IsoCrncyConvFieldsSerialized { 
   

								private long sf31IsoDe4TrnAmt;

								private long sf31IsoDe5SetlAmt;

								private long sf31IsoDe6CrdhldBillAmt;

						private char[] sf31IsoDe9SetlCnvRte = new char[8];

						private char[] sf31IsoDe10CrdhldCnvRte = new char[8];
				private Sf31IsoCnvDteCcyymmdd sf31IsoCnvDteCcyymmdd = new Sf31IsoCnvDteCcyymmdd();

						private char[] sf31IsoDe49TrnCurCde = new char[3];

						private char[] sf31IsoDe50SetlCurCde = new char[3];

						private char[] sf31IsoDe51CrdhldCurCde = new char[3];

						private char[] sf31IsoDe48Tag42Fld1 = new char[2];

						private char[] sf31IsoDe43MrchNmctst = new char[40];

						private char[] sf31IsoDe48Tag84 = new char[2];
	
	/**
	* Constructor for Sf31IsoCrncyConvFields
	**/
    public Sf31IsoCrncyConvFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf31IsoCrncyConvFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoCrncyConvFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sf31IsoCnvDteCcyymmdd.setParent(this,getStartOffset() + 37);
								setSf31IsoDe4TrnAmt(0L);
								setSf31IsoDe5SetlAmt(0L);
								setSf31IsoDe6CrdhldBillAmt(0L);
								setSf31IsoDe9SetlCnvRte(fillSpace(8));
								setSf31IsoDe10CrdhldCnvRte(fillSpace(8));
								setSf31IsoDe49TrnCurCde(fillSpace(3));
								setSf31IsoDe50SetlCurCde(fillSpace(3));
								setSf31IsoDe51CrdhldCurCde(fillSpace(3));
								setSf31IsoDe48Tag42Fld1(fillSpace(2));
								setSf31IsoDe43MrchNmctst(fillSpace(40));
								setSf31IsoDe48Tag84(fillSpace(2));
    } 

	public long getSf31IsoDe4TrnAmt() throws CFException {
        if (isSf31IsoDe4TrnAmtModified()) { 
           sf31IsoDe4TrnAmt = refreshSf31IsoDe4TrnAmt();
        }
   		return sf31IsoDe4TrnAmt;
	}
	
	/**
	 * 	Update Sf31IsoDe4TrnAmt with the passed value
	 *  Corresponding COBOL Variable is SF31-ISO-DE4-TRN-AMT
	 *	@param number
	 */
	public void setSf31IsoDe4TrnAmt(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			sf31IsoDe4TrnAmt = checkSf31IsoDe4TrnAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSf31IsoDe4TrnAmt(sf31IsoDe4TrnAmt);
	}


	public long getSf31IsoDe5SetlAmt() throws CFException {
        if (isSf31IsoDe5SetlAmtModified()) { 
           sf31IsoDe5SetlAmt = refreshSf31IsoDe5SetlAmt();
        }
   		return sf31IsoDe5SetlAmt;
	}
	
	/**
	 * 	Update Sf31IsoDe5SetlAmt with the passed value
	 *  Corresponding COBOL Variable is SF31-ISO-DE5-SETL-AMT
	 *	@param number
	 */
	public void setSf31IsoDe5SetlAmt(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			sf31IsoDe5SetlAmt = checkSf31IsoDe5SetlAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSf31IsoDe5SetlAmt(sf31IsoDe5SetlAmt);
	}


	public long getSf31IsoDe6CrdhldBillAmt() throws CFException {
        if (isSf31IsoDe6CrdhldBillAmtModified()) { 
           sf31IsoDe6CrdhldBillAmt = refreshSf31IsoDe6CrdhldBillAmt();
        }
   		return sf31IsoDe6CrdhldBillAmt;
	}
	
	/**
	 * 	Update Sf31IsoDe6CrdhldBillAmt with the passed value
	 *  Corresponding COBOL Variable is SF31-ISO-DE6-CRDHLD-BILL-AMT
	 *	@param number
	 */
	public void setSf31IsoDe6CrdhldBillAmt(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			sf31IsoDe6CrdhldBillAmt = checkSf31IsoDe6CrdhldBillAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSf31IsoDe6CrdhldBillAmt(sf31IsoDe6CrdhldBillAmt);
	}


	/**
	 *	Returns the value of sf31IsoDe9SetlCnvRte
	 *	@return sf31IsoDe9SetlCnvRte
	 */
   public char[] getSf31IsoDe9SetlCnvRte() throws CFException{
     if (isSf31IsoDe9SetlCnvRteModified()) { 
        sf31IsoDe9SetlCnvRte = refreshSf31IsoDe9SetlCnvRte();
     }
   		return sf31IsoDe9SetlCnvRte;
   }

  
	/**
	*  set variable sf31IsoDe9SetlCnvRte
	*  Corresponding COBOL Variable is SF31-ISO-DE9-SETL-CNV-RTE
	*  @param value
	**/
   public void setSf31IsoDe9SetlCnvRte(char[] value) {
      sf31IsoDe9SetlCnvRte = checkSf31IsoDe9SetlCnvRteConstraints(value);
      serializeSf31IsoDe9SetlCnvRte(sf31IsoDe9SetlCnvRte);
   } 

     /**
	 * 	Update Sf31IsoDe9SetlCnvRte 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe9SetlCnvRte(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe9SetlCnvRte,sf31IsoDe9SetlCnvRte.length);
   	
   }
   
   public void setSf31IsoDe9SetlCnvRte(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe9SetlCnvRte,sf31IsoDe9SetlCnvRte.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe9SetlCnvRte 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe9SetlCnvRte(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe9SetlCnvRte+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe9SetlCnvRte with another Field
	 *	@param value
	 */
   public void setSf31IsoDe9SetlCnvRte(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe9SetlCnvRte,SF_31_ISO_DE_9_SETL_CNV_RTE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe9SetlCnvRte 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe9SetlCnvRte(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe9SetlCnvRte,SF_31_ISO_DE_9_SETL_CNV_RTE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe9SetlCnvRte 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe9SetlCnvRte(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe9SetlCnvRte+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe10CrdhldCnvRte
	 *	@return sf31IsoDe10CrdhldCnvRte
	 */
   public char[] getSf31IsoDe10CrdhldCnvRte() throws CFException{
     if (isSf31IsoDe10CrdhldCnvRteModified()) { 
        sf31IsoDe10CrdhldCnvRte = refreshSf31IsoDe10CrdhldCnvRte();
     }
   		return sf31IsoDe10CrdhldCnvRte;
   }

  
	/**
	*  set variable sf31IsoDe10CrdhldCnvRte
	*  Corresponding COBOL Variable is SF31-ISO-DE10-CRDHLD-CNV-RTE
	*  @param value
	**/
   public void setSf31IsoDe10CrdhldCnvRte(char[] value) {
      sf31IsoDe10CrdhldCnvRte = checkSf31IsoDe10CrdhldCnvRteConstraints(value);
      serializeSf31IsoDe10CrdhldCnvRte(sf31IsoDe10CrdhldCnvRte);
   } 

     /**
	 * 	Update Sf31IsoDe10CrdhldCnvRte 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe10CrdhldCnvRte(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe10CrdhldCnvRte,sf31IsoDe10CrdhldCnvRte.length);
   	
   }
   
   public void setSf31IsoDe10CrdhldCnvRte(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe10CrdhldCnvRte,sf31IsoDe10CrdhldCnvRte.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe10CrdhldCnvRte 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe10CrdhldCnvRte(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe10CrdhldCnvRte+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe10CrdhldCnvRte with another Field
	 *	@param value
	 */
   public void setSf31IsoDe10CrdhldCnvRte(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe10CrdhldCnvRte,SF_31_ISO_DE_10_CRDHLD_CNV_RTE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe10CrdhldCnvRte 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe10CrdhldCnvRte(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe10CrdhldCnvRte,SF_31_ISO_DE_10_CRDHLD_CNV_RTE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe10CrdhldCnvRte 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe10CrdhldCnvRte(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe10CrdhldCnvRte+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoCnvDteCcyymmdd
	 *	@return sf31IsoCnvDteCcyymmdd
	 */   
	 public Sf31IsoCnvDteCcyymmdd getSf31IsoCnvDteCcyymmdd() {
   	return sf31IsoCnvDteCcyymmdd;
   }
   /**
	* 	Update Sf31IsoCnvDteCcyymmdd with the passed value
	*   Corresponding COBOL Variable is SF31-ISO-CNV-DTE-CCYYMMDD
	*	@param value
	*/
   public void setSf31IsoCnvDteCcyymmdd(char[] value) {
      sf31IsoCnvDteCcyymmdd.setString(value); 
   }   
    
     /**
	 * 	Update Sf31IsoCnvDteCcyymmdd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoCnvDteCcyymmdd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoCnvDteCcyymmdd.begin,sf31IsoCnvDteCcyymmdd.length());
   }
   
     /**
	 * 	Update Sf31IsoCnvDteCcyymmdd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCnvDteCcyymmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoCnvDteCcyymmdd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf31IsoCnvDteCcyymmdd with another Field
	 *	@param value
	 */
   public void setSf31IsoCnvDteCcyymmdd(Field source) {
   	replace(source,0,source.length(),sf31IsoCnvDteCcyymmdd.begin,sf31IsoCnvDteCcyymmdd.length());
   }  
   
     /**
	 * 	Update Sf31IsoCnvDteCcyymmdd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoCnvDteCcyymmdd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoCnvDteCcyymmdd.begin,sf31IsoCnvDteCcyymmdd.length());
   }
   
     /**
	 * 	Update Sf31IsoCnvDteCcyymmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCnvDteCcyymmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoCnvDteCcyymmdd.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf31IsoDe49TrnCurCde
	 *	@return sf31IsoDe49TrnCurCde
	 */
   public char[] getSf31IsoDe49TrnCurCde() throws CFException{
     if (isSf31IsoDe49TrnCurCdeModified()) { 
        sf31IsoDe49TrnCurCde = refreshSf31IsoDe49TrnCurCde();
     }
   		return sf31IsoDe49TrnCurCde;
   }

  
	/**
	*  set variable sf31IsoDe49TrnCurCde
	*  Corresponding COBOL Variable is SF31-ISO-DE49-TRN-CUR-CDE
	*  @param value
	**/
   public void setSf31IsoDe49TrnCurCde(char[] value) {
      sf31IsoDe49TrnCurCde = checkSf31IsoDe49TrnCurCdeConstraints(value);
      serializeSf31IsoDe49TrnCurCde(sf31IsoDe49TrnCurCde);
   } 

     /**
	 * 	Update Sf31IsoDe49TrnCurCde 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe49TrnCurCde(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe49TrnCurCde,sf31IsoDe49TrnCurCde.length);
   	
   }
   
   public void setSf31IsoDe49TrnCurCde(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe49TrnCurCde,sf31IsoDe49TrnCurCde.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe49TrnCurCde 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe49TrnCurCde(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe49TrnCurCde+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe49TrnCurCde with another Field
	 *	@param value
	 */
   public void setSf31IsoDe49TrnCurCde(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe49TrnCurCde,SF_31_ISO_DE_49_TRN_CUR_CDE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe49TrnCurCde 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe49TrnCurCde(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe49TrnCurCde,SF_31_ISO_DE_49_TRN_CUR_CDE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe49TrnCurCde 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe49TrnCurCde(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe49TrnCurCde+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe50SetlCurCde
	 *	@return sf31IsoDe50SetlCurCde
	 */
   public char[] getSf31IsoDe50SetlCurCde() throws CFException{
     if (isSf31IsoDe50SetlCurCdeModified()) { 
        sf31IsoDe50SetlCurCde = refreshSf31IsoDe50SetlCurCde();
     }
   		return sf31IsoDe50SetlCurCde;
   }

  
	/**
	*  set variable sf31IsoDe50SetlCurCde
	*  Corresponding COBOL Variable is SF31-ISO-DE50-SETL-CUR-CDE
	*  @param value
	**/
   public void setSf31IsoDe50SetlCurCde(char[] value) {
      sf31IsoDe50SetlCurCde = checkSf31IsoDe50SetlCurCdeConstraints(value);
      serializeSf31IsoDe50SetlCurCde(sf31IsoDe50SetlCurCde);
   } 

     /**
	 * 	Update Sf31IsoDe50SetlCurCde 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe50SetlCurCde(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe50SetlCurCde,sf31IsoDe50SetlCurCde.length);
   	
   }
   
   public void setSf31IsoDe50SetlCurCde(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe50SetlCurCde,sf31IsoDe50SetlCurCde.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe50SetlCurCde 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe50SetlCurCde(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe50SetlCurCde+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe50SetlCurCde with another Field
	 *	@param value
	 */
   public void setSf31IsoDe50SetlCurCde(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe50SetlCurCde,SF_31_ISO_DE_50_SETL_CUR_CDE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe50SetlCurCde 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe50SetlCurCde(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe50SetlCurCde,SF_31_ISO_DE_50_SETL_CUR_CDE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe50SetlCurCde 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe50SetlCurCde(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe50SetlCurCde+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe51CrdhldCurCde
	 *	@return sf31IsoDe51CrdhldCurCde
	 */
   public char[] getSf31IsoDe51CrdhldCurCde() throws CFException{
     if (isSf31IsoDe51CrdhldCurCdeModified()) { 
        sf31IsoDe51CrdhldCurCde = refreshSf31IsoDe51CrdhldCurCde();
     }
   		return sf31IsoDe51CrdhldCurCde;
   }

  
	/**
	*  set variable sf31IsoDe51CrdhldCurCde
	*  Corresponding COBOL Variable is SF31-ISO-DE51-CRDHLD-CUR-CDE
	*  @param value
	**/
   public void setSf31IsoDe51CrdhldCurCde(char[] value) {
      sf31IsoDe51CrdhldCurCde = checkSf31IsoDe51CrdhldCurCdeConstraints(value);
      serializeSf31IsoDe51CrdhldCurCde(sf31IsoDe51CrdhldCurCde);
   } 

     /**
	 * 	Update Sf31IsoDe51CrdhldCurCde 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe51CrdhldCurCde(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe51CrdhldCurCde,sf31IsoDe51CrdhldCurCde.length);
   	
   }
   
   public void setSf31IsoDe51CrdhldCurCde(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe51CrdhldCurCde,sf31IsoDe51CrdhldCurCde.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe51CrdhldCurCde 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe51CrdhldCurCde(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe51CrdhldCurCde+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe51CrdhldCurCde with another Field
	 *	@param value
	 */
   public void setSf31IsoDe51CrdhldCurCde(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe51CrdhldCurCde,SF_31_ISO_DE_51_CRDHLD_CUR_CDE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe51CrdhldCurCde 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe51CrdhldCurCde(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe51CrdhldCurCde,SF_31_ISO_DE_51_CRDHLD_CUR_CDE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe51CrdhldCurCde 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe51CrdhldCurCde(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe51CrdhldCurCde+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Tag42Fld1
	 *	@return sf31IsoDe48Tag42Fld1
	 */
   public char[] getSf31IsoDe48Tag42Fld1() throws CFException{
     if (isSf31IsoDe48Tag42Fld1Modified()) { 
        sf31IsoDe48Tag42Fld1 = refreshSf31IsoDe48Tag42Fld1();
     }
   		return sf31IsoDe48Tag42Fld1;
   }

  
	/**
	*  set variable sf31IsoDe48Tag42Fld1
	*  Corresponding COBOL Variable is SF31-ISO-DE48-TAG42-FLD1
	*  @param value
	**/
   public void setSf31IsoDe48Tag42Fld1(char[] value) {
      sf31IsoDe48Tag42Fld1 = checkSf31IsoDe48Tag42Fld1Constraints(value);
      serializeSf31IsoDe48Tag42Fld1(sf31IsoDe48Tag42Fld1);
   } 

     /**
	 * 	Update Sf31IsoDe48Tag42Fld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Tag42Fld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Tag42Fld1,sf31IsoDe48Tag42Fld1.length);
   	
   }
   
   public void setSf31IsoDe48Tag42Fld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag42Fld1,sf31IsoDe48Tag42Fld1.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Tag42Fld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Tag42Fld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag42Fld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Tag42Fld1 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Tag42Fld1(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Tag42Fld1,SF_31_ISO_DE_48_TAG_42_FLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Tag42Fld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Tag42Fld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag42Fld1,SF_31_ISO_DE_48_TAG_42_FLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Tag42Fld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Tag42Fld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag42Fld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe43MrchNmctst
	 *	@return sf31IsoDe43MrchNmctst
	 */
   public char[] getSf31IsoDe43MrchNmctst() throws CFException{
     if (isSf31IsoDe43MrchNmctstModified()) { 
        sf31IsoDe43MrchNmctst = refreshSf31IsoDe43MrchNmctst();
     }
   		return sf31IsoDe43MrchNmctst;
   }

  
	/**
	*  set variable sf31IsoDe43MrchNmctst
	*  Corresponding COBOL Variable is SF31-ISO-DE43-MRCH-NMCTST
	*  @param value
	**/
   public void setSf31IsoDe43MrchNmctst(char[] value) {
      sf31IsoDe43MrchNmctst = checkSf31IsoDe43MrchNmctstConstraints(value);
      serializeSf31IsoDe43MrchNmctst(sf31IsoDe43MrchNmctst);
   } 

     /**
	 * 	Update Sf31IsoDe43MrchNmctst 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe43MrchNmctst(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe43MrchNmctst,sf31IsoDe43MrchNmctst.length);
   	
   }
   
   public void setSf31IsoDe43MrchNmctst(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe43MrchNmctst,sf31IsoDe43MrchNmctst.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe43MrchNmctst 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe43MrchNmctst(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe43MrchNmctst+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe43MrchNmctst with another Field
	 *	@param value
	 */
   public void setSf31IsoDe43MrchNmctst(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe43MrchNmctst,SF_31_ISO_DE_43_MRCH_NMCTST_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe43MrchNmctst 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe43MrchNmctst(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe43MrchNmctst,SF_31_ISO_DE_43_MRCH_NMCTST_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe43MrchNmctst 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe43MrchNmctst(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe43MrchNmctst+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Tag84
	 *	@return sf31IsoDe48Tag84
	 */
   public char[] getSf31IsoDe48Tag84() throws CFException{
     if (isSf31IsoDe48Tag84Modified()) { 
        sf31IsoDe48Tag84 = refreshSf31IsoDe48Tag84();
     }
   		return sf31IsoDe48Tag84;
   }

  
	/**
	*  set variable sf31IsoDe48Tag84
	*  Corresponding COBOL Variable is SF31-ISO-DE48-TAG84
	*  @param value
	**/
   public void setSf31IsoDe48Tag84(char[] value) {
      sf31IsoDe48Tag84 = checkSf31IsoDe48Tag84Constraints(value);
      serializeSf31IsoDe48Tag84(sf31IsoDe48Tag84);
   } 

     /**
	 * 	Update Sf31IsoDe48Tag84 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Tag84(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Tag84,sf31IsoDe48Tag84.length);
   	
   }
   
   public void setSf31IsoDe48Tag84(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag84,sf31IsoDe48Tag84.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Tag84 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Tag84(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag84+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Tag84 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Tag84(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Tag84,SF_31_ISO_DE_48_TAG_84_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Tag84 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Tag84(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag84,SF_31_ISO_DE_48_TAG_84_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Tag84 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Tag84(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag84+targetIndex,targetLen);
    
   }
	char[] sf31IsoMaNewAccount8888Value = "01".toCharArray();
	/**
	 *	Test condition "01" for isSf31IsoMaNewAccount88()
	 *	@return  Returns true if isSf31IsoMaNewAccount88() is "01"
	 */
   public boolean isSf31IsoMaNewAccount88() throws CFException {
      return (  compareChars( getSf31IsoDe48Tag84() , sf31IsoMaNewAccount8888Value)  == 0  );
   }


	/**
	*  set values "01"
	*/
   	public void setSf31IsoMaNewAccount88True() {  			
    	setSf31IsoDe48Tag84( sf31IsoMaNewAccount8888Value);
   	}
	char[] sf31IsoMaTryLater8888Value = "02".toCharArray();
	/**
	 *	Test condition "02" for isSf31IsoMaTryLater88()
	 *	@return  Returns true if isSf31IsoMaTryLater88() is "02"
	 */
   public boolean isSf31IsoMaTryLater88() throws CFException {
      return (  compareChars( getSf31IsoDe48Tag84() , sf31IsoMaTryLater8888Value)  == 0  );
   }


	/**
	*  set values "02"
	*/
   	public void setSf31IsoMaTryLater88True() {  			
    	setSf31IsoDe48Tag84( sf31IsoMaTryLater8888Value);
   	}
	char[] sf31IsoMaNotTryLater8888Value = "03".toCharArray();
	/**
	 *	Test condition "03" for isSf31IsoMaNotTryLater88()
	 *	@return  Returns true if isSf31IsoMaNotTryLater88() is "03"
	 */
   public boolean isSf31IsoMaNotTryLater88() throws CFException {
      return (  compareChars( getSf31IsoDe48Tag84() , sf31IsoMaNotTryLater8888Value)  == 0  );
   }


	/**
	*  set values "03"
	*/
   	public void setSf31IsoMaNotTryLater88True() {  			
    	setSf31IsoDe48Tag84( sf31IsoMaNotTryLater8888Value);
   	}

	
	
	

		public static int getSf31IsoCrncyConvFieldsFieldLength() {
			return SF_31_ISO_CRNCY_CONV_FIELDS_LENGTH;
		}

}
  
