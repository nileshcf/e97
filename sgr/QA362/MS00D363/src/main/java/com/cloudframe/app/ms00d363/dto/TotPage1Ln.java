package com.cloudframe.app.ms00d363.dto;

/**
*  The class TotPage1Ln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TotPage1Ln extends TotPage1LnSerialized {
   

						private char[] tot1Cc = new char[1];


						private char[] tot1Desc = new char[16];

								private char[] tot1FinNbr = Field.fillLowValue(11);


								private char[] tot1FinNbrDen = Field.fillLowValue(9);


						private char[] tot1FinAmt = Field.fillLowValue(18);

						private char[] tot1FinAmtInd = new char[2];


								private char[] tot1FinFeeNbr = Field.fillLowValue(9);


								private char[] tot1PctFeeNbr = Field.fillLowValue(9);


								private char[] tot1NfinFeeNbr = Field.fillLowValue(9);


								private char[] tot1NbilFeeNbr = Field.fillLowValue(9);


						private char[] tot1FeeAmtNet = Field.fillLowValue(20);

						private char[] tot1FeeAmtInd = Field.fillLowValue(2);

	
	/**
	* Constructor for TotPage1Ln
	**/
    public TotPage1Ln() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTot1Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
								setTot1Desc(("    TOTALS      ").toCharArray());
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
								setTot1FinAmtInd(fillSpace(2));
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
             fillSpace(4)
             , getStartOffset() + 102
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 128
             ,5
             );
    }


 

	/**
	 *	Returns the value of tot1Cc
	 *	@return tot1Cc
	 */
   public char[] getTot1Cc() throws CFException{
     if (isTot1CcModified()) { 
        tot1Cc = refreshTot1Cc();
     }
   		return tot1Cc;
   }

  
	/**
	*  set variable tot1Cc
	*  Corresponding COBOL Variable is TOT1-CC
	*  @param value
	**/
   public void setTot1Cc(char[] value) {
      tot1Cc = checkTot1CcConstraints(value);
      serializeTot1Cc(tot1Cc);
   } 

     /**
	 * 	Update Tot1Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTot1Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTot1Cc,tot1Cc.length);
   	
   }
   
   public void setTot1Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTot1Cc,tot1Cc.length);
   	
   }
   
     /**
	 * 	Update Tot1Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTot1Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tot1Cc with another Field
	 *	@param value
	 */
   public void setTot1Cc(Field source) {
       replace(source,0,source.length(),beginTot1Cc,TOT_1_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Tot1Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTot1Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTot1Cc,TOT_1_CC_LEN);
   	
   }
   
     /**
	 * 	Update Tot1Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTot1Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tot1Desc
	 *	@return tot1Desc
	 */
   public char[] getTot1Desc() throws CFException{
     if (isTot1DescModified()) { 
        tot1Desc = refreshTot1Desc();
     }
   		return tot1Desc;
   }

  
	/**
	*  set variable tot1Desc
	*  Corresponding COBOL Variable is TOT1-DESC
	*  @param value
	**/
   public void setTot1Desc(char[] value) {
      tot1Desc = checkTot1DescConstraints(value);
      serializeTot1Desc(tot1Desc);
   } 

     /**
	 * 	Update Tot1Desc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTot1Desc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTot1Desc,tot1Desc.length);
   	
   }
   
   public void setTot1Desc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTot1Desc,tot1Desc.length);
   	
   }
   
     /**
	 * 	Update Tot1Desc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTot1Desc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1Desc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tot1Desc with another Field
	 *	@param value
	 */
   public void setTot1Desc(Field source) {
       replace(source,0,source.length(),beginTot1Desc,TOT_1_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Tot1Desc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTot1Desc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTot1Desc,TOT_1_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Tot1Desc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTot1Desc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1Desc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tot1FinNbr
	 *	@return tot1FinNbr
	 */
   public char[] getTot1FinNbr() throws CFException{
     if (isTot1FinNbrModified()) { 
        tot1FinNbr = refreshTot1FinNbr();
     }
   		return tot1FinNbr;
   }

  
	/**
	*  set variable tot1FinNbr
	*  Corresponding COBOL Variable is TOT1-FIN-NBR
	*  @param value
	**/
   public void setTot1FinNbr(char[] value) {
      tot1FinNbr = checkTot1FinNbrConstraints(value);
      serializeTot1FinNbr(tot1FinNbr);
   } 

     /**
	 * 	Update Tot1FinNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTot1FinNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTot1FinNbr,tot1FinNbr.length);
   	
   }
   
   public void setTot1FinNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinNbr,tot1FinNbr.length);
   	
   }
   
     /**
	 * 	Update Tot1FinNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTot1FinNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tot1FinNbr with another Field
	 *	@param value
	 */
   public void setTot1FinNbr(Field source) {
       replace(source,0,source.length(),beginTot1FinNbr,TOT_1_FIN_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Tot1FinNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTot1FinNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTot1FinNbr,TOT_1_FIN_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Tot1FinNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTot1FinNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tot1FinNbrDen
	 *	@return tot1FinNbrDen
	 */
   public char[] getTot1FinNbrDen() throws CFException{
     if (isTot1FinNbrDenModified()) { 
        tot1FinNbrDen = refreshTot1FinNbrDen();
     }
   		return tot1FinNbrDen;
   }

  
	/**
	*  set variable tot1FinNbrDen
	*  Corresponding COBOL Variable is TOT1-FIN-NBR-DEN
	*  @param value
	**/
   public void setTot1FinNbrDen(char[] value) {
      tot1FinNbrDen = checkTot1FinNbrDenConstraints(value);
      serializeTot1FinNbrDen(tot1FinNbrDen);
   } 

     /**
	 * 	Update Tot1FinNbrDen 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTot1FinNbrDen(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTot1FinNbrDen,tot1FinNbrDen.length);
   	
   }
   
   public void setTot1FinNbrDen(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinNbrDen,tot1FinNbrDen.length);
   	
   }
   
     /**
	 * 	Update Tot1FinNbrDen 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTot1FinNbrDen(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinNbrDen+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tot1FinNbrDen with another Field
	 *	@param value
	 */
   public void setTot1FinNbrDen(Field source) {
       replace(source,0,source.length(),beginTot1FinNbrDen,TOT_1_FIN_NBR_DEN_LEN);
   	
   }  
   
     /**
	 * 	Update Tot1FinNbrDen 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTot1FinNbrDen(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTot1FinNbrDen,TOT_1_FIN_NBR_DEN_LEN);
   	
   }
   
     /**
	 * 	Update Tot1FinNbrDen 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTot1FinNbrDen(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinNbrDen+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tot1FinAmt
	 *	@return tot1FinAmt
	 */
   public char[] getTot1FinAmt() throws CFException{
     if (isTot1FinAmtModified()) { 
        tot1FinAmt = refreshTot1FinAmt();
     }
   		return tot1FinAmt;
   }

  
	/**
	*  set variable tot1FinAmt
	*  Corresponding COBOL Variable is TOT1-FIN-AMT
	*  @param value
	**/
   public void setTot1FinAmt(char[] value) {
      tot1FinAmt = checkTot1FinAmtConstraints(value);
      serializeTot1FinAmt(tot1FinAmt);
   } 

     /**
	 * 	Update Tot1FinAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTot1FinAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTot1FinAmt,tot1FinAmt.length);
   	
   }
   
   public void setTot1FinAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinAmt,tot1FinAmt.length);
   	
   }
   
     /**
	 * 	Update Tot1FinAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTot1FinAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tot1FinAmt with another Field
	 *	@param value
	 */
   public void setTot1FinAmt(Field source) {
       replace(source,0,source.length(),beginTot1FinAmt,TOT_1_FIN_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Tot1FinAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTot1FinAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTot1FinAmt,TOT_1_FIN_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Tot1FinAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTot1FinAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tot1FinAmtInd
	 *	@return tot1FinAmtInd
	 */
   public char[] getTot1FinAmtInd() throws CFException{
     if (isTot1FinAmtIndModified()) { 
        tot1FinAmtInd = refreshTot1FinAmtInd();
     }
   		return tot1FinAmtInd;
   }

  
	/**
	*  set variable tot1FinAmtInd
	*  Corresponding COBOL Variable is TOT1-FIN-AMT-IND
	*  @param value
	**/
   public void setTot1FinAmtInd(char[] value) {
      tot1FinAmtInd = checkTot1FinAmtIndConstraints(value);
      serializeTot1FinAmtInd(tot1FinAmtInd);
   } 

     /**
	 * 	Update Tot1FinAmtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTot1FinAmtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTot1FinAmtInd,tot1FinAmtInd.length);
   	
   }
   
   public void setTot1FinAmtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinAmtInd,tot1FinAmtInd.length);
   	
   }
   
     /**
	 * 	Update Tot1FinAmtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTot1FinAmtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinAmtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tot1FinAmtInd with another Field
	 *	@param value
	 */
   public void setTot1FinAmtInd(Field source) {
       replace(source,0,source.length(),beginTot1FinAmtInd,TOT_1_FIN_AMT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Tot1FinAmtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTot1FinAmtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTot1FinAmtInd,TOT_1_FIN_AMT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Tot1FinAmtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTot1FinAmtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinAmtInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tot1FinFeeNbr
	 *	@return tot1FinFeeNbr
	 */
   public char[] getTot1FinFeeNbr() throws CFException{
     if (isTot1FinFeeNbrModified()) { 
        tot1FinFeeNbr = refreshTot1FinFeeNbr();
     }
   		return tot1FinFeeNbr;
   }

  
	/**
	*  set variable tot1FinFeeNbr
	*  Corresponding COBOL Variable is TOT1-FIN-FEE-NBR
	*  @param value
	**/
   public void setTot1FinFeeNbr(char[] value) {
      tot1FinFeeNbr = checkTot1FinFeeNbrConstraints(value);
      serializeTot1FinFeeNbr(tot1FinFeeNbr);
   } 

     /**
	 * 	Update Tot1FinFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTot1FinFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTot1FinFeeNbr,tot1FinFeeNbr.length);
   	
   }
   
   public void setTot1FinFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinFeeNbr,tot1FinFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Tot1FinFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTot1FinFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tot1FinFeeNbr with another Field
	 *	@param value
	 */
   public void setTot1FinFeeNbr(Field source) {
       replace(source,0,source.length(),beginTot1FinFeeNbr,TOT_1_FIN_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Tot1FinFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTot1FinFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTot1FinFeeNbr,TOT_1_FIN_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Tot1FinFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTot1FinFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FinFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tot1PctFeeNbr
	 *	@return tot1PctFeeNbr
	 */
   public char[] getTot1PctFeeNbr() throws CFException{
     if (isTot1PctFeeNbrModified()) { 
        tot1PctFeeNbr = refreshTot1PctFeeNbr();
     }
   		return tot1PctFeeNbr;
   }

  
	/**
	*  set variable tot1PctFeeNbr
	*  Corresponding COBOL Variable is TOT1-PCT-FEE-NBR
	*  @param value
	**/
   public void setTot1PctFeeNbr(char[] value) {
      tot1PctFeeNbr = checkTot1PctFeeNbrConstraints(value);
      serializeTot1PctFeeNbr(tot1PctFeeNbr);
   } 

     /**
	 * 	Update Tot1PctFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTot1PctFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTot1PctFeeNbr,tot1PctFeeNbr.length);
   	
   }
   
   public void setTot1PctFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTot1PctFeeNbr,tot1PctFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Tot1PctFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTot1PctFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1PctFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tot1PctFeeNbr with another Field
	 *	@param value
	 */
   public void setTot1PctFeeNbr(Field source) {
       replace(source,0,source.length(),beginTot1PctFeeNbr,TOT_1_PCT_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Tot1PctFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTot1PctFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTot1PctFeeNbr,TOT_1_PCT_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Tot1PctFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTot1PctFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1PctFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tot1NfinFeeNbr
	 *	@return tot1NfinFeeNbr
	 */
   public char[] getTot1NfinFeeNbr() throws CFException{
     if (isTot1NfinFeeNbrModified()) { 
        tot1NfinFeeNbr = refreshTot1NfinFeeNbr();
     }
   		return tot1NfinFeeNbr;
   }

  
	/**
	*  set variable tot1NfinFeeNbr
	*  Corresponding COBOL Variable is TOT1-NFIN-FEE-NBR
	*  @param value
	**/
   public void setTot1NfinFeeNbr(char[] value) {
      tot1NfinFeeNbr = checkTot1NfinFeeNbrConstraints(value);
      serializeTot1NfinFeeNbr(tot1NfinFeeNbr);
   } 

     /**
	 * 	Update Tot1NfinFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTot1NfinFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTot1NfinFeeNbr,tot1NfinFeeNbr.length);
   	
   }
   
   public void setTot1NfinFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTot1NfinFeeNbr,tot1NfinFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Tot1NfinFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTot1NfinFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1NfinFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tot1NfinFeeNbr with another Field
	 *	@param value
	 */
   public void setTot1NfinFeeNbr(Field source) {
       replace(source,0,source.length(),beginTot1NfinFeeNbr,TOT_1_NFIN_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Tot1NfinFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTot1NfinFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTot1NfinFeeNbr,TOT_1_NFIN_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Tot1NfinFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTot1NfinFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1NfinFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tot1NbilFeeNbr
	 *	@return tot1NbilFeeNbr
	 */
   public char[] getTot1NbilFeeNbr() throws CFException{
     if (isTot1NbilFeeNbrModified()) { 
        tot1NbilFeeNbr = refreshTot1NbilFeeNbr();
     }
   		return tot1NbilFeeNbr;
   }

  
	/**
	*  set variable tot1NbilFeeNbr
	*  Corresponding COBOL Variable is TOT1-NBIL-FEE-NBR
	*  @param value
	**/
   public void setTot1NbilFeeNbr(char[] value) {
      tot1NbilFeeNbr = checkTot1NbilFeeNbrConstraints(value);
      serializeTot1NbilFeeNbr(tot1NbilFeeNbr);
   } 

     /**
	 * 	Update Tot1NbilFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTot1NbilFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTot1NbilFeeNbr,tot1NbilFeeNbr.length);
   	
   }
   
   public void setTot1NbilFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTot1NbilFeeNbr,tot1NbilFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Tot1NbilFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTot1NbilFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1NbilFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tot1NbilFeeNbr with another Field
	 *	@param value
	 */
   public void setTot1NbilFeeNbr(Field source) {
       replace(source,0,source.length(),beginTot1NbilFeeNbr,TOT_1_NBIL_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Tot1NbilFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTot1NbilFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTot1NbilFeeNbr,TOT_1_NBIL_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Tot1NbilFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTot1NbilFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1NbilFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tot1FeeAmtNet
	 *	@return tot1FeeAmtNet
	 */
   public char[] getTot1FeeAmtNet() throws CFException{
     if (isTot1FeeAmtNetModified()) { 
        tot1FeeAmtNet = refreshTot1FeeAmtNet();
     }
   		return tot1FeeAmtNet;
   }

  
	/**
	*  set variable tot1FeeAmtNet
	*  Corresponding COBOL Variable is TOT1-FEE-AMT-NET
	*  @param value
	**/
   public void setTot1FeeAmtNet(char[] value) {
      tot1FeeAmtNet = checkTot1FeeAmtNetConstraints(value);
      serializeTot1FeeAmtNet(tot1FeeAmtNet);
   } 

     /**
	 * 	Update Tot1FeeAmtNet 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTot1FeeAmtNet(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTot1FeeAmtNet,tot1FeeAmtNet.length);
   	
   }
   
   public void setTot1FeeAmtNet(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FeeAmtNet,tot1FeeAmtNet.length);
   	
   }
   
     /**
	 * 	Update Tot1FeeAmtNet 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTot1FeeAmtNet(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FeeAmtNet+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tot1FeeAmtNet with another Field
	 *	@param value
	 */
   public void setTot1FeeAmtNet(Field source) {
       replace(source,0,source.length(),beginTot1FeeAmtNet,TOT_1_FEE_AMT_NET_LEN);
   	
   }  
   
     /**
	 * 	Update Tot1FeeAmtNet 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTot1FeeAmtNet(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTot1FeeAmtNet,TOT_1_FEE_AMT_NET_LEN);
   	
   }
   
     /**
	 * 	Update Tot1FeeAmtNet 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTot1FeeAmtNet(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FeeAmtNet+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tot1FeeAmtInd
	 *	@return tot1FeeAmtInd
	 */
   public char[] getTot1FeeAmtInd() throws CFException{
     if (isTot1FeeAmtIndModified()) { 
        tot1FeeAmtInd = refreshTot1FeeAmtInd();
     }
   		return tot1FeeAmtInd;
   }

  
	/**
	*  set variable tot1FeeAmtInd
	*  Corresponding COBOL Variable is TOT1-FEE-AMT-IND
	*  @param value
	**/
   public void setTot1FeeAmtInd(char[] value) {
      tot1FeeAmtInd = checkTot1FeeAmtIndConstraints(value);
      serializeTot1FeeAmtInd(tot1FeeAmtInd);
   } 

     /**
	 * 	Update Tot1FeeAmtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTot1FeeAmtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTot1FeeAmtInd,tot1FeeAmtInd.length);
   	
   }
   
   public void setTot1FeeAmtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FeeAmtInd,tot1FeeAmtInd.length);
   	
   }
   
     /**
	 * 	Update Tot1FeeAmtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTot1FeeAmtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FeeAmtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tot1FeeAmtInd with another Field
	 *	@param value
	 */
   public void setTot1FeeAmtInd(Field source) {
       replace(source,0,source.length(),beginTot1FeeAmtInd,TOT_1_FEE_AMT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Tot1FeeAmtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTot1FeeAmtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTot1FeeAmtInd,TOT_1_FEE_AMT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Tot1FeeAmtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTot1FeeAmtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTot1FeeAmtInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTotPage1LnFieldLength() {
			return TOT_PAGE_1_LN_LENGTH;
		}

}
  
