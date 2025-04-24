package com.cloudframe.app.ms00d363.dto;

/**
*  The class SubPage1Ln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SubPage1Ln extends SubPage1LnSerialized { 
   

						private char[] sub1Cc = new char[1];


						private char[] sub1Desc = new char[16];

								private char[] sub1FinNbr = Field.fillLowValue(11);


								private char[] sub1FinNbrDen = Field.fillLowValue(9);


						private char[] sub1FinAmt = Field.fillLowValue(18);

						private char[] sub1FinAmtInd = new char[2];


								private char[] sub1FinFeeNbr = Field.fillLowValue(9);


								private char[] sub1PctFeeNbr = Field.fillLowValue(9);


								private char[] sub1NfinFeeNbr = Field.fillLowValue(9);


								private char[] sub1NbilFeeNbr = Field.fillLowValue(9);


						private char[] sub1FeeAmtNet = Field.fillLowValue(20);

						private char[] sub1FeeAmtInd = Field.fillLowValue(2);

	
	/**
	* Constructor for SubPage1Ln
	**/
    public SubPage1Ln() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSub1Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
								setSub1Desc(("    SUBTOTALS   ").toCharArray());
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
								setSub1FinAmtInd(fillSpace(2));
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
	 *	Returns the value of sub1Cc
	 *	@return sub1Cc
	 */
   public char[] getSub1Cc() throws CFException{
     if (isSub1CcModified()) { 
        sub1Cc = refreshSub1Cc();
     }
   		return sub1Cc;
   }

  
	/**
	*  set variable sub1Cc
	*  Corresponding COBOL Variable is SUB1-CC
	*  @param value
	**/
   public void setSub1Cc(char[] value) {
      sub1Cc = checkSub1CcConstraints(value);
      serializeSub1Cc(sub1Cc);
   } 

     /**
	 * 	Update Sub1Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSub1Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSub1Cc,sub1Cc.length);
   	
   }
   
   public void setSub1Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSub1Cc,sub1Cc.length);
   	
   }
   
     /**
	 * 	Update Sub1Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSub1Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sub1Cc with another Field
	 *	@param value
	 */
   public void setSub1Cc(Field source) {
       replace(source,0,source.length(),beginSub1Cc,SUB_1_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Sub1Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSub1Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSub1Cc,SUB_1_CC_LEN);
   	
   }
   
     /**
	 * 	Update Sub1Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSub1Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sub1Desc
	 *	@return sub1Desc
	 */
   public char[] getSub1Desc() throws CFException{
     if (isSub1DescModified()) { 
        sub1Desc = refreshSub1Desc();
     }
   		return sub1Desc;
   }

  
	/**
	*  set variable sub1Desc
	*  Corresponding COBOL Variable is SUB1-DESC
	*  @param value
	**/
   public void setSub1Desc(char[] value) {
      sub1Desc = checkSub1DescConstraints(value);
      serializeSub1Desc(sub1Desc);
   } 

     /**
	 * 	Update Sub1Desc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSub1Desc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSub1Desc,sub1Desc.length);
   	
   }
   
   public void setSub1Desc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSub1Desc,sub1Desc.length);
   	
   }
   
     /**
	 * 	Update Sub1Desc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSub1Desc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1Desc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sub1Desc with another Field
	 *	@param value
	 */
   public void setSub1Desc(Field source) {
       replace(source,0,source.length(),beginSub1Desc,SUB_1_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Sub1Desc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSub1Desc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSub1Desc,SUB_1_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Sub1Desc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSub1Desc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1Desc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sub1FinNbr
	 *	@return sub1FinNbr
	 */
   public char[] getSub1FinNbr() throws CFException{
     if (isSub1FinNbrModified()) { 
        sub1FinNbr = refreshSub1FinNbr();
     }
   		return sub1FinNbr;
   }

  
	/**
	*  set variable sub1FinNbr
	*  Corresponding COBOL Variable is SUB1-FIN-NBR
	*  @param value
	**/
   public void setSub1FinNbr(char[] value) {
      sub1FinNbr = checkSub1FinNbrConstraints(value);
      serializeSub1FinNbr(sub1FinNbr);
   } 

     /**
	 * 	Update Sub1FinNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSub1FinNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSub1FinNbr,sub1FinNbr.length);
   	
   }
   
   public void setSub1FinNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinNbr,sub1FinNbr.length);
   	
   }
   
     /**
	 * 	Update Sub1FinNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSub1FinNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sub1FinNbr with another Field
	 *	@param value
	 */
   public void setSub1FinNbr(Field source) {
       replace(source,0,source.length(),beginSub1FinNbr,SUB_1_FIN_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Sub1FinNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSub1FinNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSub1FinNbr,SUB_1_FIN_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Sub1FinNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSub1FinNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sub1FinNbrDen
	 *	@return sub1FinNbrDen
	 */
   public char[] getSub1FinNbrDen() throws CFException{
     if (isSub1FinNbrDenModified()) { 
        sub1FinNbrDen = refreshSub1FinNbrDen();
     }
   		return sub1FinNbrDen;
   }

  
	/**
	*  set variable sub1FinNbrDen
	*  Corresponding COBOL Variable is SUB1-FIN-NBR-DEN
	*  @param value
	**/
   public void setSub1FinNbrDen(char[] value) {
      sub1FinNbrDen = checkSub1FinNbrDenConstraints(value);
      serializeSub1FinNbrDen(sub1FinNbrDen);
   } 

     /**
	 * 	Update Sub1FinNbrDen 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSub1FinNbrDen(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSub1FinNbrDen,sub1FinNbrDen.length);
   	
   }
   
   public void setSub1FinNbrDen(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinNbrDen,sub1FinNbrDen.length);
   	
   }
   
     /**
	 * 	Update Sub1FinNbrDen 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSub1FinNbrDen(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinNbrDen+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sub1FinNbrDen with another Field
	 *	@param value
	 */
   public void setSub1FinNbrDen(Field source) {
       replace(source,0,source.length(),beginSub1FinNbrDen,SUB_1_FIN_NBR_DEN_LEN);
   	
   }  
   
     /**
	 * 	Update Sub1FinNbrDen 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSub1FinNbrDen(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSub1FinNbrDen,SUB_1_FIN_NBR_DEN_LEN);
   	
   }
   
     /**
	 * 	Update Sub1FinNbrDen 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSub1FinNbrDen(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinNbrDen+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sub1FinAmt
	 *	@return sub1FinAmt
	 */
   public char[] getSub1FinAmt() throws CFException{
     if (isSub1FinAmtModified()) { 
        sub1FinAmt = refreshSub1FinAmt();
     }
   		return sub1FinAmt;
   }

  
	/**
	*  set variable sub1FinAmt
	*  Corresponding COBOL Variable is SUB1-FIN-AMT
	*  @param value
	**/
   public void setSub1FinAmt(char[] value) {
      sub1FinAmt = checkSub1FinAmtConstraints(value);
      serializeSub1FinAmt(sub1FinAmt);
   } 

     /**
	 * 	Update Sub1FinAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSub1FinAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSub1FinAmt,sub1FinAmt.length);
   	
   }
   
   public void setSub1FinAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinAmt,sub1FinAmt.length);
   	
   }
   
     /**
	 * 	Update Sub1FinAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSub1FinAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sub1FinAmt with another Field
	 *	@param value
	 */
   public void setSub1FinAmt(Field source) {
       replace(source,0,source.length(),beginSub1FinAmt,SUB_1_FIN_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Sub1FinAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSub1FinAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSub1FinAmt,SUB_1_FIN_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Sub1FinAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSub1FinAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sub1FinAmtInd
	 *	@return sub1FinAmtInd
	 */
   public char[] getSub1FinAmtInd() throws CFException{
     if (isSub1FinAmtIndModified()) { 
        sub1FinAmtInd = refreshSub1FinAmtInd();
     }
   		return sub1FinAmtInd;
   }

  
	/**
	*  set variable sub1FinAmtInd
	*  Corresponding COBOL Variable is SUB1-FIN-AMT-IND
	*  @param value
	**/
   public void setSub1FinAmtInd(char[] value) {
      sub1FinAmtInd = checkSub1FinAmtIndConstraints(value);
      serializeSub1FinAmtInd(sub1FinAmtInd);
   } 

     /**
	 * 	Update Sub1FinAmtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSub1FinAmtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSub1FinAmtInd,sub1FinAmtInd.length);
   	
   }
   
   public void setSub1FinAmtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinAmtInd,sub1FinAmtInd.length);
   	
   }
   
     /**
	 * 	Update Sub1FinAmtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSub1FinAmtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinAmtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sub1FinAmtInd with another Field
	 *	@param value
	 */
   public void setSub1FinAmtInd(Field source) {
       replace(source,0,source.length(),beginSub1FinAmtInd,SUB_1_FIN_AMT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Sub1FinAmtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSub1FinAmtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSub1FinAmtInd,SUB_1_FIN_AMT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Sub1FinAmtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSub1FinAmtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinAmtInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sub1FinFeeNbr
	 *	@return sub1FinFeeNbr
	 */
   public char[] getSub1FinFeeNbr() throws CFException{
     if (isSub1FinFeeNbrModified()) { 
        sub1FinFeeNbr = refreshSub1FinFeeNbr();
     }
   		return sub1FinFeeNbr;
   }

  
	/**
	*  set variable sub1FinFeeNbr
	*  Corresponding COBOL Variable is SUB1-FIN-FEE-NBR
	*  @param value
	**/
   public void setSub1FinFeeNbr(char[] value) {
      sub1FinFeeNbr = checkSub1FinFeeNbrConstraints(value);
      serializeSub1FinFeeNbr(sub1FinFeeNbr);
   } 

     /**
	 * 	Update Sub1FinFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSub1FinFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSub1FinFeeNbr,sub1FinFeeNbr.length);
   	
   }
   
   public void setSub1FinFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinFeeNbr,sub1FinFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Sub1FinFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSub1FinFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sub1FinFeeNbr with another Field
	 *	@param value
	 */
   public void setSub1FinFeeNbr(Field source) {
       replace(source,0,source.length(),beginSub1FinFeeNbr,SUB_1_FIN_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Sub1FinFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSub1FinFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSub1FinFeeNbr,SUB_1_FIN_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Sub1FinFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSub1FinFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FinFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sub1PctFeeNbr
	 *	@return sub1PctFeeNbr
	 */
   public char[] getSub1PctFeeNbr() throws CFException{
     if (isSub1PctFeeNbrModified()) { 
        sub1PctFeeNbr = refreshSub1PctFeeNbr();
     }
   		return sub1PctFeeNbr;
   }

  
	/**
	*  set variable sub1PctFeeNbr
	*  Corresponding COBOL Variable is SUB1-PCT-FEE-NBR
	*  @param value
	**/
   public void setSub1PctFeeNbr(char[] value) {
      sub1PctFeeNbr = checkSub1PctFeeNbrConstraints(value);
      serializeSub1PctFeeNbr(sub1PctFeeNbr);
   } 

     /**
	 * 	Update Sub1PctFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSub1PctFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSub1PctFeeNbr,sub1PctFeeNbr.length);
   	
   }
   
   public void setSub1PctFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSub1PctFeeNbr,sub1PctFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Sub1PctFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSub1PctFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1PctFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sub1PctFeeNbr with another Field
	 *	@param value
	 */
   public void setSub1PctFeeNbr(Field source) {
       replace(source,0,source.length(),beginSub1PctFeeNbr,SUB_1_PCT_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Sub1PctFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSub1PctFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSub1PctFeeNbr,SUB_1_PCT_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Sub1PctFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSub1PctFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1PctFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sub1NfinFeeNbr
	 *	@return sub1NfinFeeNbr
	 */
   public char[] getSub1NfinFeeNbr() throws CFException{
     if (isSub1NfinFeeNbrModified()) { 
        sub1NfinFeeNbr = refreshSub1NfinFeeNbr();
     }
   		return sub1NfinFeeNbr;
   }

  
	/**
	*  set variable sub1NfinFeeNbr
	*  Corresponding COBOL Variable is SUB1-NFIN-FEE-NBR
	*  @param value
	**/
   public void setSub1NfinFeeNbr(char[] value) {
      sub1NfinFeeNbr = checkSub1NfinFeeNbrConstraints(value);
      serializeSub1NfinFeeNbr(sub1NfinFeeNbr);
   } 

     /**
	 * 	Update Sub1NfinFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSub1NfinFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSub1NfinFeeNbr,sub1NfinFeeNbr.length);
   	
   }
   
   public void setSub1NfinFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSub1NfinFeeNbr,sub1NfinFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Sub1NfinFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSub1NfinFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1NfinFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sub1NfinFeeNbr with another Field
	 *	@param value
	 */
   public void setSub1NfinFeeNbr(Field source) {
       replace(source,0,source.length(),beginSub1NfinFeeNbr,SUB_1_NFIN_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Sub1NfinFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSub1NfinFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSub1NfinFeeNbr,SUB_1_NFIN_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Sub1NfinFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSub1NfinFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1NfinFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sub1NbilFeeNbr
	 *	@return sub1NbilFeeNbr
	 */
   public char[] getSub1NbilFeeNbr() throws CFException{
     if (isSub1NbilFeeNbrModified()) { 
        sub1NbilFeeNbr = refreshSub1NbilFeeNbr();
     }
   		return sub1NbilFeeNbr;
   }

  
	/**
	*  set variable sub1NbilFeeNbr
	*  Corresponding COBOL Variable is SUB1-NBIL-FEE-NBR
	*  @param value
	**/
   public void setSub1NbilFeeNbr(char[] value) {
      sub1NbilFeeNbr = checkSub1NbilFeeNbrConstraints(value);
      serializeSub1NbilFeeNbr(sub1NbilFeeNbr);
   } 

     /**
	 * 	Update Sub1NbilFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSub1NbilFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSub1NbilFeeNbr,sub1NbilFeeNbr.length);
   	
   }
   
   public void setSub1NbilFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSub1NbilFeeNbr,sub1NbilFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Sub1NbilFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSub1NbilFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1NbilFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sub1NbilFeeNbr with another Field
	 *	@param value
	 */
   public void setSub1NbilFeeNbr(Field source) {
       replace(source,0,source.length(),beginSub1NbilFeeNbr,SUB_1_NBIL_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Sub1NbilFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSub1NbilFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSub1NbilFeeNbr,SUB_1_NBIL_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Sub1NbilFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSub1NbilFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1NbilFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sub1FeeAmtNet
	 *	@return sub1FeeAmtNet
	 */
   public char[] getSub1FeeAmtNet() throws CFException{
     if (isSub1FeeAmtNetModified()) { 
        sub1FeeAmtNet = refreshSub1FeeAmtNet();
     }
   		return sub1FeeAmtNet;
   }

  
	/**
	*  set variable sub1FeeAmtNet
	*  Corresponding COBOL Variable is SUB1-FEE-AMT-NET
	*  @param value
	**/
   public void setSub1FeeAmtNet(char[] value) {
      sub1FeeAmtNet = checkSub1FeeAmtNetConstraints(value);
      serializeSub1FeeAmtNet(sub1FeeAmtNet);
   } 

     /**
	 * 	Update Sub1FeeAmtNet 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSub1FeeAmtNet(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSub1FeeAmtNet,sub1FeeAmtNet.length);
   	
   }
   
   public void setSub1FeeAmtNet(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FeeAmtNet,sub1FeeAmtNet.length);
   	
   }
   
     /**
	 * 	Update Sub1FeeAmtNet 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSub1FeeAmtNet(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FeeAmtNet+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sub1FeeAmtNet with another Field
	 *	@param value
	 */
   public void setSub1FeeAmtNet(Field source) {
       replace(source,0,source.length(),beginSub1FeeAmtNet,SUB_1_FEE_AMT_NET_LEN);
   	
   }  
   
     /**
	 * 	Update Sub1FeeAmtNet 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSub1FeeAmtNet(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSub1FeeAmtNet,SUB_1_FEE_AMT_NET_LEN);
   	
   }
   
     /**
	 * 	Update Sub1FeeAmtNet 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSub1FeeAmtNet(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FeeAmtNet+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sub1FeeAmtInd
	 *	@return sub1FeeAmtInd
	 */
   public char[] getSub1FeeAmtInd() throws CFException{
     if (isSub1FeeAmtIndModified()) { 
        sub1FeeAmtInd = refreshSub1FeeAmtInd();
     }
   		return sub1FeeAmtInd;
   }

  
	/**
	*  set variable sub1FeeAmtInd
	*  Corresponding COBOL Variable is SUB1-FEE-AMT-IND
	*  @param value
	**/
   public void setSub1FeeAmtInd(char[] value) {
      sub1FeeAmtInd = checkSub1FeeAmtIndConstraints(value);
      serializeSub1FeeAmtInd(sub1FeeAmtInd);
   } 

     /**
	 * 	Update Sub1FeeAmtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSub1FeeAmtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSub1FeeAmtInd,sub1FeeAmtInd.length);
   	
   }
   
   public void setSub1FeeAmtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FeeAmtInd,sub1FeeAmtInd.length);
   	
   }
   
     /**
	 * 	Update Sub1FeeAmtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSub1FeeAmtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FeeAmtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sub1FeeAmtInd with another Field
	 *	@param value
	 */
   public void setSub1FeeAmtInd(Field source) {
       replace(source,0,source.length(),beginSub1FeeAmtInd,SUB_1_FEE_AMT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Sub1FeeAmtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSub1FeeAmtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSub1FeeAmtInd,SUB_1_FEE_AMT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Sub1FeeAmtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSub1FeeAmtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSub1FeeAmtInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSubPage1LnFieldLength() {
			return SUB_PAGE_1_LN_LENGTH;
		}

}
  
