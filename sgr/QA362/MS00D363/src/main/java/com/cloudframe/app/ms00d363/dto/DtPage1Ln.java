package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage1Ln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage1Ln extends DtPage1LnSerialized { 
   

						private char[] dt1Cc = new char[1];


						private char[] dt1Desc = Field.fillLowValue(18);

								private char[] dt1FinNbr = Field.fillLowValue(9);


								private char[] dt1FinNbrDen = Field.fillLowValue(9);


						private char[] dt1FinAmt = Field.fillLowValue(18);

						private char[] dt1FinAmtInd = new char[2];


								private char[] dt1FinFeeNbr = Field.fillLowValue(9);


								private char[] dt1PctFeeNbr = Field.fillLowValue(9);


								private char[] dt1NfinFeeNbr = Field.fillLowValue(9);


								private char[] dt1NbilFeeNbr = Field.fillLowValue(9);


						private char[] dt1FeeAmtNet = Field.fillLowValue(20);

						private char[] dt1FeeAmtInd = Field.fillLowValue(2);

	
	/**
	* Constructor for DtPage1Ln
	**/
    public DtPage1Ln() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt1Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
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
								setDt1FinAmtInd(fillSpace(2));
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
	 *	Returns the value of dt1Cc
	 *	@return dt1Cc
	 */
   public char[] getDt1Cc() throws CFException{
     if (isDt1CcModified()) { 
        dt1Cc = refreshDt1Cc();
     }
   		return dt1Cc;
   }

  
	/**
	*  set variable dt1Cc
	*  Corresponding COBOL Variable is DT1-CC
	*  @param value
	**/
   public void setDt1Cc(char[] value) {
      dt1Cc = checkDt1CcConstraints(value);
      serializeDt1Cc(dt1Cc);
   } 

     /**
	 * 	Update Dt1Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1Cc,dt1Cc.length);
   	
   }
   
   public void setDt1Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1Cc,dt1Cc.length);
   	
   }
   
     /**
	 * 	Update Dt1Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1Cc with another Field
	 *	@param value
	 */
   public void setDt1Cc(Field source) {
       replace(source,0,source.length(),beginDt1Cc,DT_1_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1Cc,DT_1_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt1Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1Desc
	 *	@return dt1Desc
	 */
   public char[] getDt1Desc() throws CFException{
     if (isDt1DescModified()) { 
        dt1Desc = refreshDt1Desc();
     }
   		return dt1Desc;
   }

  
	/**
	*  set variable dt1Desc
	*  Corresponding COBOL Variable is DT1-DESC
	*  @param value
	**/
   public void setDt1Desc(char[] value) {
      dt1Desc = checkDt1DescConstraints(value);
      serializeDt1Desc(dt1Desc);
   } 

     /**
	 * 	Update Dt1Desc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1Desc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1Desc,dt1Desc.length);
   	
   }
   
   public void setDt1Desc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1Desc,dt1Desc.length);
   	
   }
   
     /**
	 * 	Update Dt1Desc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1Desc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1Desc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1Desc with another Field
	 *	@param value
	 */
   public void setDt1Desc(Field source) {
       replace(source,0,source.length(),beginDt1Desc,DT_1_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1Desc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1Desc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1Desc,DT_1_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Dt1Desc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1Desc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1Desc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1FinNbr
	 *	@return dt1FinNbr
	 */
   public char[] getDt1FinNbr() throws CFException{
     if (isDt1FinNbrModified()) { 
        dt1FinNbr = refreshDt1FinNbr();
     }
   		return dt1FinNbr;
   }

  
	/**
	*  set variable dt1FinNbr
	*  Corresponding COBOL Variable is DT1-FIN-NBR
	*  @param value
	**/
   public void setDt1FinNbr(char[] value) {
      dt1FinNbr = checkDt1FinNbrConstraints(value);
      serializeDt1FinNbr(dt1FinNbr);
   } 

     /**
	 * 	Update Dt1FinNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1FinNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1FinNbr,dt1FinNbr.length);
   	
   }
   
   public void setDt1FinNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinNbr,dt1FinNbr.length);
   	
   }
   
     /**
	 * 	Update Dt1FinNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1FinNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1FinNbr with another Field
	 *	@param value
	 */
   public void setDt1FinNbr(Field source) {
       replace(source,0,source.length(),beginDt1FinNbr,DT_1_FIN_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1FinNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1FinNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1FinNbr,DT_1_FIN_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt1FinNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1FinNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1FinNbrDen
	 *	@return dt1FinNbrDen
	 */
   public char[] getDt1FinNbrDen() throws CFException{
     if (isDt1FinNbrDenModified()) { 
        dt1FinNbrDen = refreshDt1FinNbrDen();
     }
   		return dt1FinNbrDen;
   }

  
	/**
	*  set variable dt1FinNbrDen
	*  Corresponding COBOL Variable is DT1-FIN-NBR-DEN
	*  @param value
	**/
   public void setDt1FinNbrDen(char[] value) {
      dt1FinNbrDen = checkDt1FinNbrDenConstraints(value);
      serializeDt1FinNbrDen(dt1FinNbrDen);
   } 

     /**
	 * 	Update Dt1FinNbrDen 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1FinNbrDen(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1FinNbrDen,dt1FinNbrDen.length);
   	
   }
   
   public void setDt1FinNbrDen(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinNbrDen,dt1FinNbrDen.length);
   	
   }
   
     /**
	 * 	Update Dt1FinNbrDen 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1FinNbrDen(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinNbrDen+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1FinNbrDen with another Field
	 *	@param value
	 */
   public void setDt1FinNbrDen(Field source) {
       replace(source,0,source.length(),beginDt1FinNbrDen,DT_1_FIN_NBR_DEN_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1FinNbrDen 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1FinNbrDen(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1FinNbrDen,DT_1_FIN_NBR_DEN_LEN);
   	
   }
   
     /**
	 * 	Update Dt1FinNbrDen 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1FinNbrDen(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinNbrDen+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1FinAmt
	 *	@return dt1FinAmt
	 */
   public char[] getDt1FinAmt() throws CFException{
     if (isDt1FinAmtModified()) { 
        dt1FinAmt = refreshDt1FinAmt();
     }
   		return dt1FinAmt;
   }

  
	/**
	*  set variable dt1FinAmt
	*  Corresponding COBOL Variable is DT1-FIN-AMT
	*  @param value
	**/
   public void setDt1FinAmt(char[] value) {
      dt1FinAmt = checkDt1FinAmtConstraints(value);
      serializeDt1FinAmt(dt1FinAmt);
   } 

     /**
	 * 	Update Dt1FinAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1FinAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1FinAmt,dt1FinAmt.length);
   	
   }
   
   public void setDt1FinAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinAmt,dt1FinAmt.length);
   	
   }
   
     /**
	 * 	Update Dt1FinAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1FinAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1FinAmt with another Field
	 *	@param value
	 */
   public void setDt1FinAmt(Field source) {
       replace(source,0,source.length(),beginDt1FinAmt,DT_1_FIN_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1FinAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1FinAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1FinAmt,DT_1_FIN_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt1FinAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1FinAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1FinAmtInd
	 *	@return dt1FinAmtInd
	 */
   public char[] getDt1FinAmtInd() throws CFException{
     if (isDt1FinAmtIndModified()) { 
        dt1FinAmtInd = refreshDt1FinAmtInd();
     }
   		return dt1FinAmtInd;
   }

  
	/**
	*  set variable dt1FinAmtInd
	*  Corresponding COBOL Variable is DT1-FIN-AMT-IND
	*  @param value
	**/
   public void setDt1FinAmtInd(char[] value) {
      dt1FinAmtInd = checkDt1FinAmtIndConstraints(value);
      serializeDt1FinAmtInd(dt1FinAmtInd);
   } 

     /**
	 * 	Update Dt1FinAmtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1FinAmtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1FinAmtInd,dt1FinAmtInd.length);
   	
   }
   
   public void setDt1FinAmtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinAmtInd,dt1FinAmtInd.length);
   	
   }
   
     /**
	 * 	Update Dt1FinAmtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1FinAmtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinAmtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1FinAmtInd with another Field
	 *	@param value
	 */
   public void setDt1FinAmtInd(Field source) {
       replace(source,0,source.length(),beginDt1FinAmtInd,DT_1_FIN_AMT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1FinAmtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1FinAmtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1FinAmtInd,DT_1_FIN_AMT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1FinAmtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1FinAmtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinAmtInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1FinFeeNbr
	 *	@return dt1FinFeeNbr
	 */
   public char[] getDt1FinFeeNbr() throws CFException{
     if (isDt1FinFeeNbrModified()) { 
        dt1FinFeeNbr = refreshDt1FinFeeNbr();
     }
   		return dt1FinFeeNbr;
   }

  
	/**
	*  set variable dt1FinFeeNbr
	*  Corresponding COBOL Variable is DT1-FIN-FEE-NBR
	*  @param value
	**/
   public void setDt1FinFeeNbr(char[] value) {
      dt1FinFeeNbr = checkDt1FinFeeNbrConstraints(value);
      serializeDt1FinFeeNbr(dt1FinFeeNbr);
   } 

     /**
	 * 	Update Dt1FinFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1FinFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1FinFeeNbr,dt1FinFeeNbr.length);
   	
   }
   
   public void setDt1FinFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinFeeNbr,dt1FinFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Dt1FinFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1FinFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1FinFeeNbr with another Field
	 *	@param value
	 */
   public void setDt1FinFeeNbr(Field source) {
       replace(source,0,source.length(),beginDt1FinFeeNbr,DT_1_FIN_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1FinFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1FinFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1FinFeeNbr,DT_1_FIN_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt1FinFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1FinFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FinFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1PctFeeNbr
	 *	@return dt1PctFeeNbr
	 */
   public char[] getDt1PctFeeNbr() throws CFException{
     if (isDt1PctFeeNbrModified()) { 
        dt1PctFeeNbr = refreshDt1PctFeeNbr();
     }
   		return dt1PctFeeNbr;
   }

  
	/**
	*  set variable dt1PctFeeNbr
	*  Corresponding COBOL Variable is DT1-PCT-FEE-NBR
	*  @param value
	**/
   public void setDt1PctFeeNbr(char[] value) {
      dt1PctFeeNbr = checkDt1PctFeeNbrConstraints(value);
      serializeDt1PctFeeNbr(dt1PctFeeNbr);
   } 

     /**
	 * 	Update Dt1PctFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1PctFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1PctFeeNbr,dt1PctFeeNbr.length);
   	
   }
   
   public void setDt1PctFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1PctFeeNbr,dt1PctFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Dt1PctFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1PctFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1PctFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1PctFeeNbr with another Field
	 *	@param value
	 */
   public void setDt1PctFeeNbr(Field source) {
       replace(source,0,source.length(),beginDt1PctFeeNbr,DT_1_PCT_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1PctFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1PctFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1PctFeeNbr,DT_1_PCT_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt1PctFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1PctFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1PctFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1NfinFeeNbr
	 *	@return dt1NfinFeeNbr
	 */
   public char[] getDt1NfinFeeNbr() throws CFException{
     if (isDt1NfinFeeNbrModified()) { 
        dt1NfinFeeNbr = refreshDt1NfinFeeNbr();
     }
   		return dt1NfinFeeNbr;
   }

  
	/**
	*  set variable dt1NfinFeeNbr
	*  Corresponding COBOL Variable is DT1-NFIN-FEE-NBR
	*  @param value
	**/
   public void setDt1NfinFeeNbr(char[] value) {
      dt1NfinFeeNbr = checkDt1NfinFeeNbrConstraints(value);
      serializeDt1NfinFeeNbr(dt1NfinFeeNbr);
   } 

     /**
	 * 	Update Dt1NfinFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1NfinFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1NfinFeeNbr,dt1NfinFeeNbr.length);
   	
   }
   
   public void setDt1NfinFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1NfinFeeNbr,dt1NfinFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Dt1NfinFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1NfinFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1NfinFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1NfinFeeNbr with another Field
	 *	@param value
	 */
   public void setDt1NfinFeeNbr(Field source) {
       replace(source,0,source.length(),beginDt1NfinFeeNbr,DT_1_NFIN_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1NfinFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1NfinFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1NfinFeeNbr,DT_1_NFIN_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt1NfinFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1NfinFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1NfinFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1NbilFeeNbr
	 *	@return dt1NbilFeeNbr
	 */
   public char[] getDt1NbilFeeNbr() throws CFException{
     if (isDt1NbilFeeNbrModified()) { 
        dt1NbilFeeNbr = refreshDt1NbilFeeNbr();
     }
   		return dt1NbilFeeNbr;
   }

  
	/**
	*  set variable dt1NbilFeeNbr
	*  Corresponding COBOL Variable is DT1-NBIL-FEE-NBR
	*  @param value
	**/
   public void setDt1NbilFeeNbr(char[] value) {
      dt1NbilFeeNbr = checkDt1NbilFeeNbrConstraints(value);
      serializeDt1NbilFeeNbr(dt1NbilFeeNbr);
   } 

     /**
	 * 	Update Dt1NbilFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1NbilFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1NbilFeeNbr,dt1NbilFeeNbr.length);
   	
   }
   
   public void setDt1NbilFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1NbilFeeNbr,dt1NbilFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Dt1NbilFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1NbilFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1NbilFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1NbilFeeNbr with another Field
	 *	@param value
	 */
   public void setDt1NbilFeeNbr(Field source) {
       replace(source,0,source.length(),beginDt1NbilFeeNbr,DT_1_NBIL_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1NbilFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1NbilFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1NbilFeeNbr,DT_1_NBIL_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt1NbilFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1NbilFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1NbilFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1FeeAmtNet
	 *	@return dt1FeeAmtNet
	 */
   public char[] getDt1FeeAmtNet() throws CFException{
     if (isDt1FeeAmtNetModified()) { 
        dt1FeeAmtNet = refreshDt1FeeAmtNet();
     }
   		return dt1FeeAmtNet;
   }

  
	/**
	*  set variable dt1FeeAmtNet
	*  Corresponding COBOL Variable is DT1-FEE-AMT-NET
	*  @param value
	**/
   public void setDt1FeeAmtNet(char[] value) {
      dt1FeeAmtNet = checkDt1FeeAmtNetConstraints(value);
      serializeDt1FeeAmtNet(dt1FeeAmtNet);
   } 

     /**
	 * 	Update Dt1FeeAmtNet 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1FeeAmtNet(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1FeeAmtNet,dt1FeeAmtNet.length);
   	
   }
   
   public void setDt1FeeAmtNet(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FeeAmtNet,dt1FeeAmtNet.length);
   	
   }
   
     /**
	 * 	Update Dt1FeeAmtNet 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1FeeAmtNet(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FeeAmtNet+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1FeeAmtNet with another Field
	 *	@param value
	 */
   public void setDt1FeeAmtNet(Field source) {
       replace(source,0,source.length(),beginDt1FeeAmtNet,DT_1_FEE_AMT_NET_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1FeeAmtNet 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1FeeAmtNet(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1FeeAmtNet,DT_1_FEE_AMT_NET_LEN);
   	
   }
   
     /**
	 * 	Update Dt1FeeAmtNet 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1FeeAmtNet(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FeeAmtNet+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1FeeAmtInd
	 *	@return dt1FeeAmtInd
	 */
   public char[] getDt1FeeAmtInd() throws CFException{
     if (isDt1FeeAmtIndModified()) { 
        dt1FeeAmtInd = refreshDt1FeeAmtInd();
     }
   		return dt1FeeAmtInd;
   }

  
	/**
	*  set variable dt1FeeAmtInd
	*  Corresponding COBOL Variable is DT1-FEE-AMT-IND
	*  @param value
	**/
   public void setDt1FeeAmtInd(char[] value) {
      dt1FeeAmtInd = checkDt1FeeAmtIndConstraints(value);
      serializeDt1FeeAmtInd(dt1FeeAmtInd);
   } 

     /**
	 * 	Update Dt1FeeAmtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1FeeAmtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1FeeAmtInd,dt1FeeAmtInd.length);
   	
   }
   
   public void setDt1FeeAmtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FeeAmtInd,dt1FeeAmtInd.length);
   	
   }
   
     /**
	 * 	Update Dt1FeeAmtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1FeeAmtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FeeAmtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1FeeAmtInd with another Field
	 *	@param value
	 */
   public void setDt1FeeAmtInd(Field source) {
       replace(source,0,source.length(),beginDt1FeeAmtInd,DT_1_FEE_AMT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1FeeAmtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1FeeAmtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1FeeAmtInd,DT_1_FEE_AMT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt1FeeAmtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1FeeAmtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1FeeAmtInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage1LnFieldLength() {
			return DT_PAGE_1_LN_LENGTH;
		}

}
  
