package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln2a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln2a extends DtPage3Ln2aSerialized {
   

						private char[] dt32aCc = new char[1];




								private char[] dt32aTotalAmt = Field.fillLowValue(22);


						private char[] dt32aInd = Field.fillLowValue(1);

	
	/**
	* Constructor for DtPage3Ln2a
	**/
    public DtPage3Ln2a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt32aCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 1
             ,2
             );
       replaceValue( // serialize and save the value
             ("TOTAL:").toCharArray()
             , getStartOffset() + 3
             ,6
             );
       replaceValue( // serialize and save the value
             pad(65," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 9
             ,65
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 96
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(30)
             , getStartOffset() + 98
             ,30
             );
    }


 

	/**
	 *	Returns the value of dt32aCc
	 *	@return dt32aCc
	 */
   public char[] getDt32aCc() throws CFException{
     if (isDt32aCcModified()) { 
        dt32aCc = refreshDt32aCc();
     }
   		return dt32aCc;
   }

  
	/**
	*  set variable dt32aCc
	*  Corresponding COBOL Variable is DT3-2A-CC
	*  @param value
	**/
   public void setDt32aCc(char[] value) {
      dt32aCc = checkDt32aCcConstraints(value);
      serializeDt32aCc(dt32aCc);
   } 

     /**
	 * 	Update Dt32aCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt32aCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt32aCc,dt32aCc.length);
   	
   }
   
   public void setDt32aCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt32aCc,dt32aCc.length);
   	
   }
   
     /**
	 * 	Update Dt32aCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt32aCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32aCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt32aCc with another Field
	 *	@param value
	 */
   public void setDt32aCc(Field source) {
       replace(source,0,source.length(),beginDt32aCc,DT_32A_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt32aCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt32aCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt32aCc,DT_32A_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt32aCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt32aCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32aCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt32aTotalAmt
	 *	@return dt32aTotalAmt
	 */
   public char[] getDt32aTotalAmt() throws CFException{
     if (isDt32aTotalAmtModified()) { 
        dt32aTotalAmt = refreshDt32aTotalAmt();
     }
   		return dt32aTotalAmt;
   }

  
	/**
	*  set variable dt32aTotalAmt
	*  Corresponding COBOL Variable is DT3-2A-TOTAL-AMT
	*  @param value
	**/
   public void setDt32aTotalAmt(char[] value) {
      dt32aTotalAmt = checkDt32aTotalAmtConstraints(value);
      serializeDt32aTotalAmt(dt32aTotalAmt);
   } 

     /**
	 * 	Update Dt32aTotalAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt32aTotalAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt32aTotalAmt,dt32aTotalAmt.length);
   	
   }
   
   public void setDt32aTotalAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt32aTotalAmt,dt32aTotalAmt.length);
   	
   }
   
     /**
	 * 	Update Dt32aTotalAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt32aTotalAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32aTotalAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt32aTotalAmt with another Field
	 *	@param value
	 */
   public void setDt32aTotalAmt(Field source) {
       replace(source,0,source.length(),beginDt32aTotalAmt,DT_32A_TOTAL_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt32aTotalAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt32aTotalAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt32aTotalAmt,DT_32A_TOTAL_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt32aTotalAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt32aTotalAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32aTotalAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt32aInd
	 *	@return dt32aInd
	 */
   public char[] getDt32aInd() throws CFException{
     if (isDt32aIndModified()) { 
        dt32aInd = refreshDt32aInd();
     }
   		return dt32aInd;
   }

  
	/**
	*  set variable dt32aInd
	*  Corresponding COBOL Variable is DT3-2A-IND
	*  @param value
	**/
   public void setDt32aInd(char[] value) {
      dt32aInd = checkDt32aIndConstraints(value);
      serializeDt32aInd(dt32aInd);
   } 

     /**
	 * 	Update Dt32aInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt32aInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt32aInd,dt32aInd.length);
   	
   }
   
   public void setDt32aInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt32aInd,dt32aInd.length);
   	
   }
   
     /**
	 * 	Update Dt32aInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt32aInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32aInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt32aInd with another Field
	 *	@param value
	 */
   public void setDt32aInd(Field source) {
       replace(source,0,source.length(),beginDt32aInd,DT_32A_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt32aInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt32aInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt32aInd,DT_32A_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt32aInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt32aInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32aInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln2aFieldLength() {
			return DT_PAGE_3_LN_2A_LENGTH;
		}

}
  
