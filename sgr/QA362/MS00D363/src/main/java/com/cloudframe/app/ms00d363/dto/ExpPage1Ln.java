package com.cloudframe.app.ms00d363.dto;

/**
*  The class ExpPage1Ln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ExpPage1Ln extends ExpPage1LnSerialized { 
   

						private char[] exp1Cc = new char[1];


						private char[] exp1Desc = new char[18];

								private char[] exp1FinNbr = Field.fillLowValue(9);


								private char[] exp1FinNbrDen = Field.fillLowValue(9);


						private char[] exp1FinAmt = Field.fillLowValue(18);

						private char[] exp1FinAmtInd = new char[2];


								private char[] exp1FinFeeNbr = Field.fillLowValue(9);


								private char[] exp1PctFeeNbr = Field.fillLowValue(9);


								private char[] exp1NfinFeeNbr = Field.fillLowValue(9);


								private char[] exp1NbilFeeNbr = Field.fillLowValue(9);


						private char[] exp1FeeAmtNet = Field.fillLowValue(16);

						private char[] exp1FeeAmtInd = Field.fillLowValue(2);

	
	/**
	* Constructor for ExpPage1Ln
	**/
    public ExpPage1Ln() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setExp1Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
								setExp1Desc(("EXCEPTION ITEMS   ").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 31
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 41
             ,1
             );
								setExp1FinAmtInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 62
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 72
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 82
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 92
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 102
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 128
             ,5
             );
    }


 

	/**
	 *	Returns the value of exp1Cc
	 *	@return exp1Cc
	 */
   public char[] getExp1Cc() throws CFException{
     if (isExp1CcModified()) { 
        exp1Cc = refreshExp1Cc();
     }
   		return exp1Cc;
   }

  
	/**
	*  set variable exp1Cc
	*  Corresponding COBOL Variable is EXP1-CC
	*  @param value
	**/
   public void setExp1Cc(char[] value) {
      exp1Cc = checkExp1CcConstraints(value);
      serializeExp1Cc(exp1Cc);
   } 

     /**
	 * 	Update Exp1Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExp1Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExp1Cc,exp1Cc.length);
   	
   }
   
   public void setExp1Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExp1Cc,exp1Cc.length);
   	
   }
   
     /**
	 * 	Update Exp1Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExp1Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Exp1Cc with another Field
	 *	@param value
	 */
   public void setExp1Cc(Field source) {
       replace(source,0,source.length(),beginExp1Cc,EXP_1_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Exp1Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExp1Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExp1Cc,EXP_1_CC_LEN);
   	
   }
   
     /**
	 * 	Update Exp1Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExp1Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exp1Desc
	 *	@return exp1Desc
	 */
   public char[] getExp1Desc() throws CFException{
     if (isExp1DescModified()) { 
        exp1Desc = refreshExp1Desc();
     }
   		return exp1Desc;
   }

  
	/**
	*  set variable exp1Desc
	*  Corresponding COBOL Variable is EXP1-DESC
	*  @param value
	**/
   public void setExp1Desc(char[] value) {
      exp1Desc = checkExp1DescConstraints(value);
      serializeExp1Desc(exp1Desc);
   } 

     /**
	 * 	Update Exp1Desc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExp1Desc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExp1Desc,exp1Desc.length);
   	
   }
   
   public void setExp1Desc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExp1Desc,exp1Desc.length);
   	
   }
   
     /**
	 * 	Update Exp1Desc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExp1Desc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1Desc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Exp1Desc with another Field
	 *	@param value
	 */
   public void setExp1Desc(Field source) {
       replace(source,0,source.length(),beginExp1Desc,EXP_1_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Exp1Desc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExp1Desc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExp1Desc,EXP_1_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Exp1Desc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExp1Desc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1Desc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exp1FinNbr
	 *	@return exp1FinNbr
	 */
   public char[] getExp1FinNbr() throws CFException{
     if (isExp1FinNbrModified()) { 
        exp1FinNbr = refreshExp1FinNbr();
     }
   		return exp1FinNbr;
   }

  
	/**
	*  set variable exp1FinNbr
	*  Corresponding COBOL Variable is EXP1-FIN-NBR
	*  @param value
	**/
   public void setExp1FinNbr(char[] value) {
      exp1FinNbr = checkExp1FinNbrConstraints(value);
      serializeExp1FinNbr(exp1FinNbr);
   } 

     /**
	 * 	Update Exp1FinNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExp1FinNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExp1FinNbr,exp1FinNbr.length);
   	
   }
   
   public void setExp1FinNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinNbr,exp1FinNbr.length);
   	
   }
   
     /**
	 * 	Update Exp1FinNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExp1FinNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Exp1FinNbr with another Field
	 *	@param value
	 */
   public void setExp1FinNbr(Field source) {
       replace(source,0,source.length(),beginExp1FinNbr,EXP_1_FIN_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Exp1FinNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExp1FinNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExp1FinNbr,EXP_1_FIN_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Exp1FinNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExp1FinNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exp1FinNbrDen
	 *	@return exp1FinNbrDen
	 */
   public char[] getExp1FinNbrDen() throws CFException{
     if (isExp1FinNbrDenModified()) { 
        exp1FinNbrDen = refreshExp1FinNbrDen();
     }
   		return exp1FinNbrDen;
   }

  
	/**
	*  set variable exp1FinNbrDen
	*  Corresponding COBOL Variable is EXP1-FIN-NBR-DEN
	*  @param value
	**/
   public void setExp1FinNbrDen(char[] value) {
      exp1FinNbrDen = checkExp1FinNbrDenConstraints(value);
      serializeExp1FinNbrDen(exp1FinNbrDen);
   } 

     /**
	 * 	Update Exp1FinNbrDen 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExp1FinNbrDen(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExp1FinNbrDen,exp1FinNbrDen.length);
   	
   }
   
   public void setExp1FinNbrDen(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinNbrDen,exp1FinNbrDen.length);
   	
   }
   
     /**
	 * 	Update Exp1FinNbrDen 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExp1FinNbrDen(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinNbrDen+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Exp1FinNbrDen with another Field
	 *	@param value
	 */
   public void setExp1FinNbrDen(Field source) {
       replace(source,0,source.length(),beginExp1FinNbrDen,EXP_1_FIN_NBR_DEN_LEN);
   	
   }  
   
     /**
	 * 	Update Exp1FinNbrDen 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExp1FinNbrDen(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExp1FinNbrDen,EXP_1_FIN_NBR_DEN_LEN);
   	
   }
   
     /**
	 * 	Update Exp1FinNbrDen 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExp1FinNbrDen(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinNbrDen+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exp1FinAmt
	 *	@return exp1FinAmt
	 */
   public char[] getExp1FinAmt() throws CFException{
     if (isExp1FinAmtModified()) { 
        exp1FinAmt = refreshExp1FinAmt();
     }
   		return exp1FinAmt;
   }

  
	/**
	*  set variable exp1FinAmt
	*  Corresponding COBOL Variable is EXP1-FIN-AMT
	*  @param value
	**/
   public void setExp1FinAmt(char[] value) {
      exp1FinAmt = checkExp1FinAmtConstraints(value);
      serializeExp1FinAmt(exp1FinAmt);
   } 

     /**
	 * 	Update Exp1FinAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExp1FinAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExp1FinAmt,exp1FinAmt.length);
   	
   }
   
   public void setExp1FinAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinAmt,exp1FinAmt.length);
   	
   }
   
     /**
	 * 	Update Exp1FinAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExp1FinAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Exp1FinAmt with another Field
	 *	@param value
	 */
   public void setExp1FinAmt(Field source) {
       replace(source,0,source.length(),beginExp1FinAmt,EXP_1_FIN_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Exp1FinAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExp1FinAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExp1FinAmt,EXP_1_FIN_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Exp1FinAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExp1FinAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exp1FinAmtInd
	 *	@return exp1FinAmtInd
	 */
   public char[] getExp1FinAmtInd() throws CFException{
     if (isExp1FinAmtIndModified()) { 
        exp1FinAmtInd = refreshExp1FinAmtInd();
     }
   		return exp1FinAmtInd;
   }

  
	/**
	*  set variable exp1FinAmtInd
	*  Corresponding COBOL Variable is EXP1-FIN-AMT-IND
	*  @param value
	**/
   public void setExp1FinAmtInd(char[] value) {
      exp1FinAmtInd = checkExp1FinAmtIndConstraints(value);
      serializeExp1FinAmtInd(exp1FinAmtInd);
   } 

     /**
	 * 	Update Exp1FinAmtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExp1FinAmtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExp1FinAmtInd,exp1FinAmtInd.length);
   	
   }
   
   public void setExp1FinAmtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinAmtInd,exp1FinAmtInd.length);
   	
   }
   
     /**
	 * 	Update Exp1FinAmtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExp1FinAmtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinAmtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Exp1FinAmtInd with another Field
	 *	@param value
	 */
   public void setExp1FinAmtInd(Field source) {
       replace(source,0,source.length(),beginExp1FinAmtInd,EXP_1_FIN_AMT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Exp1FinAmtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExp1FinAmtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExp1FinAmtInd,EXP_1_FIN_AMT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Exp1FinAmtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExp1FinAmtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinAmtInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exp1FinFeeNbr
	 *	@return exp1FinFeeNbr
	 */
   public char[] getExp1FinFeeNbr() throws CFException{
     if (isExp1FinFeeNbrModified()) { 
        exp1FinFeeNbr = refreshExp1FinFeeNbr();
     }
   		return exp1FinFeeNbr;
   }

  
	/**
	*  set variable exp1FinFeeNbr
	*  Corresponding COBOL Variable is EXP1-FIN-FEE-NBR
	*  @param value
	**/
   public void setExp1FinFeeNbr(char[] value) {
      exp1FinFeeNbr = checkExp1FinFeeNbrConstraints(value);
      serializeExp1FinFeeNbr(exp1FinFeeNbr);
   } 

     /**
	 * 	Update Exp1FinFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExp1FinFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExp1FinFeeNbr,exp1FinFeeNbr.length);
   	
   }
   
   public void setExp1FinFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinFeeNbr,exp1FinFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Exp1FinFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExp1FinFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Exp1FinFeeNbr with another Field
	 *	@param value
	 */
   public void setExp1FinFeeNbr(Field source) {
       replace(source,0,source.length(),beginExp1FinFeeNbr,EXP_1_FIN_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Exp1FinFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExp1FinFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExp1FinFeeNbr,EXP_1_FIN_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Exp1FinFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExp1FinFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FinFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exp1PctFeeNbr
	 *	@return exp1PctFeeNbr
	 */
   public char[] getExp1PctFeeNbr() throws CFException{
     if (isExp1PctFeeNbrModified()) { 
        exp1PctFeeNbr = refreshExp1PctFeeNbr();
     }
   		return exp1PctFeeNbr;
   }

  
	/**
	*  set variable exp1PctFeeNbr
	*  Corresponding COBOL Variable is EXP1-PCT-FEE-NBR
	*  @param value
	**/
   public void setExp1PctFeeNbr(char[] value) {
      exp1PctFeeNbr = checkExp1PctFeeNbrConstraints(value);
      serializeExp1PctFeeNbr(exp1PctFeeNbr);
   } 

     /**
	 * 	Update Exp1PctFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExp1PctFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExp1PctFeeNbr,exp1PctFeeNbr.length);
   	
   }
   
   public void setExp1PctFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExp1PctFeeNbr,exp1PctFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Exp1PctFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExp1PctFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1PctFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Exp1PctFeeNbr with another Field
	 *	@param value
	 */
   public void setExp1PctFeeNbr(Field source) {
       replace(source,0,source.length(),beginExp1PctFeeNbr,EXP_1_PCT_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Exp1PctFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExp1PctFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExp1PctFeeNbr,EXP_1_PCT_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Exp1PctFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExp1PctFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1PctFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exp1NfinFeeNbr
	 *	@return exp1NfinFeeNbr
	 */
   public char[] getExp1NfinFeeNbr() throws CFException{
     if (isExp1NfinFeeNbrModified()) { 
        exp1NfinFeeNbr = refreshExp1NfinFeeNbr();
     }
   		return exp1NfinFeeNbr;
   }

  
	/**
	*  set variable exp1NfinFeeNbr
	*  Corresponding COBOL Variable is EXP1-NFIN-FEE-NBR
	*  @param value
	**/
   public void setExp1NfinFeeNbr(char[] value) {
      exp1NfinFeeNbr = checkExp1NfinFeeNbrConstraints(value);
      serializeExp1NfinFeeNbr(exp1NfinFeeNbr);
   } 

     /**
	 * 	Update Exp1NfinFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExp1NfinFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExp1NfinFeeNbr,exp1NfinFeeNbr.length);
   	
   }
   
   public void setExp1NfinFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExp1NfinFeeNbr,exp1NfinFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Exp1NfinFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExp1NfinFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1NfinFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Exp1NfinFeeNbr with another Field
	 *	@param value
	 */
   public void setExp1NfinFeeNbr(Field source) {
       replace(source,0,source.length(),beginExp1NfinFeeNbr,EXP_1_NFIN_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Exp1NfinFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExp1NfinFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExp1NfinFeeNbr,EXP_1_NFIN_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Exp1NfinFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExp1NfinFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1NfinFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exp1NbilFeeNbr
	 *	@return exp1NbilFeeNbr
	 */
   public char[] getExp1NbilFeeNbr() throws CFException{
     if (isExp1NbilFeeNbrModified()) { 
        exp1NbilFeeNbr = refreshExp1NbilFeeNbr();
     }
   		return exp1NbilFeeNbr;
   }

  
	/**
	*  set variable exp1NbilFeeNbr
	*  Corresponding COBOL Variable is EXP1-NBIL-FEE-NBR
	*  @param value
	**/
   public void setExp1NbilFeeNbr(char[] value) {
      exp1NbilFeeNbr = checkExp1NbilFeeNbrConstraints(value);
      serializeExp1NbilFeeNbr(exp1NbilFeeNbr);
   } 

     /**
	 * 	Update Exp1NbilFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExp1NbilFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExp1NbilFeeNbr,exp1NbilFeeNbr.length);
   	
   }
   
   public void setExp1NbilFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExp1NbilFeeNbr,exp1NbilFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Exp1NbilFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExp1NbilFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1NbilFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Exp1NbilFeeNbr with another Field
	 *	@param value
	 */
   public void setExp1NbilFeeNbr(Field source) {
       replace(source,0,source.length(),beginExp1NbilFeeNbr,EXP_1_NBIL_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Exp1NbilFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExp1NbilFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExp1NbilFeeNbr,EXP_1_NBIL_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Exp1NbilFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExp1NbilFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1NbilFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exp1FeeAmtNet
	 *	@return exp1FeeAmtNet
	 */
   public char[] getExp1FeeAmtNet() throws CFException{
     if (isExp1FeeAmtNetModified()) { 
        exp1FeeAmtNet = refreshExp1FeeAmtNet();
     }
   		return exp1FeeAmtNet;
   }

  
	/**
	*  set variable exp1FeeAmtNet
	*  Corresponding COBOL Variable is EXP1-FEE-AMT-NET
	*  @param value
	**/
   public void setExp1FeeAmtNet(char[] value) {
      exp1FeeAmtNet = checkExp1FeeAmtNetConstraints(value);
      serializeExp1FeeAmtNet(exp1FeeAmtNet);
   } 

     /**
	 * 	Update Exp1FeeAmtNet 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExp1FeeAmtNet(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExp1FeeAmtNet,exp1FeeAmtNet.length);
   	
   }
   
   public void setExp1FeeAmtNet(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FeeAmtNet,exp1FeeAmtNet.length);
   	
   }
   
     /**
	 * 	Update Exp1FeeAmtNet 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExp1FeeAmtNet(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FeeAmtNet+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Exp1FeeAmtNet with another Field
	 *	@param value
	 */
   public void setExp1FeeAmtNet(Field source) {
       replace(source,0,source.length(),beginExp1FeeAmtNet,EXP_1_FEE_AMT_NET_LEN);
   	
   }  
   
     /**
	 * 	Update Exp1FeeAmtNet 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExp1FeeAmtNet(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExp1FeeAmtNet,EXP_1_FEE_AMT_NET_LEN);
   	
   }
   
     /**
	 * 	Update Exp1FeeAmtNet 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExp1FeeAmtNet(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FeeAmtNet+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exp1FeeAmtInd
	 *	@return exp1FeeAmtInd
	 */
   public char[] getExp1FeeAmtInd() throws CFException{
     if (isExp1FeeAmtIndModified()) { 
        exp1FeeAmtInd = refreshExp1FeeAmtInd();
     }
   		return exp1FeeAmtInd;
   }

  
	/**
	*  set variable exp1FeeAmtInd
	*  Corresponding COBOL Variable is EXP1-FEE-AMT-IND
	*  @param value
	**/
   public void setExp1FeeAmtInd(char[] value) {
      exp1FeeAmtInd = checkExp1FeeAmtIndConstraints(value);
      serializeExp1FeeAmtInd(exp1FeeAmtInd);
   } 

     /**
	 * 	Update Exp1FeeAmtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExp1FeeAmtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExp1FeeAmtInd,exp1FeeAmtInd.length);
   	
   }
   
   public void setExp1FeeAmtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FeeAmtInd,exp1FeeAmtInd.length);
   	
   }
   
     /**
	 * 	Update Exp1FeeAmtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExp1FeeAmtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FeeAmtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Exp1FeeAmtInd with another Field
	 *	@param value
	 */
   public void setExp1FeeAmtInd(Field source) {
       replace(source,0,source.length(),beginExp1FeeAmtInd,EXP_1_FEE_AMT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Exp1FeeAmtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExp1FeeAmtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExp1FeeAmtInd,EXP_1_FEE_AMT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Exp1FeeAmtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExp1FeeAmtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExp1FeeAmtInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getExpPage1LnFieldLength() {
			return EXP_PAGE_1_LN_LENGTH;
		}

}
  
