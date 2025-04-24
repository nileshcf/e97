package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln9 extends DtPage3Ln9Serialized { 
   

						private char[] dt39Cc = new char[1];








						private char[] dt39AchtotNetAmt = Field.fillLowValue(18);


						private char[] dt39AchtotInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln9
	**/
    public DtPage3Ln9() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt39Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("NET SETTLEMENT (ACH)").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 22
             ,14
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
								setDt39AchtotInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }


 

	/**
	 *	Returns the value of dt39Cc
	 *	@return dt39Cc
	 */
   public char[] getDt39Cc() throws CFException{
     if (isDt39CcModified()) { 
        dt39Cc = refreshDt39Cc();
     }
   		return dt39Cc;
   }

  
	/**
	*  set variable dt39Cc
	*  Corresponding COBOL Variable is DT3-9-CC
	*  @param value
	**/
   public void setDt39Cc(char[] value) {
      dt39Cc = checkDt39CcConstraints(value);
      serializeDt39Cc(dt39Cc);
   } 

     /**
	 * 	Update Dt39Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt39Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt39Cc,dt39Cc.length);
   	
   }
   
   public void setDt39Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt39Cc,dt39Cc.length);
   	
   }
   
     /**
	 * 	Update Dt39Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt39Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt39Cc with another Field
	 *	@param value
	 */
   public void setDt39Cc(Field source) {
       replace(source,0,source.length(),beginDt39Cc,DT_39_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt39Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt39Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt39Cc,DT_39_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt39Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt39Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt39AchtotNetAmt
	 *	@return dt39AchtotNetAmt
	 */
   public char[] getDt39AchtotNetAmt() throws CFException{
     if (isDt39AchtotNetAmtModified()) { 
        dt39AchtotNetAmt = refreshDt39AchtotNetAmt();
     }
   		return dt39AchtotNetAmt;
   }

  
	/**
	*  set variable dt39AchtotNetAmt
	*  Corresponding COBOL Variable is DT3-9-ACHTOT-NET-AMT
	*  @param value
	**/
   public void setDt39AchtotNetAmt(char[] value) {
      dt39AchtotNetAmt = checkDt39AchtotNetAmtConstraints(value);
      serializeDt39AchtotNetAmt(dt39AchtotNetAmt);
   } 

     /**
	 * 	Update Dt39AchtotNetAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt39AchtotNetAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt39AchtotNetAmt,dt39AchtotNetAmt.length);
   	
   }
   
   public void setDt39AchtotNetAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt39AchtotNetAmt,dt39AchtotNetAmt.length);
   	
   }
   
     /**
	 * 	Update Dt39AchtotNetAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt39AchtotNetAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39AchtotNetAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt39AchtotNetAmt with another Field
	 *	@param value
	 */
   public void setDt39AchtotNetAmt(Field source) {
       replace(source,0,source.length(),beginDt39AchtotNetAmt,DT_39_ACHTOT_NET_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt39AchtotNetAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt39AchtotNetAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt39AchtotNetAmt,DT_39_ACHTOT_NET_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt39AchtotNetAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt39AchtotNetAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39AchtotNetAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt39AchtotInd
	 *	@return dt39AchtotInd
	 */
   public char[] getDt39AchtotInd() throws CFException{
     if (isDt39AchtotIndModified()) { 
        dt39AchtotInd = refreshDt39AchtotInd();
     }
   		return dt39AchtotInd;
   }

  
	/**
	*  set variable dt39AchtotInd
	*  Corresponding COBOL Variable is DT3-9-ACHTOT-IND
	*  @param value
	**/
   public void setDt39AchtotInd(char[] value) {
      dt39AchtotInd = checkDt39AchtotIndConstraints(value);
      serializeDt39AchtotInd(dt39AchtotInd);
   } 

     /**
	 * 	Update Dt39AchtotInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt39AchtotInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt39AchtotInd,dt39AchtotInd.length);
   	
   }
   
   public void setDt39AchtotInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt39AchtotInd,dt39AchtotInd.length);
   	
   }
   
     /**
	 * 	Update Dt39AchtotInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt39AchtotInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39AchtotInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt39AchtotInd with another Field
	 *	@param value
	 */
   public void setDt39AchtotInd(Field source) {
       replace(source,0,source.length(),beginDt39AchtotInd,DT_39_ACHTOT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt39AchtotInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt39AchtotInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt39AchtotInd,DT_39_ACHTOT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt39AchtotInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt39AchtotInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt39AchtotInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln9FieldLength() {
			return DT_PAGE_3_LN_9_LENGTH;
		}

}
  
