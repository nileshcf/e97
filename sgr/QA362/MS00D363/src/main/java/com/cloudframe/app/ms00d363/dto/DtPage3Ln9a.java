package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln9a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln9a extends DtPage3Ln9aSerialized {
   

						private char[] dt39aCc = new char[1];





						private char[] dt39aSsc = Field.fillLowValue(3);






						private char[] dt39aTottotNetAmt = Field.fillLowValue(18);


						private char[] dt39aTottotInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln9a
	**/
    public DtPage3Ln9a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt39aCc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("NET SETTLEMENT TOTAL").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 22
             ,3
             );
       replaceValue( // serialize and save the value
             ("SSC : ").toCharArray()
             , getStartOffset() + 25
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 34
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 36
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 51
             ,17
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 68
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 83
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 111
             ,6
             );
								setDt39aTottotInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }


 

	/**
	 *	Returns the value of dt39aCc
	 *	@return dt39aCc
	 */
   public char[] getDt39aCc() throws CFException{
     if (isDt39aCcModified()) { 
        dt39aCc = refreshDt39aCc();
     }
   		return dt39aCc;
   }

  
	/**
	*  set variable dt39aCc
	*  Corresponding COBOL Variable is DT3-9A-CC
	*  @param value
	**/
   public void setDt39aCc(char[] value) {
      dt39aCc = checkDt39aCcConstraints(value);
      serializeDt39aCc(dt39aCc);
   } 

     /**
	 * 	Update Dt39aCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt39aCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt39aCc,dt39aCc.length);
   	
   }
   
   public void setDt39aCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt39aCc,dt39aCc.length);
   	
   }
   
     /**
	 * 	Update Dt39aCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt39aCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39aCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt39aCc with another Field
	 *	@param value
	 */
   public void setDt39aCc(Field source) {
       replace(source,0,source.length(),beginDt39aCc,DT_39A_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt39aCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt39aCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt39aCc,DT_39A_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt39aCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt39aCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39aCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt39aSsc
	 *	@return dt39aSsc
	 */
   public char[] getDt39aSsc() throws CFException{
     if (isDt39aSscModified()) { 
        dt39aSsc = refreshDt39aSsc();
     }
   		return dt39aSsc;
   }

  
	/**
	*  set variable dt39aSsc
	*  Corresponding COBOL Variable is DT3-9A-SSC
	*  @param value
	**/
   public void setDt39aSsc(char[] value) {
      dt39aSsc = checkDt39aSscConstraints(value);
      serializeDt39aSsc(dt39aSsc);
   } 

     /**
	 * 	Update Dt39aSsc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt39aSsc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt39aSsc,dt39aSsc.length);
   	
   }
   
   public void setDt39aSsc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt39aSsc,dt39aSsc.length);
   	
   }
   
     /**
	 * 	Update Dt39aSsc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt39aSsc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39aSsc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt39aSsc with another Field
	 *	@param value
	 */
   public void setDt39aSsc(Field source) {
       replace(source,0,source.length(),beginDt39aSsc,DT_39A_SSC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt39aSsc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt39aSsc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt39aSsc,DT_39A_SSC_LEN);
   	
   }
   
     /**
	 * 	Update Dt39aSsc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt39aSsc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39aSsc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt39aTottotNetAmt
	 *	@return dt39aTottotNetAmt
	 */
   public char[] getDt39aTottotNetAmt() throws CFException{
     if (isDt39aTottotNetAmtModified()) { 
        dt39aTottotNetAmt = refreshDt39aTottotNetAmt();
     }
   		return dt39aTottotNetAmt;
   }

  
	/**
	*  set variable dt39aTottotNetAmt
	*  Corresponding COBOL Variable is DT3-9A-TOTTOT-NET-AMT
	*  @param value
	**/
   public void setDt39aTottotNetAmt(char[] value) {
      dt39aTottotNetAmt = checkDt39aTottotNetAmtConstraints(value);
      serializeDt39aTottotNetAmt(dt39aTottotNetAmt);
   } 

     /**
	 * 	Update Dt39aTottotNetAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt39aTottotNetAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt39aTottotNetAmt,dt39aTottotNetAmt.length);
   	
   }
   
   public void setDt39aTottotNetAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt39aTottotNetAmt,dt39aTottotNetAmt.length);
   	
   }
   
     /**
	 * 	Update Dt39aTottotNetAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt39aTottotNetAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39aTottotNetAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt39aTottotNetAmt with another Field
	 *	@param value
	 */
   public void setDt39aTottotNetAmt(Field source) {
       replace(source,0,source.length(),beginDt39aTottotNetAmt,DT_39A_TOTTOT_NET_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt39aTottotNetAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt39aTottotNetAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt39aTottotNetAmt,DT_39A_TOTTOT_NET_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt39aTottotNetAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt39aTottotNetAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39aTottotNetAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt39aTottotInd
	 *	@return dt39aTottotInd
	 */
   public char[] getDt39aTottotInd() throws CFException{
     if (isDt39aTottotIndModified()) { 
        dt39aTottotInd = refreshDt39aTottotInd();
     }
   		return dt39aTottotInd;
   }

  
	/**
	*  set variable dt39aTottotInd
	*  Corresponding COBOL Variable is DT3-9A-TOTTOT-IND
	*  @param value
	**/
   public void setDt39aTottotInd(char[] value) {
      dt39aTottotInd = checkDt39aTottotIndConstraints(value);
      serializeDt39aTottotInd(dt39aTottotInd);
   } 

     /**
	 * 	Update Dt39aTottotInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt39aTottotInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt39aTottotInd,dt39aTottotInd.length);
   	
   }
   
   public void setDt39aTottotInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt39aTottotInd,dt39aTottotInd.length);
   	
   }
   
     /**
	 * 	Update Dt39aTottotInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt39aTottotInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39aTottotInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt39aTottotInd with another Field
	 *	@param value
	 */
   public void setDt39aTottotInd(Field source) {
       replace(source,0,source.length(),beginDt39aTottotInd,DT_39A_TOTTOT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt39aTottotInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt39aTottotInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt39aTottotInd,DT_39A_TOTTOT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt39aTottotInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt39aTottotInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39aTottotInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln9aFieldLength() {
			return DT_PAGE_3_LN_9A_LENGTH;
		}

}
  
